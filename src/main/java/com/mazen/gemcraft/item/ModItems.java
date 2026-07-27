package com.mazen.gemcraft.item;

import com.mazen.gemcraft.GemCraft;
import com.mazen.gemcraft.item.custom.MagicWandItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    //1. Add Items here, names must be lowercase and can have underscores.
    public static final Item RUBY = registerItem("ruby", Item::new);
    public static final Item SAPPHIRE = registerItem("sapphire", Item::new);
    public static final Item TOPAZ = registerItem("topaz", Item::new);

    public static final Item MAGIC_WAND = registerItem("magic_wand", properties -> new MagicWandItem(properties.durability(1_561)));



    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, name)))));
    }

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    public static void registerModItems() {
        GemCraft.LOGGER.info("Registering Mod Items for " + GemCraft.MOD_ID);

    }
}