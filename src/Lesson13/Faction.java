package Lesson13;

import java.util.*;

import static PrintAndScanner.Print.print;

public class Faction {

    private String nameFaction;

    public Faction(String nameFaction){
        this.nameFaction = nameFaction;
    }

    public String getNameFaction() {
        return nameFaction;
    }

    public void setNameFaction(String nameFaction) {
        this.nameFaction = nameFaction;
    }

    Scanner scanner = new Scanner(System.in);

    List<Deputy> deputyList = new ArrayList<>();

    public void addDeputy(){
        print("Ведіть фамілію депутата ");
        String surname = scanner.next();
        print("Ведіть імя депутата");
        String name = scanner.next();
        print("Скільки років депутату ?");
        int age = scanner.nextInt();
        print("Ведіть вагу депутата");
        int weight = scanner.nextInt();
        print("Ведіть ріст депутата");
        int height = scanner.nextInt();
        print("Депутат бере хабар ?");
        boolean bribery = scanner.nextBoolean();
        Deputy deputy = new Deputy(surname,name,age,bribery,weight,height);
        deputy.toBribe(bribery);
        deputyList.add(deputy);
    }
    public void removeDeputy(){
        print("Ведіть фамілію депутата ");
        String surname = scanner.next();
        print("Ведіть імя депутата");
        String name = scanner.next();

        Iterator<Deputy> deputyIterator = deputyList.iterator();
        while (deputyIterator.hasNext()){
            Deputy nextDeputy = deputyIterator.next();
            if(nextDeputy.getSurname().equalsIgnoreCase(surname)&&nextDeputy.getName().equalsIgnoreCase(name)){
                deputyIterator.remove();
                print("Депутата"+ nextDeputy.toString() + "видалено  з фракції");
            }else {
                print("Немає такого депутата ");
            }
        }
    }
    public void bringOutAllBribersFraction(){
        for(Deputy deputy : deputyList){
            if(deputy.isBribery()){
                print(deputy.toString());
            }
        }
    }
    public void bringOutBiggestFaction(){
        int bribeSize = 0;
        int deputyIndex = -1;

        for (int i = 0; i < deputyList.size(); i++) {
            if (deputyList.get(i).isBribery()) {
                if (deputyList.get(i).getBribeSize() > bribeSize) {
                    bribeSize = deputyList.get(i).getBribeSize();
                    deputyIndex = deputyList.indexOf(deputyList.get(i));
                }
            }
        }

        if (deputyIndex >= 0) {
            System.out.println("Самый большой взяточник фракции " + deputyList.get(deputyIndex).toString());
        } else {
            System.out.println("В данной партии взяточников нет!");
        }
    }
    public void allDeputiesFraction(){
        for(Deputy deputy : deputyList){
            print(deputy.toString());
        }
    }
    public void removeAllFractionDeputies(){
        deputyList.clear();
        print("Всі депутати Видалені ");
    }
}
