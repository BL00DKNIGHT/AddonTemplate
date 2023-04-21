package ceuaddon;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import gregtech.api.unification.ore.OrePrefix; //Needed for oreprefix/unification
import gregtech.api.GregTechAPI; //Used to interact with CEu's creative tabs and events like HighTier

import gregtech.api.items.metaitem.ElectricStats; //Needed for PotatOS (battery)
import gregtech.api.GTValues; //To set voltages
import gregtech.api.unification.material.MarkerMaterials.Tier; //To set tiers
@Mod.EventBusSubscriber(modid = CEuAddon.ID)
public class CommonProxy {

    public static MetaItem<?> exampleitems;

    public static MetaItem<?>.MetaValueItem exampleSusso;
    public static MetaItem<?>.MetaValueItem POTATOS;
    public static MetaItem<?>.MetaValueItem POTATOS_ULV;

    public void preLoad() {
        exampleitems = new StandardMetaItem();
        exampleitems.setRegistryName("example_item");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        exampleSusso = exampleitems.addItem(0, "example_susso_meta_item");
        POTATOS = exampleitems.addItem(1, "battery.re.ulv.potatos").addComponents(ElectricStats.createRechargeableBattery(Long.MAX_VALUE, GTValues.ULV)).setUnificationData(OrePrefix.battery, Tier.ULV).setCreativeTabs(GregTechAPI.TAB_GREGTECH_TOOLS);
        POTATOS_ULV = exampleitems.addItem(2, "circuit.potatos").setUnificationData(OrePrefix.circuit, Tier.MAX);
    }
}
