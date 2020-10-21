package net.vivi.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vivi.init.CropInit;

public class StrawberryCrop extends CropBlock {

    public StrawberryCrop(Settings settings) {
        super(FabricBlockSettings.copy(Blocks.POTATOES));
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return CropInit.STRAWBERRY_CROP;
    }
}
