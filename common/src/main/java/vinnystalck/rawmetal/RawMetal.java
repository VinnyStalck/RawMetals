package vinnystalck.rawmetal;

import vinnystalck.rawmetal.init.RawMetalBlocks;
import vinnystalck.rawmetal.init.RawMetalItems;

public class RawMetal {
	public static final String MOD_ID = "rawmetal";

	public static void initialize() {
		RawMetalBlocks.initialize();
		RawMetalItems.initialize();
	}
}
