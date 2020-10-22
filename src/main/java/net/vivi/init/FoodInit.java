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
    public static final Item TOFU_SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(11).saturationModifier(12.0f).build()));
    public static final Item RAW_BACON = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(2.0f).meat().build()));
    public static final Item COOKED_BACON = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(14f).meat().build()));
    public static final Item SILKEN_TOFU = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(2.0f).snack().build()));
    public static final Item FIRM_TOFU = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(5.0f).build()));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("vivi", "strawberry_jelly"), STRAWBERRY_JELLY);
        Registry.register(Registry.ITEM, new Identifier("vivi", "salad"), SALAD);
        Registry.register(Registry.ITEM, new Identifier("vivi", "chicken_salad"), CHICKEN_SALAD);
        Registry.register(Registry.ITEM, new Identifier("vivi", "tofu_salad"), TOFU_SALAD);
        Registry.register(Registry.ITEM, new Identifier("vivi", "raw_bacon"), RAW_BACON);
        Registry.register(Registry.ITEM, new Identifier("vivi", "cooked_bacon"), COOKED_BACON);
        Registry.register(Registry.ITEM, new Identifier("vivi", "silken_tofu"), SILKEN_TOFU);
        Registry.register(Registry.ITEM, new Identifier("vivi", "firm_tofu"), FIRM_TOFU);
    }
}
