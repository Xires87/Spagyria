package net.fryc.threepotions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fryc.threepotions.items.ModItems;
import net.fryc.threepotions.loot.ModLootTables;
import net.fryc.threepotions.potions.ModPotions;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
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

		//creative
		ItemGroup THREE_POTIONS = FabricItemGroup.builder(new Identifier(MOD_ID, "three_potions_item_group"))
				.displayName(Text.literal("Three Potions"))
				.icon(() -> new ItemStack(ModItems.CLOVER))
				.entries((enabledFeatures, entries) -> {
					entries.add(ModItems.CLOVER);
					entries.add(ModItems.WITHER_BONE);
					entries.add(ModItems.RED_CRYSTALS);
				})
				.build();
	}
}
