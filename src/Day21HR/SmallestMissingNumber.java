package Day21HR;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 import java.util.Scanner;
public class SmallestMissingNumber {

        public int firstMissingPositive(int[] nums) {
            Map<Integer, Boolean> map = new HashMap<>();
            for (int n : nums) {
                if (n > 0) {
                    map.put(n, true);
                }
            }
            int number = 1;
            while (true) {
                if (map.get(number) == null) {
                    return number;
                }
                number++;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();

            int[] nums = new int[size];

            System.out.println("Enter the elements of the array (space-separated): ");
            for (int i = 0; i < size; i++) {
                nums[i] = scanner.nextInt();
            }

            SmallestMissingNumber solution = new SmallestMissingNumber();
            int result = solution.firstMissingPositive(nums);

            System.out.println("The first missing positive integer is: " + result);

            scanner.close();
        }
    }
