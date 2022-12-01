import java.util.*;

public class chernovik {
    public static void octtohex(String x) {
        String octal = x;
        int decimal = Integer.parseInt(octal, 8);
        String hex = Integer.toHexString(decimal);
        info(hex.toUpperCase());
//        boolean flag = false;
//        for (int i = 2; i <= a / 2; ++i) {
//            if (a % i == 0) {
//                flag = true;
//                break;
//            }
//        }
//
//        if (!flag)
//            info("True");
//        else
//            info("False");
//        int r4 = 1;
//        int r3 = 1;
//        int r1 = 1;
//        int r2 = 1;
//        int r = a + 1;
//        while (true) {
//            r1 = r % 10;
//            int r11 = r / 10;
//            r2 = r11 % 10;
//            int r22 = r11 / 10;
//            r3 = r22 % 10;
//            r4 = r22 / 10;
//            r++;
//            if(r4 != r3 && r4 != r2 && r4 != r1 &&
//                    r3 != r2 && r3 != r1 &&
//                    r2 != r1){
//                info(r-1);
//                break;
//            }
//        }
}
        //        int rem1 = a % 10;
//        int div1 = a / 10;
//        int rem2 = div1 % 10;
//        int div2 = div1 / 10;
//        int summ = rem1 + rem2 + div2;
//        int product = rem1 * rem2 * div2;
//        int res = product - summ;
//        info(res);
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
//        Scanner v = new Scanner(System.in);
//        String input = v.nextLine();
//        int replace = input.length() - input.replace("(", "").length();
//        int replace2 = input.length() - input.replace(")", "").length();
//        if(replace != replace2){
//            int res = replace2 - replace;
//            System.out.println("replace = " + res);
//        }
        /*Scanner v = new Scanner(System.in);
        int a = v.nextInt();
        binary(a);*/
//        Scanner v = new Scanner(System.in);
//        int[] a = new int[50];
//        int l = 1;
//        int i = 0;
//        int b = 0;
//        while(l != 0){
//            l = v.nextInt();
//            i++;
//            a[i] = l;
//            b = Math.max(b,l);
//        }
//        int j = 0;
//        for(; j < 50; j++) {
//            if (a[j] == b) {
//                break;
//            }
//        }
//        a[j] = 0;
//        b = 0;
//        for(int p = 0; p < 50; p++)
//            b = Math.max(b,a[p]);
//        System.out.println(b);
//        System.out.println();
    }
}