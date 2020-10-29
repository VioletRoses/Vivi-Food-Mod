package net.vivi.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
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
import net.vivi.biome.FruitForest;
import net.vivi.biome.GardenPlains;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static net.fabricmc.fabric.api.biome.v1.OverworldBiomes.*;
import static net.fabricmc.fabric.api.biome.v1.OverworldClimate.*;
import static net.minecraft.util.registry.Registry.*;
import static net.minecraft.world.gen.feature.ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP;
import static net.vivi.init.ViviBlocks.*;

public class ViviWorldGen {
    public static Set<Block> SOIL = new HashSet<>(Arrays.asList(Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL, Blocks.COARSE_DIRT));
    public static ConfiguredFeature<?, ?> ORE_SALT_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, SALT_ORE.getDefaultState(), 27)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64)).spreadHorizontally().repeat(10));

    public static ConfiguredFeature<TreeFeatureConfig, ?> createFruitTree(Block leaves) {
        return Feature.TREE.configure(new TreeFeatureConfig.Builder(
                new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                new SimpleBlockStateProvider(leaves.getDefaultState()),
                new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 2),
                new StraightTrunkPlacer(6, 0, 0),
                new TwoLayersFeatureSize(1, 0, 0))
                .build());
    }
    public static ConfiguredFeature<TreeFeatureConfig, ?> PEACH_TREE = createFruitTree(PEACH_LEAVES);
    public static ConfiguredFeature<TreeFeatureConfig, ?> ORANGE_TREE = createFruitTree(ORANGE_LEAVES);
    public static ConfiguredFeature<TreeFeatureConfig, ?> LYCHEE_TREE = createFruitTree(LYCHEE_LEAVES);
    public static ConfiguredFeature<TreeFeatureConfig, ?> CHERRY_TREE = createFruitTree(CHERRY_LEAVES);

    public static ConfiguredFeature<?, ?> DENSE_CHERRY_TREES = CHERRY_TREE.decorate(SQUARE_HEIGHTMAP).decorate(ViviDecorators.denseTrees);
    public static ConfiguredFeature<?, ?> DENSE_ORANGE_TREES = ORANGE_TREE.decorate(SQUARE_HEIGHTMAP).decorate(ViviDecorators.denseTrees);
    public static ConfiguredFeature<?, ?> DENSE_LYCHEE_TREES = LYCHEE_TREE.decorate(SQUARE_HEIGHTMAP).decorate(ViviDecorators.denseTrees);
    public static ConfiguredFeature<?, ?> DENSE_PEACH_TREES = PEACH_TREE.decorate(SQUARE_HEIGHTMAP).decorate(ViviDecorators.denseTrees);

    public static ConfiguredFeature<?, ?> GARDEN_GRASS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(ViviBlocks.GARDEN_GRASS.getDefaultState()), new SimpleBlockPlacer()).tries(14).whitelist(SOIL).cannotProject().build()).decorate(Decorator.HEIGHTMAP_WORLD_SURFACE.configure(NopeDecoratorConfig.DEFAULT));
    public static ConfiguredFeature<?, ?> DENSE_GARDEN_GRASS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(ViviBlocks.GARDEN_GRASS.getDefaultState()), new SimpleBlockPlacer()).tries(96).whitelist(SOIL).cannotProject().build()).decorate(Decorator.HEIGHTMAP_WORLD_SURFACE.configure(NopeDecoratorConfig.DEFAULT));

    public static void init() {

        //Feature Register
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "garden_grass"), GARDEN_GRASS);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "peach_tree"), PEACH_TREE);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "orange_tree"), ORANGE_TREE);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "lychee_tree"), LYCHEE_TREE);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "cherry_tree"), CHERRY_TREE);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "dense_garden_grass"), DENSE_GARDEN_GRASS);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "dense_cherry_trees"), DENSE_CHERRY_TREES);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "dense_orange_trees"), DENSE_ORANGE_TREES);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "dense_lychee_trees"), DENSE_LYCHEE_TREES);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "dense_peach_trees"), DENSE_PEACH_TREES);
        register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "ore_salt_overworld"), ORE_SALT_OVERWORLD);

        //Biome Register
        BuiltinRegistries.add(BuiltinRegistries.BIOME, new Identifier("vivi", "fruit_forest"), FruitForest.create());
        BuiltinRegistries.add(BuiltinRegistries.BIOME, new Identifier("vivi", "garden_plains"), GardenPlains.create());

        //Biome Worldgen
        addContinentalBiome(RegistryKey.of(BIOME_KEY, new Identifier("vivi", "fruit_forest")), COOL,1.0f);
        addContinentalBiome(RegistryKey.of(BIOME_KEY, new Identifier("vivi", "garden_plains")), COOL,1.0f);
    }
}