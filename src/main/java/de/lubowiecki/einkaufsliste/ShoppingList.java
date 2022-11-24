package de.lubowiecki.einkaufsliste;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
}
