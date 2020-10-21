package net.vivi.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vivi.CactusSword;
import net.vivi.CactusToolMaterial;

public class ToolInit {
    public static final SwordItem CACTUS_SWORD = new CactusSword(CactusToolMaterial.INSTANCE, 0, -2.2f, new Item.Settings().group(ItemGroup.COMBAT));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("vivi", "cactus_sword"), CACTUS_SWORD);
    }
}
