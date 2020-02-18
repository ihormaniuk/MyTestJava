import java.util.Random;

public class ecaltest {
    public static void main(String [] args){
        Random random = new Random ();
        int rand = random.nextInt ( 6 );
//        if(rand <=6){
//            switch ( rand ){
//                case 0:{
//                    System.out.println ( "Hi i Am nuber 1 switch " );
//                    break;
//                }
//                case 1:{
//                    System.out.println("Hi i Am number 2 switch");
//                    break;
//                }
//                case 2:{
//                    System.out.println("Hi i Am numer 3 switch");
//                    break;
//                }
//                case 3:{
//                    System.out.println("Hi i Am numer 4 switch");
//                    break;
//                }
//                case 4:{
//                    System.out.println("Hi i Am number 5 switch");
//                    break;
//                }
//            }
//        }
//        if (rand>6){
//            System.out.println ( "random nubmers big for 5 good buy" );
//        }
        for(int i = 0;i<1;i++){
            switch ( rand ){
                case 0:{
                    System.out.println ( "Hi i Am nuber 1 switch " );
                    break;
                }
                case 1:{
                    System.out.println("Hi i Am number 2 switch");
                    break;
                }
                case 2:{
                    System.out.println("Hi i Am numer 3 switch");
                    break;
                }
                case 3:{
                    System.out.println("Hi i Am numer 4 switch");
                    break;
                }
                case 4:{
                    System.out.println("Hi i Am number 5 switch");
                    break;
                }
            }
        }
    }
}
