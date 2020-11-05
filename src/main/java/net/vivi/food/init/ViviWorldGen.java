package net.vivi.food.init;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.impl.biome.modification.BiomeSelectionContextImpl;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStep;
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
import net.vivi.food.biome.FruitForest;
import net.vivi.food.biome.GardenPlains;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static net.fabricmc.fabric.api.biome.v1.BiomeModifications.*;
import static net.fabricmc.fabric.api.biome.v1.BiomeSelectors.*;
import static net.fabricmc.fabric.api.biome.v1.OverworldBiomes.*;
import static net.fabricmc.fabric.api.biome.v1.OverworldClimate.*;
import static net.minecraft.util.registry.BuiltinRegistries.*;
import static net.minecraft.util.registry.Registry.*;
import static net.minecraft.world.biome.Biome.Category.*;
import static net.minecraft.world.gen.feature.ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP;
import static net.vivi.food.init.ViviBlocks.*;

public class ViviWorldGen {

    public static void init() {
        //Feature Worldgen
        addFeature(categories(FOREST), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(CONFIGURED_FEATURE_WORLDGEN, new Identifier("proton", "sparse_peach_trees")));
        addFeature(categories(FOREST), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(CONFIGURED_FEATURE_WORLDGEN, new Identifier("proton", "sparse_cherry_trees")));
        addFeature(categories(FOREST), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(CONFIGURED_FEATURE_WORLDGEN, new Identifier("proton", "sparse_orange_trees")));
        addFeature(categories(FOREST), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(CONFIGURED_FEATURE_WORLDGEN, new Identifier("proton", "sparse_lychee_trees")));
        addFeature(categories(FOREST), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(CONFIGURED_FEATURE_WORLDGEN, new Identifier("proton", "dense_garden_grass")));

        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(CONFIGURED_FEATURE_WORLDGEN, new Identifier("proton", "ore_salt_overworld")));

        //Biome Register
        add(BIOME, new Identifier("vivi", "fruit_forest"), FruitForest.create());
        add(BIOME, new Identifier("vivi", "garden_plains"), GardenPlains.create());

        //Biome Worldgen
        addContinentalBiome(RegistryKey.of(BIOME_KEY, new Identifier("vivi", "fruit_forest")), COOL,1.0f);
        addContinentalBiome(RegistryKey.of(BIOME_KEY, new Identifier("vivi", "garden_plains")), COOL,1.0f);
    }
}