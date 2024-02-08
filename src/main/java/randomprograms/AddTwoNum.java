package randomprograms;
import java.util.Scanner;
public class AddTwoNum {

        public static int calculateSum(int[] arr) {
                int sum = 0;
                for (int num : arr) {
                        sum += num;
                }
                return sum;
        }
}
