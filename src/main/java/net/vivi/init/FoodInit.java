package net.vivi.init;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vivi.ViviMain;

public class FoodInit {

    public static final Item STRAWBERRY_JELLY = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(2.0f).snack().build()));
    public static final Item SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(9).saturationModifier(10.0f).build()));
    public static final Item CHICKEN_SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(12).saturationModifier(15.0f).meat().build()));
    public static final Item RAW_BACON = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(2.0f).meat().build()));
    public static final Item COOKED_BACON = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(14f).meat().build()));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("vivi", "strawberry_jelly"), STRAWBERRY_JELLY);
        Registry.register(Registry.ITEM, new Identifier("vivi", "salad"), SALAD);
        Registry.register(Registry.ITEM, new Identifier("vivi", "chicken_salad"), CHICKEN_SALAD);
        Registry.register(Registry.ITEM, new Identifier("vivi", "raw_bacon"), RAW_BACON);
        Registry.register(Registry.ITEM, new Identifier("vivi", "cooked_bacon"), COOKED_BACON);
    }
}
