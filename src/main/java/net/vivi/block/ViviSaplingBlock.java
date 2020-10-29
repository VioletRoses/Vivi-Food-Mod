package net.vivi.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.sound.BlockSoundGroup;

public class ViviSaplingBlock extends SaplingBlock {
    public ViviSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    public ViviSaplingBlock(SaplingGenerator generator) {
        this(generator, FabricBlockSettings.of(Material.PLANT).collidable(false).ticksRandomly().hardness(0).sounds(BlockSoundGroup.GRASS));
    }
}
