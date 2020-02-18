
import Console.MonthUa;
import Console.mainConsole;
import test.Zarplata;
import test.math;
import test.time;

import java.util.Scanner;

import static PrintAndScanner.Print.print;
import static PrintAndScanner.readeConsole.readInt;
import static PrintAndScanner.readeConsole.readLine;


public class mainT {
    public static void main(String [] args){
        for ( MonthUa m : MonthUa.values () ){
            String s = readLine ();
            if(s.equalsIgnoreCase (m.getInSeasons ())){
                print (s);
                break;
            }
        }
//        fg f = new fg();
//        f.tests();
        Scanner scanner = new Scanner ( System.in );
        mainConsole con = new mainConsole();
        math matht = new math ();
        time tim = new time ();
        Zarplata zp = new Zarplata ();
        print ( "\n" +
                "    *************** Меню *************** \n" +
                "  1 ****** Калькулятор ****** \n" +
                "  2 *** Кількість днів Скільки Ти прожив *** \n" +
                "  3 *** Робота з Місяцями  і сезонами **** \n" +
                "  4 *** Заробітня плата *** " );

        int num = readInt();
        switch ( num ){
            case 1:{
                matht.consile ();
                break;
            }
            case 2:{
                tim.dateCalck ();
                break;
            }
            case 3:{

                break;
            }
            case 4:{
                zp.zaplata ();
                break;
            }
        }
    }

}

