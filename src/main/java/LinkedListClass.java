import java.util.LinkedList;

public class LinkedListClass {
    public static void searchForAnElementInALinkedList(int n) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(14);
        linkedList.push(21);
        linkedList.push(11);
        linkedList.push(30);
        linkedList.push(10);

        if(linkedList.contains(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
