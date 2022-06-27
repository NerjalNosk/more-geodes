package com.github.thedeathlycow.moregeodes;

import com.github.thedeathlycow.moregeodes.blocks.ModBlocks;
import com.github.thedeathlycow.moregeodes.blocks.entity.ModBlockEntities;
import com.github.thedeathlycow.moregeodes.features.ModFeatures;
import com.github.thedeathlycow.moregeodes.item.ModItems;
import com.github.thedeathlycow.moregeodes.sounds.GeodesSoundEvents;
import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class MoreGeodes implements ModInitializer {

    public static final String MODID = "geodes";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOGGER.info("Beginning More Geodes initialization");
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModFeatures.placeFeaturesInBiomes();
        ModBlockEntities.registerBlockEntities();
        GeodesSoundEvents.registerSoundEvents();
        LOGGER.info("More Geodes initialized!");
    }
}