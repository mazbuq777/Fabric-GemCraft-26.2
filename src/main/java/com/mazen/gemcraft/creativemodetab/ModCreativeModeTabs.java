package com.mazen.gemcraft.creativemodetab;

import com.mazen.gemcraft.GemCraft;
import com.mazen.gemcraft.block.ModBlocks;
import com.mazen.gemcraft.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    //Add creative tab

    //Tab start
    public static final CreativeModeTab GEMCRAFT_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, "gemcraft_items"),// Change here
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.RUBY)) // Icon
                    .title(Component.translatable("creativemodetab.gemcraft.gemcraft_items")) //Name of tab
                    .displayItems((parameters, output) -> {

                        // Items within tab
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.SAPPHIRE);
                        output.accept(ModItems.TOPAZ);

                        output.accept(ModItems.MAGIC_WAND);


                    }).build());
    //Tab end

    //Tab start
    public static final CreativeModeTab GEMCRAFT_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, "gemcraft_blocks"), // Change here
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK)) // Icon
                    .title(Component.translatable("creativemodetab.gemcraft.gemcraft_blocks")) //Name of tab
                    .displayItems((parameters, output) -> {

                        // Blocks within tab

                        //Gem blocks
                        output.accept(ModBlocks.RUBY_BLOCK);
                        output.accept(ModBlocks.SAPPHIRE_BLOCK);
                        output.accept(ModBlocks.TOPAZ_BLOCK);

                        //Gem ores
                        output.accept(ModBlocks.RUBY_ORE);
                        output.accept(ModBlocks.SAPPHIRE_ORE);
                        output.accept(ModBlocks.TOPAZ_ORE);

                        //Gem deepslate ores
                        output.accept(ModBlocks.RUBY_DEEPSLATE_ORE);
                        output.accept(ModBlocks.SAPPHIRE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.TOPAZ_DEEPSLATE_ORE);

                        //Gem nether ores
                        output.accept(ModBlocks.RUBY_NETHER_ORE);
                        output.accept(ModBlocks.SAPPHIRE_NETHER_ORE);
                        output.accept(ModBlocks.TOPAZ_NETHER_ORE);

                        //Gem end ores
                        output.accept(ModBlocks.RUBY_END_ORE);
                        output.accept(ModBlocks.SAPPHIRE_END_ORE);
                        output.accept(ModBlocks.TOPAZ_END_ORE);


                    }).build());
    //Tab end

    public static void registerModCreativeModeTabs() {
        GemCraft.LOGGER.info("Registering Creative Mode Tabs for " + GemCraft.MOD_ID);
    }

}
