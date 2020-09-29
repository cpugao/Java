import java.util.ArrayList; 
import java.util.Arrays;

public class BasicJava {

    public static void printAll(){
        for (int  i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    // public static Integer addTwo(int n) {
    //     return n + 2;
    // }
    
    public static void printOdd(){
        for (int i = 1; i <= 255; i+=2) {
            System.out.println(i);
        }
    }

    public static void printSum(){
        int sum = 0;
        for (int i = 1; i <= 255; i++) {
            sum = sum + i;
            System.out.println("New number: " + i + " Sum: " + sum);
            // System.out.println(String.format("New number: %d Sum: %d", i, sum));
        }
    }

    public static void printVal(int[] x){
        for (Integer num : x){
            System.out.println(num);
        }
    }

    public static void printMax(int[] x){
        int max = x[0];
        for (int i=1; i<x.length; i++){
            if (x[i]>max){
                max = x[i];
            }
        }
        System.out.println(max);
    }

    public static void printAvg(int[] x){
        int sum = x[0];
        for (int i=1; i<x.length; i++){
            sum = sum + x[i];
        }
        System.out.println((double)sum/x.length);
    }

    public static void printOddArray() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i=1; i<=255; i+=2) {
            y.add(i);
        }
        System.out.println(y);
    }

    public static Integer greaterThan(int[] x, int y) {
        int count = 0;
        for (int i=0; i<x.length; i++) {
            if (x[i]>y) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void printSquared(int[] x) {
        for (int i=0; i<x.length; i++) {
            x[i] = x[i]*x[i];
        }
        System.out.println(Arrays.toString(x));
    }

    public static void printAllPositive(int[] x) {
        for (int i=0; i<x.length; i++) {
            if (x[i]<0) {
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x));
    }

    public static Object [] maxMinAvg (int[] x) {
        int sum = x[0];
        int max = x[0];
        int min = x[0];
        for ( int i=1; i<x.length; i++) {
            sum = sum + x[i];
            if (x[i]>max) {
                max = x[i];
            }
            if (x[i]<min) {
                min = x[i];
            }
        }
        double avg = (double)sum/x.length;
        Object [] newArr = {min,max,avg};
        return newArr;
    }

    public static void shift(int[] x) {
        for (int i=0; i<x.length-1; i++) {
            x[i] = x[i+1];
        }
        x[x.length - 1] = 0;
        System.out.println(Arrays.toString(x));
    }
}