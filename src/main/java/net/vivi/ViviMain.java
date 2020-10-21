package net.vivi;

import net.fabricmc.api.ModInitializer;
import net.vivi.init.CropInit;
import net.vivi.init.FoodInit;
import net.vivi.init.ToolInit;


public class ViviMain implements ModInitializer {


	@Override
	public void onInitialize() {
		System.out.println("Vivi's food mod is starting!");
		CropInit.init();
		FoodInit.init();
		ToolInit.init();
	}
}
