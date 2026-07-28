package com.mazen.gemcraft.item;

import com.mazen.gemcraft.GemCraft;
import com.mazen.gemcraft.item.custom.MagicWandItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class ModItems {
    //1. Add Items here, names must be lowercase and can have underscores.
    public static final Item RUBY = registerItem("ruby", Item::new);
    public static final Item SAPPHIRE = registerItem("sapphire", Item::new);
    public static final Item TOPAZ = registerItem("topaz", Item::new);

    public static final Item MAGIC_WAND = registerItem("magic_wand", properties -> new MagicWandItem(properties.durability(1_561)));

    //Ruby tools and weapons------------------------------------------------------------------------------------------------------------------------------------
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            properties -> new Item(properties.sword(ModToolMaterials.RUBY, 3, -2.4F)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.RUBY, 1, -2.8F)));

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            properties -> new ShovelItem(ModToolMaterials.RUBY, 1.5f, -3.0f, properties));

    public static final Item RUBY_AXE = registerItem("ruby_axe",
            properties -> new AxeItem(ModToolMaterials.RUBY, 5f, -3.0f, properties));

    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            properties -> new HoeItem(ModToolMaterials.RUBY, -3f, 0f, properties));

    public static final Item RUBY_SPEAR = registerItem("ruby_spear",
            properties -> new Item(properties.spear(ModToolMaterials.RUBY, 1.05F, 1.075F, 0.5F,
                    3.0F, 10.0F, 6.5F, 5.1F, 10.0F, 4.6F)));

    //Ruby armor-------------------------------------------------------------------------------------------------------------------------------------------------

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.HELMET)));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS)));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS)));

    //Sapphire tools and weapons---------------------------------------------------------------------------------------------------------------------------------
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            properties -> new Item(properties.sword(ModToolMaterials.SAPPHIRE, 3, -2.4F)));

    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.SAPPHIRE, 1, -2.8F)));

    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            properties -> new ShovelItem(ModToolMaterials.SAPPHIRE, 1.5f, -3.0f, properties));

    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            properties -> new AxeItem(ModToolMaterials.SAPPHIRE, 5f, -3.0f, properties));

    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            properties -> new HoeItem(ModToolMaterials.SAPPHIRE, -3f, 0f, properties));

    public static final Item SAPPHIRE_SPEAR = registerItem("sapphire_spear",
            properties -> new Item(properties.spear(ModToolMaterials.SAPPHIRE, 1.05F, 1.075F, 0.5F,
                    3.0F, 10.0F, 6.5F, 5.1F, 10.0F, 4.6F)));

    //Sapphire armor--------------------------------------------------------------------------------------------------------------------------------------------

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.HELMET)));

    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));

    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.BOOTS)));

    //Topaz tools and weapons------------------------------------------------------------------------------------------------------------------------------------
    public static final Item TOPAZ_SWORD = registerItem("topaz_sword",
            properties -> new Item(properties.sword(ModToolMaterials.TOPAZ, 3, -2.4F)));

    public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.TOPAZ, 1, -2.8F)));

    public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel",
            properties -> new ShovelItem(ModToolMaterials.TOPAZ, 1.5f, -3.0f, properties));

    public static final Item TOPAZ_AXE = registerItem("topaz_axe",
            properties -> new AxeItem(ModToolMaterials.TOPAZ, 5f, -3.0f, properties));

    public static final Item TOPAZ_HOE = registerItem("topaz_hoe",
            properties -> new HoeItem(ModToolMaterials.TOPAZ, -3f, 0f, properties));

    public static final Item TOPAZ_SPEAR = registerItem("topaz_spear",
            properties -> new Item(properties.spear(ModToolMaterials.TOPAZ, 1.05F, 1.075F, 0.5F,
                    3.0F, 10.0F, 6.5F, 5.1F, 10.0F, 4.6F)));

    //Topaz armor--------------------------------------------------------------------------------------------------------------------------------------------

    public static final Item TOPAZ_HELMET = registerItem("topaz_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.HELMET)));

    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.LEGGINGS)));

    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.BOOTS)));



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