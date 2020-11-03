package net.vivi.food.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;
import net.vivi.food.init.ViviWorldGen;

public class FruitForest {
    public static Biome create() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        generationSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, ViviWorldGen.DENSE_CHERRY_TREES);
        generationSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, ViviWorldGen.DENSE_ORANGE_TREES);
        generationSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, ViviWorldGen.DENSE_LYCHEE_TREES);
        generationSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, ViviWorldGen.DENSE_PEACH_TREES);
        return new Biome.Builder()
                .precipitation(Biome.Precipitation.RAIN)
                .category(Biome.Category.FOREST)
                .depth(0.125f)
                .scale(0.05f)
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
