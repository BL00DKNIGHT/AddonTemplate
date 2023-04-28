package ceuaddon.item;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.*; //recommended to check this if you want to add some properties
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.info.MaterialIconSet;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;

public class ExampleMaterials {

    public static final MaterialIconSet EXAMPLE = new MaterialIconSet("exampleiconset");

    //Registering them
    public static Material testMaterial;

    //Adding Materials
    public static void init() {
        testMaterial = new Material.Builder(32000, "test_material")
                .ingot()
                .color(0xFF8D3B)
                    //CEu uses the hex color code, but make sure to put 0x before the hex color
                .iconSet(EXAMPLE)
                    //gregtech/api/unification/material/info/MaterialIconSet.java
                .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                    //Flags, you can find all of them at gregtech/api/unification/material/info/MaterialFlags.java
                .components(Titanium, 1, Oxygen, 20)
                    //You can find all materials on gregtech/api/unification/material/Materials.java
                .itemPipeProperties(8192, 1)
                    //Priority, transferRate
                .cableProperties(VA[UV], 128, 0, true, 78)
                    //Voltage, Amps, EnergyLoss, isSuperConductor, CriticalTemp
                .blastTemp(9001, GasTier.HIGHER, VA[ZPM], 1000)
                    //Temp, GasTier, eutOverride, durationOveride (in ticks)
                .build();
    }
}
