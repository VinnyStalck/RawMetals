package vinnystalck.rawmetal.fabric;

import net.fabricmc.api.ModInitializer;
import vinnystalck.rawmetal.RawMetal;
import vinnystalck.rawmetal.fabric.init.RawMetalFabricLootTables;

public class RawMetalFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		RawMetal.initialize();
		RawMetalFabricLootTables.initialize();
	}
}
