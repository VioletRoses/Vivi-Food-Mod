package net.vivi.food;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;

import java.util.Arrays;

import static net.vivi.food.init.ViviBlocks.*;
import static net.vivi.food.init.ViviCrops.*;

public class ViviClient implements ClientModInitializer {


    private static final BlockColorProvider FOLIAGE_BLOCK_COLORS =
            (block, world, pos, layer) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor();
    private static final ItemColorProvider FOLIAGE_ITEM_COLORS =
            (item, layer) -> FoliageColors.getColor(0.5, 1.0);
    private static final BlockColorProvider GRASS_BLOCK_COLORS =
            (block, world, pos, layer) -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : FoliageColors.getDefaultColor();
    private static final ItemColorProvider GRASS_ITEM_COLORS =
            (item, layer) -> GrassColors.getColor(0.5, 1.0);

    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register(
                FOLIAGE_BLOCK_COLORS,
                PEACH_LEAVES,
                ORANGE_LEAVES,
                CHERRY_LEAVES,
                LYCHEE_LEAVES
        );
        ColorProviderRegistry.ITEM.register(
                FOLIAGE_ITEM_COLORS,
                PEACH_LEAVES,
                ORANGE_LEAVES,
                CHERRY_LEAVES,
                LYCHEE_LEAVES
        );
        ColorProviderRegistry.BLOCK.register(
                GRASS_BLOCK_COLORS,
                GARDEN_GRASS
        );
        ColorProviderRegistry.ITEM.register(
                GRASS_ITEM_COLORS,
                GARDEN_GRASS
        );
        for (Block block : Arrays.asList(GARDEN_GRASS,
                TOMATO_CROP,
                LETTUCE_CROP,
                STRAWBERRY_CROP,
                CORN_CROP,
                COFFEE_CROP,
                MINT_CROP,
                TEA_CROP,
                SOYBEAN_CROP,
                PEACH_LEAVES,
                LYCHEE_LEAVES,
                ORANGE_LEAVES,
                CHERRY_LEAVES))
            BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), block);
    }
}
