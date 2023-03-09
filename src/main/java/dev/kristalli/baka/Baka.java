package dev.kristalli.baka;

import dev.kristalli.baka.block.BakaBlocks;
import dev.kristalli.baka.item.BakaItemGroup;
import dev.kristalli.baka.item.BakaItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Baka implements ModInitializer {
	public static final String MOD_ID = "baka";
	public static final Logger LOGGER = LoggerFactory.getLogger("baka");

	@Override
	public void onInitialize() {
		LOGGER.info("B-baka!");
		BakaItemGroup.registerItemGroups();
		BakaItems.registerBakaItems();
		BakaBlocks.registerBlocks();
	}
}