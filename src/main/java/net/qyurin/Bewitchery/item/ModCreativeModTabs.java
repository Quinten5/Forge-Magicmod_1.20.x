package net.qyurin.Bewitchery.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.qyurin.Bewitchery.Bewitchery;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Bewitchery.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BEWITCHERY_TAB = CREATIVE_MODE_TABS.register("bewitchery_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.UNICORN_HORN.get()))
                    .title(Component.translatable("creativetab.bewitchery_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.UNICORN_HORN.get());
                        output.accept(ModItems.UNICORN_HAIR.get());

                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
