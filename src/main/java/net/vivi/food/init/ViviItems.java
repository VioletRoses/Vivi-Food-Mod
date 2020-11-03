package net.vivi.food.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.vivi.food.ViviMain;

import static net.minecraft.util.registry.Registry.ITEM;
import static net.minecraft.util.registry.Registry.register;

public class ViviItems {
    public static final Item SALT = new Item(new FabricItemSettings().group(ViviMain.VIVI_FOOD_GROUP));
    public static final Item MORTAR_AND_PESTLE = new Item(new FabricItemSettings().group(ViviMain.VIVI_FOOD_GROUP));

    public static void init() {
        //TODO: Salt texture
        register(ITEM, new Identifier("vivi", "salt"), SALT);
        //TODO: Mortar and pestle texture
        register(ITEM, new Identifier("vivi", "mortar_and_pestle"), MORTAR_AND_PESTLE);

    }
}
