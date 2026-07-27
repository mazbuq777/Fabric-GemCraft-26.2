package com.mazen.gemcraft.datagen;

import com.mazen.gemcraft.block.ModBlocks;
import com.mazen.gemcraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        //Blocks that drop their-self
        dropSelf(ModBlocks.RUBY_BLOCK);
        dropSelf(ModBlocks.SAPPHIRE_BLOCK);
        dropSelf(ModBlocks.TOPAZ_BLOCK);

        //Ore that drops gem
        add(ModBlocks.RUBY_ORE, createOreDrop(ModBlocks.RUBY_ORE, ModItems.RUBY));
        add(ModBlocks.SAPPHIRE_ORE, createOreDrop(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE));
        add(ModBlocks.TOPAZ_ORE, createOreDrop(ModBlocks.TOPAZ_ORE, ModItems.TOPAZ));

        add(ModBlocks.RUBY_DEEPSLATE_ORE, createOreDrop(ModBlocks.RUBY_DEEPSLATE_ORE, ModItems.RUBY));
        add(ModBlocks.SAPPHIRE_DEEPSLATE_ORE, createOreDrop(ModBlocks.SAPPHIRE_DEEPSLATE_ORE, ModItems.SAPPHIRE));
        add(ModBlocks.TOPAZ_DEEPSLATE_ORE, createOreDrop(ModBlocks.TOPAZ_DEEPSLATE_ORE, ModItems.TOPAZ));

        //Ore that drops multiple gems
        add(ModBlocks.RUBY_NETHER_ORE, createMultipleOreDrops(ModBlocks.RUBY_NETHER_ORE, ModItems.RUBY, 1, 2));
        add(ModBlocks.SAPPHIRE_NETHER_ORE, createMultipleOreDrops(ModBlocks.SAPPHIRE_NETHER_ORE, ModItems.SAPPHIRE, 1, 2));
        add(ModBlocks.TOPAZ_NETHER_ORE, createMultipleOreDrops(ModBlocks.TOPAZ_NETHER_ORE, ModItems.TOPAZ, 1, 2));

        add(ModBlocks.RUBY_END_ORE, createMultipleOreDrops(ModBlocks.RUBY_END_ORE, ModItems.RUBY, 1, 2));
        add(ModBlocks.SAPPHIRE_END_ORE, createMultipleOreDrops(ModBlocks.SAPPHIRE_END_ORE, ModItems.SAPPHIRE, 1, 2));
        add(ModBlocks.TOPAZ_END_ORE, createMultipleOreDrops(ModBlocks.TOPAZ_END_ORE, ModItems.TOPAZ, 1, 2));

    }

    public LootTable.Builder createMultipleOreDrops(final Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(
                block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }
}
