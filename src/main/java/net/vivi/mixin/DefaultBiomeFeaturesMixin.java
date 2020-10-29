package net.vivi.mixin;

import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.vivi.init.ViviWorldGen.*;

@Mixin(DefaultBiomeFeatures.class)
public class DefaultBiomeFeaturesMixin {
    @Inject(method = "addDefaultOres(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
    private static void addDefaultOres(GenerationSettings.Builder builder, CallbackInfo ci) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_SALT_OVERWORLD);
    }
    @Inject(method = "addForestTrees(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
    private static void addForestTrees(GenerationSettings.Builder builder, CallbackInfo ci) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, SPARSE_CHERRY_TREES);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, SPARSE_LYCHEE_TREES);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, SPARSE_ORANGE_TREES);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, SPARSE_PEACH_TREES);
    }
    @Inject(method = "addForestGrass(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
    private static void addForestGrass(GenerationSettings.Builder builder, CallbackInfo ci) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, GARDEN_GRASS);
    }
}
