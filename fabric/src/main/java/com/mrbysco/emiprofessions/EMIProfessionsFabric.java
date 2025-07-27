package com.mrbysco.emiprofessions;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class EMIProfessionsFabric implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		//ClientWorldEvents.AFTER_CLIENT_WORLD_CHANGE.register((client, world) -> {
		//	VillagerCache.clearCache();
		//});
		ServerLifecycleEvents.SYNC_DATA_PACK_CONTENTS.register((player, joined) -> {
			VillagerCache.clearCache();
		});
	}
}
