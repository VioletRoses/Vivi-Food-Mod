package net.vivi.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;

public class CornCrop extends CropBlock {
    public CornCrop(Settings settings) {
        super(FabricBlockSettings.copy(Blocks.POTATOES));
    }
}
