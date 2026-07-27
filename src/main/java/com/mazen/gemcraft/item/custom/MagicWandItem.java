package com.mazen.gemcraft.item.custom;

import com.mazen.gemcraft.block.ModBlocks;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.Map;

public class MagicWandItem extends Item {

    private static final Map<Block, Block> TRANSMUTATION_MAP =
            Map.of(
                    ModBlocks.RUBY_BLOCK, ModBlocks.SAPPHIRE_BLOCK,
                    ModBlocks.SAPPHIRE_BLOCK, ModBlocks.TOPAZ_BLOCK,
                    ModBlocks.TOPAZ_BLOCK, ModBlocks.RUBY_BLOCK

            );


    public MagicWandItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        // Right Click Block
        // Change Block from A to B...

        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(TRANSMUTATION_MAP.containsKey(clickedBlock) && !level.isClientSide()) {
            // We are on the Server!
            level.setBlockAndUpdate(context.getClickedPos(), TRANSMUTATION_MAP.get(clickedBlock).defaultBlockState());
            context.getItemInHand().hurtAndBreak(1, context.getPlayer(), context.getHand());
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public boolean isFoil(ItemStack stack){
        return true;
    }


}
