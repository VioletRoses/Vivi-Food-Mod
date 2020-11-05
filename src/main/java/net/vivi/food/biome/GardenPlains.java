package net.vivi.food.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep.Feature;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;

import static net.minecraft.world.gen.feature.ConfiguredFeatures.*;
import static net.minecraft.world.gen.feature.DefaultBiomeFeatures.*;
import static net.vivi.food.init.ViviFeatures.*;

public class GardenPlains {
    public static Biome create() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        addFarmAnimals(spawnSettings);
        addMonsters(spawnSettings, 95, 5, 100);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        addDefaultUndergroundStructures(generationSettings);
        addLandCarvers(generationSettings);
        addDefaultLakes(generationSettings);
        addDungeons(generationSettings);
        addMineables(generationSettings);
        addDefaultOres(generationSettings);
        addDefaultDisks(generationSettings);
        addSprings(generationSettings);
        addFrozenTopLayer(generationSettings);
        generationSettings.surfaceBuilder(ConfiguredSurfaceBuilders.GRASS)
                .feature(Feature.VEGETAL_DECORATION, DENSE_GARDEN_GRASS)
                .feature(Feature.VEGETAL_DECORATION, PATCH_LARGE_FERN)
                .feature(Feature.VEGETAL_DECORATION, PATCH_TALL_GRASS_2)
                .feature(Feature.VEGETAL_DECORATION, FLOWER_PLAIN_DECORATED)
                .feature(Feature.VEGETAL_DECORATION, OAK);
        return new Biome.Builder()
                .precipitation(Biome.Precipitation.RAIN)
                .category(Biome.Category.PLAINS)
                .depth(0.2f)
                .scale(0.1f)
                .temperature(0.8f)
                .downfall(0.4f)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x3f76e4)
                        .waterFogColor(0x050533)
                        .fogColor(0xc0d8ff)
                        .skyColor(0x77adff)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }
}
