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

    public static final Block GARDEN_GRASS = new ViviGrass(FabricBlockSettings.copyOf(Blocks.GRASS).breakInstantly().materialColor(MaterialColor.GREEN_TERRACOTTA).sounds(BlockSoundGroup.GRASS).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).collidable(false));
    public static final Block SALT_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(1.0f).requiresTool());
    public static final Item SALT = new Item(new FabricItemSettings().group(ViviMain.VIVI_FOOD_GROUP));
    //TODO: Salt texture
    public static final Block PEACH_SAPLING = new Block(FabricBlockSettings.of(Material.PLANT).breakInstantly());
    //TODO: Peach sapling texture
    public static final Block PEACH_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).hardness(0.2f).materialColor(MaterialColor.GREEN_TERRACOTTA).suffocates(ViviBlocks::never).blockVision(ViviBlocks::never).sounds(BlockSoundGroup.GRASS));

    public static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    public static void init() {
        register(BLOCK, new Identifier("vivi", "garden_grass"), GARDEN_GRASS);
        register(ITEM, new Identifier("vivi", "garden_grass"), new BlockItem(GARDEN_GRASS, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));
        register(BLOCK, new Identifier("vivi", "peach_leaves"), PEACH_LEAVES);
        register(BLOCK, new Identifier("vivi", "peach_sapling"), PEACH_SAPLING);
        register(ITEM, new Identifier("vivi", "peach_sapling"), new BlockItem(PEACH_SAPLING, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));
        register(ITEM, new Identifier("vivi", "peach_leaves"), new BlockItem(PEACH_LEAVES, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register(ITEM, new Identifier("vivi", "salt"), SALT);
        register(BLOCK, new Identifier("vivi", "salt_ore"), SALT_ORE);
        register(ITEM, new Identifier("vivi", "salt_ore"), new BlockItem(SALT_ORE, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));
    }
}
