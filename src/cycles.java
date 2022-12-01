import java.util.Scanner;

public class cycles {
    public static void main(String[] args) {
        // Циклы
//        for (float i = 100; i >= 10; i -= 10) {
//            System.out.println("Element:" + i);
//        }
//        int l = 1;
//
//        while (l <= 10) {
//            System.out.println("Element:" + l);
//            l++;
//        }
//        int t = 0;
//      do{
//            System.out.println("Element:"+t);
//        t++;
//        }while(t <= 10);
//        for(int i = 5; i < 50; i += 2){
//            if(i % 3 == 0)
//                continue;

        //           if(i >= 50)
//                break;
//            System.out.println("Element:"+i);
//        }
        //Массивы данных
//        int[] nums = new int[5];
//       nums[0] = 45;
//        nums[1] = 32;
//      nums[2] = 1;
//       nums[3] = 9;
//        nums[4] = 3;
//        int res = nums[2] + nums[3];
//        System.out.println(res);

//        float[] nums2 = new float[]{5.0f, 6.45f, 89.984f};
//       System.out.println(nums2[1]);
//        for(int i = 0; i < nums2.length; i++){
//            System.out.println("Element:"+nums2[i]);
//       }
//       int[] arr = new int[4];
//        Scanner v = new Scanner(System.in);
//
//        for(int i = 0; i < arr.length;i++){
//            System.out.println("Enter the number: ");
//        int value = v.nextInt();
//            arr[i] = value;
//        }
//        int min = arr[0];
//        for(int i = 0; i < arr.length;i++){
//            if(arr[i] < min)
//                min = arr[i];
//        }
//        System.out.println("Minimal: "+min);


        //Многомерные массивы данных
//       char[][] syms = new char[2][2];
//       syms[0][0] = 't';
//        System.out.println(syms[0][0]);

       byte[][] nums = new byte[][]{
               {5, 7},
               {7, 3},
               {2, 0}
       };
//               nums[1][1] = 67;
        System.out.println(nums[1][1]);


//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(Math.max(a,Math.max(b , c)));


//        Scanner v = new Scanner(System.in);
//        int a = v.nextInt();
//        int b = v.nextInt();
//        int w =(a+b+7)%7;
//             if(w==1){System.out.println("Monday");}
//        else if(w==2){System.out.println("Tuesday");}
//        else if(w==3){System.out.println("Wednesday");}
//        else if(w==4){System.out.println("Thursday");}
//        else if(w==5){System.out.println("Friday");}
//        else if(w==6){System.out.println("Saturday");}
//        else if(w==0){System.out.println("Sunday");}


//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int[] array = new int[a];
//        int sum = 0;
//        System.out.println("Введите число:");
//        for (int i=0; i < a; i++)
//        {
//            // считываем введенный пользователем элемент в массив
//            array[i] = scanner.nextInt();
//        }
//        // проходим по всем элементов массива и суммируем каждое число
//        for( int num : array) {
//            sum = sum+num;
//        }
//        System.out.println("Сумма элементов массива равна: " + sum);


//        Scanner v = new Scanner(System.in);
//        String str = v.nextLine();
//        String rev= new StringBuffer(str).reverse().toString();
//        System.out.println(rev);


//        Scanner v = new Scanner(System.in);
//        int N = v.nextInt();
//
//        for(int i = 1; i <= 10; i++){
//            int result = N *i;
//                if (2 <= N && N <= 20) {
//                    System.out.println(N+" x "+i+" = " + result);
//                }
//        }
        /*Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            for (int j = 0; j < n; j++)
            {
                res +=(Math.pow(2, j) * b);
                System.out.print((res)  + " ");
            }
            System.out.print("\n");
        }
        in.close();*/
        /*Scanner v = new Scanner(System.in);
        int a = v.nextInt();
        int w = 0;
        if(a <= -2) {
            for(int s = -2; s >= a; s--){
            w += s;
        }            System.out.println(w);

        } else if(a >= 0) {
            for (int i = 1; i <= a; i++) {
                w += i;
            }
            System.out.println(w);
        }*/
       /* Scanner v = new Scanner(System.in);
        int A1 = v.nextInt();
        int B1 = v.nextInt();
        int C1 = v.nextInt();
        int A2 = v.nextInt();
        int B2 = v.nextInt();
        int C2 = v.nextInt();
        if(A1 == 3 && A1 + B1 + C1 == A2 + B2 + C2 && A1 < A2 && B1 == B2 && C1 > C2){
            System.out.println("Boxes are equal");
        } else if(A1 + B1 + C1 > A2 + B2 + C2){
            System.out.println("The first box is larger than the second one");
        } else if(A1 + B1 + C1 < A2 + B2 + C2){
            System.out.println("The first box is smaller than the second one");
        }else if(A1 + B1 + C1 == A2 + B2 + C2 && A1 > A2 && B1 == B2 && C1 < C2) {
            System.out.println("Boxes are incomparable");
        }else if( A1 < A2 && B1 == B2 && C1 > C2 && A1 < C2 && A2 < C1){
            System.out.println("Boxes are incomparable");
        }else System.out.println("Boxes are equal");*/
//        Scanner v = new Scanner(System.in);
//        int a = v.nextInt();
//        String k = "*";
//        for(int i = a; i > 0; i--){
//            String f = "";
//            for(int j = i; j > 0; j--){
//                f = f + k;
//            }
//            System.out.println(f);
//        }
        /* Scanner v = new Scanner(System.in);
        int a = v.nextInt();
        for(int i = 0; i < a; i++){
            double e = Math.pow(2,i);
           if(a > e){
               System.out.print((int)e +"\s");
           }*/
      /* Scanner v = new Scanner(System.in);
       int a =132424;
        int o = 0;
        while(a != 0){
             a = v.nextInt();
            o = Math.max(a,o);
        } System.out.println(o);*/
//        Scanner v = new Scanner(System.in);
//        long a = v.nextLong();
//        long b = v.nextLong();
//        long o = 0;
//        for(long t = a; t >= a && t <= b; t++){
//            o += t;
//        }            System.out.println(o);
        /*Scanner v = new Scanner(System.in);
        int n = v.nextInt();
        String k = "*";
        String start = "";
        String mid = "*";
        for(int i=1; i<=n; i++) {
            start += k;
        }
        for(int i=1; i<=n - 2; i++) {
            mid += " ";
        }

        mid += k;
        System.out.println(start);
        for(int i=1; i<=n - 2; i++) {
            System.out.println(mid);
        }
        System.out.println(start);*/
//        Scanner v = new Scanner(System.in);
//        int a = v.nextInt();
//        int b = v.nextInt();
//        int c = 0 ;
//        for (int i = 1; i < b; i++){
//            if(a % i == 0 && b % i == 0){
//                c = i;
//            }
//        }
//        System.out.println(c);
    }
}