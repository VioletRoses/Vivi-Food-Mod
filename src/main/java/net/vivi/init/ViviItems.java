package net.vivi.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.vivi.ViviMain;

import static net.minecraft.util.registry.Registry.ITEM;
import static net.minecraft.util.registry.Registry.register;

public class ViviItems {
    public static final Item SALT = new Item(new FabricItemSettings().group(ViviMain.VIVI_FOOD_GROUP));

    public static void init() {
        //TODO: Salt texture
        register(ITEM, new Identifier("vivi", "salt"), SALT);

    }
}
