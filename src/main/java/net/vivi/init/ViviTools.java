package net.vivi.init;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.vivi.ViviMain;
import net.vivi.tool.CactusSword;
import net.vivi.tool.material.CactusToolMaterial;

import static net.minecraft.util.registry.Registry.*;

public class ViviTools {

    public static final SwordItem CACTUS_SWORD = new CactusSword(CactusToolMaterial.INSTANCE, 0, -2.2f, new Item.Settings().group(ViviMain.VIVI_FOOD_GROUP));

    public static void init() {
        register(ITEM, new Identifier("vivi", "cactus_sword"), CACTUS_SWORD);
    }
}
