package net.vivi;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.vivi.init.ViviBlocks;
import net.vivi.init.ViviCrops;
import net.vivi.init.ViviFoods;
import net.vivi.init.ViviTools;
import net.vivi.init.ViviWorldGen;

public class ViviMain implements ModInitializer {

	public static final ItemGroup VIVI_FOOD_GROUP = FabricItemGroupBuilder.build(new Identifier("vivi", "food"), () -> new ItemStack(ViviCrops.STRAWBERRY));

	@Override
	public void onInitialize() {
		System.out.println("Vivi's food mod is starting!");
		//Adds crops/base foods
		ViviCrops.init();
		//Adds meals/combined foods
		ViviFoods.init();
		//Adds tools
		ViviTools.init();
		//Adds blocks (salt, etc.)
		ViviBlocks.init();
		//Enables worldgen features
		ViviWorldGen.init();
	}
}
