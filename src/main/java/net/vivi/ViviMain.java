package net.vivi;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vivi.init.CropInit;
import net.vivi.init.FoodInit;


public class ViviMain implements ModInitializer {
	public static final SwordItem CACTUS_SWORD = new CactusSword(CactusToolMaterial.INSTANCE, 0, -2.2f, new Item.Settings().group(ItemGroup.COMBAT));


	@Override
	public void onInitialize() {
		System.out.println("Vivi's food mod is starting!");
		CropInit.init();
		FoodInit.init();
		Registry.register(Registry.ITEM, new Identifier("vivi", "cactus_sword"), CACTUS_SWORD);
	}
}
