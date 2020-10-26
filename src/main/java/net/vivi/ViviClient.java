package net.vivi;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;

import static net.vivi.init.ViviBlocks.*;
import static net.vivi.init.ViviCrops.*;

public class ViviClient implements ClientModInitializer {


    private static final BlockColorProvider FOLIAGE_BLOCK_COLORS =
            (block, world, pos, layer) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor();
    private static final ItemColorProvider FOLIAGE_ITEM_COLORS =
            (item, layer) -> FoliageColors.getColor(0.5, 1.0);


    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register(
                FOLIAGE_BLOCK_COLORS,
                PEACH_LEAVES
        );
        ColorProviderRegistry.ITEM.register(
                FOLIAGE_ITEM_COLORS,
                PEACH_LEAVES
        );
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), GARDEN_GRASS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TOMATO_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), LETTUCE_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), STRAWBERRY_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CORN_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), COFFEE_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), MINT_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TEA_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), SOYBEAN_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), PEACH_LEAVES);
    }
}
