package com.mazen.gemcraft;

import com.mazen.gemcraft.block.ModBlocks;
import com.mazen.gemcraft.creativemodetab.ModCreativeModeTabs;
import com.mazen.gemcraft.item.ModItems;
import com.mazen.gemcraft.worldgen.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GemCraft implements ModInitializer {
	public static final String MOD_ID = "gemcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();
	}
}
