package net.vivi;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;
import net.vivi.init.ViviBlocks;
import net.vivi.init.ViviCrops;

public class ViviClient implements ClientModInitializer {


    private static final BlockColorProvider FOLIAGE_BLOCK_COLORS =
            (block, world, pos, layer) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor();
    private static final ItemColorProvider FOLIAGE_ITEM_COLORS =
            (item, layer) -> FoliageColors.getColor(0.5, 1.0);


    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register(
                FOLIAGE_BLOCK_COLORS,
                ViviBlocks.PEACH_LEAVES
        );
        ColorProviderRegistry.ITEM.register(
                FOLIAGE_ITEM_COLORS,
                ViviBlocks.PEACH_LEAVES
        );
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ViviCrops.TOMATO_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ViviCrops.LETTUCE_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ViviCrops.STRAWBERRY_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ViviCrops.CORN_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ViviCrops.COFFEE_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ViviCrops.MINT_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ViviCrops.TEA_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ViviCrops.SOYBEAN_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ViviBlocks.PEACH_LEAVES);
    }
}
