package net.vivi.init;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.vivi.ViviMain;
import net.vivi.item.DrinkItem;

import static net.minecraft.util.registry.Registry.*;

public class ViviFoods {

    //TODO: Peach texture
    public static final Item PEACH = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).build()));
    //TODO: Strawberry jelly texture
    public static final Item STRAWBERRY_JELLY = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).build()));
    //TODO: Salad texture
    public static final Item SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(9).saturationModifier(1.0f).build()));
    //TODO: Chicken salad texture
    public static final Item CHICKEN_SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(11).saturationModifier(1.0f).meat().build()));
    //TODO: Tofu salad texture
    public static final Item TOFU_SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(11).saturationModifier(1.0f).build()));
    //TODO: Raw bacon texture
    public static final Item RAW_BACON = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).meat().build()));
    //TODO: Cooked bacon texture
    public static final Item COOKED_BACON = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(9).saturationModifier(1.0f).meat().build()));
    //TODO: Silken tofu texture
    public static final Item SILKEN_TOFU = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).build()));
    //TODO: Firm tofu texture
    public static final Item FIRM_TOFU = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build()));
    //TODO: Coffee texture
    public static final Item COFFEE = new DrinkItem(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 60 * 20), 1.0f).build()));
    //TODO: Green tea texture
    public static final Item GREEN_TEA = new DrinkItem(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5 * 20), 0.8f).build()));
    //TODO: Mint tea texture
    public static final Item MINT_TEA = new DrinkItem(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 8 * 20), 0.9f).build()));
    //TODO: Peach tea texture
    public static final Item PEACH_TEA = new DrinkItem(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(1.0f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 11 * 20), 1.0f).build()));

    public static void init() {
        register(ITEM, new Identifier("vivi", "strawberry_jelly"), STRAWBERRY_JELLY);
        register(ITEM, new Identifier("vivi", "salad"), SALAD);
        register(ITEM, new Identifier("vivi", "chicken_salad"), CHICKEN_SALAD);
        register(ITEM, new Identifier("vivi", "tofu_salad"), TOFU_SALAD);
        register(ITEM, new Identifier("vivi", "raw_bacon"), RAW_BACON);
        register(ITEM, new Identifier("vivi", "cooked_bacon"), COOKED_BACON);
        register(ITEM, new Identifier("vivi", "silken_tofu"), SILKEN_TOFU);
        register(ITEM, new Identifier("vivi", "firm_tofu"), FIRM_TOFU);
        register(ITEM, new Identifier("vivi", "coffee"), COFFEE);
        register(ITEM, new Identifier("vivi", "green_tea"), GREEN_TEA);
        register(ITEM, new Identifier("vivi", "mint_tea"), MINT_TEA);
        register(ITEM, new Identifier("vivi", "peach_tea"), PEACH_TEA);
        register(ITEM, new Identifier("vivi", "peach"), PEACH);
    }
}
