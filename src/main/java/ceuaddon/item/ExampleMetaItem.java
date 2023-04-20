package ceuaddon.item;

import gregtech.api.items.metaitem.*;
import static gregtech.api.unification.material.MarkerMaterials.*;
import gregtech.api.unification.ore.OrePrefix;

import static ceuaddon.item.*;

public class ExampleMetaItem extends StandardMetaItem {

    public ExampleMetaItem() { super(); }

    @Override
    public void registerSubItems() {

        AMONG = addItem(1, "amogus");
    }
}