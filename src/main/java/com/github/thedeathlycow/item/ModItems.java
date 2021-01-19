package com.github.thedeathlycow.item;

import com.github.thedeathlycow.blocks.ModBlocks;
import com.github.thedeathlycow.MoreGeodes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static Item EMERALD_SHARD = new Item(new FabricItemSettings().group(ItemGroup.MISC));


    public static void registerItems() {

        register("emerald_shard", EMERALD_SHARD);
        register("emerald_geode", new BlockItem(ModBlocks.EMERALD_GEODE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        register("budding_emerald", new BlockItem(ModBlocks.BUDDING_EMERALD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        register("emerald_cluster", new BlockItem(ModBlocks.EMERALD_CLUSTER, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        register("large_emerald_bud", new BlockItem(ModBlocks.LARGE_EMERALD_BUD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        register("medium_emerald_bud", new BlockItem(ModBlocks.MEDIUM_EMERALD_BUD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        register("small_emerald_bud", new BlockItem(ModBlocks.SMALL_EMERALD_BUD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    }

    private static void register(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(MoreGeodes.MODID, name), item);
    }
}
