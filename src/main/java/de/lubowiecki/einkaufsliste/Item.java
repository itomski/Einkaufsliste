package de.lubowiecki.einkaufsliste;

public class Item {

    // private heißt nur Objekte dieser Klasse dürfen auf diese Eigenschaften zugreifen

    private String name;

    private String category;

    private int amount;

    // Wird kein Konstruktor definiert gibt es einen leeren Standardkonstruktor

    // Wird ein Konstruktor definiert, wird ein leerer Standardkonstruktor nicht mehr automatisch erzeugt

    // Konstruktor: wird bei der Instanzierung des Objektes benutzt
    public Item() {
        name = "Unbekannt";
        category = "Unbekannt";
    }

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Aufgabe: Definiere einen neuen Konstrutor mit 3 Parametern

    public String showDetails() {
        // Es gibt keine gleichnamigen Methodenparameter d.h. name ist die Instanzvariable
        return name + ", " + category + ", Anzahl: " + amount;
    }

    public String getName() { // Lesend
        return name;
    }

    public void setName(String name) { // Schreibend
        // Prüfen ob der neue Wert ok ist und eingesetzt werden kann
        if(name != null) {
            // this.name ist die Instanzvariable
            // name ist lokale Methodenparameter
            this.name = name;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if(category != null) {
            this.category = category;
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if(amount >= 0) {
            this.amount = amount;
        }
    }

    @Override
    public String toString() { // Konvertiert ein Item in einen String
        return showDetails(); // Verwendet eine andere Methode
    }
}
