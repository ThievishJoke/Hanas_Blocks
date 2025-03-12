package net.hana.hanas_blocks.registry;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class NarrowLogRegistry {
    public record LogInfo(Block logBlock, Identifier sideTexture, Identifier topTexture, Block strippedBlock) {}

    private static final Map<Block, LogInfo> LOG_REGISTRY = new HashMap<>();

    public static void registerLog(Block logBlock, Identifier sideTexture, Identifier topTexture, Block strippedBlock) {
        LOG_REGISTRY.put(logBlock, new LogInfo(logBlock, sideTexture, topTexture, strippedBlock));
    }

    public static Map<Block, LogInfo> getLogs() {
        return LOG_REGISTRY;
    }
}
