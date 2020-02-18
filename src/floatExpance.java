import java.util.Random;

import static PrintAndScanner.Print.print;

public class floatExpance {
    public static void main(String [] args){
//        float a = 2.4f;
//        int c = Integer.MAX_VALUE;
//        System.out.println(Math.round ( a ));
        Random random = new Random ( );
        int run = random.nextInt (15)+10;
        int a = 25;
        if(run>0){
            print ("run = " + run );
            print ( run>a );
            print (run==a );
            print (run<a );
        }
    }
}
class Dog {
    String name;
    String says;
}
