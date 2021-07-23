package vinnystalck.rawmetal.init;

import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import vinnystalck.rawmetal.RawMetal;

public class RawMetalItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(RawMetal.MOD_ID, Registry.ITEM_KEY);

	public static final RegistrySupplier<Item> RAW_IRON = regRawMetal("raw_iron");
	public static final RegistrySupplier<Item> RAW_GOLD = regRawMetal("raw_gold");
	public static final RegistrySupplier<Item> RAW_COPPER = regRawMetal("raw_copper");
	public static final RegistrySupplier<Item> RAW_ZINC = regRawMetal("raw_zinc");
			
	public static final RegistrySupplier<Item> RAW_IRON_BLOCK = regRawMetalBlock("raw_iron_block", RawMetalBlocks.RAW_IRON_BLOCK);
	public static final RegistrySupplier<Item> RAW_GOLD_BLOCK = regRawMetalBlock("raw_gold_block", RawMetalBlocks.RAW_GOLD_BLOCK);
	public static final RegistrySupplier<Item> RAW_COPPER_BLOCK = regRawMetalBlock("raw_copper_block", RawMetalBlocks.RAW_COPPER_BLOCK);
	public static final RegistrySupplier<Item> RAW_ZINC_BLOCK = regRawMetalBlock("raw_zinc_block", RawMetalBlocks.RAW_ZINC_BLOCK);

	public static void initialize() {
		ITEMS.register();
	}

	private static RegistrySupplier<Item> regRawMetal(String id) {
		return ITEMS.register(id, () -> new Item(new Item.Settings().group(ItemGroup.MISC)));
	}
	private static RegistrySupplier<Item> regRawMetalBlock(String id, RegistrySupplier<Block> block) {
		return ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
