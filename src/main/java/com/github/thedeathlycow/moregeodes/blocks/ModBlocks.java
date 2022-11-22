package com.github.thedeathlycow.moregeodes.blocks;

import com.github.thedeathlycow.moregeodes.MoreGeodes;
import com.github.thedeathlycow.moregeodes.sounds.CrystalBlockSoundGroup;
import com.github.thedeathlycow.moregeodes.sounds.ModBlockSoundGroups;
import com.google.common.collect.ImmutableList;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block EMERALD_CRYSTAL_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.EMERALD_GEODE, FabricBlockSettings.of(Material.AMETHYST, MapColor.EMERALD_GREEN).strength(1.5F).sounds(ModBlockSoundGroups.EMERALD_GEODE).requiresTool());

    public static final Block EMERALD_CLUSTER = new CrystalClusterBlock(CrystalBlockSoundGroup.EMERALD_GEODE, 7, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.EMERALD_GREEN).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.EMERALD_CLUSTER).strength(1.5f).luminance((blockState) -> 5));
    public static final Block LARGE_EMERALD_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.EMERALD_GEODE, 5, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.EMERALD_GREEN).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LARGE_EMERALD_BUD).strength(1.5f).luminance((blockState) -> 4));
    public static final Block MEDIUM_EMERALD_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.EMERALD_GEODE, 4, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.EMERALD_GREEN).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.MEDIUM_EMERALD_BUD).strength(1.5f).luminance((blockState) -> 2));
    public static final Block SMALL_EMERALD_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.EMERALD_GEODE, 3, 4, FabricBlockSettings.of(Material.AMETHYST, MapColor.EMERALD_GREEN).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.SMALL_EMERALD_BUD).strength(1.5f).luminance((blockState) -> 1));

    public static final Block QUARTZ_CRYSTAL_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.QUARTZ_GEODE, FabricBlockSettings.of(Material.AMETHYST, MapColor.OFF_WHITE).strength(1.5F).sounds(ModBlockSoundGroups.QUARTZ_GEODE).requiresTool());

    public static final Block QUARTZ_CLUSTER = new QuartzClusterBlock(7, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.OFF_WHITE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.QUARTZ_CLUSTER).strength(1.5f).luminance((blockState) -> 5), 15, 1);
    public static final Block LARGE_QUARTZ_BUD = new QuartzClusterBlock(5, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.OFF_WHITE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LARGE_QUARTZ_BUD).strength(1.5f).luminance((blockState) -> 4), 15, 5);
    public static final Block MEDIUM_QUARTZ_BUD = new QuartzClusterBlock(4, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.OFF_WHITE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.MEDIUM_QUARTZ_BUD).strength(1.5f).luminance((blockState) -> 2), 15, 10);
    public static final Block SMALL_QUARTZ_BUD = new QuartzClusterBlock(3, 4, FabricBlockSettings.of(Material.AMETHYST, MapColor.OFF_WHITE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.SMALL_QUARTZ_BUD).strength(1.5f).luminance((blockState) -> 1), 15, 20);

    public static final Block DIAMOND_CRYSTAL_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.DIAMOND_GEODE, FabricBlockSettings.of(Material.AMETHYST, MapColor.DIAMOND_BLUE).strength(1.5F).sounds(ModBlockSoundGroups.DIAMOND_GEODE).requiresTool());

    public static final Block DIAMOND_CLUSTER = new CrystalClusterBlock(CrystalBlockSoundGroup.DIAMOND_GEODE, 7, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.DIAMOND_BLUE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.DIAMOND_CLUSTER).strength(1.5f).luminance((blockState) -> 7));

    public static final Block ECHO_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.ECHO_BLOCK, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).strength(1.5f).sounds(ModBlockSoundGroups.ECHO_BLOCK).requiresTool());

    public static final Block ECHO_CLUSTER = new CrystalClusterBlock(CrystalBlockSoundGroup.ECHO_BLOCK, 7, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.ECHO_CLUSTER).strength(1.5f).luminance((blockState) -> 5));
    public static final Block LARGE_ECHO_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.ECHO_BLOCK, 5, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LARGE_ECHO_BUD).strength(1.5f).luminance((blockState) -> 4));
    public static final Block MEDIUM_ECHO_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.ECHO_BLOCK, 4, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.MEDIUM_ECHO_BUD).strength(1.5f).luminance((blockState) -> 2));
    public static final Block SMALL_ECHO_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.ECHO_BLOCK, 3, 4, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.SMALL_ECHO_BUD).strength(1.5f).luminance((blockState) -> 1));

    public static final Block LAPIS_CRYSTAL_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.LAPIS, FabricBlockSettings.of(Material.AMETHYST, MapColor.LAPIS_BLUE).strength(1.5f).sounds(ModBlockSoundGroups.LAPIS_CRYSTAL_BLOCK).requiresTool());
    public static final Block LAPIS_CLUSTER = new CrystalClusterBlock(CrystalBlockSoundGroup.LAPIS, 7, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.LAPIS_BLUE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LAPIS_CLUSTER).strength(1.5f).luminance((blockState) -> 5));
    public static final Block LARGE_LAPIS_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.LAPIS, 5, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.LAPIS_BLUE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LARGE_LAPIS_BUD).strength(1.5f).luminance((blockState) -> 4));
    public static final Block MEDIUM_LAPIS_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.LAPIS, 4, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.LAPIS_BLUE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.MEDIUM_LAPIS_BUD).strength(1.5f).luminance((blockState) -> 2));
    public static final Block SMALL_LAPIS_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.LAPIS, 3, 4, FabricBlockSettings.of(Material.AMETHYST, MapColor.LAPIS_BLUE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.SMALL_LAPIS_BUD).strength(1.5f).luminance((blockState) -> 1));

    public static final Block ECHO_LOCATOR = new EchoLocatorBlock(EchoLocatorType.ALL, FabricBlockSettings.of(GeodeMaterials.ECHO_LOCATOR).nonOpaque().sounds(ModBlockSoundGroups.ECHO_LOCATOR).strength(1.5F, 6.0F).requiresTool());

    public static final GeodeBuddingBlock BUDDING_EMERALD = new GeodeBuddingBlock(
            CrystalBlockSoundGroup.EMERALD_GEODE,
            FabricBlockSettings.of(Material.AMETHYST, MapColor.EMERALD_GREEN).ticksRandomly().strength(1.5F).sounds(ModBlockSoundGroups.EMERALD_GEODE).requiresTool(),
            ImmutableList.of(SMALL_EMERALD_BUD, MEDIUM_EMERALD_BUD, LARGE_EMERALD_BUD, EMERALD_CLUSTER)
    );

    public static final GeodeBuddingBlock BUDDING_QUARTZ = new GeodeBuddingBlock(
            CrystalBlockSoundGroup.QUARTZ_GEODE,
            FabricBlockSettings.of(Material.AMETHYST, MapColor.OFF_WHITE).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.QUARTZ_GEODE).requiresTool(),
            ImmutableList.of(SMALL_QUARTZ_BUD, MEDIUM_QUARTZ_BUD, LARGE_QUARTZ_BUD, QUARTZ_CLUSTER)
    );

    public static final GeodeBuddingBlock BUDDING_ECHO_BLOCK = new GeodeBuddingBlock(
            CrystalBlockSoundGroup.ECHO_BLOCK,
            FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.ECHO_BLOCK).requiresTool(),
            ImmutableList.of(SMALL_ECHO_BUD, MEDIUM_ECHO_BUD, LARGE_ECHO_BUD, ECHO_CLUSTER)
    );

    public static final GeodeBuddingBlock BUDDING_LAPIS = new GeodeBuddingBlock(
            CrystalBlockSoundGroup.LAPIS,
            FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.LAPIS_CRYSTAL_BLOCK).requiresTool(),
            ImmutableList.of(SMALL_LAPIS_BUD, MEDIUM_LAPIS_BUD, LARGE_LAPIS_BUD, LAPIS_CLUSTER)
    );

    public static final Block PYRITE = new Block(
            FabricBlockSettings.of(Material.STONE, MapColor.GOLD)
                    .sounds(BlockSoundGroup.CALCITE)
                    .requiresTool()
                    .strength(0.75F)
    );

    public static final Block PYRITE_STAIRS = new StairsBlock(
            PYRITE.getDefaultState(),
            FabricBlockSettings.copyOf(PYRITE)
    );

    public static final Block PYRITE_SLAB = new SlabBlock(
            FabricBlockSettings.copyOf(PYRITE)
    );

    public static final Block PYRITE_WALL = new WallBlock(
            FabricBlockSettings.copyOf(PYRITE)
    );

    public static final Block CALCITE_STAIRS = new StairsBlock(
            Blocks.CALCITE.getDefaultState(),
            FabricBlockSettings.copyOf(Blocks.CALCITE)
    );

    public static final Block CALCITE_SLAB = new SlabBlock(
            FabricBlockSettings.copyOf(Blocks.CALCITE)
    );

    public static final Block CALCITE_WALL = new WallBlock(
            FabricBlockSettings.copyOf(Blocks.CALCITE)
    );


    public static void registerBlocks() {
        register("emerald_crystal_block", EMERALD_CRYSTAL_BLOCK);
        register("budding_emerald", BUDDING_EMERALD);
        register("emerald_cluster", EMERALD_CLUSTER);
        register("large_emerald_bud", LARGE_EMERALD_BUD);
        register("medium_emerald_bud", MEDIUM_EMERALD_BUD);
        register("small_emerald_bud", SMALL_EMERALD_BUD);
        register("quartz_crystal_block", QUARTZ_CRYSTAL_BLOCK);
        register("budding_quartz", BUDDING_QUARTZ);
        register("quartz_cluster", QUARTZ_CLUSTER);
        register("large_quartz_bud", LARGE_QUARTZ_BUD);
        register("medium_quartz_bud", MEDIUM_QUARTZ_BUD);
        register("small_quartz_bud", SMALL_QUARTZ_BUD);
        register("diamond_crystal_block", DIAMOND_CRYSTAL_BLOCK);
        register("diamond_cluster", DIAMOND_CLUSTER);
        register("echo_block", ECHO_BLOCK);
        register("budding_echo_block", BUDDING_ECHO_BLOCK);
        register("echo_cluster", ECHO_CLUSTER);
        register("large_echo_bud", LARGE_ECHO_BUD);
        register("medium_echo_bud", MEDIUM_ECHO_BUD);
        register("small_echo_bud", SMALL_ECHO_BUD);
        register("echo_locator", ECHO_LOCATOR);
        register("lapis_crystal_block", LAPIS_CRYSTAL_BLOCK);
        register("lapis_cluster", LAPIS_CLUSTER);
        register("large_lapis_bud", LARGE_LAPIS_BUD);
        register("medium_lapis_bud", MEDIUM_LAPIS_BUD);
        register("small_lapis_bud", SMALL_LAPIS_BUD);
        register("budding_lapis", BUDDING_LAPIS);
        register("pyrite", PYRITE);
        register("pyrite_stairs", PYRITE_STAIRS);
        register("pyrite_slab", PYRITE_SLAB);
        register("pyrite_wall", PYRITE_WALL);
        register("calcite_stairs", CALCITE_STAIRS);
        register("calcite_slab", CALCITE_SLAB);
        register("calcite_wall", CALCITE_WALL);
    }

    private static void register(String name, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(MoreGeodes.MODID, name), block);
    }

}
