package net.vivi;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CactusToolMaterial implements ToolMaterial {

	public static final CactusToolMaterial INSTANCE = new CactusToolMaterial();

	@Override
	public int getDurability(){
		return 149;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return 2.0f;
	}

	@Override
	public float getAttackDamage() {
		return 5.0f;
	}

	@Override
	public int getMiningLevel() {
		return 2;
	}

	@Override
	public int getEnchantability() {
		return 15;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.CACTUS);
	}
}
