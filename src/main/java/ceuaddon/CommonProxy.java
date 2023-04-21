package ceuaddon;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = CEuAddon.ID)
public class CommonProxy {

    public static MetaItem<?> exampleitems;

    public static MetaItem<?>.MetaValueItem exampleSusso;

    public void preLoad() {
        exampleitems = new StandardMetaItem();
        exampleitems.setRegistryName("example_item");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        exampleSusso = exampleitems.addItem(0, "example_susso_meta_item");
    }
}