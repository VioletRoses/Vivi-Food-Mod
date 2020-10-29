package net.vivi.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;

public class ViviGrass extends FernBlock {

    public ViviGrass(Settings settings) {
        super(FabricBlockSettings.copy(Blocks.GRASS));
    }
}
