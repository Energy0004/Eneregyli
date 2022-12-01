import java.util.*;

public class chernovik {
    public static void octtohex(String x) {
        String octal = x;
        int decimal = Integer.parseInt(octal, 8);
        String hex = Integer.toHexString(decimal);
        info(hex.toUpperCase());
}
    public static void info(String result){
        System.out.println(result);
    }
    /*public static void binary(int b){
        String bin = Integer.toBinaryString(b);
        String rep = bin.replace('0','1');
        int binc2 = Integer.parseInt(rep,2);
        int binc = Integer.parseInt(bin,2);
        int h = Math.abs(binc-binc2);
        String bin2 = String.valueOf(h);
        info(bin2);
    }
    public static void info(String digit){
        System.out.println(digit);
    }*/

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        String input = v.next();
        octtohex(input);
    }
}