package blutact.spectrumalloypotions;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpectrumAlloyPotions implements ModInitializer {
	public static final String MOD_ID = "spectrum-alloy-potions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing SpectrumAlloyPotions!");
	}
}