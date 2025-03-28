package com.karel.karelcraft.item;

import com.karel.karelcraft.KarelCraft;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, KarelCraft.MOD_ID);

    public static final RegistryObject<Item> POUTINE_SACREE = ITEMS.register("poutine_sacree", () ->
        new Item(new Properties()
            .food(new FoodProperties.Builder()
                .nutrition(8)
                .saturationMod(1.2f)
                .alwaysEat()
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1), 1.0f)
                .build())
            .rarity(net.minecraft.world.item.Rarity.RARE)
            .fireResistant()
        ) {
            @Override
            public boolean isFoil(ItemStack stack) {
                return true;
            }
        }
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
