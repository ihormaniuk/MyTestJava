package test;

import java.util.Scanner;

public class math  {
    Scanner scaner = new Scanner ( System.in );

    public void consile ( ) {
        System.out.println ( "\n" +
                "********** Калькулятор ********** \n" +
                "************** Меню *************\n" +
                "1       *** Додавання ***        \n" +
                "2       *** Віднімання ***        \n" +
                "3       *** Множення ***          \n" +
                "4       *** Ділення ***        " );
        int num = scaner.nextInt ();
        switch ( num ) {
            case 1: {
                System.out.println ( "\n" +
                        "                           *** Додавання ***\n" +
                        "                 *** Число неповине перевищувати 50000 ***\n" +
                        "                         *** Ведіть перше число ***" );
                int a = scaner.nextInt ();
                if ( a <= 50000 ) {
                    System.out.println ( "*** Ведіть друге число ***" );
                    int b = scaner.nextInt ();
                    if ( b > 50000 ) {
                        System.out.println ( "---  Число перевищело 50000 ---" );
                    }
                    if ( b <= 50000 ) {
                        System.out.println ( a + " + " + b + " = " + ( a + b ) );
                    }
                }
                if ( a > 70000 ) {
                    System.out.println ( "---  Число перевищело 70000 ---" );
                }
            }
            case 2: {
                System.out.println ( "\n" +
                        "                           *** Віднімання ***\n" +
                        "                                                               \n" +
                        "" +
                        "                 *** Число неповине перевищувати 70000 ***\n" +
                        "                                                               \n" +
                        "" +
                        "                          *** Ведіть перше число ***" );
                int a = scaner.nextInt ();
                if ( a <= 70000 ) {
                    System.out.println ( "*** Ведіть друге число ***" );
                    int b = scaner.nextInt ();
                    if ( b > 70000 ) {
                        System.out.println ( "---  Число перевищело 70000 ---" );
                    }
                    if ( b <= 70000 ) {
                        System.out.println ( a + " - " + b + " = " + ( a - b ) );
                    }
                }
                if ( a > 70000 ) {
                    System.out.println ( "---  Число перевищело 70000 ---" );
                }
            }
            case 3: {
                System.out.println ( "\n" +
                        "                           *** Множення ***\n" +
                        "                                                               \n" +
                        "" +
                        "                 *** Число неповине перевищувати 100000 ***\n" +
                        "                                                               \n" +
                        "" +
                        "                          *** Ведіть перше число ***" );
                int a = scaner.nextInt ();
                if ( a <= 100000 ) {
                    System.out.println ( "*** Ведіть друге число ***" );
                    int b = scaner.nextInt ();
                    if ( b > 100000 ) {
                        System.out.println ( "---  Число перевищело 100000 ---" );
                    }
                    if ( b <= 100000 ) {
                        System.out.println ( a + " * " + b + " = " + ( a * b ) );
                    }
                }
                if ( a > 100000 ) {
                    System.out.println ( "---  Число перевищело 100000 ---" );
                }

            }
            case 4 : {
                System.out.println ( "\n" +
                        "                           *** Ділення ***\n" +
                        "                                                               \n" +
                        "" +
                        "                 *** Число неповине перевищувати 100000 ***\n" +
                        "                                                               \n" +
                        "" +
                        "                          *** Ведіть перше число ***" );
                int a = scaner.nextInt ();
                if ( a <= 100000 ) {
                    System.out.println ( "*** Ведіть друге число ***" );
                    int b = scaner.nextInt ();
                    if ( b > 100000 ) {
                        System.out.println ( "---  Число перевищело 100000 ---" );
                    }
                    if ( b <= 100000 ) {
                        System.out.println ( a + " / " + b + " = " + ( a / b ) );
                    }
                }
                if ( a > 100000 ) {
                    System.out.println ( "---  Число перевищело 100000 ---" );
                }
            }
        }
    }
}
