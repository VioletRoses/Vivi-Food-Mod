package net.vivi.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.PlantBlock;

public class ViviGrass extends PlantBlock {

    public ViviGrass(Settings settings) {
        super(FabricBlockSettings.copy(Blocks.GRASS));
    }
}
