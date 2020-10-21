package net.vivi.init;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class WorldGenInit {

    public static ConfiguredFeature<?, ?> ORE_SALT_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockInit.SALT_BLOCK.getDefaultState(), 27)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64)).spreadHorizontally().repeat(15));

    public static void init() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("vivi", "ore_salt_overworld"), ORE_SALT_OVERWORLD);
    }
}
