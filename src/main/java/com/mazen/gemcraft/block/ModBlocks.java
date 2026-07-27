package com.mazen.gemcraft.block;

import com.mazen.gemcraft.GemCraft;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public class ModBlocks {

    //Ruby Block
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            properties -> new Block(
                    properties
                            //Properties
                            .strength(5f, 6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)));
    //Block end

    //Ruby ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(3f, 3f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.STONE)));
    //Block end

    //Ruby deepslate ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block RUBY_DEEPSLATE_ORE = registerBlock("ruby_deepslate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(4.5f, 3f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.DEEPSLATE)));
    //Block end

    //Ruby nether ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block RUBY_NETHER_ORE = registerBlock("ruby_nether_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(3f, 3f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.NETHER)));
    //Block end

    //Ruby end ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block RUBY_END_ORE = registerBlock("ruby_end_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(3f, 6f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.SAND)));
    //Block end

    //Sapphire block
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            properties -> new Block(
                    properties
                            //Properties
                            .strength(5f, 6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)));
    //Block end

    //Sapphire ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(3f, 3f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.STONE)));
    //Block end

    //Sapphire deepslate ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block SAPPHIRE_DEEPSLATE_ORE = registerBlock("sapphire_deepslate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(4.5f, 3f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.DEEPSLATE)));
    //Block end

    //Sapphire nether ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block SAPPHIRE_NETHER_ORE = registerBlock("sapphire_nether_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(3f, 3f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.NETHER)));
    //Block end

    //Sapphire end ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block SAPPHIRE_END_ORE = registerBlock("sapphire_end_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(3f, 6f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.SAND)));
    //Block end

    //Topaz block
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            properties -> new Block(
                    properties
                            //Properties
                            .strength(5f, 6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)));
    //Block end

    //Topaz ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(3f, 3f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.STONE)));
    //Block end

    //Topaz deepslate ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block TOPAZ_DEEPSLATE_ORE = registerBlock("topaz_deepslate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(4.5f, 3f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.DEEPSLATE)));
    //Block end

    //Topaz nether ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block TOPAZ_NETHER_ORE = registerBlock("topaz_nether_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(3f, 3f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.NETHER)));
    //Block end

    //Topaz end ore
    //Blocks start            Name of block variable            Name of block reference (copy this to use in en_us.json)
    public static final Block TOPAZ_END_ORE = registerBlock("topaz_end_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties
                            //Properties
                            .strength(3f, 6f)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.SAND)));
    //Block end



    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GemCraft.MOD_ID, name)))));
    }

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    public static void registerModBlocks() {
        GemCraft.LOGGER.info("Registering Mod Blocks for " + GemCraft.MOD_ID);
    }
}
