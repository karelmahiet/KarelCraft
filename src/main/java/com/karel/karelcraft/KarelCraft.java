package com.karel.karelcraft;

import com.karel.karelcraft.item.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod(KarelCraft.MOD_ID)
public class KarelCraft {
    public static final String MOD_ID = "karelcraft";

    public KarelCraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
    }
}
