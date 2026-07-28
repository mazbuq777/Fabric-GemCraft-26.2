package com.mazen.gemcraft.item.custom;

import com.mazen.gemcraft.block.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.Map;
import java.util.function.Consumer;

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
        BlockPos pos = context.getClickedPos();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(TRANSMUTATION_MAP.containsKey(clickedBlock) && !level.isClientSide()) {
            // We are on the Server!

            // Play blaze shoot sound
            level.playSound(
                    null,
                    pos,
                    SoundEvents.BLAZE_SHOOT,
                    SoundSource.PLAYERS,
                    1.0F,
                    1.0F
            );

            // Spawn flame particles
            if (level instanceof ServerLevel serverLevel) {
                serverLevel.sendParticles(
                        ParticleTypes.FLAME,
                        pos.getX() + 0.5,
                        pos.getY() + 0.5,
                        pos.getZ() + 0.5,
                        20,     // particle count
                        0.3,    // x spread
                        0.3,    // y spread
                        0.3,    // z spread
                        0.02    // speed
                );
            }

            level.setBlockAndUpdate(context.getClickedPos(), TRANSMUTATION_MAP.get(clickedBlock).defaultBlockState());
            context.getItemInHand().hurtAndBreak(1, context.getPlayer(), context.getHand());
        }

        return InteractionResult.SUCCESS;
    }

    //Add tooltips! go to lang to change them there.
    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                Consumer<Component> builder, TooltipFlag tooltipFlag) {

        if (Minecraft.getInstance().hasShiftDown()){
            builder.accept(Component.translatable("tooltip.gemcraft.magic_wand.shift_down"));
        } else {
            builder.accept(Component.translatable("tooltip.gemcraft.magic_wand"));
        }


        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
    }

    @Override
    public boolean isFoil(ItemStack stack){
        return true;
    }


}
