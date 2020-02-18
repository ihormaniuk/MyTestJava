package readatextother;


import javax.swing.JFrame;


public class SimpleFrame {
    public static void main (String[] args) {
        manclass one = new manclass ();
        one.mainConsole ();

        JFrame frame = new JFrame ();     // створити фрейм
        frame.setSize (1000,1000 );         // задаємо ширину і висоту фрейму
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ); // задаємо дії при закритті фрейму
        frame.setVisible ( true );        // показати фрейм на екрані (зробити видимим)

    }
}