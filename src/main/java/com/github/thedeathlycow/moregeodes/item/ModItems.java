package com.github.thedeathlycow.moregeodes.item;

import com.github.thedeathlycow.moregeodes.blocks.ModBlocks;
import com.github.thedeathlycow.moregeodes.MoreGeodesDedicatedServer;
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
        register("small_emerald_bud", new BlockItem(ModBlocks.SMALL_EMERALD_BUD, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register("medium_emerald_bud", new BlockItem(ModBlocks.MEDIUM_EMERALD_BUD, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register("large_emerald_bud", new BlockItem(ModBlocks.LARGE_EMERALD_BUD, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register("emerald_cluster", new BlockItem(ModBlocks.EMERALD_CLUSTER, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register("quartz_geode", new BlockItem(ModBlocks.QUARTZ_GEODE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        register("budding_quartz", new BlockItem(ModBlocks.BUDDING_QUARTZ, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        register("small_quartz_bud", new BlockItem(ModBlocks.SMALL_QUARTZ_BUD, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register("medium_quartz_bud", new BlockItem(ModBlocks.MEDIUM_QUARTZ_BUD, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register("large_quartz_bud", new BlockItem(ModBlocks.LARGE_QUARTZ_BUD, new Item.Settings().group(ItemGroup.DECORATIONS)));
        register("quartz_cluster", new BlockItem(ModBlocks.QUARTZ_CLUSTER, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }

    private static void register(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(MoreGeodesDedicatedServer.MODID, name), item);
    }
}