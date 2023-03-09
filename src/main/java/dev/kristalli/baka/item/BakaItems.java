package dev.kristalli.baka.item;

import dev.kristalli.baka.Baka;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class BakaItems {
    private static final Item BAKAYANO = registerItem("bakayano",
            new Item(new FabricItemSettings()
                    .maxCount(420).fireproof().rarity(Rarity.EPIC)));

    public static final Item BAKAYARO = registerItem("bakayaro",
            new Item(new FabricItemSettings()
                    .maxCount(69).fireproof().rarity(Rarity.EPIC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Baka.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(BakaItemGroup.BAKA, BAKAYARO);
        addToItemGroup(BakaItemGroup.BAKA, BAKAYANO);

        addToItemGroup(ItemGroups.INGREDIENTS, BAKAYARO);
        addToItemGroup(ItemGroups.INGREDIENTS, BAKAYANO);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerBakaItems() {
        Baka.LOGGER.info("Registering Baka Items ^^");
        addItemsToItemGroup();
    }
}