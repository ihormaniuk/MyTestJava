package test;


import java.util.Scanner;

public class time {
    Scanner scanner = new Scanner ( System.in );
    public void dateCalck(){
        System.out.println ( "*** Ведіть Скіль Вам Років ***" );
        long a = scanner.nextInt ();
        long d = a * 362;
        System.out.println ( "Ви прожили днів = " + d );

    }
}
