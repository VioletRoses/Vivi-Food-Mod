package net.vivi.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.vivi.ViviMain;
import net.vivi.block.ViviGrass;

import static net.minecraft.util.registry.Registry.*;

public class ViviBlocks {

    //Grass
    public static final Block GARDEN_GRASS = new ViviGrass(FabricBlockSettings.copyOf(Blocks.GRASS).breakInstantly().materialColor(MaterialColor.GREEN_TERRACOTTA).sounds(BlockSoundGroup.GRASS).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).collidable(false));

    //Leaves
    public static final Block PEACH_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).hardness(0.2f).materialColor(MaterialColor.GREEN_TERRACOTTA).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).sounds(BlockSoundGroup.GRASS));
    public static final Block ORANGE_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).hardness(0.2f).materialColor(MaterialColor.GREEN_TERRACOTTA).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).sounds(BlockSoundGroup.GRASS));
    public static final Block LYCHEE_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).hardness(0.2f).materialColor(MaterialColor.RED_TERRACOTTA).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).sounds(BlockSoundGroup.GRASS));
    public static final Block CHERRY_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).hardness(0.2f).materialColor(MaterialColor.RED_TERRACOTTA).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).sounds(BlockSoundGroup.GRASS));

    //Saplings
    public static final Block PEACH_SAPLING = new Block(FabricBlockSettings.of(Material.PLANT).breakInstantly());
    public static final Block ORANGE_SAPLING = new Block(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING));

    //Ores
    public static final Block SALT_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(1.0f).requiresTool());


    public static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    public static void init() {

        //Grass
        register(BLOCK, new Identifier("vivi", "garden_grass"), GARDEN_GRASS);
        register(ITEM, new Identifier("vivi", "garden_grass"), new BlockItem(GARDEN_GRASS, new Item.Settings().group(ItemGroup.DECORATIONS)));

        //Leaves
        register(BLOCK, new Identifier("vivi", "peach_leaves"), PEACH_LEAVES);
        //TODO: Orange leaves texture
        register(BLOCK, new Identifier("vivi", "orange_leaves"), ORANGE_LEAVES);
        //TODO: Cherry leaves texture
        register(BLOCK, new Identifier("vivi", "cherry_leaves"), CHERRY_LEAVES);
        register(ITEM, new Identifier("vivi", "peach_leaves"), new BlockItem(PEACH_LEAVES, new Item.Settings().group(ItemGroup.DECORATIONS)));

        //Saplings
        //TODO: Peach sapling texture
        register(BLOCK, new Identifier("vivi", "peach_sapling"), PEACH_SAPLING);
        //TODO: Orange sapling texture
        register(BLOCK, new Identifier("vivi", "orange_sapling"), ORANGE_SAPLING);
        register(ITEM, new Identifier("vivi", "peach_sapling"), new BlockItem(PEACH_SAPLING, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));

        //Ores
        register(BLOCK, new Identifier("vivi", "salt_ore"), SALT_ORE);
        register(ITEM, new Identifier("vivi", "salt_ore"), new BlockItem(SALT_ORE, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));

    }
}
