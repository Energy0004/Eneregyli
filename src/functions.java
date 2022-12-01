public class functions {
    public static void main(String[] args) {
//        //Функции
//        info("Hello");
//        String java = "Java";
//       info(java);
//        info("");
//        short num = 7;
//        int result1 = summa((short)5,num);
//        short num2 = 8;
//        int result2 = summa((short)4,num2);
//        info(String.valueOf(result2));
//    }
//    public static int summa(short a,short b){
//        int res = a+b;
//        String result = "Результат: "+res;
//        info(result);
//        return res;
//    }
//
//    public static void info(String word){
//        System.out.print(word);
//        System.out.println("!");
//    }
        byte[] nums1 = new byte[]{5, 6, 8};
        int summ1 = summaArray(nums1);

        System.out.println("Сумма 1: " + summ1);

        byte[] nums2 = new byte[]{5, 7, 3, 7, 6, 8};
        int summ2 = summaArray(nums2);

        System.out.println("Сумма 2: " + summ2);

    }
    public static int summaArray(byte[] arr){
        int summa = 0;
        for(byte i = 0; i < arr.length; i++)
            summa += arr[i];

        return summa;
    }
}
