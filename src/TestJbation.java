import javax.swing.*;

public class TestJbation {
    public static void main(String [] args){
        String input;
        String txt = null;
        String title = "";
        int number ;
        ImageIcon img = new ImageIcon("D:/Other/icons8-trash-500.png");;
        input = JOptionPane.showInputDialog(null,"Input Numeric \n" +
                "","Checking the Numbers",JOptionPane.QUESTION_MESSAGE);

        if (input == null) {
            JOptionPane.showInputDialog(null,"\n" +
                    "Wrong Number","Input error",JOptionPane.ERROR_MESSAGE);
        }
        number = Integer.parseInt(input);

        if(number%2==0){
            img = new ImageIcon("D:/Other/icons8-trash-500.png");
            txt=" Number = " + number;
            title =  " ";
        } else {

        }

        JOptionPane.showMessageDialog(null,
                txt,
                title,
                JOptionPane.PLAIN_MESSAGE,
                img);

    }
}
