package Console;

import java.util.Scanner;

public class MonthUtilUa {
    Scanner scanner = new Scanner(System.in);

//    method 1
    public MonthUa readMonth() {
        while (true) {
            if (!(scanner.hasNextInt())) {
                String s = scanner.nextLine().trim ();
                for ( MonthUa monthUa : MonthUa.values()) {
                    if (s.equalsIgnoreCase(monthUa.name())) {
                        return monthUa;
                    }
                }
                System.out.println("Введене Слово не Вірне спробуйте ще раз");
//                scanner = new Scanner(System.in);
            } else {
                int m = scanner.nextInt();
                if (m > 12 || m < 1) {
                    System.out.println("Ви ввели неправильний місяць, спробуйте ще раз.");
                    scanner = new Scanner(System.in);
                } else {
                    for ( MonthUa monthUa : MonthUa.values()) {
                        if (m == monthUa.ordinal() + 1) {
                            return monthUa;
                        }
                    }
                }
            }
        }
    }

    //method 2
    public void sameSeasonMonths(MonthUa monthUa) {
        Seasons season;
        if (monthUa.ordinal() >= 8 && monthUa.ordinal() <= 10) {
            season = Seasons.Осінь;
        } else if (monthUa.ordinal() >= 2 && monthUa.ordinal() <= 4) {
            season = Seasons.Весна;
        } else if (monthUa.ordinal() >= 5 && monthUa.ordinal() <= 7) {
            season = Seasons.Літо;
        } else {
            season = Seasons.Зима;
        }
        switch (season) {
            case Осінь:
                for ( MonthUa months : MonthUa.values()) {
                    if (months.ordinal() == monthUa.ordinal() || months.ordinal() < 8 || months.ordinal() > 10) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Весна:
                for ( MonthUa months : MonthUa.values()) {
                    if (months.ordinal() == monthUa.ordinal() || months.ordinal() < 2 || months.ordinal() > 4) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Літо:
                for ( MonthUa months : MonthUa.values()) {
                    if (months.ordinal() == monthUa.ordinal() || months.ordinal() < 5 || months.ordinal() > 7) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Зима:
                for ( MonthUa months : MonthUa.values()) {
                    if (months.ordinal() == monthUa.ordinal() || months.ordinal() < 11 && months.ordinal() > 1) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
        }
    }

    //method 10
    public void evenNumberOfDays (MonthUa monthUa) {
        if (monthUa.inDays % 2 == 0) {
            System.out.println(monthUa.name() + " має парну кількість днів.");
        } else {
            System.out.println(monthUa.name() + " має непарну кількість днів.");
        }
    }
}
