import static PrintAndScanner.Print.print;

public class stringother {

    public static void main(String[] args){

        String one = "У нашій школі любий учень знає що директор дуже суворий";
        String [] tho;
        String a = " " ;
        tho = one.split ( a );

        print(tho.length);

        for(int i = 0; i < tho.length; i++) {
            System.out.println(tho[i]);
        }

    }

}
