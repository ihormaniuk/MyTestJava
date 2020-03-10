package twt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static PrintAndScanner.Print.print;

public class dg {
    public static void main(String[] args){
        print(generateRandomLink(5));
        print(links.size());
    }
    private static List<String> links = new ArrayList<String>();

    public static String generateRandomLink(int len) {
        char[] letters = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        String s = "";
        for (int i = 0; i < len; i++) {
            s += letters[new Random().nextInt(letters.length)];
            if (links.contains(s))
                s += letters[new Random().nextInt(letters.length)];

        }
        links.add(s);
        return "https://prnt.sc/" + s;
    }
}
