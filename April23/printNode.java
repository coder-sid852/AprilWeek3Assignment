package April23;

import java.util.LinkedList;
import java.util.Scanner;

public class printNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> llist = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int j = sc.nextInt();
            llist.add(j);   
        }
        System.out.println("List is: ");
        System.out.println(llist.toString());
        int j =5;
        
            int llElement = llist.get(j);
  
        System.out.print("Element on 5th index is:  ");
        System.out.println(llElement);

        sc.close();
        
    }
}
