import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //Scanner named sc.
        Scanner sc = new Scanner(System.in);
        //While loop iterates through sc as long as hasNextInt method is true. hasNextInt is a method
        //in the scanner class that check if there is a nextInt or not. Returns false if not.
        while(sc.hasNextInt()){
            //Declares int a equal to the next int.
            int a = sc.nextInt();
            //Prints integer
            System.out.println(a);
        }
    }
}
