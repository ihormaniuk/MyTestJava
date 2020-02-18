import Console.MonthUa;

import static PrintAndScanner.Print.print;
import static PrintAndScanner.readeConsole.readLine;

public class fg {
    public Object tests;

    public MonthUa tests ( ){
        String s = readLine();
        for( MonthUa m : MonthUa.values ()){
            if(s.equalsIgnoreCase ( String.valueOf ( m.getInSeasons () ) )){
                return m;
            }
            print (m.name () + " " + m.getInDays () + " " + m.getInSeasons ());
        }
        return null;
    }
}
