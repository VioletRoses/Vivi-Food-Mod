package net.vivi.food.init;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.vivi.food.biome.FruitForest;
import net.vivi.food.biome.GardenPlains;

import static net.fabricmc.fabric.api.biome.v1.BiomeModifications.*;
import static net.fabricmc.fabric.api.biome.v1.BiomeSelectors.*;
import static net.fabricmc.fabric.api.biome.v1.OverworldBiomes.*;
import static net.fabricmc.fabric.api.biome.v1.OverworldClimate.*;
import static net.minecraft.util.registry.BuiltinRegistries.*;
import static net.minecraft.util.registry.Registry.*;
import static net.minecraft.world.biome.Biome.Category.*;

@SuppressWarnings( "deprecation" )
public class ViviWorldGen {

    public static void init() {
        //Feature Worldgen
        addFeature(categories(FOREST), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(CONFIGURED_FEATURE_WORLDGEN, new Identifier("proton", "sparse_peach_trees")));
        addFeature(categories(FOREST), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(CONFIGURED_FEATURE_WORLDGEN, new Identifier("proton", "sparse_cherry_trees")));
        addFeature(categories(FOREST), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(CONFIGURED_FEATURE_WORLDGEN, new Identifier("proton", "sparse_orange_trees")));
        addFeature(categories(FOREST), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(CONFIGURED_FEATURE_WORLDGEN, new Identifier("proton", "sparse_lychee_trees")));
        addFeature(categories(FOREST), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(CONFIGURED_FEATURE_WORLDGEN, new Identifier("proton", "sparse_mango_trees")));
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