package net.vivi.init;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vivi.ViviMain;
import net.vivi.item.DrinkItem;

public class FoodInit {
    //TODO: Strawberry jelly texture
    public static final Item STRAWBERRY_JELLY = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).snack().build()));
    //TODO: Salad texture
    public static final Item SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(9).saturationModifier(1.0f).build()));
    //TODO: Chicken salad texture
    public static final Item CHICKEN_SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(12).saturationModifier(1.2f).meat().build()));
    //TODO: Tofu salad texture
    public static final Item TOFU_SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(11).saturationModifier(1.2f).build()));
    //TODO: Raw bacon texture
    public static final Item RAW_BACON = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0f).meat().build()));
    //TODO: Cooked bacon texture
    public static final Item COOKED_BACON = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(1.2f).meat().build()));
    //TODO: Silken tofu texture
    public static final Item SILKEN_TOFU = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).snack().build()));
    //TODO: Firm tofu texture
    public static final Item FIRM_TOFU = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build()));
    //TODO: Coffee texture
    public static final Item COFFEE = new DrinkItem(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.2f).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 60 * 20), 1.0f).build()));
    //TODO: Green tea texture
    public static final Item GREEN_TEA = new DrinkItem(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5 * 20), 0.8f).build()));
    //TODO: Mint tea texture
    public static final Item MINT_TEA = new DrinkItem(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10 * 20), 1.0f).build()));


    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("vivi", "strawberry_jelly"), STRAWBERRY_JELLY);
        Registry.register(Registry.ITEM, new Identifier("vivi", "salad"), SALAD);
        Registry.register(Registry.ITEM, new Identifier("vivi", "chicken_salad"), CHICKEN_SALAD);
        Registry.register(Registry.ITEM, new Identifier("vivi", "tofu_salad"), TOFU_SALAD);
        Registry.register(Registry.ITEM, new Identifier("vivi", "raw_bacon"), RAW_BACON);
        Registry.register(Registry.ITEM, new Identifier("vivi", "cooked_bacon"), COOKED_BACON);
        Registry.register(Registry.ITEM, new Identifier("vivi", "silken_tofu"), SILKEN_TOFU);
        Registry.register(Registry.ITEM, new Identifier("vivi", "firm_tofu"), FIRM_TOFU);
        Registry.register(Registry.ITEM, new Identifier("vivi", "coffee"), COFFEE);
        Registry.register(Registry.ITEM, new Identifier("vivi", "green_tea"), GREEN_TEA);
        Registry.register(Registry.ITEM, new Identifier("vivi", "mint_tea"), MINT_TEA);
    }
}
