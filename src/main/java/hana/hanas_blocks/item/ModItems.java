package hana.hanas_blocks.item;

import hana.hanas_blocks.item.custom.LongSwordItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import hana.hanas_blocks.HanasBlocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;


public class ModItems {

    // Hana's Items
    //bahaj
    public static final Item WHITE_BLAHAJ = registerItem("white_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item ORANGE_BLAHAJ = registerItem("orange_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item MAGENTA_BLAHAJ = registerItem("magenta_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item LIGHT_BLUE_BLAHAJ = registerItem("light_blue_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item YELLOW_BLAHAJ = registerItem("yellow_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item LIME_BLAHAJ = registerItem("lime_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item PINK_BLAHAJ = registerItem("pink_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item GRAY_BLAHAJ = registerItem("gray_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item LIGHT_GRAY_BLAHAJ = registerItem("light_gray_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item CYAN_BLAHAJ = registerItem("cyan_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item PURPLE_BLAHAJ = registerItem("purple_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item BLAHAJ = registerItem("blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item BROWN_BLAHAJ = registerItem("brown_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item GREEN_BLAHAJ = registerItem("green_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item RED_BLAHAJ = registerItem("red_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item BLACK_BLAHAJ = registerItem("black_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));

    //neon blahaj
    public static final Item NEON_PINK_BLAHAJ = registerItem("neon_pink_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));

    //metal blahaj
    public static final Item PEARLARIUM_BLAHAJ = registerItem("pearlarium_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item NIGRUM_PETRAMIUNIUM_BLAHAJ = registerItem("nigrum_petramiunium_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));

    //pride blahaj
    public static final Item PRIDE_BLAHAJ = registerItem("pride_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item TRANSGENDER_BLAHAJ = registerItem("transgender_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item DEMIBOY_BLAHAJ = registerItem("demiboy_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item DEMIGIRL_BLAHAJ = registerItem("demigirl_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item GENDERFLUID_BLAHAJ = registerItem("genderfluid_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item NON_BINARY_BLAHAJ = registerItem("non_binary_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item POLYGENDER_BLAHAJ = registerItem("polygender_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item LESBIAN_BLAHAJ = registerItem("lesbian_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item GAY_BLAHAJ = registerItem("gay_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item PANSEXUAL_BLAHAJ = registerItem("pansexual_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item BISEXUAL_BLAHAJ = registerItem("bisexual_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));

    //sheet
    public static final Item COPPER_SHEET = registerItem("copper_sheet", new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON)));
    public static final Item IRON_SHEET = registerItem("iron_sheet", new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON)));
    public static final Item GOLD_SHEET = registerItem("gold_sheet", new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON)));
    public static final Item SCRAP_SHEET = registerItem("scrap_sheet", new Item(new Item.Settings().maxCount(32).rarity(Rarity.UNCOMMON)));
    
    public static final Item RAW_PEARLARIUM = registerItem("raw_pearlarium", new Item(new Item.Settings().maxCount(64).rarity(Rarity.RARE)));
    public static final Item PEARLARIUM_ALLOY_INGOT = registerItem("pearlarium_alloy_ingot", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item PEARLARIUM_ALLOY_PLATE = registerItem("pearlarium_alloy_plate", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item PEARLARIUM_ALLOY_SHEET = registerItem("pearlarium_alloy_sheet", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item PEARLARIUM_CRYSTAL = registerItem("pearlarium_crystal", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item CRUSHED_PEARLARIUM = registerItem("crushed_pearlarium", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    
    public static final Item RAW_NIGRUM_PETRAMIUNIUM = registerItem("raw_nigrum_petramiunium", new Item(new Item.Settings().maxCount(64).rarity(Rarity.RARE)));
    public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_INGOT = registerItem("nigrum_petramiunium_alloy_ingot", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE = registerItem("nigrum_petramiunium_alloy_plate", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_SHEET = registerItem("nigrum_petramiunium_alloy_sheet", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item NIGRUM_PETRAMIUNIUM_CRYSTAL = registerItem("nigrum_petramiunium_crystal", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item CRUSHED_NIGRUM_PETRAMIUNIUM = registerItem("crushed_nigrum_petramiunium", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));


    public static final Item PEARLARIUM_ALLOY_SWORD = registerItem("pearlarium_alloy_sword",
            new SwordItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, 8, -2.4f))));
    public static final Item PEARLARIUM_ALLOY_PICKAXE = registerItem("pearlarium_alloy_pickaxe",
            new PickaxeItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, 1, -2.8F))));
    public static final Item PEARLARIUM_ALLOY_SHOVEL = registerItem("pearlarium_alloy_shovel",
            new ShovelItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, 1.5f, -3.0f))));
    public static final Item PEARLARIUM_ALLOY_AXE = registerItem("pearlarium_alloy_axe",
            new AxeItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, 10, -3.0F))));
    public static final Item PEARLARIUM_ALLOY_HOE = registerItem("pearlarium_alloy_hoe",
            new HoeItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, 0, 0.0F))));

    public static final Item PEARLARIUM_ALLOY_LONGSWORD = registerItem("pearlarium_alloy_longsword",
            new LongSwordItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(LongSwordItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT,
                            7,
                            -2.7f,
                            1.5F))));

    public static final Item PEARLARIUM_ALLOY_PLATE_SWORD = registerItem("pearlarium_alloy_plate_sword",
            new SwordItem(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, 10, -2.8f))));
    public static final Item PEARLARIUM_ALLOY_PLATE_PICKAXE = registerItem("pearlarium_alloy_plate_pickaxe",
            new PickaxeItem(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, 1, -2.8F))));
    public static final Item PEARLARIUM_ALLOY_PLATE_SHOVEL = registerItem("pearlarium_alloy_plate_shovel",
            new ShovelItem(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, 1.5f, -3.0f))));
    public static final Item PEARLARIUM_ALLOY_PLATE_AXE = registerItem("pearlarium_alloy_plate_axe",
            new AxeItem(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, 12, -3.3F))));
    public static final Item PEARLARIUM_ALLOY_PLATE_HOE = registerItem("pearlarium_alloy_plate_hoe",
            new HoeItem(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, 0, 0.0F))));

    //public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_SWORD = registerItem("pink_garnet_sword",
    //        new SwordItem(NigrumPetramiuniumAlloyMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, new Item.Settings()
    //                .attributeModifiers(SwordItem.createAttributeModifiers(NigrumPetramiuniumAlloyMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, 3, -2.4f))));
    //public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PICKAXE = registerItem("pink_garnet_pickaxe",
    //        new PickaxeItem(NigrumPetramiuniumAlloyMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, new Item.Settings()
    //                .attributeModifiers(PickaxeItem.createAttributeModifiers(NigrumPetramiuniumAlloyMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, 1, -2.8f))));
    //public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_SHOVEL = registerItem("pink_garnet_shovel",
    //        new ShovelItem(NigrumPetramiuniumAlloyMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, new Item.Settings()
    //                .attributeModifiers(ShovelItem.createAttributeModifiers(NigrumPetramiuniumAlloyMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, 1.5f, -3.0f))));
    //public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_AXE = registerItem("pink_garnet_axe",
    //        new AxeItem(NigrumPetramiuniumAlloyMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, new Item.Settings()
    //                .attributeModifiers(AxeItem.createAttributeModifiers(NigrumPetramiuniumAlloyMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, 6, -3.2f))));
    //public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_HOE = registerItem("pink_garnet_hoe",
    //        new HoeItem(NigrumPetramiuniumAlloyMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, new Item.Settings()
    //                .attributeModifiers(HoeItem.createAttributeModifiers(NigrumPetramiuniumAlloyMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, 0, -3f))));

    //public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_SWORD = registerItem("pink_garnet_sword",
    //        new SwordItem(NigrumPetramiuniumAlloyPlateMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, new Item.Settings()
    //                .attributeModifiers(SwordItem.createAttributeModifiers(NigrumPetramiuniumAlloyPlateMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, 3, -2.4f))));
    //public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_PICKAXE = registerItem("pink_garnet_pickaxe",
    //        new PickaxeItem(NigrumPetramiuniumAlloyPlateMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, new Item.Settings()
    //                .attributeModifiers(PickaxeItem.createAttributeModifiers(NigrumPetramiuniumAlloyPlateMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, 1, -2.8f))));
    //public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_SHOVEL = registerItem("pink_garnet_shovel",
    //        new ShovelItem(NigrumPetramiuniumAlloyPlateMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, new Item.Settings()
    //                .attributeModifiers(ShovelItem.createAttributeModifiers(NigrumPetramiuniumAlloyPlateMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, 1.5f, -3.0f))));
    //public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_AXE = registerItem("pink_garnet_axe",
    //        new AxeItem(NigrumPetramiuniumAlloyPlateMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, new Item.Settings()
    //                .attributeModifiers(AxeItem.createAttributeModifiers(NigrumPetramiuniumAlloyPlateMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, 6, -3.2f))));
    //public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_HOE = registerItem("pink_garnet_hoe",
    //        new HoeItem(NigrumPetramiuniumAlloyPlateMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, new Item.Settings()
    //                .attributeModifiers(HoeItem.createAttributeModifiers(NigrumPetramiuniumAlloyPlateMaterial.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, 0, -3f))));

    // animal armor
    public static final Item PEARLARIUM_HORSE_ARMOR = registerItem("pearlarium_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.PEARLARIUM_SET, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    //trims
    public static final Item SHOCK_SMITHING_TEMPLATE = registerItem("shock_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(HanasBlocks.MOD_ID, "shock"), FeatureFlags.VANILLA));

    public static final Item SCULK_MATERIAL = registerItem("sculk_material", new Item(new Item.Settings().rarity(Rarity.COMMON)));

    //eatables
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item LETTUCE = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item ONION = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item SPRING_ONION = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item SOY_BEAN = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item CORN = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item GREEN_BEAN = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item PEA = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item SWEET_POTATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item RAW_SCULK_MEAT = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item COOKED_SCULK_MEAT = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item YAM = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item RICE = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item ACORN_SQUASH = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item ASPARAGUS = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item BEAN_SPROUT = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item RED_BELL_PEPPER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item GREEN_BELL_PEPPER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item YELLOW_BELL_PEPPER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item ORANGE_BELL_PEPPER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item BLACK_BEAN = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item BROCCOFLOWER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item BROCCOLI = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item BUTTERNUT_SQUASH = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item CAULIFLOWER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item CELERY = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item CAYENNE_PEPPER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item CHERRY_PEPPER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item CHERRY = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item CHILI_PEPPER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item CUCUMBER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item DILL = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item GARLIC = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item JALAPEÑO = registerItem("jalapeño", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item LEEK = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item PARSNIP = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item PEPPER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item SPINISH = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item SQUASH = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item SWEET_CORN = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item WHITE_BELL_PEPPER = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));
    //public static final Item ZUCCHINI = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.Tomato)));


    public static final Item BUNS = registerItem("buns", new Item(new Item.Settings().food(ModFoodComponents.Buns)));

    public static final Item TOMATO_BREAD = registerItem("tomato_bread", new Item(new Item.Settings().food(ModFoodComponents.Tomato_Bread)));

    public static final Item HAMBURGER = registerItem("hamburger", new Item(new Item.Settings().food(ModFoodComponents.Hamburger)));

    //armor
    //public static final Item PEARLARIUM_PLATE_HELMET = registerItem("pearlarium_plate_helmet",
    //        new ArmorItem(ModArmorMaterial.PEARLARIUM_PLATE_SET, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
    //public static final Item PEARLARIUM_PLATE_CHESTPLATE = registerItem("pearlarium_plate_chestplate",
    //        new ArmorItem(ModArmorMaterial.PEARLARIUM_PLATE_SET, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
    //public static final Item PEARLARIUM_PLATE_LEGGINGS = registerItem("pearlarium_plate_leggings",
    //        new ArmorItem(ModArmorMaterial.PEARLARIUM_PLATE_SET, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
    //public static final Item PEARLARIUM_PLATE_BOOTS = registerItem("pearlarium_plate_boots",
    //        new ArmorItem(ModArmorMaterial.PEARLARIUM_PLATE_SET, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));

    //public static final Item NIGRUM_PETRAMIUNIUM_PLATE_HELMET = registerItem("nigrum_petraminium_plate_helmet",
    //        new ArmorItem(ModArmorMaterial.NIGRUM_PETRAMIUNIUM_PLATE_SET, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
    //public static final Item NIGRUM_PETRAMIUNIUM_PLATE_CHESTPLATE = registerItem("nigrum_petraminium_plate_chestplate",
    //        new ArmorItem(ModArmorMaterial.NIGRUM_PETRAMIUNIUM_PLATE_SET, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(50))));
    //public static final Item NIGRUM_PETRAMIUNIUM_PLATE_LEGGINGS = registerItem("nigrum_petraminium_plate_leggings",
    //        new ArmorItem(ModArmorMaterial.NIGRUM_PETRAMIUNIUM_PLATE_SET, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(50))));
    //public static final Item NIGRUM_PETRAMIUNIUM_PLATE_BOOTS = registerItem("nigrum_petraminium_plate_boots",
    //        new ArmorItem(ModArmorMaterial.NIGRUM_PETRAMIUNIUM_PLATE_SET, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(50))));

    public static final Item PEARLARIUM_HELMET = registerItem("pearlarium_helmet",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_SET, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item PEARLARIUM_CHESTPLATE = registerItem("pearlarium_chestplate",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_SET, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item PEARLARIUM_LEGGINGS = registerItem("pearlarium_leggings",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_SET, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item PEARLARIUM_BOOTS = registerItem("pearlarium_boots",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_SET, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    public static final Item NIGRUM_PETRAMIUNIUM_HELMET = registerItem("nigrum_petramiunium_helmet",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_SET, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item NIGRUM_PETRAMIUNIUM_CHESTPLATE = registerItem("nigrum_petramiunium_chestplate",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_SET, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item NIGRUM_PETRAMIUNIUM_LEGGINGS = registerItem("nigrum_petramiunium_leggings",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_SET, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item NIGRUM_PETRAMIUNIUM_BOOTS = registerItem("nigrum_petramiunium_boots",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_SET, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    //ShieldItem
    //public static final Item PEARLARIUM_PLATED_SHIELD = registerItem("pearlarium_plated_shield",
    //        new ShieldItem(new Item.Settings().maxCount(1).maxDamage(1008).component(DataComponentTypes.BANNER_PATTERNS, BannerPatternsComponent.DEFAULT)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RAW_PEARLARIUM);
        entries.add(RAW_NIGRUM_PETRAMIUNIUM);
        entries.add(PEARLARIUM_ALLOY_INGOT);
        entries.add(PEARLARIUM_ALLOY_PLATE);
        entries.add(PEARLARIUM_ALLOY_SHEET);
        entries.add(NIGRUM_PETRAMIUNIUM_ALLOY_INGOT);
        entries.add(NIGRUM_PETRAMIUNIUM_ALLOY_PLATE);
        entries.add(NIGRUM_PETRAMIUNIUM_ALLOY_SHEET);
        entries.add(SCRAP_SHEET);
        entries.add(COPPER_SHEET);
        entries.add(IRON_SHEET);
        entries.add(GOLD_SHEET);
        entries.add(SCULK_MATERIAL);

        //entries.add(SHOCK_ARMOR_TRIM_SMITHING_TEMPLATE);
    }

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(PEARLARIUM_HELMET);
        entries.add(PEARLARIUM_CHESTPLATE);
        entries.add(PEARLARIUM_LEGGINGS);
        entries.add(PEARLARIUM_BOOTS);
        entries.add(NIGRUM_PETRAMIUNIUM_HELMET);
        entries.add(NIGRUM_PETRAMIUNIUM_CHESTPLATE);
        entries.add(NIGRUM_PETRAMIUNIUM_LEGGINGS);
        entries.add(NIGRUM_PETRAMIUNIUM_BOOTS);

        entries.add(PEARLARIUM_ALLOY_SWORD);
        entries.add(PEARLARIUM_ALLOY_AXE);
    }

    private static void addItemsToInventoryItemGroup(FabricItemGroupEntries entries) {
        entries.add(WHITE_BLAHAJ);
        entries.add(ORANGE_BLAHAJ);
        entries.add(MAGENTA_BLAHAJ);
        entries.add(LIGHT_BLUE_BLAHAJ);
        entries.add(YELLOW_BLAHAJ);
        entries.add(LIME_BLAHAJ);
        entries.add(PINK_BLAHAJ);
        entries.add(GRAY_BLAHAJ);
        entries.add(LIGHT_GRAY_BLAHAJ);
        entries.add(CYAN_BLAHAJ);
        entries.add(PURPLE_BLAHAJ);
        entries.add(BLAHAJ);
        entries.add(BROWN_BLAHAJ );
        entries.add(GREEN_BLAHAJ);
        entries.add(RED_BLAHAJ);
        entries.add(BLACK_BLAHAJ);

        entries.add(NEON_PINK_BLAHAJ);

        entries.add(PEARLARIUM_BLAHAJ);
        entries.add(NIGRUM_PETRAMIUNIUM_BLAHAJ);

        entries.add(PRIDE_BLAHAJ);
        entries.add(TRANSGENDER_BLAHAJ);
        entries.add(DEMIBOY_BLAHAJ);
        entries.add(DEMIGIRL_BLAHAJ);
        entries.add(GENDERFLUID_BLAHAJ);
        entries.add(NON_BINARY_BLAHAJ);
        entries.add(POLYGENDER_BLAHAJ);
        entries.add(LESBIAN_BLAHAJ);
        entries.add(GAY_BLAHAJ);
        entries.add(PANSEXUAL_BLAHAJ);
        entries.add(BISEXUAL_BLAHAJ);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HanasBlocks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HanasBlocks.LOGGER.info("Registering Mod Items for " + HanasBlocks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register(ModItems::addItemsToInventoryItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}