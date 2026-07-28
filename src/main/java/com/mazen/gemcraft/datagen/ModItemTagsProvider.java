package com.mazen.gemcraft.datagen;

import com.mazen.gemcraft.item.ModItems;
import com.mazen.gemcraft.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {


    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        tag(ModTags.Items.GEMS)
                .add(ModItems.getRK(ModItems.RUBY))
                .add(ModItems.getRK(ModItems.SAPPHIRE))
                .add(ModItems.getRK(ModItems.TOPAZ));

        tag(ItemTags.SWORDS).add(ModItems.getRK(ModItems.   RUBY_SWORD));
        tag(ItemTags.PICKAXES).add(ModItems.getRK(ModItems. RUBY_PICKAXE));
        tag(ItemTags.SHOVELS).add(ModItems.getRK(ModItems.  RUBY_SHOVEL));
        tag(ItemTags.AXES).add(ModItems.getRK(ModItems.     RUBY_AXE));
        tag(ItemTags.HOES).add(ModItems.getRK(ModItems.     RUBY_HOE));
        tag(ItemTags.SPEARS).add(ModItems.getRK(ModItems.   RUBY_SPEAR));

        tag(ItemTags.SWORDS).add(ModItems.getRK(ModItems.   SAPPHIRE_SWORD));
        tag(ItemTags.PICKAXES).add(ModItems.getRK(ModItems. SAPPHIRE_PICKAXE));
        tag(ItemTags.SHOVELS).add(ModItems.getRK(ModItems.  SAPPHIRE_SHOVEL));
        tag(ItemTags.AXES).add(ModItems.getRK(ModItems.     SAPPHIRE_AXE));
        tag(ItemTags.HOES).add(ModItems.getRK(ModItems.     SAPPHIRE_HOE));
        tag(ItemTags.SPEARS).add(ModItems.getRK(ModItems.   SAPPHIRE_SPEAR));

        tag(ItemTags.SWORDS).add(ModItems.getRK(ModItems.   TOPAZ_SWORD));
        tag(ItemTags.PICKAXES).add(ModItems.getRK(ModItems. TOPAZ_PICKAXE));
        tag(ItemTags.SHOVELS).add(ModItems.getRK(ModItems.  TOPAZ_SHOVEL));
        tag(ItemTags.AXES).add(ModItems.getRK(ModItems.     TOPAZ_AXE));
        tag(ItemTags.HOES).add(ModItems.getRK(ModItems.     TOPAZ_HOE));
        tag(ItemTags.SPEARS).add(ModItems.getRK(ModItems.   TOPAZ_SPEAR));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.   RUBY_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.  RUBY_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.    RUBY_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.   RUBY_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.   SAPPHIRE_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.  SAPPHIRE_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.    SAPPHIRE_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.   SAPPHIRE_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.   TOPAZ_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.  TOPAZ_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.    TOPAZ_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.   TOPAZ_BOOTS));

    }
}
