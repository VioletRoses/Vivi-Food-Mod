package net.vivi.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vivi.block.LettuceCrop;
import net.vivi.block.StrawberryCrop;
import net.vivi.block.TomatoCrop;

public class CropInit {
    public static final Item TOMATO = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(2.0f).snack().build()));
    public static final Block TOMATO_CROP = new TomatoCrop(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Item LETTUCE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(2.0f).snack().build()));
    public static final Block LETTUCE_CROP = new LettuceCrop(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Item STRAWBERRY = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(2.0f).snack().build()));
    public static final Block STRAWBERRY_CROP = new StrawberryCrop(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Item PICKLE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(5.0f).snack().build()));


    public static void init() {
        //Tomato
        Registry.register(Registry.ITEM, new Identifier("vivi", "tomato"), TOMATO);
        Registry.register(Registry.BLOCK, new Identifier("vivi", "tomato_crop"), TOMATO_CROP);
        Registry.register(Registry.ITEM, new Identifier("vivi", "tomato_seed"), new BlockItem(TOMATO_CROP, new Item.Settings().group(ItemGroup.FOOD)));

        //Lettuce
        Registry.register(Registry.ITEM, new Identifier("vivi", "lettuce"), LETTUCE);
        Registry.register(Registry.BLOCK, new Identifier("vivi", "lettuce_crop"), LETTUCE_CROP);
        Registry.register(Registry.ITEM, new Identifier("vivi", "lettuce_seed"), new BlockItem(LETTUCE_CROP, new Item.Settings().group(ItemGroup.FOOD)));

        //Strawberry
        Registry.register(Registry.ITEM, new Identifier("vivi", "strawberry"), STRAWBERRY);
        Registry.register(Registry.BLOCK, new Identifier("vivi", "strawberry_crop"), STRAWBERRY_CROP);
        Registry.register(Registry.ITEM, new Identifier("vivi", "strawberry_seed"), new BlockItem(STRAWBERRY_CROP, new Item.Settings().group(ItemGroup.FOOD)));

        Registry.register(Registry.ITEM, new Identifier("vivi", "pickle"), PICKLE);

    }
}
