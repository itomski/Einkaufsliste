package de.lubowiecki.einkaufsliste;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Scanner ist der Datentyp der Variable
        // scanner ist Variablenname
        // new Scanner(...) das Objekt wird gebaut und in die Variable scanner hinterlegt
        // System.in Eingaben auf der Konsole
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe: ");
        String eingabe = scanner.nextLine(); // Liest den Inhalt der Konsole bis zum Ende der aktuellen Zeile
        System.out.println("#" + eingabe + "#");

        // trim() schneidet die überflüssigen Leerzeichen am Anfang und Ende der Zeichenkette ab
        System.out.println("#" + eingabe.trim() + "#");

        // toLowerCase() ändert alles in Kleinbuchstaben um
        System.out.println("#" + eingabe.trim().toLowerCase() + "#");

        eingabe = eingabe.trim().toLowerCase(); // In der Eingabe die Leerzeichen entfernen und in Kleinbuchstaben ändern
        //System.out.println(eingabe.equals("hallo"));
        //System.out.println(eingabe == "hallo"); // ist es das gleiche Objekt auf dem Speicher?

        // EVA = Eingabe, Verarbeitung, Ausgabe

        if(eingabe.equals("add")) {
            System.out.println("Neues Item zu der Soppinglist hinzufügen");
        }
        else if(eingabe.equals("show")) {
            System.out.println("Zeige alle Items aus der Liste");
        }
        else if(eingabe.equals("exit")) {
            System.out.println("Programm verlassen.");
        }
        else {
            System.out.println("Eingabe ungültig.");
        }

        System.exit(0); // Programm HIER beenden

        // bei primitiven Typen (byte, short, int, char, long, float, double) ist == ein Wertvergleich
        // 10 == 15 : false
        // 7 == 7 : true
        // int a = 10, b = 15;
        // a == b : false

        // bei komplexen Typen (alles was aus einer Klasse erzeugt wird) ist == ein Referenzvergleich
        // Referenzvergleich heißt sind die Variablen Referenzen auf das gleiche Objekt auf dem Heap
        // Equals ist bei komplexen Typen der Wertvergleich/Inhaltsvergleich
        // primitive Typen haben kein equals

        int a = 10, b = 20;
        System.out.println(a == b); // primitiver Wertevergleich

        Integer a2 = 10, b2 = 20; // Komplex
        System.out.println(a2 == b2); // Referenzvergleich: Ist es das gleiche Objekt auf dem Speicher?
        System.out.println(a2.equals(b2)); // Inhaltsvergleich
    }
}
