//Version 2: Unlimited Input with -1 as Stop Signal
// User can enter as many elements as they want. Input ends when -1 is entered. The program then finds the unique element.
import java.util.Scanner;
import java.util.ArrayList;

class UniqueElements{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter numbers (type -1 to stop):");

        while (true) { 
            int num = sc.nextInt();
            if (num == -1) break;
                arr.add(num);
            
        }

                int[] nums = arr.stream().mapToInt(i -> i).toArray();

                int ans = 0;
        for (int x : nums) ans ^= x;

        System.out.println("Unique element: " + ans);


    }
    }
