package com.mazen.gemcraft.datagen;

import com.mazen.gemcraft.block.ModBlocks;
import com.mazen.gemcraft.item.ModArmorMaterials;
import com.mazen.gemcraft.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    //Add blocks to generate its model
    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        //Gem blocks
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.TOPAZ_BLOCK);

        //Gem ores
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.TOPAZ_ORE);

        //Gem deepslate ores
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.TOPAZ_DEEPSLATE_ORE);

        //Gem nether ores
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_NETHER_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_NETHER_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.TOPAZ_NETHER_ORE);

        //Gem end ores
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_END_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_END_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.TOPAZ_END_ORE);
    }

    //Add items to generate its model
    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

        itemModelGenerators.generateFlatItem(ModItems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.MAGIC_WAND, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.RUBY_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.RUBY_SPEAR);

        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.SAPPHIRE_SPEAR);

        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.TOPAZ_SPEAR);

        itemModelGenerators.generateTrimmableItem(ModItems.RUBY_HELMET, ModArmorMaterials.      RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.RUBY_CHESTPLATE, ModArmorMaterials.  RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.RUBY_LEGGINGS, ModArmorMaterials.    RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.RUBY_BOOTS, ModArmorMaterials.       RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_HELMET, ModArmorMaterials.      SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_CHESTPLATE, ModArmorMaterials.  SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_LEGGINGS, ModArmorMaterials.    SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_BOOTS, ModArmorMaterials.       SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.TOPAZ_HELMET, ModArmorMaterials.      TOPAZ_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.TOPAZ_CHESTPLATE, ModArmorMaterials.  TOPAZ_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.TOPAZ_LEGGINGS, ModArmorMaterials.    TOPAZ_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.TOPAZ_BOOTS, ModArmorMaterials.       TOPAZ_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

    }
}
