package linked.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<String> aus = new LinkedList<>();
//        aus.add("Sydney");
//        aus.add("Melbourne");
//        aus.add("Brisbane");
//        aus.add("Perth");
//        aus.add("Canberra");
//        aus.add("Adelaide");
//        aus.add("Darwin");
        addInOrder(aus,"Sydney");
        addInOrder(aus,"Melbourne");
        addInOrder(aus,"Brisbane");
        addInOrder(aus,"Perth");
        addInOrder(aus,"Canberra");
        addInOrder(aus,"Adelaide");
        addInOrder(aus,"Darwin");

        printList(aus);

        aus.add(1, "Alice Springs");
        printList(aus);

//        aus.remove(4);
//        Collections.sort(aus);
//        printList(aus);

        addInOrder(aus, "St. Louis");
        printList(aus);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) { // note we are changing the input and returning something different; this is typically frowned upon in Java programming
            int comparison = stringListIterator.next().compareTo(newCity); // must use .next() here to point to the first iteration
            // 0 is equal; we don't want to add
            if(comparison == 0) {
                //equal, do not add
                System.out.println(newCity = " is already included as a destination");
                return false;
            } else if (comparison > 0) { // MM proposed internal model for comparator:
                // alphabet starts at 0.  so 'b' - 'a' is positive.  Therefore, a goes before b.
                // new city should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous(); // only a ListIterator can use the previous method
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) { // city in list is closer to 0 as 'a' - 'b' is negative
                // move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }



}

// LinkedList is superior to ArrayList in speed/low effort of adding, deleting