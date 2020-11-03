package net.vivi.food.util;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.function.Supplier;

public class ViviSaplingGenerator extends SaplingGenerator {
    public final Supplier<TreeFeatureConfig> configSupplier;

    public ViviSaplingGenerator(Supplier<TreeFeatureConfig> configSupplier) {
        this.configSupplier = configSupplier;
    }

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
        return Feature.TREE.configure(configSupplier.get());
    }
}
