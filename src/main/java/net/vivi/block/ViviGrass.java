package net.vivi.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ViviGrass extends FernBlock {

    public ViviGrass(Settings settings) {
        super(FabricBlockSettings.copy(Blocks.GRASS));
    }
}
