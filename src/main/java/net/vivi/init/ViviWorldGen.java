package net.vivi.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.NopeDecoratorConfig;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static net.minecraft.util.registry.Registry.*;

public class ViviWorldGen {

    public static Set<Block> SOIL = new HashSet<>(Arrays.asList(Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL, Blocks.COARSE_DIRT));
    public static ConfiguredFeature<?, ?> ORE_SALT_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ViviBlocks.SALT_ORE.getDefaultState(), 27)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64)).spreadHorizontally().repeat(10));
    public static ConfiguredFeature<?, ?> PEACH_TREE = Feature.TREE.configure(new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
            new SimpleBlockStateProvider(ViviBlocks.PEACH_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3),
            new StraightTrunkPlacer(6, 0, 0),
            new TwoLayersFeatureSize(1, 0, 0))
            .build());
    public static ConfiguredFeature<?, ?> ORANGE_TREE = Feature.TREE.configure(new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
            new SimpleBlockStateProvider(ViviBlocks.ORANGE_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3),
            new StraightTrunkPlacer(6, 0, 0),
            new TwoLayersFeatureSize(1, 0, 0))
            .build());
    public static ConfiguredFeature<?, ?> LYCHEE_TREE = Feature.TREE.configure(new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
            new SimpleBlockStateProvider(ViviBlocks.LYCHEE_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3),
            new StraightTrunkPlacer(6, 0, 0),
            new TwoLayersFeatureSize(1, 0, 0))
            .build());
    public static ConfiguredFeature<?, ?> CHERRY_TREE = Feature.TREE.configure(new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
            new SimpleBlockStateProvider(ViviBlocks.CHERRY_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3),
            new StraightTrunkPlacer(6, 0, 0),
            new TwoLayersFeatureSize(1, 0, 0))
            .build());

    public static ConfiguredFeature<?, ?> GARDEN_GRASS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(ViviBlocks.GARDEN_GRASS.getDefaultState()), new SimpleBlockPlacer()).tries(10).whitelist(SOIL).cannotProject().build()).decorate(Decorator.HEIGHTMAP_WORLD_SURFACE.configure(NopeDecoratorConfig.DEFAULT));

    public static void init() {
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "garden_grass"), GARDEN_GRASS);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "peach_tree"), PEACH_TREE);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "orange_tree"), ORANGE_TREE);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "ore_salt_overworld"), ORE_SALT_OVERWORLD);
    }
}
