package ceuaddon.metatileentities;

import ceuaddon.CEuAddon;
import ceuaddon.recipe.ExampleRecipeMaps;
import ceuaddon.metatileentities.multiblock.*;
import ceuaddon.metatileentities.singleblock.*;
import gregtech.api.GTValues;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.client.renderer.texture.Textures;
import net.minecraft.util.ResourceLocation;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gregtech.common.metatileentities.MetaTileEntities.registerSimpleMetaTileEntity;

public class ExampleMetaTileEntities {

    // Multiblock
    public static MetaTileEntitySteamCompressor STEAM_COMPRESSOR;
    public static MetaTileEntityTestElectric TEST_MULTIBLOCK;

    // Singleblock
    public static SteamTest STEAM_TEST_BRONZE;
    public static SteamTest STEAM_TEST_STEEL;
    public static final SimpleMachineMetaTileEntity[] TEST_MACHINE = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];

    public static void init() {
        // Multiblock
        STEAM_COMPRESSOR = registerMetaTileEntity(19999, new MetaTileEntitySteamCompressor(exampleId("steam_smelter")));
        TEST_MULTIBLOCK = registerMetaTileEntity(19998, new MetaTileEntityTestElectric(exampleId("test_multiblock")));

        // Singleblock
        STEAM_TEST_BRONZE = registerMetaTileEntity(19992, new SteamTest(exampleId("steam_test_bronze"), false));
        STEAM_TEST_STEEL = registerMetaTileEntity(19991, new SteamTest(exampleId("steam_test_steel"), true));

        //19976-19990
        registerSimpleMetaTileEntity(TEST_MACHINE, 19976, "test_machine", ExampleRecipeMaps.TEST_RECIPES, Textures.COMPRESSOR_OVERLAY, true);
    }

    private static ResourceLocation exampleId(String name) {
        return new ResourceLocation(CEuAddon.ID, name);
    }

}
