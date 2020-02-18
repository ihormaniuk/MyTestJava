package PrintAndScanner;

import java.util.Scanner;

public class readeConsole {
     static Scanner sc = new Scanner ( System.in );

    public static String readLine ( ){
        return sc.nextLine ();
    }

    public static String readNextLine(){
        return sc.next (  );
    }

    public static  int readInt(){
        return sc.nextInt ();
    }

}
