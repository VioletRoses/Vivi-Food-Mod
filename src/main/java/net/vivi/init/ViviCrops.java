package net.vivi.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.vivi.ViviMain;
import net.vivi.block.*;

import static net.minecraft.util.registry.Registry.*;

public class ViviCrops {

    public static final Block TOMATO_CROP = new TomatoCrop(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Block LETTUCE_CROP = new LettuceCrop(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Block STRAWBERRY_CROP = new StrawberryCrop(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Block CORN_CROP = new CornCrop(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Block SOYBEAN_CROP = new SoybeanCrop(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Block COFFEE_CROP = new CoffeeCrop(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Block TEA_CROP = new TeaCrop(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Block MINT_CROP = new MintCrop(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));



    public static void init() {
        //TODO: Fix up tomato crop texture, seed texture
        register(BLOCK, new Identifier("vivi", "tomato_crop"), TOMATO_CROP);
        register(ITEM, new Identifier("vivi", "tomato_seeds"), new BlockItem(TOMATO_CROP, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));

        //TODO: Lettuce crop texture, seed texture
        register(BLOCK, new Identifier("vivi", "lettuce_crop"), LETTUCE_CROP);
        register(ITEM, new Identifier("vivi", "lettuce_seeds"), new BlockItem(LETTUCE_CROP, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));

        //TODO: Strawberry crop texture, seed texture
        register(BLOCK, new Identifier("vivi", "strawberry_crop"), STRAWBERRY_CROP);
        register(ITEM, new Identifier("vivi", "strawberry_seeds"), new BlockItem(STRAWBERRY_CROP, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));

        //TODO: Corn crop texture, seed texture
        register(BLOCK, new Identifier("vivi", "corn_crop"), CORN_CROP);
        register(ITEM, new Identifier("vivi", "corn_seeds"), new BlockItem(CORN_CROP, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));

        //TODO: Soybean crop texture, seed texture
        register(BLOCK, new Identifier("vivi", "soybean_crop"), SOYBEAN_CROP);
        register(ITEM, new Identifier("vivi", "soybean_seeds"), new BlockItem(SOYBEAN_CROP, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));

        //TODO: Coffee crop texture, seed texture
        register(BLOCK, new Identifier("vivi", "coffee_crop"), COFFEE_CROP);
        register(ITEM, new Identifier("vivi", "coffee_seeds"), new BlockItem(COFFEE_CROP, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));

        //TODO: Tea crop texture, seed texture
        register(BLOCK, new Identifier("vivi", "tea_crop"), TEA_CROP);
        register(ITEM, new Identifier("vivi", "tea_seeds"), new BlockItem(TEA_CROP, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));

        //TODO: Mint crop texture, seed texture
        register(BLOCK, new Identifier("vivi", "mint_crop"), MINT_CROP);
        register(ITEM, new Identifier("vivi", "mint_seeds"), new BlockItem(MINT_CROP, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP)));
    }
}
