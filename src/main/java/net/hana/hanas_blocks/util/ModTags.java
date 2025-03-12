package net.hana.hanas_blocks.util;

import net.hana.hanas_blocks.HanasBlocks;
import net.minecraft.block.Block;
//import net.minecraft.item.Item;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> WATER_PLANT_CAN_SURVIVE_ON =
                createTag("water_plant_can_survive_on");
        public static final TagKey<Block> SHRUB_CAN_SURVIVE_ON =
                createTag("shrub_can_survive_on");
        public static final TagKey<Block> SCULK_PLANTABLE_BLOCKS =
                createTag("sculk_plantable_blocks");
        public static final TagKey<Block> WATER_PLANT_PLANTABLE_BLOCKS =
                createTag("water_plant_plantable_blocks");
        public static final TagKey<Block> WEAPON_EFFICIENT =
                createTag("weapon_effcient");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HanasBlocks.MOD_ID, name));
        }

        public static final TagKey<Block> NEEDS_PEARLARIUM_TOOL = createTag("needs_pearlarium_tool");
        public static final TagKey<Block> NEEDS_NIGRUM_PETRAMIUNIUM_TOOL = createTag("needs_nigrum_petramiunium_tool");

        public static final TagKey<Block> INCORRECT_FOR_PEARLARIUM_TOOL = createTag("incorrect_for_pearlarium_tool");
        public static final TagKey<Block> INCORRECT_FOR_PEARLARIUM_PLATE_TOOL = createTag("incorrect_for_pearlarium_plate_tool");
        public static final TagKey<Block> INCORRECT_FOR_NIGRUM_PETRAMIUNIUM_TOOL = createTag("incorrect_for_nigrum_petramiunium_tool");
        public static final TagKey<Block> INCORRECT_FOR_NIGRUM_PETRAMIUNIUM_PLATE_TOOL = createTag("incorrect_for_nigrum_petramiunium_plate_tool");


    }

    public static class Items {
        public static final TagKey<Item> MATERIAL_DUST =
                createTag("material_dust");
        public static final TagKey<Item> ALLOY_MATERIAL =
                createTag("alloy_material");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlocks.MOD_ID, name));
        }
    }

}
