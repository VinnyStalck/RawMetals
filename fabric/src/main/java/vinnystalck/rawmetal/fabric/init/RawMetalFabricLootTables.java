package vinnystalck.rawmetal.fabric.init;

import java.util.ArrayList;

import me.shedaniel.architectury.registry.RegistrySupplier;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.Item;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import vinnystalck.rawmetal.init.RawMetalItems;
import vinnystalck.rawmetal.init.RawMetalLootTables;

public class RawMetalFabricLootTables extends RawMetalLootTables {
	public static void initialize() {
		LootTableLoadingCallback.EVENT.register(
			(resourceManager, lootManager, identifier, fabricLootSupplierBuilder, lootTableSetter) -> {
				if (IRON_ORE.equals(identifier)) {
					lootTableSetter.set(lootTable(RawMetalItems.RAW_IRON));
				}
				if (GOLD_ORE.equals(identifier)) {
					lootTableSetter.set(lootTable(RawMetalItems.RAW_GOLD));
				}
			});
	}

	private static LootTable lootTable(RegistrySupplier<Item> item) {
		ArrayList<LootPool> lootPools = new ArrayList<LootPool>();
		lootPools.add(
			FabricLootPoolBuilder.builder()
				.rolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(item.get()).build())
				.build());

		FabricLootSupplierBuilder supplierBuilder = FabricLootSupplierBuilder.builder().withPools(lootPools);

		return supplierBuilder.build();
	}
}
