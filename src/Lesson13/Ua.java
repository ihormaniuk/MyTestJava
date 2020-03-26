package Lesson13;

import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class Ua {
    public static void menu(){
        print("Введіть 1 щоб додати фракцію\n" +
                "Введіть 2 щоб видалити конкретну фракцію\n" +
                "Введіть 3 щоб вивести усі фракції\n" +
                "Введіть 4 щоб очистити конкретну фракцію\n" +
                "Введіть 5 щоб вивести конкретну фракцію\n" +
                "Введіть 6 щоб додати депутата в фракцію\n" +
                "Введіть 7 щоб видалити депутата з фракції\n" +
                "Введіть 8 щоб вивести список хабарників\n" +
                "Введіть 9 щоб вивести найбільшого хабарника\n");
    }

    public static void main(String[] args){

        menu();

        while (true) {
            Scanner scanner = new Scanner(System.in);

            print("\n" +
                    "      *** Ведіть Число *** \n" +
                    " *** 10 : Вивести меню знову ! *** \n");

            int read = scanner.nextInt();
            switch (read) {
                case 1: {
                    VerkhovnaRada.getVerkhovnaRada().addFaction();
                    break;
                }
                case 2: {
                    VerkhovnaRada.getVerkhovnaRada().removeFaction();
                    break;
                }
                case 3: {
                    VerkhovnaRada.getVerkhovnaRada().getAllFaction();
                    break;
                }
                case 4: {
                    VerkhovnaRada.getVerkhovnaRada().clearDeputyGroup();
                    break;
                }
                case 5:{
                    VerkhovnaRada.getVerkhovnaRada().getOneFaction();
                    break;
                }
                case 6:{
                    VerkhovnaRada.getVerkhovnaRada().addDeputyFaction();
                    break;
                }
                case 7:{
                    VerkhovnaRada.getVerkhovnaRada().removeDeputy();
                    break;
                }
                case 8:{
                    VerkhovnaRada.getVerkhovnaRada().allBringFaction();
                    break;
                }
                case 9:{
                    VerkhovnaRada.getVerkhovnaRada().bringOutBiggest();
                    break;
                }
                case 10:{
                    menu();
                    break;
                }
                default:{
                    print("Число має бути від 1 до 10");
                }
            }
        }
    }
}
