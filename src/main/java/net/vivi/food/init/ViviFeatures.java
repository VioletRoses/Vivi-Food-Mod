package net.vivi.food.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
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

import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;
import static net.minecraft.util.registry.Registry.register;
import static net.minecraft.world.gen.feature.ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP;
import static net.vivi.food.init.ViviBlocks.*;
import static net.vivi.food.init.ViviDecorators.*;

public class ViviFeatures {
    public static Set<Block> SOIL = new HashSet<>(Arrays.asList(Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL, Blocks.COARSE_DIRT));
    public static ConfiguredFeature<?, ?> ORE_SALT_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, SALT_ORE.getDefaultState(), 27)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64)).spreadHorizontally().repeat(6));

    public static ConfiguredFeature<TreeFeatureConfig, ?> createFruitTree(Block leaves) {
        return Feature.TREE.configure(new TreeFeatureConfig.Builder(
                new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                new SimpleBlockStateProvider(leaves.getDefaultState()),
                new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 4),
                new StraightTrunkPlacer(6, 0, 0),
                new TwoLayersFeatureSize(1, 0, 0))
                .build());
    }
    public static ConfiguredFeature<TreeFeatureConfig, ?> PEACH_TREE = createFruitTree(PEACH_LEAVES);
    public static ConfiguredFeature<TreeFeatureConfig, ?> ORANGE_TREE = createFruitTree(ORANGE_LEAVES);
    public static ConfiguredFeature<TreeFeatureConfig, ?> LYCHEE_TREE = createFruitTree(LYCHEE_LEAVES);
    public static ConfiguredFeature<TreeFeatureConfig, ?> CHERRY_TREE = createFruitTree(CHERRY_LEAVES);

    public static ConfiguredFeature<?, ?> DENSE_CHERRY_TREES = CHERRY_TREE.decorate(SQUARE_HEIGHTMAP).decorate(denseTrees);
    public static ConfiguredFeature<?, ?> DENSE_ORANGE_TREES = ORANGE_TREE.decorate(SQUARE_HEIGHTMAP).decorate(denseTrees);
    public static ConfiguredFeature<?, ?> DENSE_LYCHEE_TREES = LYCHEE_TREE.decorate(SQUARE_HEIGHTMAP).decorate(denseTrees);
    public static ConfiguredFeature<?, ?> DENSE_PEACH_TREES = PEACH_TREE.decorate(SQUARE_HEIGHTMAP).decorate(denseTrees);

    public static ConfiguredFeature<?, ?> SPARSE_CHERRY_TREES = CHERRY_TREE.decorate(SQUARE_HEIGHTMAP).decorate(sparseTrees);
    public static ConfiguredFeature<?, ?> SPARSE_ORANGE_TREES = ORANGE_TREE.decorate(SQUARE_HEIGHTMAP).decorate(sparseTrees);
    public static ConfiguredFeature<?, ?> SPARSE_LYCHEE_TREES = LYCHEE_TREE.decorate(SQUARE_HEIGHTMAP).decorate(sparseTrees);
    public static ConfiguredFeature<?, ?> SPARSE_PEACH_TREES = PEACH_TREE.decorate(SQUARE_HEIGHTMAP).decorate(sparseTrees);

    public static ConfiguredFeature<?, ?> RARE_CHERRY_TREES = CHERRY_TREE.decorate(SQUARE_HEIGHTMAP).decorate(rareTrees);
    public static ConfiguredFeature<?, ?> RARE_ORANGE_TREES = ORANGE_TREE.decorate(SQUARE_HEIGHTMAP).decorate(rareTrees);
    public static ConfiguredFeature<?, ?> RARE_LYCHEE_TREES = LYCHEE_TREE.decorate(SQUARE_HEIGHTMAP).decorate(rareTrees);
    public static ConfiguredFeature<?, ?> RARE_PEACH_TREES = PEACH_TREE.decorate(SQUARE_HEIGHTMAP).decorate(rareTrees);

    public static ConfiguredFeature<?, ?> SPARSE_GARDEN_GRASS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(ViviBlocks.GARDEN_GRASS.getDefaultState()), new SimpleBlockPlacer()).tries(14).whitelist(SOIL).cannotProject().build()).decorate(Decorator.HEIGHTMAP_WORLD_SURFACE.configure(NopeDecoratorConfig.DEFAULT));
    public static ConfiguredFeature<?, ?> DENSE_GARDEN_GRASS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(ViviBlocks.GARDEN_GRASS.getDefaultState()), new SimpleBlockPlacer()).tries(128).whitelist(SOIL).cannotProject().build()).decorate(Decorator.HEIGHTMAP_WORLD_SURFACE.configure(NopeDecoratorConfig.DEFAULT));


    public static void init() {
        //Feature Register
        register(CONFIGURED_FEATURE, new Identifier("vivi", "sparse_garden_grass"), SPARSE_GARDEN_GRASS);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "peach_tree"), PEACH_TREE);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "orange_tree"), ORANGE_TREE);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "lychee_tree"), LYCHEE_TREE);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "cherry_tree"), CHERRY_TREE);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "dense_garden_grass"), DENSE_GARDEN_GRASS);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "dense_cherry_trees"), DENSE_CHERRY_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "dense_orange_trees"), DENSE_ORANGE_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "dense_lychee_trees"), DENSE_LYCHEE_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "dense_peach_trees"), DENSE_PEACH_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "sparse_cherry_trees"), SPARSE_CHERRY_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "sparse_orange_trees"), SPARSE_ORANGE_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "sparse_lychee_trees"), SPARSE_LYCHEE_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "sparse_peach_trees"), SPARSE_PEACH_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "rare_cherry_trees"), RARE_CHERRY_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "rare_orange_trees"), RARE_ORANGE_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "rare_lychee_trees"), RARE_LYCHEE_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "rare_peach_trees"), RARE_PEACH_TREES);
        register(CONFIGURED_FEATURE, new Identifier("vivi", "ore_salt_overworld"), ORE_SALT_OVERWORLD);
    }
}
