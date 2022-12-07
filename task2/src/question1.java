import java.util.Scanner;
    public class question1 {
        public static void main(String[]args) {
            Scanner scanner=new Scanner(System.in);

            int nums[] = new int[10];
            int sum = 0;

            System.out.println("Enter 10 numbers");
            for(int i = 0; i < nums.length; i++) {
                nums[i] = scanner.nextInt();
                sum = sum + nums[i];

            }
            double average = sum / nums.length;
            System.out.println("The numbers that are larger than average:  ");
            for(int i = 0; i < nums.length; i++) {
                if (nums[i] > average) {
                    System.out.println(nums[i]);
                }
            }
        }
    }

