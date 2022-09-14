package net.fryc.threepotions.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fryc.threepotions.ThreePotions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WITHER_BONE = registerItem("wither_bone" ,
            new Item(new FabricItemSettings().maxCount(64).group(ItemGroup.BREWING)));

    public static final Item RED_CRYSTALS = registerItem("red_crystals" ,
            new Item(new FabricItemSettings().maxCount(64).group(ItemGroup.BREWING)));

    public static final Item CLOVER = registerItem("clover" ,
            new Item(new FabricItemSettings().maxCount(64).group(ItemGroup.BREWING)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ThreePotions.MOD_ID, name), item);
    }
    public static void registerModItems(){
        ThreePotions.LOGGER.info("Registering Mod Items for " + ThreePotions.MOD_ID);
    }

}
