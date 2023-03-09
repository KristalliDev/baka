package dev.kristalli.baka.item;

import dev.kristalli.baka.Baka;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BakaItemGroup {
    public static ItemGroup BAKA;

    public static void registerItemGroups() {
        BAKA = FabricItemGroup.builder(new Identifier(Baka.MOD_ID, "baka"))
                .displayName(Text.translatable("itemgroup.baka"))
                .icon(() -> new ItemStack(BakaItems.BAKAYARO)).build();
    }
}