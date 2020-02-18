import java.util.Arrays;
import java.util.Random;

import static PrintAndScanner.Print.print;

public class Mydate {
    public static void main(String[] args){


        int []a;

        Random random = new Random();
        a = new int[random.nextInt(100)];
        print("a = " + a.length);
        print(Arrays.toString(a));




//        Scanner scanner = new Scanner(System.in);
//        print("день");
//        String days = scanner.nextLine();
//        print("місяць");
//        String moun = scanner.nextLine();
//        print("рік");
//        String years = scanner.nextLine();
//
//        String dates = (days + "/" + moun + "/"+years);
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//
//            Date date = formatter.parse(dates);
//            System.out.println("Ваша дата народження : " + date);
//            System.out.println(formatter.format(date));
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        Date d = new Date();
//        int tes = Integer.parseInt(dates);
//        int sdf = Integer.parseInt(String.valueOf(d));
//        int sf = tes - sdf;

    }
}
