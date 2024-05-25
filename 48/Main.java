import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(Arrays.toString(result()));
    }

    private static int putUser(){
        System.out.println("Введите число x: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static int[] arrayX(){
        int x = putUser();
        int y = 1;
        int[] result = new int[15];
        for(int i = 0; i < result.length; ++i){
            result[i] = y;
            y = 2 * x + 1;
            ++x;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    private static int[] arrayZ(){
        int x = putUser();
        int z = 1;
        int[] result = new int[15];
        for(int i = 0; i < result.length; ++i){
            result[i] = z;
            z = 3 * x + 1;
            ++x;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    private static int[] result(){
        int[] arrayY = arrayX();
        int[] arrayZ = arrayZ();
        int j = 0, k = 0;
        int[] result = new int[arrayY.length];

        for(int i = 0; i < result.length; ++i){
            if (arrayY[j] <= 13){
                if (arrayY[j] == arrayZ[k]) {
                    result[i] = arrayY[j];
                    ++j; ++i; ++k;
                    result[i] = arrayY[j];
                } else if (arrayY[j+1] > arrayZ[k]){
                    ++j;
                    result[i] = arrayZ[k];
                    ++k; ++j;
                }

            } else {
                while (j < arrayY.length && k < arrayZ.length) {
                    ++j; ++k;
                }

                if (arrayY[j] == arrayZ[k]) {
                    result[i] = arrayY[j];
                    ++i; ++j;
                    result[i] = arrayY[j];
                    ++i; ++k;
                    result[i] = arrayZ[k];
                }
            }
        }
        return result;
    }
}
