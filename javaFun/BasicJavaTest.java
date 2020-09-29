import java.util.Arrays;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava basic = new BasicJava();

        basic.printAll();
        basic.printOdd();
        basic.printSum();

        int [] array = {1,3,5,7,9,13};
        basic.printVal(array);
        basic.printMax(array);
        basic.printAvg(array);

        basic.printOddArray();

        System.out.println(basic.greaterThan(array, 8));

        int [] array1 = {1,2,3};
        basic.printSquared(array1);

        int [] array2 = {-7,-5,1,2,3};
        basic.printAllPositive(array2);
        
        System.out.println(Arrays.toString(basic.maxMinAvg(array)));

        basic.shift(array);
    }
}