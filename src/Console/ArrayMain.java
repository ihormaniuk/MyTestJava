package Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class ArrayMain {
    public static void main(String[] args) {

        System.out.println("Виберіть : (тільки номер)\n" +
                "1 - Перевірити чи є такий місяць\n" +
                "2 - Вивести всі місяці з такою ж порою року\n" +
                "3 - Вивести всі місяці які мають таку саму кількість днів\n" +
                "4 - Вивести на екран всі місяці які мають меншу кількість днів\n" +
                "5 - Вивести на екран всі місяці які мають більшу кількість днів\n" +
                "6 - Вивести на екран наступну пору року\n" +
                "7 - Вивести на екран попередню пору року\n" +
                "8 - Вивести на екран всі місяці які мають парну кількість днів\n" +
                "9 - Вивести на екран всі місяці які мають непарну кількість днів\n" +
                "10 - Вивести на екран чи введений з консолі місяць має парну кількість днів");

        Scanner scanner = new Scanner(System.in);

        List<MonthUa> monthUaList = new ArrayList<>();
        for (MonthUa valueMonthUa : MonthUa.values()) {
            monthUaList.add(valueMonthUa);
        }

        List<Seasons> seasonsList = new ArrayList<>();
        for (Seasons valueSeasons : Seasons.values()) {
            seasonsList.add(valueSeasons);
        }

        int value = scanner.nextInt();

            switch (value) {
                case 1: {
                    print("Ведіть місяць");
                    String read = scanner.next();
                    boolean flag = mountFlag(monthUaList, read);
                    if (flag) {
                        print("Є такий місяць як - " + read);
                    } else {
                        print("Немає таког місяця як - " + read);
                    }
                    break;
                }
                case 2: {
                    print("Ведіть пору року ");
                    String read = scanner.next();
                    for (MonthUa months2 : monthUaList) {
                        if (months2.getSeasons().toString().equalsIgnoreCase(read)) {
                            System.out.println(months2);
                        }else if(months2.name().toString().equalsIgnoreCase(read)){
                            print(months2.getSeasons());
                        }
                    }
                    break;
                }
                case 3:{
                    print("Ведіть місяць ");
                    String read = scanner.next();
                    for(MonthUa monthUa3 : monthUaList){
                        if(monthUa3.name().equalsIgnoreCase(read)){
                            printMonthDay(monthUa3.getDays());
                        }
                    }
                    break;
                }
                case 4:{
                    print("Ведіть кількість днів");
                    int monthDay = scanner.nextInt();
                    if(monthDay == 31 || monthDay < 31){
                        for (MonthUa monthUa : monthUaList){
                            if (monthDay > monthUa.days){
                                print(monthUa.name() + " " + monthUa.getDays());
                            }
                        }if(monthDay <= 28){
                            print("Немає менше 28 днів ");
                        }
                    }else print("Число Більше 31 ");
                    break;
                }
                case 5:{
                    print("Ведіть кількість днів");
                    int monthDay = scanner.nextInt();
                    if(monthDay == 31 || monthDay < 31 && monthDay >= 28){
                        for (MonthUa monthUa : monthUaList){
                            if (monthDay < monthUa.days){
                                print(monthUa.name() + " " + monthUa.getDays());
                            }
                        }
                    }else if(monthDay < 27){
                        print("Немає менше 28 днів ");
                    }else print("Число Більше 31 ");
                    break;
                }
                case 6:{
                    print("Ведіть пору року");
                    String seasons = scanner.next();
                    Seasons seasons1 = Seasons.valueOf(upperCase(seasons.toLowerCase()));
                    int i = seasons1.ordinal();

                    if (i == (seasonsList.size() - 1)) {
                        i = 0;
                        System.out.println(seasonsList.get(i));
                    } else {
                        System.out.println(seasonsList.get(i + 1));
                    }
                    break;
                }
                case 7:{
                    print("Ведіть пору року");
                    String seasons = scanner.next();
                    Seasons seasons1 = Seasons.valueOf(upperCase(seasons.toLowerCase()));
                    int i = seasons1.ordinal();

                    if (i == (seasonsList.size() + 1)) {
                        i = 0;
                        System.out.println(seasonsList.get(i));
                    } else {
                        System.out.println(seasonsList.get(i - 1));
                    }
                    break;
                }
                case 8:{
                    for (MonthUa monthUa : monthUaList){
                        if(monthUa.getDays() % 2 == 0){
                            print(monthUa.name() + " " + monthUa.getDays());
                        }
                    }
                    break;
                }
                case 9:{
                    for (MonthUa monthUa : monthUaList){
                        if(monthUa.getDays() % 2 != 0){
                            print(monthUa.name() + " " + monthUa.getDays());
                        }
                    }
                    break;
                }
                case 10:{
                    print("Ведіть місяць ");
                    String read = scanner.next();
                    for(MonthUa monthUa : monthUaList){
                        if(monthUa.name().equalsIgnoreCase(read)){
                            if(monthUa.getDays() % 2 == 0){
                                print(monthUa + " " + monthUa.getDays() + " Має Парну кількість днів " );
                            }else if(monthUa.getDays() % 2 !=0){
                                print(monthUa + " " + monthUa.getDays() + " Немає парної кількості днів");
                            }
                        }
                    }
                }
            }
    }

    static String upperCase(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        } else {
            return string.substring(0, 1).toUpperCase() + string.substring(1);
        }
    }

    static void printMonthDay(int specifiedNumber){
        for (MonthUa monthUa : MonthUa.values()){
            if (monthUa.days == specifiedNumber){
                print(monthUa.name() + " " + monthUa.getDays());
            }
        }
    }

    static boolean mountFlag (List<MonthUa> monthUaList, String s){
        boolean flag = false;
        for (MonthUa m : monthUaList){
            if (m.name().equalsIgnoreCase(s)) {
                flag = true;
            }
        }
        return flag;
    }
}
