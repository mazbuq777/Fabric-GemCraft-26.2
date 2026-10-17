package com.mazen.gemcraft.worldgen;

import com.mazen.gemcraft.GemCraft;
import com.mazen.gemcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("overworld_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RUBY_ORE_KEY = registerKey("end_ruby_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("overworld_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY = registerKey("nether_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAPPHIRE_ORE_KEY = registerKey("end_sapphire_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TOPAZ_ORE_KEY = registerKey("overworld_topaz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TOPAZ_ORE_KEY = registerKey("nether_topaz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_TOPAZ_ORE_KEY = registerKey("end_topaz_ore");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);
        
//==========================================================================================================================        
        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.RUBY_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.RUBY_DEEPSLATE_ORE.defaultBlockState())),
                9));
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
                ModBlocks.RUBY_NETHER_ORE.defaultBlockState(), 10));
        register(context, END_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.RUBY_END_ORE.defaultBlockState(), 12));
//===========================================================================================================================
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.SAPPHIRE_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.SAPPHIRE_DEEPSLATE_ORE.defaultBlockState())),
                9));
        register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
                ModBlocks.SAPPHIRE_NETHER_ORE.defaultBlockState(), 10));
        register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.SAPPHIRE_END_ORE.defaultBlockState(), 12));
//============================================================================================================================
        register(context, OVERWORLD_TOPAZ_ORE_KEY, Feature.ORE, new OreConfiguration(
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.TOPAZ_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.TOPAZ_DEEPSLATE_ORE.defaultBlockState())),
                9));
        register(context, NETHER_TOPAZ_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
                ModBlocks.TOPAZ_NETHER_ORE.defaultBlockState(), 10));
        register(context, END_TOPAZ_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.TOPAZ_END_ORE.defaultBlockState(), 12));
    }
//=============================================================================================================================
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
