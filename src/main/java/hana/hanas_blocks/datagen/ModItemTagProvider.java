package hana.hanas_blocks.datagen;

import hana.hanas_blocks.item.ModItems;
import hana.hanas_blocks.util.TrimHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import hana.hanas_blocks.block.ModBlocks;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        /*
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PEARLARIUM_PLATE_HELMET, ModItems.PEARLARIUM_PLATE_CHESTPLATE, ModItems.PEARLARIUM_PLATE_LEGGINGS, ModItems.PEARLARIUM_PLATE_BOOTS);
        */

        getOrCreateTagBuilder(ItemTags.PLANKS)
            .add(ModBlocks.MAHOGANY_PLANKS.asItem());
        
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
            .add(ModBlocks.MAHOGANY_LOG.asItem())
            .add(ModBlocks.MAHOGANY_WOOD.asItem())
            .add(ModBlocks.STRIPPED_MAHOGANY_LOG.asItem())
            .add(ModBlocks.STRIPPED_MAHOGANY_WOOD.asItem());

        //getOrCreateTagBuilder(ItemTags.SWORDS)
        //        .add(ModItems.PINK_GARNET_SWORD);
        //getOrCreateTagBuilder(ItemTags.PICKAXES)
        //        .add(ModItems.PINK_GARNET_PICKAXE);
        //getOrCreateTagBuilder(ItemTags.SHOVELS)
        //        .add(ModItems.PINK_GARNET_SHOVEL);
        //getOrCreateTagBuilder(ItemTags.AXES)
        //        .add(ModItems.PINK_GARNET_AXE);
        //getOrCreateTagBuilder(ItemTags.HOES)
        //        .add(ModItems.PINK_GARNET_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PEARLARIUM_HELMET)
                .add(ModItems.PEARLARIUM_CHESTPLATE)
                .add(ModItems.PEARLARIUM_LEGGINGS)
                .add(ModItems.PEARLARIUM_BOOTS)
                .add(ModItems.PEARLARIUM_PLATE_HELMET)
                .add(ModItems.PEARLARIUM_PLATE_CHESTPLATE)
                .add(ModItems.PEARLARIUM_PLATE_LEGGINGS)
                .add(ModItems.PEARLARIUM_PLATE_BOOTS)
                .add(ModItems.NIGRUM_PETRAMINIUM_HELMET)
                .add(ModItems.NIGRUM_PETRAMINIUM_CHESTPLATE)
                .add(ModItems.NIGRUM_PETRAMINIUM_LEGGINGS)
                .add(ModItems.NIGRUM_PETRAMINIUM_BOOTS)
                .add(ModItems.NIGRUM_PETRAMINIUM_PLATE_HELMET)
                .add(ModItems.NIGRUM_PETRAMINIUM_PLATE_CHESTPLATE)
                .add(ModItems.NIGRUM_PETRAMINIUM_PLATE_LEGGINGS)
                .add(ModItems.NIGRUM_PETRAMINIUM_PLATE_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.PEARLARIUM_ALLOY_INGOT);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.SHOCK_ARMOR_TRIM_SMITHING_TEMPLATE);


    }
}
