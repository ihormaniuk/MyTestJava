package Lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class VerkhovnaRada {

    List<Faction> factions = new ArrayList<>();

    public void addFaction(){
        Scanner scanner = new Scanner(System.in);
        print("Ведіть насзву фракції ");
        String deputyFactionName = scanner.next();

        Faction faction = new Faction(deputyFactionName);

        factions.add(faction);
        System.out.println(faction.toString() + " Фракція добавлена !");
    }
    public void removeFaction(){
        factions.clear();
        print("");
    }
}
