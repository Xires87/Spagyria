package net.fryc.threepotions.potions;

import net.fryc.threepotions.ThreePotions;
import net.fryc.threepotions.items.ModItems;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static Potion WITHER_POTION;
    public static Potion LONG_WITHER_POTION;
    public static Potion STRONG_WITHER_POTION;

    public static Potion HEALTH_BOOST_POTION;
    public static Potion LONG_HEALTH_BOOST_POTION;
    public static Potion STRONG_HEALTH_BOOST_POTION;

    public static Potion ABSORPTION_POTION;
    public static Potion LONG_ABSORPTION_POTION;
    public static Potion STRONG_ABSORPTION_POTION;

    public static Potion HASTE_POTION;
    public static Potion LONG_HASTE_POTION;
    public static Potion STRONG_HASTE_POTION;

    public static Potion MINING_FATIGUE_POTION;
    public static Potion LONG_MINING_FATIGUE_POTION;
    public static Potion STRONG_MINING_FATIGUE_POTION;

    public static Potion RESISTANCE_POTION;
    public static Potion LONG_RESISTANCE_POTION;
    public static Potion STRONG_RESISTANCE_POTION;

    public static Potion BLINDNESS_POTION;
    public static Potion LONG_BLINDNESS_POTION;

    public static Potion DOLPHINS_GRACE_POTION;
    public static Potion LONG_DOLPHINS_GRACE_POTION;

    public static Potion NAUSEA_POTION;
    public static Potion LONG_NAUSEA_POTION;

    public static Potion SATURATION_POTION;
    public static Potion STRONG_SATURATION_POTION;

    public static Potion HUNGER_POTION;
    public static Potion LONG_HUNGER_POTION;
    public static Potion STRONG_HUNGER_POTION;

    public static Potion BAD_LUCK_POTION;

    public static Potion GLOWING_POTION;
    public static Potion LONG_GLOWING_POTION;

    public static Potion DARKNESS_POTION;
    public static Potion LONG_DARKNESS_POTION;

    public static Potion LEVITATION_POTION;
    public static Potion LONG_LEVITATION_POTION;

    public static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(ThreePotions.MOD_ID, name),
                potion);
    }

    public static void registerPotions() {
        WITHER_POTION = registerPotion("wither_potion", new Potion(new StatusEffectInstance(StatusEffects.WITHER, 600, 0)));
        LONG_WITHER_POTION = registerPotion("long_wither_potion", new Potion(new StatusEffectInstance(StatusEffects.WITHER, 1200, 0)));
        STRONG_WITHER_POTION = registerPotion("strong_wither_potion", new Potion(new StatusEffectInstance(StatusEffects.WITHER, 283, 1)));

        HEALTH_BOOST_POTION = registerPotion("hp_boost_potion", new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 3600, 0)));
        LONG_HEALTH_BOOST_POTION = registerPotion("long_hp_boost_potion", new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 9600, 0)));
        STRONG_HEALTH_BOOST_POTION = registerPotion("strong_hp_boost_potion", new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1800, 1)));

        ABSORPTION_POTION = registerPotion("absorption_potion", new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 0)));
        LONG_ABSORPTION_POTION = registerPotion("long_absorption_potion", new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 9600, 0)));
        STRONG_ABSORPTION_POTION = registerPotion("strong_absorption_potion", new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 1800, 1)));

        HASTE_POTION = registerPotion("haste_potion", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 3600, 0)));
        LONG_HASTE_POTION = registerPotion("long_haste_potion", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 9600, 0)));
        STRONG_HASTE_POTION = registerPotion("strong_haste_potion", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 1800, 1)));

        MINING_FATIGUE_POTION = registerPotion("mining_fatigue_potion", new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 3600, 0)));
        LONG_MINING_FATIGUE_POTION = registerPotion("long_mining_fatigue_potion", new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 9600, 0)));
        STRONG_MINING_FATIGUE_POTION = registerPotion("strong_mining_fatigue_potion", new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 1800, 1)));

        RESISTANCE_POTION = registerPotion("resistance_potion", new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, 1800, 0)));
        LONG_RESISTANCE_POTION = registerPotion("long_resistance_potion", new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, 4800, 0)));
        STRONG_RESISTANCE_POTION = registerPotion("strong_resistance_potion", new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, 900, 1)));

        BLINDNESS_POTION = registerPotion("blindness_potion", new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, 400)));
        LONG_BLINDNESS_POTION = registerPotion("long_blindness_potion", new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, 800)));

        DOLPHINS_GRACE_POTION = registerPotion("dolphins_grace_potion", new Potion(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 650)));
        LONG_DOLPHINS_GRACE_POTION = registerPotion("long_dolphins_grace_potion", new Potion(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1300)));

        NAUSEA_POTION = registerPotion("nausea_potion", new Potion(new StatusEffectInstance(StatusEffects.NAUSEA, 500)));
        LONG_NAUSEA_POTION = registerPotion("long_nausea_potion", new Potion(new StatusEffectInstance(StatusEffects.NAUSEA, 1200)));

        SATURATION_POTION = registerPotion("saturation_potion", new Potion(new StatusEffectInstance(new StatusEffectInstance(StatusEffects.SATURATION, 1, 1))));
        STRONG_SATURATION_POTION = registerPotion("strong_saturation_potion", new Potion(new StatusEffectInstance(new StatusEffectInstance(StatusEffects.SATURATION, 1, 2))));

        HUNGER_POTION = registerPotion("hunger_potion", new Potion(new StatusEffectInstance(StatusEffects.HUNGER, 2000, 0)));
        LONG_HUNGER_POTION = registerPotion("long_hunger_potion", new Potion(new StatusEffectInstance(StatusEffects.HUNGER, 5000, 0)));
        STRONG_HUNGER_POTION = registerPotion("strong_hunger_potion", new Potion(new StatusEffectInstance(StatusEffects.HUNGER, 950, 1)));

        BAD_LUCK_POTION = registerPotion("bad_luck_potion", new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 6000)));

        LEVITATION_POTION = registerPotion("levitation_potion", new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 500)));
        LONG_LEVITATION_POTION = registerPotion("long_levitation_potion", new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 1000)));

        GLOWING_POTION = registerPotion("glowing_potion", new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 3600)));
        LONG_GLOWING_POTION = registerPotion("long_glowing_potion", new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 9600)));

        DARKNESS_POTION = registerPotion("darkness_potion", new Potion(new StatusEffectInstance(StatusEffects.DARKNESS, 400)));
        LONG_DARKNESS_POTION = registerPotion("long_darkness_potion", new Potion(new StatusEffectInstance(StatusEffects.DARKNESS, 800)));

        registerPotionRecipes();
    }

    private static void registerPotionRecipes() {
        //luck
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, ModItems.CLOVER,
                Potions.LUCK);

        BrewingRecipeRegistry.registerPotionRecipe(Potions.LUCK, Items.FERMENTED_SPIDER_EYE,
                ModPotions.BAD_LUCK_POTION);

        //wither
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, ModItems.WITHER_BONE,
                ModPotions.WITHER_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.WITHER_POTION, Items.REDSTONE,
                ModPotions.LONG_WITHER_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.STRONG_WITHER_POTION, Items.REDSTONE,
                ModPotions.LONG_WITHER_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.WITHER_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_WITHER_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.LONG_WITHER_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_WITHER_POTION);

        //health boost
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, ModItems.RED_CRYSTALS,
                ModPotions.HEALTH_BOOST_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.HEALTH_BOOST_POTION, Items.REDSTONE,
                ModPotions.LONG_HEALTH_BOOST_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.STRONG_HEALTH_BOOST_POTION, Items.REDSTONE,
                ModPotions.LONG_HEALTH_BOOST_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.HEALTH_BOOST_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_HEALTH_BOOST_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.LONG_HEALTH_BOOST_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_HEALTH_BOOST_POTION);

        //haste
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, ModItems.SILVERFISH_SKIN,
                ModPotions.HASTE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.MINING_FATIGUE_POTION, Items.FERMENTED_SPIDER_EYE,
                ModPotions.HASTE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.STRONG_MINING_FATIGUE_POTION, Items.FERMENTED_SPIDER_EYE,
                ModPotions.HASTE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.LONG_MINING_FATIGUE_POTION, Items.FERMENTED_SPIDER_EYE,
                ModPotions.HASTE_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.HASTE_POTION, Items.REDSTONE,
                ModPotions.LONG_HASTE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.STRONG_HASTE_POTION, Items.REDSTONE,
                ModPotions.LONG_HASTE_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.HASTE_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_HASTE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.LONG_HASTE_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_HASTE_POTION);

        //fatigue
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.HASTE_POTION, Items.FERMENTED_SPIDER_EYE,
                ModPotions.MINING_FATIGUE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.STRONG_HASTE_POTION, Items.FERMENTED_SPIDER_EYE,
                ModPotions.MINING_FATIGUE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.LONG_HASTE_POTION, Items.FERMENTED_SPIDER_EYE,
                ModPotions.MINING_FATIGUE_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.MINING_FATIGUE_POTION, Items.REDSTONE,
                ModPotions.LONG_MINING_FATIGUE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.STRONG_MINING_FATIGUE_POTION, Items.REDSTONE,
                ModPotions.LONG_MINING_FATIGUE_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.MINING_FATIGUE_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_MINING_FATIGUE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.LONG_MINING_FATIGUE_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_MINING_FATIGUE_POTION);

        //absorption
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.GOLDEN_APPLE,
                ModPotions.ABSORPTION_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.ABSORPTION_POTION, Items.REDSTONE,
                ModPotions.LONG_ABSORPTION_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.STRONG_ABSORPTION_POTION, Items.REDSTONE,
                ModPotions.LONG_ABSORPTION_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.ABSORPTION_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_ABSORPTION_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.LONG_ABSORPTION_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_ABSORPTION_POTION);

        //resistance
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, ModItems.ENDER_DRAGON_SCALE,
                ModPotions.RESISTANCE_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.RESISTANCE_POTION, Items.REDSTONE,
                ModPotions.LONG_RESISTANCE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.STRONG_RESISTANCE_POTION, Items.REDSTONE,
                ModPotions.LONG_RESISTANCE_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.RESISTANCE_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_RESISTANCE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.LONG_RESISTANCE_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_RESISTANCE_POTION);

        //blindness
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, ModItems.BAT_EYE,
                ModPotions.BLINDNESS_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.BLINDNESS_POTION, Items.REDSTONE,
                ModPotions.LONG_BLINDNESS_POTION);

        //dolphins grace
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, ModItems.DOLPHIN_FIN,
                ModPotions.DOLPHINS_GRACE_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.DOLPHINS_GRACE_POTION, Items.REDSTONE,
                ModPotions.LONG_DOLPHINS_GRACE_POTION);

        //nausea
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.POISONOUS_POTATO,
                ModPotions.NAUSEA_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.NAUSEA_POTION, Items.REDSTONE,
                ModPotions.LONG_NAUSEA_POTION);

        //saturation
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, ModItems.POLAR_BEAR_LIVER,
                ModPotions.SATURATION_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.SATURATION_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_SATURATION_POTION);

        //hunger
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.SATURATION_POTION, Items.FERMENTED_SPIDER_EYE,
                ModPotions.HUNGER_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.STRONG_SATURATION_POTION, Items.FERMENTED_SPIDER_EYE,
                ModPotions.HUNGER_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.HUNGER_POTION, Items.REDSTONE,
                ModPotions.LONG_HUNGER_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.STRONG_HUNGER_POTION, Items.REDSTONE,
                ModPotions.LONG_HUNGER_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.HUNGER_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_HUNGER_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.LONG_HUNGER_POTION, Items.GLOWSTONE_DUST,
                ModPotions.STRONG_HUNGER_POTION);

        //glowing
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.GLOW_INK_SAC,
                ModPotions.GLOWING_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.GLOWING_POTION, Items.REDSTONE,
                ModPotions.LONG_GLOWING_POTION);

        //darkness
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.GLOWING_POTION, Items.FERMENTED_SPIDER_EYE,
                ModPotions.DARKNESS_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.DARKNESS_POTION, Items.REDSTONE,
                ModPotions.LONG_DARKNESS_POTION);

        //levitation
        BrewingRecipeRegistry.registerPotionRecipe(Potions.SLOW_FALLING, Items.FERMENTED_SPIDER_EYE,
                ModPotions.LEVITATION_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.LEVITATION_POTION, Items.REDSTONE,
                ModPotions.LONG_LEVITATION_POTION);

    }
}
