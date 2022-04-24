package April23;

import java.util.LinkedList;
import java.util.Scanner;

public class addUserElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int j = sc.nextInt();
            ll.add(j);   
        }
        System.out.println("Before deleting Element list is: ");
        System.out.println(ll.toString());
        int j =10;
        for (int i = 0; i < j; i++) {
            int llElement = ll.get(i);
  
            if (llElement >=40) {
                ll.remove(i);
                j--;
            }
        }
        System.out.println("After deleting Element list is: ");
        System.out.println(ll.toString());

        sc.close();
        
    }
}
