package Lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class VerkhovnaRada {
    Scanner scanner = new Scanner(System.in);

    private static VerkhovnaRada verkhovnaRada = new VerkhovnaRada ();

    private VerkhovnaRada(){
    }

    public static VerkhovnaRada getVerkhovnaRada() {
        if (verkhovnaRada == null) {
            verkhovnaRada = new VerkhovnaRada();
        }

        return verkhovnaRada;
    }

    List<Faction> factions = new ArrayList<>();

    public void addFaction(){  //додати фракцію
        print("Ведіть назву фракції ");
        String deputyFactionName = scanner.next();

        Faction faction = new Faction(deputyFactionName);

        factions.add(faction);
        System.out.println(faction.toString() + " Фракція добавлена !");
    }
    public void removeFaction(){ //видалити фракцію
        print("Ведіть назву фракції ");
        String deputyFactionName = scanner.next();
        boolean typeCorrect = isDeputyGroupExists(factions, deputyFactionName);

        if (typeCorrect) {

            Iterator<Faction> iterator = factions.iterator();
            while (iterator.hasNext()) {

                Faction factionNext = iterator.next();

                if (factionNext.getNameFaction().equalsIgnoreCase(deputyFactionName)) {
                    iterator.remove();
                    System.out.println(factionNext.toString() + " видалено");
                }
            }
        } else {
            print("Немає такої Фракції ");
        }
    }
    public void getAllFaction(){ //вивести всі фракції
        print("Всі фракції : ");
        for(Faction faction : factions){
            print(faction.toString());
        }
    }

    public void getOneFaction(){ //вивести конкретну фракцію
        print(" Ведіть назву фракції ");
        String nameFaction = scanner.next();

        for (Faction faction : factions) {
            if(faction.getNameFaction().equalsIgnoreCase(nameFaction)){
                print(faction.toString() + " Є ");
            }else
                print(" немає такої фракції : " + nameFaction);
        }
    }

    public void addDeputyFaction(){ //додати депутата до конкретної фракції
        print("Ведіть назву фракції ");
        String addDeputy = scanner.next();
        for (Faction factiongroupe : factions) {
            if (factiongroupe.getNameFaction().equalsIgnoreCase(addDeputy)) {
                factiongroupe.addDeputy();
            }else {
                print("немає такої фракції : " + addDeputy);
            }
        }
    }

    public void removeDeputy(){ //видалити депутата
        print("Ведіть назву фракції ");
        String removeDeputy = scanner.next();
        for (Faction factiongroupe : factions) {
            if (factiongroupe.getNameFaction().equalsIgnoreCase(removeDeputy)) {
                factiongroupe.removeDeputy();
            }else {
                print("немає такої фракції : " + removeDeputy);
            }
        }
    }

    public void allBringFaction(){ //вивести всіх хабарників у фракції
        print("Ведіть назву фракції ");
        String factionBring = scanner.next();
        for(Faction faction : factions){
            if(faction.getNameFaction().equalsIgnoreCase(factionBring)){
                faction.bringOutAllBribersFraction();
            }else {
                print("немає такої фракції : " + factionBring);
            }
        }
    }

    public void bringOutBiggest(){ //вивести найбільшого хабарника у фракції
        print("Ведіть назву фракції ");
        String factionBring = scanner.next();
        for(Faction faction : factions){
            if(faction.getNameFaction().equalsIgnoreCase(factionBring)){
                faction.bringOutBiggestFaction();
            }else {
                print("немає такої фракції : " + factionBring);
            }
        }
    }

    public void giveAllDeputyFaction(){ //вивести всіх депутатів фракції
        print("Ведіть назву фракції ");
        String factionDeputy = scanner.next();
        for(Faction faction : factions){
            if(faction.getNameFaction().equalsIgnoreCase(factionDeputy)){
                faction.addDeputy();
            }else {
                print("немає такої фракції : " + factionDeputy);
            }
        }
    }

    public void clearDeputyGroup() {
        System.out.println("Ведіть назву фракції");
        String deputyGroupName = scanner.next();

            for (Faction faction : factions) {
                if (faction.getNameFaction().equalsIgnoreCase(deputyGroupName)) {
                    faction.removeAllFractionDeputies();
                }else {
                    print("немає такої фракції : " + deputyGroupName);
                }
            }
    }

    static boolean isDeputyGroupExists(List<Faction> factions, String deputyGroupName) {
        boolean flag = false;

        for (Faction faction : factions) {
            if (faction.getNameFaction().equalsIgnoreCase(deputyGroupName)) {
                flag = true;
            }
        }

        return flag;
    }

}
