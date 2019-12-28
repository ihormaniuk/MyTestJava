package Console;

import java.util.Scanner;

public class ConsoleUa {
    // method 3
    public void printAllMonthsThatHaveTheSameNumberofDays(int specifiedNumber){
        for (MonthUa m : MonthUa.values()){
            if (m.inDays == specifiedNumber){
                System.out.println(m.toString());
            }
        }
    }

    // method 4
    public void showDisplayallMonthsthatHaveFewerDays(int specifiedNumber){

        String s = null;
        for (MonthUa m : MonthUa.values()){
            if (m.inDays < specifiedNumber){
                System.out.println(m.toString());
                s=m.toString();
            }
        }
        if (s==null){
            System.out.println("немає менших місяців");
        }

    }

    //method 5
    public void showonDisplayallMonthsThatHaveMoreGreatDays(int specifiedNumber){
        String s = null;

        for (MonthUa m : MonthUa.values()){
            if (m.inDays > specifiedNumber){
                System.out.println(m.toString());
                s=m.toString();

            }
        }
        if (s==null){
            System.out.println("немає більших місяців");
        }

    }

    //method 6
    public  void printNextSeason(MonthUa monthUa) {
        System.out.print("Наступний Сезон " + monthUa + " це ");
        switch (monthUa) {
            case Грудень:
            case Січень:
            case Лютий:
                System.out.println(Seasons.Весна);
                break;
            case Березень:
            case Квітень:
            case Травень:
                System.out.println(Seasons.Літо);
                break;
            case Червень:
            case Липень:
            case Серпень:
                System.out.println(Seasons.Осінь);
                break;
            case Вересень:
            case Жовтень:
            case Листопад:
                System.out.println(Seasons.Зима);
                break;
            default:
                System.out.println("---некоректно ведений місяць---");
                break;
        }
    }

    //method 7
    public void printPreviousSeason(MonthUa monthUa) {
        System.out.print(" Попередній Сезон " + monthUa + " це ");
        switch (monthUa) {
            case Грудень:
            case Січень:
            case Лютий:
                System.out.println(Seasons.Осінь);
                break;
            case Березень:
            case Квітень:
            case Травень:
                System.out.println(Seasons.Зима);
                break;
            case Червень:
            case Липень:
            case Серпень:
                System.out.println(Seasons.Весна);
                break;
            case Вересень:
            case Жовтень:
            case Листопад:
                System.out.println(Seasons.Літо);
                break;
            default:
                System.out.println("---некоректно ведений місяць---");
                break;
        }
    }

    //method 8
    public void evenMonth (){

        for (MonthUa d : MonthUa.values()){


            if (d.inDays%2==0){
                System.out.println(d.name()+ " День = "+ d.inDays);
            }

        }

    }

    //method 9
    public void oddMonth (){
        for (MonthUa d : MonthUa.values()){


            if (d.inDays%2==1){
                System.out.println(d.name()+ " День  = "+ d.inDays);
            }

        }


    }
    public void check(MonthUa month) {
        boolean monthExists = false;
        for (MonthUa m : MonthUa.values()) {
            if (m.equals(month)) {
                monthExists = true;
            }
        }

        if (monthExists) {
            System.out.println(month + " дійсно існує ");
        }
        else {
            System.out.println("Немає такого місяця, як " + month);
        }
    }




    public void Console(){


        MonthUtilUa monthUa = new MonthUtilUa ();

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
                "10 - Вивести на екран чи введений з консолі місяць має парну кількість днів\n" +
                "11 - Вихід   ");



        int number;
        ConsoleUa consoleUa = new ConsoleUa ();


        while(true){
            Scanner scan= new Scanner(System.in);
            if(scan.hasNextInt()){

                number=scan.nextInt();

                if (number>11||number <1)
                {
                    System.out.println("*****************************************************");
                    System.out.println("           ******** Невірно Ведене Значення ********");
                    System.out.println("*****************************************************");
                }



                switch (number){
                    case 1: {
                        System.out.println("*****************************************************");
                        System.out.println("        1 - Перевірити чи є такий місяць ");
                        System.out.println("*****************************************************");
                        System.out.println("        ******** Ведіть Місяць ********");

                        consoleUa.check ( monthUa.readMonth () );

                        System.out.println("        ********  Наступний Крок? ******** ");
                        break;
                    }
                    case 2: {
                        System.out.println("*****************************************************");
                        System.out.println("   2 - Вивести всі місяці з такою ж порою року");
                        System.out.println("*****************************************************");
                        System.out.println("        ******** Ведіть Місяць ********");
                        monthUa.sameSeasonMonths(monthUa.readMonth());

                        System.out.println("        ********  Наступний Крок? ******** ");
                        break;
                    }
                    case 3: {
                        System.out.println("******************************************************************");
                        System.out.println("   3 - Вивести всі місяці які мають таку саму кількість днів");
                        System.out.println("******************************************************************");
                        System.out.println("         ******** Ведіть Місяць ********");
                        consoleUa.printAllMonthsThatHaveTheSameNumberofDays (monthUa.readMonth().inDays);

                        System.out.println("        ********  Наступний Крок? ******** ");
                        break;
                    }
                    case 4: {
                        System.out.println("*****************************************************");
                        System.out.println("    4 - Вивести на екран всі місяці які мають меншу кількість днів");
                        System.out.println("*****************************************************");
                        System.out.println("        ******** Ведіть Місяць ******** ");
                        consoleUa.showDisplayallMonthsthatHaveFewerDays (monthUa.readMonth().inDays);

                        System.out.println("         ********  Наступний Крок? ******** ");
                        break;
                    }
                    case 5: {
                        System.out.println("*****************************************************");
                        System.out.println("  5 - Вивести на екран всі місяці які мають більшу кількість днів ");
                        System.out.println("*****************************************************");
                        System.out.println("        ******** Ведіть Місяць ******** ");
                        consoleUa.showonDisplayallMonthsThatHaveMoreGreatDays (monthUa.readMonth().inDays);

                        System.out.println("        ********  Наступний Крок? ******** ");
                        break;
                    }
                    case 6: {
                        System.out.println("*****************************************************");
                        System.out.println("  6 - Вивести на екран наступну пору року");
                        System.out.println("*****************************************************");
                        System.out.println("        ******** Ведіть Місяць ******** ");
                        consoleUa.printNextSeason ( monthUa.readMonth () );

                        System.out.println("         ********  Наступний Крок? ******** ");
                        break;
                    }
                    case 7: {
                        System.out.println("*****************************************************");
                        System.out.println("   7 - Вивести на екран попередню пору року ");
                        System.out.println("*****************************************************");
                        System.out.println("         ******** Ведіть Місяць ******** ");
                        consoleUa.printPreviousSeason (monthUa.readMonth());

                        System.out.println("         ********  Наступний Крок? ******** ");
                        break;
                    }
                    case 8: {
                        System.out.println("***********************************************************************");
                        System.out.println("  8 - Вивести на екран всі місяці які мають парну кількість днів");
                        System.out.println("***********************************************************************");
                        System.out.println("        ******** Ведіть Місяць ******** ");
                        consoleUa.evenMonth ();

                        System.out.println("        ********  Наступний Крок? ******** ");
                        break;
                    }
                    case 9: {
                        System.out.println("*************************************************************************");
                        System.out.println("   9 - Вивести на екран всі місяці які мають непарну кількість днів ");
                        System.out.println("*************************************************************************");
                        consoleUa.oddMonth();

                        System.out.println("         ********  Наступний Крок? ******** ");
                        break;
                    }
                    case 10: {
                        System.out.println("*****************************************************");
                        System.out.println(" 10 - Вивести на екран чи введений з консолі місяць має парну кількість днів ");
                        System.out.println("*****************************************************");
                        System.out.println("        ******** Ведіть Місяць ********");
                        monthUa.evenNumberOfDays(monthUa.readMonth());

                        System.out.println("       ********  Наступний Крок? ******** ");
                        break;
                    }
                    case 11: {
                        System.out.println("******************************************");
                        System.out.println("      ********* 11 - Вихід *********");
                        System.out.println("*******************************************");
                        break;
                    }
                }
            }
            else{
                System.out.println("******************************************");
                System.out.println("******* Помилка невірно введено *******");
                System.out.println("******************************************");
            }



        }
    }
}
