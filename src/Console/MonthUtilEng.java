package Console;

import java.util.Scanner;

public class MonthUtilEng {
    Scanner scanner = new Scanner(System.in);

    //method 1
    public Month readMonth() {
        while (true) {
            if (!(scanner.hasNextInt())) {
                String s = scanner.nextLine().trim();
                for (Month month : Month.values()) {
                    if (s.equalsIgnoreCase(month.name())) {
                        return month;
                    }
                }
                System.out.println("The word you entered is not \nthe name of the month, try again");
                scanner = new Scanner(System.in);
            } else {
                int m = scanner.nextInt();
                if (m > 12 || m < 1) {
                    System.out.println("You entered the wrong month, try again.");
                    scanner = new Scanner(System.in);
                } else {
                    for (Month month : Month.values()) {
                        if (m == month.ordinal() + 1) {
                            return month;
                        }
                    }
                }
            }
        }
    }


    // method 2
    public void sameSeasonMonths(Month month) {
        Seasons season;
        if (month.ordinal() >= 8 && month.ordinal() <= 10) {
            season = Seasons.Autumn;
        } else if (month.ordinal() >= 2 && month.ordinal() <= 4) {
            season = Seasons.Spring;
        } else if (month.ordinal() >= 5 && month.ordinal() <= 7) {
            season = Seasons.Summer;
        } else {
            season = Seasons.Winter;
        }
        switch (season) {
            case Autumn:
                for (Month months : Month.values()) {
                    if (months.ordinal() == month.ordinal() || months.ordinal() < 8 || months.ordinal() > 10) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Spring:
                for (Month months : Month.values()) {
                    if (months.ordinal() == month.ordinal() || months.ordinal() < 2 || months.ordinal() > 4) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Summer:
                for (Month months : Month.values()) {
                    if (months.ordinal() == month.ordinal() || months.ordinal() < 5 || months.ordinal() > 7) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Winter:
                for (Month months : Month.values()) {
                    if (months.ordinal() == month.ordinal() || months.ordinal() < 11 && months.ordinal() > 1) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
        }
    }

    //method 10
    public void evenNumberOfDays (Month month) {
        if (month.inDays % 2 == 0) {
            System.out.println(month.name() + " has an even number of days.");
        } else {
            System.out.println(month.name() + " has an odd number of days.");
        }
    }

}