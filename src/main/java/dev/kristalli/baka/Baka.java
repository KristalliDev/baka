package dev.kristalli.baka;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Baka implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("baka");

	@Override
	public void onInitialize() {
		LOGGER.info("B-baka!");
	}
}