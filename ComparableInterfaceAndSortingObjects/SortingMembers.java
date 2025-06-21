package ComparableInterfaceAndSortingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMembers {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("Mikeal", 182));
        members.add(new Member("Matti", 187));
        members.add(new Member("Ada", 184));

        // Original List
        System.out.println("Oiginal List Order: ");
        members.stream().forEach(System.out::println);

        // If an object has implemented Comparable interface, we can sort them in java using two ways.
        // 1. list.stream().sorted() -> Returns a new stream of list. Does not change the original list
        // 2. Collections.sort(yourList) -> Change the original list in place

        // Using stream
        System.out.println("Sorted stream (original list not changed):");
        members.stream().sorted().forEach(System.out::println);

        // Using Collections.sort
        System.out.println("Sorting with Collections.sort():");
        Collections.sort(members);
        members.stream().forEach(System.out::println);
    }
}
