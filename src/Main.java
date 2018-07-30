import List.ListReferenceBased;

public class Main {
/*
    Complete the reference-based implementation of the ADT List including
    a main method(pp. 264 - 268) and verify methods such as a constructor,
    "find()", "add()", get(), "remove()" and "removeAll()" by implementing
    a test program. Show that the ADT List works.
 */
    public static void main(String[] args) {
        ListReferenceBased aList = new ListReferenceBased();

        System.out.println("Size: " + aList.size());
        aList.add(0, "Peter");
        aList.add(1, "John");
        aList.add(2, "Jack");
        aList.add(3, "Sam");
        aList.add(4, "Paul");
        System.out.println("isEmpty: " + aList.isEmpty());
        aList.display();
        System.out.println("Size: " + aList.size());
        aList.remove(1);
        System.out.println("Size: " + aList.size());
        aList.remove(3);
        System.out.println("Size: " + aList.size());
        System.out.println("Index 1: " + aList.get(1));
        aList.removeAll();
        System.out.println("Size: " + aList.size());
        System.out.println("isEmpty: " + aList.isEmpty());
    }
}
