package net.fryc.threepotions.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fryc.threepotions.ThreePotions;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WITHER_BONE = registerItem("wither_bone" ,
            new Item(new FabricItemSettings().maxCount(64).fireproof()));

    public static final Item RED_CRYSTALS = registerItem("red_crystals" ,
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item CLOVER = registerItem("clover" ,
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item SILVERFISH_SKIN = registerItem("silverfish_skin" ,
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item BAT_EYE = registerItem("bat_eye" ,
            new Item(new FabricItemSettings().maxCount(64).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100), 1.0f).build())));

    public static final Item ENDER_DRAGON_SCALE = registerItem("ender_dragon_scale" ,
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.UNCOMMON).fireproof()));

    public static final Item DOLPHIN_FIN = registerItem("dolphin_fin" ,
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item POLAR_BEAR_LIVER = registerItem("polar_bear_liver" ,
            new Item(new FabricItemSettings().maxCount(64).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).meat().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100), 0.4f).build())));

    public static final Item COOKED_POLAR_BEAR_LIVER = registerItem("cooked_polar_bear_liver" ,
            new Item(new FabricItemSettings().maxCount(64).food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0f).meat().build())));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ThreePotions.MOD_ID, name), item);
    }
    public static void registerModItems(){
    }

}
