package April22;

import java.util.LinkedList;
  
class searchElement {
    public static void main(String[] args)
    {
        LinkedList<Integer> ll = new LinkedList<>();
  
        ll.add(2);
        ll.add(4);
        ll.add(1);
        ll.add(3);
        ll.add(8);
        ll.add(5);
  
        int element = 3;
  
        int ans = -1;
  
        for (int i = 0; i < ll.size(); i++) {
  
            int llElement = ll.get(i);
  
            if (llElement == element) {
  
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println(
                "Found at " + ans+" index");
        }
    }
}
