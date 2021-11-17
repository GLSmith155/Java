import java.util.Scanner;

public class Solution { 
    
    public static void main(String[] args) { 
        // Creates a scanner named sc
        Scanner sc = new Scanner(System.in); 
        // Takes in an int x
        int x = sc.nextInt(); 
        // Takes in a double y
        double y = sc.nextDouble(); 
        // Uses nextLine method and clears buffer
        sc.nextLine(); 
/**What nextInt() and nextDouble() does is it assigns integer to appropriate variable and keeps the enter key unread in thekeyboard buffer. so when its time to supply String the nextLine() will read the enter key from the user thinking that the user has entered the enter key.(that's we get empty output) . Unlike C, there is no fflush() to clean buffer, so we have to flush by not taking it in variable. **/
        String s = sc.nextLine();

    System.out.println("String: "+s);
    System.out.println("Double: "+y);
    System.out.println("Int: "+x);
        }
}
