package net.vivi.init;

import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ViviWorldGen {

    public static ConfiguredFeature<?, ?> ORE_SALT_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ViviBlocks.SALT_ORE.getDefaultState(), 27)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64)).spreadHorizontally().repeat(10));
    public static ConfiguredFeature<?, ?> PEACH_TREE = Feature.TREE.configure(new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
            new SimpleBlockStateProvider(ViviBlocks.PEACH_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3),
            new StraightTrunkPlacer(6, 0, 0),
            new TwoLayersFeatureSize(1, 0, 0))
            .build());

    public static void init() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", ""), PEACH_TREE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "ore_salt_overworld"), ORE_SALT_OVERWORLD);
    }
}
