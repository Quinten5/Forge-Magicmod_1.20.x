package net.qyurin.Bewitchery.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.qyurin.Bewitchery.Bewitchery;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bewitchery.MOD_ID);

    public static final RegistryObject<Item> UNICORN_HORN = ITEMS.register("unicornhorn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNICORN_HAIR = ITEMS.register("unicorn_hair",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
