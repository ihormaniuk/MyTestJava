import Console.ConsoleUa;
import Console.MonthUa;
import Console.mainConsole;

import javax.swing.*;
import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class testequalsEnum {
//    static Scanner sc = new Scanner ( System.in );
//
//    public static String s = sc.nextLine ();
//    private static MonthUa m;



    public static void main(String[] args){
        mainConsole m = new mainConsole ();

        String title = "Messenge four You";

        String text = "My Java Code";

        long a ;
        long b ;
        long ear;
        String result;



        result = JOptionPane.showInputDialog ( "Додавання\n" +
                "++++++++++++++++++++++++" +
                "\nВедіть число" );

        a = Long.parseLong ( result );

        result=JOptionPane.showInputDialog ( "Друге число  " );

        b=Long.parseLong ( result );

        ear=a+b;
        JOptionPane.showMessageDialog ( null,"Дорівнює  =   "+ear+"" );

    }

//    public static String equalse(){
//        for ( MonthUa m : MonthUa.values () ) {
//            if (s.equalsIgnoreCase ( m.getInSeasons () ); s.trim () ){
//
//            }
//        }
//    }

}
