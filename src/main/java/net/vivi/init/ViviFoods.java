package net.vivi.init;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.util.Identifier;
import net.vivi.ViviMain;
import net.vivi.item.DrinkItem;

import static net.minecraft.util.registry.Registry.*;

public class ViviFoods {

    public static final FoodComponent CROP_FRUIT = new FoodComponent.Builder().hunger(3).saturationModifier(0.75f).snack().build();
    public static final FoodComponent TREE_FRUIT = new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).snack().build();
    public static final FoodComponent JELLY = new FoodComponent.Builder().hunger(3).saturationModifier(0.75f).snack().build();


    public static final Item PICKLE = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(5.0f).snack().build()));

    //Crop Fruits
    public static final Item LETTUCE = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(CROP_FRUIT));
    public static final Item TOMATO = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(CROP_FRUIT));
    public static final Item STRAWBERRY = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(CROP_FRUIT));
    public static final Item CORN = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(CROP_FRUIT));
    public static final Item SOYBEAN = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(CROP_FRUIT));
    public static final Item COFFEE_BEANS = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP));
    public static final Item TEA_LEAF = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP));
    public static final Item MINT_LEAF = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP));

    //Tree Fruits
    public static final Item CHERRY = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(TREE_FRUIT));
    public static final Item LYCHEE = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(TREE_FRUIT));
    public static final Item ORANGE = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(TREE_FRUIT));
    public static final Item PEACH = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(TREE_FRUIT));

    //Jellies
    public static final Item STRAWBERRY_JELLY = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(JELLY));
    public static final Item ORANGE_JELLY = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(JELLY));
    public static final Item PEACH_JELLY = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(JELLY));
    public static final Item CHERRY_JELLY = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(JELLY));

    //Drinks
    public static final Item COFFEE = new DrinkItem(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 60 * 20), 1.0f).build()));
    public static final Item GREEN_TEA = new DrinkItem(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5 * 20), 0.8f).build()));
    public static final Item MINT_TEA = new DrinkItem(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 8 * 20), 0.9f).build()));
    public static final Item PEACH_TEA = new DrinkItem(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(1.0f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 11 * 20), 1.0f).build()));

    //Ingredients
    public static final Item FLOUR = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP));
    public static final Item DOUGH = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP));
    public static final Item BREAD_SLICE = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.5f).snack().build()));
    public static final Item TOAST = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.75f).build()));
    public static final Item PEANUT_BUTTER = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(JELLY));

    //Meals
    public static final Item PEANUT_BUTTER_JELLY = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(11).saturationModifier(1.0f).build()));
    public static final Item SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(9).saturationModifier(1.0f).build()));
    public static final Item CHICKEN_SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(11).saturationModifier(1.0f).meat().build()));
    public static final Item TOFU_SALAD = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(11).saturationModifier(1.0f).build()));
    public static final Item RAW_BACON = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).meat().build()));
    public static final Item COOKED_BACON = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(9).saturationModifier(1.0f).meat().build()));
    public static final Item SILKEN_TOFU = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).build()));
    public static final Item FIRM_TOFU = new Item(new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build()));


    public static void init() {

        //Crop fruits
        //TODO: Tomato texture
        register(ITEM, new Identifier("vivi", "tomato"), TOMATO);
        //TODO: Lettuce texture
        register(ITEM, new Identifier("vivi", "lettuce"), LETTUCE);
        //TODO: Strawberry texture
        register(ITEM, new Identifier("vivi", "strawberry"), STRAWBERRY);
        //TODO: Corn texture
        register(ITEM, new Identifier("vivi", "corn"), CORN);
        //TODO: Soybean texture
        register(ITEM, new Identifier("vivi", "soybean"), SOYBEAN);
        //TODO: Coffee beans texture
        register(ITEM, new Identifier("vivi", "coffee_beans"), COFFEE_BEANS);
        //TODO: Tea leaf texture
        register(ITEM, new Identifier("vivi", "tea_leaf"), TEA_LEAF);
        //TODO: Mint leaf texture
        register(ITEM, new Identifier("vivi", "mint_leaf"), MINT_LEAF);

        //Tree fruits
        //TODO: Peach texture
        register(ITEM, new Identifier("vivi", "peach"), PEACH);
        //TODO: Orange texture
        register(ITEM, new Identifier("vivi", "orange"), ORANGE);
        //TODO: Lychee texture
        register(ITEM, new Identifier("vivi", "lychee"), LYCHEE);
        //TODO: Cherry texture
        register(ITEM, new Identifier("vivi", "cherry"), CHERRY);

        //Jellies
        //TODO: Strawberry jelly texture
        register(ITEM, new Identifier("vivi", "strawberry_jelly"), STRAWBERRY_JELLY);
        //TODO: Orange jelly texture
        register(ITEM, new Identifier("vivi", "orange_jelly"), ORANGE_JELLY);
        //TODO: Peach jelly texture
        register(ITEM, new Identifier("vivi", "peach_jelly"), PEACH_JELLY);
        //TODO: Cherry jelly texture
        register(ITEM, new Identifier("vivi", "cherry_jelly"), CHERRY_JELLY);

        //Drinks
        //TODO: Coffee texture
        register(ITEM, new Identifier("vivi", "coffee"), COFFEE);
        //TODO: Green tea texture
        register(ITEM, new Identifier("vivi", "green_tea"), GREEN_TEA);
        //TODO: Mint tea texture
        register(ITEM, new Identifier("vivi", "mint_tea"), MINT_TEA);
        //TODO: Peach tea texture
        register(ITEM, new Identifier("vivi", "peach_tea"), PEACH_TEA);

        //Ingredients
        //TODO: Flour texture
        register(ITEM, new Identifier("vivi", "flour"), FLOUR);
        //TODO: Dough texture
        register(ITEM, new Identifier("vivi", "dough"), DOUGH);
        //TODO: Bread slice texture
        register(ITEM, new Identifier("vivi", "bread_slice"), BREAD_SLICE);
        //TODO: Toast texture
        register(ITEM, new Identifier("vivi", "toast"), TOAST);
        //TODO: Peanut butter texture
        register(ITEM, new Identifier("vivi", "peanut_butter"), PEANUT_BUTTER);

        //Meals
        //TODO: Peanut butter jelly sandwich texture
        register(ITEM, new Identifier("vivi", "peanut_butter_jelly"), PEANUT_BUTTER_JELLY);
        //TODO: Salad texture
        register(ITEM, new Identifier("vivi", "salad"), SALAD);
        //TODO: Chicken salad texture
        register(ITEM, new Identifier("vivi", "chicken_salad"), CHICKEN_SALAD);
        //TODO: Tofu salad texture
        register(ITEM, new Identifier("vivi", "tofu_salad"), TOFU_SALAD);
        //TODO: Raw bacon texture
        register(ITEM, new Identifier("vivi", "raw_bacon"), RAW_BACON);
        //TODO: Cooked bacon texture
        register(ITEM, new Identifier("vivi", "cooked_bacon"), COOKED_BACON);
        //TODO: Silken tofu texture
        register(ITEM, new Identifier("vivi", "silken_tofu"), SILKEN_TOFU);
        //TODO: Firm tofu texture
        register(ITEM, new Identifier("vivi", "firm_tofu"), FIRM_TOFU);

        //Misc
        register(ITEM, new Identifier("vivi", "pickle"), PICKLE);
    }
}
