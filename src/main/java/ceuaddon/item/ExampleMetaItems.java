package ceuaddon.item;

import gregtech.api.items.metaitem.MetaItem;

import java.util.*;

public class ExampleMetaItems {

    public static final List<MetaItem<?>> ITEMS = MetaItem.getMetaItems();

    public static void init() {
        ExampleMetaItems items = new ExampleMetaItems();
        items.setRegistryName("ExampleMetaItems");
    }

    public static MetaItem<?>.MetaValueItem AMONG;
}