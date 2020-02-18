import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class glasni {

    public static void main(String [] args){

        Scanner scanner = new Scanner ( System.in );

        String text = scanner.nextLine ();

//        .replaceAll ( "['а','о','у','е','и','і']" ,"-" )


        print(text.replaceAll ( "['А','О','У','Е','И','І','а',о','у','е','и','і']" ,"-" ));
    }
}
