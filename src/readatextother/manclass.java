package readatextother;

import Console.ConsoleEng;
import Console.ConsoleUa;

import javax.swing.*;
import java.util.Scanner;

public class manclass {
    public void win(){
        JFrame frame = new JFrame ();     // створити фрейм
        frame.setSize (1000,1000 );         // задаємо ширину і висоту фрейму
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ); // задаємо дії при закритті фрейму
        frame.setVisible ( true );        // показати фрейм на екрані (зробити видимим)
    }
    public void mainConsole(){

        Scanner scanner = new Scanner(System.in);
        ConsoleUa consoleUa = new ConsoleUa ();
        ConsoleEng consoleEng = new ConsoleEng ();
        System.out.println ( "\n" +
                "***** Виберіть Мову *****\n" +
                "***** Select Language *****\n" +
                "***** 1 - Українська *****\n" +
                "***** 2 - English *****" );
        int number = scanner.nextInt ();
        switch ( number ){
            case 1:{
                System.out.println("***** Українська *****");
                consoleUa.Console ();
                break;
            }
            case 2:{
                System.out.println ("***** English *****");
                consoleEng.Console ();
                break;
            }
        }
    }
}
