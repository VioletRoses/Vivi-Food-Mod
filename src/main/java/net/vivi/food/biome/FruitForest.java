package net.vivi.food.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;
import net.vivi.food.init.ViviFeatures;

import static net.minecraft.world.gen.feature.DefaultBiomeFeatures.*;

public class FruitForest {
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
                .feature(GenerationStep.Feature.VEGETAL_DECORATION, ViviFeatures.DENSE_CHERRY_TREES)
                .feature(GenerationStep.Feature.VEGETAL_DECORATION, ViviFeatures.DENSE_ORANGE_TREES)
                .feature(GenerationStep.Feature.VEGETAL_DECORATION, ViviFeatures.DENSE_LYCHEE_TREES)
                .feature(GenerationStep.Feature.VEGETAL_DECORATION, ViviFeatures.DENSE_PEACH_TREES)
                .feature(GenerationStep.Feature.VEGETAL_DECORATION, ViviFeatures.DENSE_MANGO_TREES);
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
