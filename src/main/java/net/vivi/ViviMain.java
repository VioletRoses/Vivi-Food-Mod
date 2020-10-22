package net.vivi;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.vivi.init.BlockInit;
import net.vivi.init.CropInit;
import net.vivi.init.FoodInit;
import net.vivi.init.ToolInit;
import net.vivi.init.WorldGenInit;

public class ViviMain implements ModInitializer {

	public static final ItemGroup VIVI_FOOD_GROUP = FabricItemGroupBuilder.build(new Identifier("vivi", "food"), () -> new ItemStack(CropInit.STRAWBERRY));

	@Override
	public void onInitialize() {
		System.out.println("Vivi's food mod is starting!");
		//Adds crops/base foods
		CropInit.init();
		//Adds meals/combined foods
		FoodInit.init();
		//Adds tools
		ToolInit.init();
		//Adds blocks (salt, etc.)
		BlockInit.init();
		//Enables worldgen features
		WorldGenInit.init();
	}
}
