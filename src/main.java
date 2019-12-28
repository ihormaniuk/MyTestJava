import Console.mainConsole;
import test.Zarplata;
import test.math;
import test.time;

import java.util.Scanner;

public class main {
    public static void main(String [] args){
        Scanner scanner = new Scanner ( System.in );
        mainConsole con = new mainConsole();
        math matht = new math ();
        time tim = new time ();
        Zarplata zp = new Zarplata ();
        System.out.println ( "\n" +
                "    *************** Меню *************** \n" +
                "  1 ****** Калькулятор ****** \n" +
                "  2 *** Кількість днів Скільки Ти прожив *** \n" +
                "  3 *** Робота з Місяцями  і сезонами **** \n" +
                "  4 *** Заробітня плата *** " );

        int num = scanner.nextInt ();
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
                con.ConsoleOne ();
                break;
            }
            case 4:{
                zp.zaplata ();
                break;
            }
        }
    }

}

