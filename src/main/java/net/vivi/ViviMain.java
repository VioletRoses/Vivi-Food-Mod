package net.vivi;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vivi.init.CropInit;
import net.vivi.init.FoodInit;


public class ViviMain implements ModInitializer {
	public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD).hardness(4.0f));
	public static final SwordItem CACTUS_SWORD = new CactusSword(CactusToolMaterial.INSTANCE, 0, -2.2f, new Item.Settings().group(ItemGroup.COMBAT));


	@Override
	public void onInitialize() {
		System.out.println("Vivi's food mod is starting!");
		CropInit.init();
		FoodInit.init();
		Registry.register(Registry.ITEM, new Identifier("vivi", "cactus_sword"), CACTUS_SWORD);
		Registry.register(Registry.BLOCK, new Identifier("vivi", "example_block"), EXAMPLE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("vivi", "example_block"), new BlockItem(EXAMPLE_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
	}
}
