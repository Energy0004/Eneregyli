import java.util.ArrayList;
import java.util.LinkedList;

public class collections {
    public static void main(String[] args){
        //Коллекции
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1,  30);

        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.remove(1);
        numbers.clear();

        for(Integer el : numbers){
            System.out.println(el);
        }
        LinkedList<Float> numberss = new LinkedList<>();
        numberss.add(5.6f);
        numberss.add(15.26f);
        numberss.add(5.64356f);

        for(Float el : numberss ){
            System.out.println("Element: " + el);
        }


//            int n = 100;
//            double[] array = new double[n];
//            for (int i = 0; i < array.length; i++) {
//                array[i] = Math.random()*100;
//            }
//
//            double max = array[0]; // Массив не должен быть пустым
//            double min = array[0];
//            double avg = 0;
//            for (int i = 0; i < array.length; i++) {
//                if(max < array[i])
//                    max = array[i];
//                if(min > array[i])
//                    min = array[i];
//                avg += array[i]/array.length;
//            }
//
//            System.out.println("max = " + max);
//            System.out.println("min = " + min);
//            System.out.println("avg = " + avg);

    }
}
