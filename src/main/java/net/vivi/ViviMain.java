package net.vivi;

import net.fabricmc.api.ModInitializer;
import net.vivi.init.BlockInit;
import net.vivi.init.CropInit;
import net.vivi.init.FoodInit;
import net.vivi.init.ToolInit;
import net.vivi.init.WorldGenInit;

public class ViviMain implements ModInitializer {

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
