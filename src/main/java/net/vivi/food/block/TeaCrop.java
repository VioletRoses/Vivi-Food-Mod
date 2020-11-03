package net.vivi.food.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vivi.food.init.ViviCrops;

public class TeaCrop extends CropBlock {

    public TeaCrop(Settings settings) {
        super(FabricBlockSettings.copy(Blocks.POTATOES));
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ViviCrops.TEA_CROP;
    }
}
