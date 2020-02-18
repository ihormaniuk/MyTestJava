import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class polindome {

    public static void main(String[] args){

        Scanner sc = new Scanner ( System.in );

        print ("Ведіть слово яке є Паліндромом ! \n" +
                "Слово не повине бути більше ніж 5 символів");

        String text = sc.nextLine ();
        StringBuffer sb = new StringBuffer ( text.trim () );
        sb.toString ();
        sb.reverse ();

        if ( text.length () > 5 ){
            print (" Слово превищило 5 символів ");
        }else {
            if( text.equalsIgnoreCase ( String.valueOf ( sb ) ) ){
                print("Це слово Паліндромом");
            }else {
                print ("Це слово не є Паліндромом");
            }
        }


    }



}
