import static PrintAndScanner.Print.print;

public class convertChartoNumber {
    public static void main(String[] args){
        String s = "Привіт Я Ігор Мені 24";
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length;i++){
            print(chars[i]);
            print((int) s.charAt(i));
        }
        char c = 1055;
        print(c);

//        for(int a = 0;a<chars.length;a++){
//            int b = Character.getNumericValue(chars[a]);
//            print(b);
//        }
    }
}
