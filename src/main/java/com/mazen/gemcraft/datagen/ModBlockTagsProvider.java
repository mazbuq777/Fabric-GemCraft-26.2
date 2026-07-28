package com.mazen.gemcraft.datagen;

import com.mazen.gemcraft.block.ModBlocks;
import com.mazen.gemcraft.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                //Blocks
                .add(ModBlocks.getRK(ModBlocks.RUBY_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_BLOCK))

                //Gem Ores
                .add(ModBlocks.getRK(ModBlocks.RUBY_ORE))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_ORE))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_ORE))

                //Gem Deepslate Ores
                .add(ModBlocks.getRK(ModBlocks.RUBY_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_DEEPSLATE_ORE))

                //Gem Nether Ores
                .add(ModBlocks.getRK(ModBlocks.RUBY_NETHER_ORE))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_NETHER_ORE))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_NETHER_ORE))

                //Gem End Ores
                .add(ModBlocks.getRK(ModBlocks.RUBY_END_ORE))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_END_ORE))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_END_ORE))
                ;

        tag(BlockTags.NEEDS_IRON_TOOL)

                .add(ModBlocks.getRK(ModBlocks.RUBY_ORE))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_ORE))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_ORE))

                .add(ModBlocks.getRK(ModBlocks.RUBY_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_DEEPSLATE_ORE))
                ;

        tag(BlockTags.NEEDS_DIAMOND_TOOL)

                .add(ModBlocks.getRK(ModBlocks.RUBY_NETHER_ORE))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_NETHER_ORE))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_NETHER_ORE))

                .add(ModBlocks.getRK(ModBlocks.RUBY_END_ORE))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_END_ORE))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_END_ORE));

        tag(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(ModTags.Blocks.NEEDS_TOPAZ_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

    }
}