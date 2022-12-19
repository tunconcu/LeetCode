import java.util.Scanner;
public class FirstProblemTwoSum {
    public static void main(String[] args) {
        System.out.println("LeetCode problem 1: twosum");
        
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        
        System.out.println("Enter the elements :");
        for(int i=0;i<10;i++) {
            array[i] = scanner.nextInt();
            }
        
        int target;
        System.out.println("Please enter the target number: ");
        target = scanner.nextInt();
        
        twoSum(array,target);
        }
        
        //System.out.println("Official Solution-------------------------------");
         public static int[] twoSum(int[] nums, int target) {
                for (int i = 0; i < nums.length; i++) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] == target - nums[i]) {
                            System.out.println("First indice: " + i);
                            System.out.println("Second indice: " + j);
                            System.out.println("Target number: " + target);
                            return new int[] { i, j }; 
                        }
                        //System.out.println("Official Solution-------------------------------");
                    }
                }
                for(int i=0;i<10;i++) {
                    for(int j=i+1;j<10;j++) {
                        if(i!=j && nums[i] == nums[j]) {
                        System.out.println("Please do not enter duplicate elements: ");
                        return null;
                        }
                    }
                }
                return null;
            }	
        
}
