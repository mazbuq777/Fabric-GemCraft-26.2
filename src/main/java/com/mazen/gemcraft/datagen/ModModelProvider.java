package com.mazen.gemcraft.datagen;

import com.mazen.gemcraft.block.ModBlocks;
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

    }
}
