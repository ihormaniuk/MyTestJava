package Console;

import java.util.Scanner;

public class ConsoleEng {

    // method 3
    public void printAllMonthsThatHaveTheSameNumberofDays(int specifiedNumber){
        for (Month m : Month.values()){
            if (m.inDays == specifiedNumber){
                System.out.println(m.toString());
            }
        }
    }

    // method 4
    public void showDisplayallMonthsthatHaveFewerDays(int specifiedNumber){

        String s = null;
        for (Month m : Month.values()){
            if (m.inDays < specifiedNumber){
                System.out.println(m.toString());
                s=m.toString();
            }
        }
        if (s==null){
            System.out.println("not more Small month");
        }

    }

    //method 5
    public void showonDisplayallMonthsThatHaveMoreGreatDays(int specifiedNumber){
        String s = null;

        for (Month m : Month.values()){
            if (m.inDays > specifiedNumber){
                System.out.println(m.toString());
                s=m.toString();

            }
        }
        if (s==null){
            System.out.println("not more Great month");
        }

    }


    //method 6
    public  void printNextSeason(Month month) {
        System.out.print("Next season for " + month + " is ");
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println(Seasons.Spring);
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println(Seasons.Summer);
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println(Seasons.Autumn);
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println(Seasons.Winter);
                break;
            default:
                System.out.println("Invalid month entered");
                break;
        }
    }

    //method 7
    public void printPreviousSeason(Month month) {
        System.out.print("Previous season for " + month + " is ");
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println(Seasons.Autumn);
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println(Seasons.Winter);
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println(Seasons.Spring);
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println(Seasons.Summer);
                break;
            default:
                System.out.println("Invalid month entered");
                break;
        }
    }


    //method 8
    public void evenMonth (){

        for (Month d : Month.values()){


            if (d.inDays%2==0){
                System.out.println(d.name()+ " day = "+ d.inDays);
            }

        }

    }

    //method 9
    public void oddMonth (){
        for (Month d : Month.values()){


            if (d.inDays%2==1){
                System.out.println(d.name()+ " day = "+ d.inDays);
            }

        }


    }





    public void  Console() {

        //String monthMain;

        MonthUtilEng month = new MonthUtilEng ();

        System.out.println("take your pick :(only number)\n" +
                "1 - Check for a month\n" +
                "2 - show on display all months with the same time of year\n" +
                "3 - show on display all months that have the equal number of days\n" +
                "4 - show on display all months that have fewer days\n" +
                "5 - show on display all months that have more Great days\n" +
                "6 - show on display all months that have fewer days\n" +
                "7 - show on display Display the next season\n" +
                "8 - Displays all months that have an even number of days\n" +
                "9 - show on display all months that have an odd number of days\n" +
                "10 - show on display or put the console has an even number of month days\n" +
                "11 - exit   ");



        int number;
        boolean flag =  true;
        ConsoleEng monthConsoleEng = new ConsoleEng ();


        while(flag){
            Scanner scan= new Scanner(System.in);
            if(scan.hasNextInt()){

                number=scan.nextInt();

                if (number>11||number <1)
                {
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("your choice is incorrect");
                    System.out.println("---------------------------------------------------------------------------");
                }



                switch (number){
                    case 1: {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("1 - Check for a month");
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("enter the month");

                        month.readMonth();

                        System.out.println("Select the next step");
                        break;
                    }
                    case 2: {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("2 - show on display all months with the same time of year");
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("enter the month");
                        month.sameSeasonMonths(month.readMonth());

                        System.out.println("Select the next step");
                        break;
                    }
                    case 3: {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("3 - show on display all months that have the equal number of days");
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("enter the month");
                        monthConsoleEng.printAllMonthsThatHaveTheSameNumberofDays (month.readMonth().inDays);

                        System.out.println("Select the next step");
                        break;
                    }
                    case 4: {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("4 - show on display all months that have fewer days");
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("enter the month");
                        monthConsoleEng.showDisplayallMonthsthatHaveFewerDays (month.readMonth().inDays);

                        System.out.println("Select the next step");
                        break;
                    }
                    case 5: {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("5 - show on display all months that have more Great days");
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("enter the month");
                        monthConsoleEng.showonDisplayallMonthsThatHaveMoreGreatDays (month.readMonth().inDays);

                        System.out.println("Select the next step");
                        break;
                    }
                    case 6: {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("6 - show on display the next season  ");
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("enter the month");
                        monthConsoleEng.printNextSeason ( month.readMonth () );

                        System.out.println("Select the next step");
                        break;
                    }
                    case 7: {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("7 - show on display past season ");
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("enter the month");
                        monthConsoleEng.printPreviousSeason (month.readMonth());

                        System.out.println("Select the next step");
                        break;
                    }
                    case 8: {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("8 - Displays all months that have an even number of days");
                        System.out.println("---------------------------------------------------------------------------");
                        monthConsoleEng.evenMonth();

                        System.out.println("Select the next step");
                        break;
                    }
                    case 9: {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("9 - Displays all months that have an odd number of days");
                        System.out.println("---------------------------------------------------------------------------");
                        monthConsoleEng.oddMonth();

                        System.out.println("Select the next step");
                        break;
                    }
                    case 10: {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("10 - Displaying the month or month entered from the console has an even number of days");
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("enter the month");
                        month.evenNumberOfDays(month.readMonth());

                        System.out.println("Select the next step");
                        break;
                    }
                    case 11: {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("11 - exit");
                        System.out.println("---------------------------------------------------------------------------");

                        flag = false;
                        break;
                    }
                }
            }
            else{
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("error invalid input");
                System.out.println("---------------------------------------------------------------------------");
            }



        }
    }
}
