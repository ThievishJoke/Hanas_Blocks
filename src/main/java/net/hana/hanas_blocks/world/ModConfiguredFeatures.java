package net.hana.hanas_blocks.world;

import net.hana.hanas_blocks.HanasBlocks;
import net.hana.hanas_blocks.block.*;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.*;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> MARBLE_ORE_KEY = registerKey("marble_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest marble = new TagMatchRuleTest(BlockTags.BASE_STONE_OVERWORLD);

        register(context, MARBLE_ORE_KEY, Feature.ORE, new OreFeatureConfig(marble, ModBlocks.DENSE_MARBLE.getDefaultState(), 64));

        DataPool.Builder<BlockState> builder = DataPool.builder();
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(HanasBlocks.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
        RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}