import java.util.Scanner;
import java.util.*;


public class Chessknight {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        Scanner v = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            int input = v.nextInt();
            String strint = String.valueOf(input);
            if(input == 0) {break;}
            if (!arr.contains(input)) {
                arr.add(input);
            }
            if(!map.containsKey(strint)) {
                map.put(strint, String.valueOf(1));
            }
            else {
                map.put(strint, String.valueOf(Integer.parseInt(map.get(strint)) + 1));
            }
        }
        Collections.sort(arr);

        for(int num: arr) {
            if(map.get(String.valueOf(num)).equals("1")){
                System.out.println(num + " occurs " + map.get(String.valueOf(num)) + " time ");
            } else
            System.out.println(num + " occurs " + map.get(String.valueOf(num)) + " times ");
        }
    }
}
//Scanner v = new Scanner(System.in);
//int value = v.nextInt();
//    int mask = 1;
//        for (int i = 15; i >= 0; i--) {
//                int temp = value >> i;
//                int bit = temp & mask;
//                System.out.print(bit);
//                }