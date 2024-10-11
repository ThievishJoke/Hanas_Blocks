package hana.hanas_blocks.enchantment;


import hana.hanas_blocks.HanasBlocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;


//todo get the enchantment working
public final class ModEnchantments {
    public static final RegistryKey<Enchantment> FROST_THORN = of("frost_thorn");
    public static void bootstrap(Registerable<Enchantment> registry) {
    }

    private static RegistryKey<Enchantment> of(String name) {
        return RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(HanasBlocks.MOD_ID, name));
    }

    public static void registerModEnchantments() {
        HanasBlocks.LOGGER.info("Registering ModEnchantments for " + HanasBlocks.MOD_ID);
    }
}