package net.fryc.threepotions.loot;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fryc.threepotions.items.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.*;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.*;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.entity.EntityFlagsPredicate;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.util.Identifier;

public class ModLootTables {
    private static final Identifier GRASS_BLOCK
            = Identifier.ofVanilla("blocks/grass");
    private static final Identifier WITHER_SKELETON
            = Identifier.ofVanilla("entities/wither_skeleton");
    private static final Identifier GUARDIAN
            = Identifier.ofVanilla("entities/guardian");
    private static final Identifier ELDER_GUARDIAN
            = Identifier.ofVanilla("entities/elder_guardian");
    private static final Identifier POLAR_BEAR
            = Identifier.ofVanilla("entities/polar_bear");
    private static final Identifier SILVERFISH
            = Identifier.ofVanilla("entities/silverfish");
    private static final Identifier BAT
            = Identifier.ofVanilla("entities/bat");
    private static final Identifier DOLPHIN
            = Identifier.ofVanilla("entities/dolphin");

    public static void modifyLoot(){
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(GRASS_BLOCK.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.003f))
                        .with(ItemEntry.builder(ModItems.CLOVER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(WITHER_SKELETON.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithEnchantedBonusLootCondition.builder(registries, 0.10f, 0.07f))
                        .with(ItemEntry.builder(ModItems.WITHER_BONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .apply(EnchantedCountIncreaseLootFunction.builder(registries, UniformLootNumberProvider.create(0.0f, 1.0f)).withLimit(2).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(GUARDIAN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithEnchantedBonusLootCondition.builder(registries, 0.025f, 0.01f))
                        .with(ItemEntry.builder(ModItems.RED_CRYSTALS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(ELDER_GUARDIAN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(ModItems.RED_CRYSTALS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(POLAR_BEAR.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithEnchantedBonusLootCondition.builder(registries, 0.63f, 0.12f))
                        .with(ItemEntry.builder(ModItems.POLAR_BEAR_LIVER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .apply(FurnaceSmeltLootFunction.builder()
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate
                                        .Builder.create().flags(EntityFlagsPredicate.Builder.create().onFire(true)))).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(SILVERFISH.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithEnchantedBonusLootCondition.builder(registries, 0.14f, 0.1f))
                        .with(ItemEntry.builder(ModItems.SILVERFISH_SKIN))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .apply(EnchantedCountIncreaseLootFunction.builder(registries, UniformLootNumberProvider.create(0.0f, 1.0f)).withLimit(2).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(BAT.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithEnchantedBonusLootCondition.builder(registries, 0.30f, 0.13f))
                        .with(ItemEntry.builder(ModItems.BAT_EYE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .apply(EnchantedCountIncreaseLootFunction.builder(registries, UniformLootNumberProvider.create(0.0f, 1.0f)).withLimit(2).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(DOLPHIN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithEnchantedBonusLootCondition.builder(registries, 0.22f, 0.15f))
                        .with(ItemEntry.builder(ModItems.DOLPHIN_FIN))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });


    }
}
