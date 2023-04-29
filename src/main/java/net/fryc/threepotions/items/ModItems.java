package net.fryc.threepotions.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fryc.threepotions.ThreePotions;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

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
            new Item(new FabricItemSettings().maxCount(64).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).meat().build())));

    public static final Item COOKED_POLAR_BEAR_LIVER = registerItem("cooked_polar_bear_liver" ,
            new Item(new FabricItemSettings().maxCount(64).food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0f).meat().build())));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ThreePotions.MOD_ID, name), item);
    }
    public static void registerModItems(){
        //creative
        ItemGroup SPAGYRIA = FabricItemGroup.builder(new Identifier(ThreePotions.MOD_ID, "spagyria_item_group"))
                .displayName(Text.literal("Spagyria"))
                .icon(() -> new ItemStack(ModItems.CLOVER))
                .entries((enabledFeatures, entries) -> {
                    entries.add(ModItems.CLOVER);
                    entries.add(ModItems.WITHER_BONE);
                    entries.add(ModItems.RED_CRYSTALS);
                    entries.add(ModItems.BAT_EYE);
                    entries.add(ModItems.DOLPHIN_FIN);
                    entries.add(ModItems.POLAR_BEAR_LIVER);
                    entries.add(ModItems.COOKED_POLAR_BEAR_LIVER);
                    entries.add(ModItems.SILVERFISH_SKIN);
                    entries.add(ModItems.ENDER_DRAGON_SCALE);
                })
                .build();
    }

}
