package vinnystalck.rawmetal.init;

import me.shedaniel.architectury.registry.BlockProperties;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import me.shedaniel.architectury.registry.ToolType;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import vinnystalck.rawmetal.RawMetal;

public class RawMetalBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(RawMetal.MOD_ID, Registry.BLOCK_KEY);

	public static final RegistrySupplier<Block> RAW_IRON_BLOCK = regRawMetalBlock("raw_iron_block");
	public static final RegistrySupplier<Block> RAW_GOLD_BLOCK = regRawMetalBlock("raw_gold_block");
	public static final RegistrySupplier<Block> RAW_COPPER_BLOCK = regRawMetalBlock("raw_copper_block");
	public static final RegistrySupplier<Block> RAW_ZINC_BLOCK = regRawMetalBlock("raw_zinc_block");

	public static void initialize() {
		BLOCKS.register();
	}

	private static RegistrySupplier<Block> regRawMetalBlock(String id) {
		return BLOCKS.register(id, () -> new Block(BlockProperties.of(Material.METAL)
			.tool(ToolType.PICKAXE, 1).strength(5f, 6f).sounds(BlockSoundGroup.METAL)));
	}
}
