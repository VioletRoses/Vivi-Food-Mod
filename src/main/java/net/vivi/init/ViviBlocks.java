package net.vivi.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vivi.ViviMain;

public class ViviBlocks {
    public static final Block SALT_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(1.0f).requiresTool());
    public static final Item SALT = new Item(new FabricItemSettings().group(ViviMain.VIVI_FOOD_GROUP));
    //TODO: Salt texture
    public static final Block PEACH_SAPLING = new Block(FabricBlockSettings.of(Material.PLANT).breakInstantly());
    //TODO: Peach sapling texture
    public static final Block PEACH_LEAVES = new Block(FabricBlockSettings.of(Material.LEAVES).hardness(0.2f));
    //TODO: Peach leaves texture

    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier("vivi", "peach_leaves"), PEACH_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier("vivi", "peach_sapling"), PEACH_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("vivi", "peach_sapling"), new BlockItem(PEACH_SAPLING, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("vivi", "peach_leaves"), new BlockItem(PEACH_LEAVES, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("vivi", "salt"), SALT);
        Registry.register(Registry.BLOCK, new Identifier("vivi", "salt_ore"), SALT_ORE);
        Registry.register(Registry.ITEM, new Identifier("vivi", "salt_ore"), new BlockItem(SALT_ORE, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));
    }
}
