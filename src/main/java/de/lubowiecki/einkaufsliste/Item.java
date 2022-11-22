package de.lubowiecki.einkaufsliste;

public class Item {

    String name;

    String category;

    int amount;

    String showDetails() {
        return name + ", " + category + ", Anzahl: " + amount;
    }

}
