package test;

import java.util.Scanner;

public class Zarplata {
    Scanner scanner = new Scanner ( System.in );
    public void zaplata(){
        System.out.println ( "*** Зарплата *** \n" +
                "1            *** Зарплата В годину *** \n" +
                "2            *** Зарплата В день ***" );
        int a = scanner.nextInt ();
        switch ( a ){
            case 1:{
                System.out.println ( "*** Заробітня плата в Годину *** \n" +
                        " ***Ведіть Суму Заробітьньої плати у Годину ***\n" +
                        "1 - бажаєте порахувати заробітьну плату\n" +
                        "2 - чи поділити ?" );
                int b = scanner.nextInt ();
                if (b>0){

                    int result = b*8;
                    System.out.println ( "Вша заробітння Плата За 8 годиний робочий День Складає = " + (result) );
                    System.out.println ( "Бажаєте Продовжити Роботу З погодиним Графіком ? \n" +
                            " 1     Так             \n" +
                            " 2     Ні " );
                    int t = scanner.nextInt ();
                    if (t>0){
                        System.out.println ( " 1 - Скільки Ви працюте у добу \n" +
                                "2 - Зарбітня плата За місяць " );
                        switch ( t ){
                            case 1:{
                                System.out.println ( "Ведіть Скільки годин у Добу Ви працюєте " );
                                int hodun = scanner.nextInt ();
                                int resu = b*hodun;
                                System.out.println ( "У добу Ви заробляєте = " + (resu) );
                            }
                            case 2:{
                                System.out.println ( " У вас 8 год Робочий графік ?\n" +
                                        "1 - Так \n" +
                                        "2 - Ні" );
                                int tho = scanner.nextInt ();
                                if(tho>0){
                                    System.out.println ( "Ведіть Скільки днів ви працюєте цього місяця?" );
                                    int workDay = scanner.nextInt ();
                                    int resultWorkDay = workDay*result;
                                    System.out.println ( "У цьому місяці Ви заробили = " + (resultWorkDay));
                                }
                            }
                        }
                        if(t==2){
                            System.out.println ( " *** GoodBye *** " );
                        }
                    }
                }
            }
        }
    }
}
