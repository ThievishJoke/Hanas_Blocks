package hana.hanas_blocks.util;

import hana.hanas_blocks.HanasBlocks;
import net.minecraft.block.Block;
//import net.minecraft.item.Item;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SCULK_PLANTABLE_BLOCKS =
                createTag("sculk_plantable_blocks");
        public static final TagKey<Block> WATER_PLANT_PLANTABLE_BLOCKS =
                createTag("water_plant_plantable_blocks");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HanasBlocks.MOD_ID, name));
        }
    }
    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlocks.MOD_ID, name));
        }
    }

}
