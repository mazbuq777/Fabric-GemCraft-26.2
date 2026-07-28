package com.mazen.gemcraft.datagen;

import com.mazen.gemcraft.block.ModBlocks;
import com.mazen.gemcraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                //Add smeltables here
                List<ItemLike> RUBY_SMELTABLES = List.of(
                        ModBlocks.RUBY_ORE,
                        ModBlocks.RUBY_DEEPSLATE_ORE,
                        ModBlocks.RUBY_NETHER_ORE,
                        ModBlocks.RUBY_END_ORE
                );
                List<ItemLike> SAPPHIRE_SMELTABLES = List.of(
                        ModBlocks.SAPPHIRE_ORE,
                        ModBlocks.SAPPHIRE_DEEPSLATE_ORE,
                        ModBlocks.SAPPHIRE_NETHER_ORE,
                        ModBlocks.SAPPHIRE_END_ORE
                );
                List<ItemLike> TOPAZ_SMELTABLES = List.of(
                        ModBlocks.TOPAZ_ORE,
                        ModBlocks.TOPAZ_DEEPSLATE_ORE,
                        ModBlocks.TOPAZ_NETHER_ORE,
                        ModBlocks.TOPAZ_END_ORE
                );


                //Add smelting
                oreSmelting(RUBY_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.RUBY, 1f, 200, "ruby");
                oreSmelting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SAPPHIRE, 1f, 200, "sapphire");
                oreSmelting(TOPAZ_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.TOPAZ, 1f, 200, "topaz");

                //Add blast smelting
                oreBlasting(RUBY_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.RUBY, 1f, 100, "ruby");
                oreBlasting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SAPPHIRE, 1f, 100, "sapphire");
                oreBlasting(TOPAZ_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.TOPAZ, 1f, 100, "topaz");

                //Blocks recipe
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.SAPPHIRE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.TOPAZ, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_BLOCK);

                //Add recipes here

                shaped(RecipeCategory.TOOLS, ModItems.MAGIC_WAND)
                        .pattern("TRS")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Items.STICK)
                        .define('T', ModItems.TOPAZ)
                        .define('R', ModItems.RUBY)
                        .define('S', ModItems.SAPPHIRE)
                        .unlockedBy(getHasName(ModItems.TOPAZ), has(Items.STICK))
                        .unlockedBy(getHasName(ModItems.RUBY), has(Items.STICK))
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(Items.STICK))
                        .save(this.output);

                //Ruby tools start
                shaped(RecipeCategory.COMBAT, ModItems.RUBY_SWORD)
                        .pattern("R")
                        .pattern("R")
                        .pattern("#")
                        .define('#', Items.STICK)
                        .define('R', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE)
                        .pattern("RRR")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Items.STICK)
                        .define('R', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_AXE)
                        .pattern("RR")
                        .pattern("#R")
                        .pattern("# ")
                        .define('#', Items.STICK)
                        .define('R', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL)
                        .pattern("R")
                        .pattern("#")
                        .pattern("#")
                        .define('#', Items.STICK)
                        .define('R', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_HOE)
                        .pattern("RR")
                        .pattern("# ")
                        .pattern("# ")
                        .define('#', Items.STICK)
                        .define('R', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, ModItems.RUBY_SPEAR)
                        .pattern("  R")
                        .pattern(" # ")
                        .pattern("#  ")
                        .define('#', Items.STICK)
                        .define('R', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(Items.STICK))
                        .save(this.output);
                //Ruby tools end-------------------------------------------------

                //Sapphire tools start-------------------------------------------
                shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_SWORD)
                        .pattern("S")
                        .pattern("S")
                        .pattern("#")
                        .define('#', Items.STICK)
                        .define('S', ModItems.SAPPHIRE)
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_PICKAXE)
                        .pattern("SSS")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Items.STICK)
                        .define('S', ModItems.SAPPHIRE)
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_AXE)
                        .pattern("SS")
                        .pattern("#S")
                        .pattern("# ")
                        .define('#', Items.STICK)
                        .define('S', ModItems.SAPPHIRE)
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_SHOVEL)
                        .pattern("S")
                        .pattern("#")
                        .pattern("#")
                        .define('#', Items.STICK)
                        .define('S', ModItems.SAPPHIRE)
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_HOE)
                        .pattern("SS")
                        .pattern("# ")
                        .pattern("# ")
                        .define('#', Items.STICK)
                        .define('S', ModItems.SAPPHIRE)
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_SPEAR)
                        .pattern("  S")
                        .pattern(" # ")
                        .pattern("#  ")
                        .define('#', Items.STICK)
                        .define('S', ModItems.SAPPHIRE)
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(Items.STICK))
                        .save(this.output);

                //Sapphire end------------------------------------------------------

                //Topaz start
                shaped(RecipeCategory.COMBAT, ModItems.TOPAZ_SWORD)
                        .pattern(" T ")
                        .pattern(" T ")
                        .pattern(" # ")
                        .define('#', Items.STICK)
                        .define('T', ModItems.TOPAZ)
                        .unlockedBy(getHasName(ModItems.TOPAZ), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.TOPAZ_PICKAXE)
                        .pattern("TTT")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Items.STICK)
                        .define('T', ModItems.TOPAZ)
                        .unlockedBy(getHasName(ModItems.TOPAZ), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.TOPAZ_AXE)
                        .pattern("TT")
                        .pattern("#T")
                        .pattern("# ")
                        .define('#', Items.STICK)
                        .define('T', ModItems.TOPAZ)
                        .unlockedBy(getHasName(ModItems.TOPAZ), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.TOPAZ_SHOVEL)
                        .pattern("T")
                        .pattern("#")
                        .pattern("#")
                        .define('#', Items.STICK)
                        .define('T', ModItems.TOPAZ)
                        .unlockedBy(getHasName(ModItems.TOPAZ), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, ModItems.TOPAZ_HOE)
                        .pattern("TT")
                        .pattern("# ")
                        .pattern("# ")
                        .define('#', Items.STICK)
                        .define('T', ModItems.TOPAZ)
                        .unlockedBy(getHasName(ModItems.TOPAZ), has(Items.STICK))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, ModItems.TOPAZ_SPEAR)
                        .pattern("  T")
                        .pattern(" # ")
                        .pattern("#  ")
                        .define('#', Items.STICK)
                        .define('T', ModItems.TOPAZ)
                        .unlockedBy(getHasName(ModItems.TOPAZ), has(Items.STICK))
                        .save(this.output);

                //Topaz end------------------------------------------------------

            }
        };
    }

    @Override
    public String getName() {
        return "GemCraft Recipes";
    }
}
