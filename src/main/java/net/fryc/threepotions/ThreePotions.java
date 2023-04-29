package net.fryc.threepotions;

import net.fabricmc.api.ModInitializer;
import net.fryc.threepotions.items.ModItems;
import net.fryc.threepotions.loot.ModLootTables;
import net.fryc.threepotions.potions.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreePotions implements ModInitializer {
	public static final String MOD_ID = "threepotions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModPotions.registerPotions();
		ModLootTables.modifyLoot();

	}
}
