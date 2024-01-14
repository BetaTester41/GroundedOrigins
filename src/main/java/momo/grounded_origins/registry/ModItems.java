package momo.grounded_origins.registry;

import momo.grounded_origins.GroundedOrigins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


public class ModItems {

    // Icons
    public static final Item BEACH_CRAB_ICON = new Item(new FabricItemSettings());
    public static final Item DEER_ICON = new Item(new FabricItemSettings());
    public static final Item MOTH_ICON = new Item(new FabricItemSettings());
    public static final Item PENGUIN_ICON = new Item(new FabricItemSettings());

    // Moth food
    public static final Item FLOWER_STAMENS = new Item(new FabricItemSettings().food(new FoodComponent.Builder().alwaysEdible().build())
    );

    public static void init() {
        // Icons
        Registry.register(Registries.ITEM, new Identifier(GroundedOrigins.MOD_ID, "beach_crab_icon"), BEACH_CRAB_ICON);
        Registry.register(Registries.ITEM, new Identifier(GroundedOrigins.MOD_ID, "deer_icon"), DEER_ICON);
        Registry.register(Registries.ITEM, new Identifier(GroundedOrigins.MOD_ID, "moth_icon"), MOTH_ICON);
        Registry.register(Registries.ITEM, new Identifier(GroundedOrigins.MOD_ID, "penguin_icon"), PENGUIN_ICON);
        // Moth food
        Registry.register(Registries.ITEM, new Identifier(GroundedOrigins.MOD_ID, "flower_stamens"), FLOWER_STAMENS);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entry -> {
            entry.add(FLOWER_STAMENS);
        });
    }
}
