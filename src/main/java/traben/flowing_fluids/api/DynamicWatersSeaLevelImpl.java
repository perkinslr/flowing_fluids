package traben.flowing_fluids.api;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import traben.flowing_fluids.FFFluidUtils;
import traben.flowing_fluids.FlowingFluids;
import net.minecraft.world.level.Level;

//#if DYNAMICWATERS
//$$ import com.AdamNew.dynamicwaters.HydrologyManager;
//$$
//$$public class DynamicWatersSeaLevelImpl implements ISeaLevel {
//$$    public byte isInf(BlockPos blockPos,
//#if MC > 12100
//$$                         ServerLevel level
//#else
//$$                         Level level
//#endif
//$$                         ) {
//$$        var lake = HydrologyManager.findLake(blockPos.getX(), blockPos.getZ(), null, level, null, true);
//$$        if (lake != null) {
//$$            int lakeLo = lake.waterY - 12;
//$$            int lakeHi = lake.waterY + 0;
//$$            var y = blockPos.getY();
//$$            if (lakeLo <= y && y <= lakeHi) {
//$$                return 3; // in band and in biome
//$$            }
//$$            return 2; // in biome, but not in band
//$$        }
//$$        else {
//$$            boolean isWithinInfBiomeHeights = FlowingFluids.config.fastBiomeRefillAtSeaLevelOnly
//$$                ? FFFluidUtils.seaLevel(level) == blockPos.getY() || FFFluidUtils.seaLevel(level) - 1 == blockPos.getY()
//$$                : FFFluidUtils.seaLevel(level) == blockPos.getY() && blockPos.getY() > 0;
//$$            boolean isInfBiome = FFFluidUtils.matchInfiniteBiomes(level.getBiome(blockPos));
//$$            byte ret = 0;
//$$            if (isWithinInfBiomeHeights) {
//$$                ret = 2;
//$$            }
//$$            if (isInfBiome) {
//$$                ret ++;
//$$            }
//$$            return ret;
//$$        }
//$$    }
//$$
//$$}
//#endif
