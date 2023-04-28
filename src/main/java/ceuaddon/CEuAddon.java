package ceuaddon;

import ceuaddon.item.ExampleMaterials;
import ceuaddon.item.ExampleMetaItems;
import ceuaddon.metatileentities.ExampleMetaTileEntities;
import ceuaddon.recipe.ExampleRecipes;
import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = CEuAddon.ID,
        name = CEuAddon.NAME,
        version = CEuAddon.VERSION,
        dependencies = GTValues.MOD_VERSION_DEP)
public class CEuAddon {

    public static final String ID = "exampleaddon";
    public static final String NAME = "Example Addon for CEu";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ExampleMetaItems.preInit();
        ExampleMetaTileEntities.init();
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        ExampleRecipes.init();
    }

    @SubscribeEvent
    public void registerMaterials(GregTechAPI.MaterialEvent event) {
        ExampleMaterials.init();
    }
}
