package traben.flowing_fluids.api;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import traben.flowing_fluids.FFFluidUtils;
import traben.flowing_fluids.FlowingFluids;
import net.minecraft.world.level.Level;

public class SeaLevelImpl implements ISeaLevel {
    public byte isInf(BlockPos blockPos,
                      //#if MC > 12100
                      ServerLevel level
                      //#else
                      //$$ Level level
                      //#endif
                      ) {
        boolean isWithinInfBiomeHeights = FlowingFluids.config.fastBiomeRefillAtSeaLevelOnly
            ? FFFluidUtils.seaLevel(level) == blockPos.getY() || FFFluidUtils.seaLevel(level) - 1 == blockPos.getY()
            : FFFluidUtils.seaLevel(level) == blockPos.getY() && blockPos.getY() > 0;
        boolean isInfBiome = FFFluidUtils.matchInfiniteBiomes(level.getBiome(blockPos));
        byte ret = 0;
        if (isWithinInfBiomeHeights) {
            ret = 2;
        }
        if (isInfBiome) {
            ret ++;
        }
        return ret;
    }    
}
