package vinnystalck.rawmetal.forge;

import me.shedaniel.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import vinnystalck.rawmetal.RawMetal;

@Mod(RawMetal.MOD_ID)
public class RawMetalForge {
	public RawMetalForge() {
		// Submit our event bus to let architectury register our content on the right time
		EventBuses.registerModEventBus(RawMetal.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
		
		RawMetal.initialize();
	}
}
