package IteratorLab;

import java.util.ArrayList;
import java.util.List;

public class TreasureChest {
    private List<Item> items = new ArrayList<>();

    public TreasureChest() {
        items.add(new Item( "Brave Potion",ItemType.POTION));

        items.add(new Item( "Ring that makes you Strong",ItemType.RING));
        items.add(new Item( "LIfe Potion",ItemType.POTION));

        items.add(new Item("King Arthur's Sword ",ItemType.WEAPON));


    }

    ItemIterator iterator(ItemType itemtype) {
        ItemIterator itemIterator = new TreasureChestItemIterator(this, itemtype);
        return itemIterator;
    }

    public List<Item> getItems() {
        return items;
    }
}
