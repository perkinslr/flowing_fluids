package traben.flowing_fluids.api;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public interface ISeaLevel {
    byte isInf(BlockPos blockPos,
                        //#if MC > 12100
                        ServerLevel level
                        //#else
                        //$$ Level level
                        //#endif
                        );
}

