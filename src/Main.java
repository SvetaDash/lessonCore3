import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        String[] arr = {"sd", "jh", "jwe", "ghr", "Yohei"};
        System.out.println("Задание 1" + Arrays.toString(arr));
        swapElements(arr, 3,4);
        System.out.println(Arrays.toString(arr));

        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox = new Box();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
           orangeBox1.add(new Orange());
           orangeBox1.add(new Orange());
           orangeBox1.add(new Orange());

        for (int i = 0; i <4; i++){
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++){
            appleBox.add(new Apple());
        }
        appleBox.info();
        orangeBox1.info();
        orangeBox2.info();

        Double appleWeight = appleBox.getWeight();
        Double orange1Weight = orangeBox1.getWeight();
        Double orange2Weight = orangeBox2.getWeight();

        System.out.println("Вес коробки с яблоками " +appleWeight);
        System.out.println("Вес 1 коробки с апельсинами " +orange1Weight);
        System.out.println("Вес 2 коробки с апельсинами " +orange2Weight);
        System.out.println("Сравнение веса апельсина-2к и яблок " +orangeBox2.compare(appleBox));
        System.out.println("Сравнение веса апельсина-1к и яблок " +orangeBox1.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        appleBox.info();
        orangeBox1.info();
        orangeBox2.info();
    }

    private static <T> void swapElements(T[] array, int index2, int index3) {
       T temp = array[index2];
        array[index2] =array[index3];
        array[index3] = temp;

    }


}


