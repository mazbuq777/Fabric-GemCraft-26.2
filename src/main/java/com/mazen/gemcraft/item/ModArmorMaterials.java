package com.mazen.gemcraft.item;

import com.mazen.gemcraft.GemCraft;
import com.mazen.gemcraft.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> RUBY_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, "ruby"));
    public static final ResourceKey<EquipmentAsset> SAPPHIRE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, "sapphire"));
    public static final ResourceKey<EquipmentAsset> TOPAZ_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, "topaz"));

    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(750,
            ArmorMaterials.makeDefense(3, 6, 8, 3, 11),
            10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2, 0, ModTags.Items.RUBY_REPAIR, RUBY_KEY);

    public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new ArmorMaterial(750,
            ArmorMaterials.makeDefense(3, 6, 8, 3, 11),
            10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2, 0, ModTags.Items.SAPPHIRE_REPAIR, SAPPHIRE_KEY);

    public static final ArmorMaterial TOPAZ_ARMOR_MATERIAL = new ArmorMaterial(750,
            ArmorMaterials.makeDefense(3, 6, 8, 3, 11),
            10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2, 0, ModTags.Items.TOPAZ_REPAIR, TOPAZ_KEY);
}
