import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static PrintAndScanner.Print.*;

public class scann {
    public static void main (String[] args) throws FileNotFoundException {
        String seperator = File.separator;
        String filet = seperator + "C:" + seperator + "test.txt";
        File file = new File ( filet );
        Scanner scanner = new Scanner ( file);

        while (scanner.hasNextLine ()) {
            List<String> st = new ArrayList<> ( Collections.singleton ( scanner.nextLine () ) );
//            Arrays.sort ( new String[]{scanner.nextLine ()} );
            print ( st  );
            String s = scanner.toString();
            char[] chars = s.toCharArray();
            for(int i = 0; i < chars.length;i++){
                print(chars[i]);
                print((int) s.charAt(i));
            }

//            scanner.close ();
        }

    }
}
