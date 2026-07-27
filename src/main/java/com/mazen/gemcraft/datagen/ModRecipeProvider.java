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

            }
        };
    }

    @Override
    public String getName() {
        return "GemCraft Recipes";
    }
}
