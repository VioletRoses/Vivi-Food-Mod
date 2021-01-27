package net.vivi.food.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.vivi.food.ViviMain;
import net.vivi.food.block.ViviGrass;
import net.vivi.food.block.ViviSaplingBlock;
import net.vivi.food.util.ViviSaplingGenerator;

import static net.minecraft.util.registry.Registry.*;

public class ViviBlocks {

    //Grass
    public static final Block GARDEN_GRASS = new ViviGrass(FabricBlockSettings.copyOf(Blocks.GRASS).breakInstantly().materialColor(MaterialColor.GREEN_TERRACOTTA).sounds(BlockSoundGroup.GRASS).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).collidable(false));

    //Leaves
    public static final Block PEACH_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).hardness(0.2f).materialColor(MaterialColor.GREEN_TERRACOTTA).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).sounds(BlockSoundGroup.GRASS));
    public static final Block ORANGE_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).hardness(0.2f).materialColor(MaterialColor.GREEN_TERRACOTTA).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).sounds(BlockSoundGroup.GRASS));
    public static final Block LYCHEE_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).hardness(0.2f).materialColor(MaterialColor.RED_TERRACOTTA).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).sounds(BlockSoundGroup.GRASS));
    public static final Block CHERRY_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).hardness(0.2f).materialColor(MaterialColor.RED_TERRACOTTA).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).sounds(BlockSoundGroup.GRASS));
    public static final Block MANGO_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).hardness(0.2f).materialColor(MaterialColor.GREEN_TERRACOTTA).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).sounds(BlockSoundGroup.GRASS));

    //Saplings
    public static final Block PEACH_SAPLING = new ViviSaplingBlock(new ViviSaplingGenerator(() -> ViviFeatures.PEACH_TREE.config));
    public static final Block ORANGE_SAPLING = new ViviSaplingBlock(new ViviSaplingGenerator(() -> ViviFeatures.ORANGE_TREE.config));
    public static final Block CHERRY_SAPLING = new ViviSaplingBlock(new ViviSaplingGenerator(() -> ViviFeatures.CHERRY_TREE.config));
    public static final Block LYCHEE_SAPLING = new ViviSaplingBlock(new ViviSaplingGenerator(() -> ViviFeatures.LYCHEE_TREE.config));
    public static final Block MANGO_SAPLING = new ViviSaplingBlock(new ViviSaplingGenerator(() -> ViviFeatures.MANGO_TREE.config));

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
        //TODO: Lychee leaves texture
        register(BLOCK, new Identifier("vivi", "lychee_leaves"), LYCHEE_LEAVES);
        //TODO: Mango leaves texture
        register(BLOCK, new Identifier("vivi", "mango_leaves"), MANGO_LEAVES);
        register(ITEM, new Identifier("vivi", "peach_leaves"), new BlockItem(PEACH_LEAVES, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register(ITEM, new Identifier("vivi", "orange_leaves"), new BlockItem(ORANGE_LEAVES, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register(ITEM, new Identifier("vivi", "cherry_leaves"), new BlockItem(CHERRY_LEAVES, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register(ITEM, new Identifier("vivi", "lychee_leaves"), new BlockItem(LYCHEE_LEAVES, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register(ITEM, new Identifier("vivi", "mango_leaves"), new BlockItem(MANGO_LEAVES, new Item.Settings().group(ItemGroup.DECORATIONS)));

        //Saplings
        //TODO: Peach sapling texture
        register(BLOCK, new Identifier("vivi", "peach_sapling"), PEACH_SAPLING);
        //TODO: Orange sapling texture
        register(BLOCK, new Identifier("vivi", "orange_sapling"), ORANGE_SAPLING);
        //TODO: Cherry sapling texture
        register(BLOCK, new Identifier("vivi", "cherry_sapling"), CHERRY_SAPLING);
        //TODO: Lychee sapling texture
        register(BLOCK, new Identifier("vivi", "lychee_sapling"), LYCHEE_SAPLING);
        //TODO: Mango sapling texture
        register(BLOCK, new Identifier("vivi", "mango_sapling"), MANGO_SAPLING);

        register(ITEM, new Identifier("vivi", "peach_sapling"), new BlockItem(PEACH_SAPLING, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));
        register(ITEM, new Identifier("vivi", "cherry_sapling"), new BlockItem(CHERRY_SAPLING, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));
        register(ITEM, new Identifier("vivi", "orange_sapling"), new BlockItem(ORANGE_SAPLING, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));
        register(ITEM, new Identifier("vivi", "lychee_sapling"), new BlockItem(LYCHEE_SAPLING, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));
        register(ITEM, new Identifier("vivi", "mango_sapling"), new BlockItem(MANGO_SAPLING, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));

        //Ores
        register(BLOCK, new Identifier("vivi", "salt_ore"), SALT_ORE);
        register(ITEM, new Identifier("vivi", "salt_ore"), new BlockItem(SALT_ORE, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));

    }
}
