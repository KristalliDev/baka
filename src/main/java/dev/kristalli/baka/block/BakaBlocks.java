package dev.kristalli.baka.block;

import dev.kristalli.baka.Baka;
import dev.kristalli.baka.item.BakaItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class BakaBlocks {
    public static final Block LEXX = registerBlock("lexx",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.5f).nonOpaque().noCollision().ticksRandomly().requiresTool()), BakaItemGroup.BAKA);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Baka.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Baka.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerBlocks() {
        Baka.LOGGER.info("Registering Baka Blocks ^^");
    }
}