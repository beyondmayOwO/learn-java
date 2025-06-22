package ComparableInterfaceAndSortingObjects;

// Comparable interface is used to compare the objects of the same type. "compareTo" method is implemented in the object
// We can use java sorting methods directly for the objects this way
public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    // "compareTo" returns integer to determine the "order" of the objects
    // if "this" is greater -> positive number (behind place), smaller/less -> negative  number (front place), equal -> 0

    // Using traditional approach
    // @Override
    // public int compareTo(Member member) {
    //     if(this.height == member.getHeight()) {
    //         return 0;
    //     } else if (this.height > member.getHeight()) {
    //         return 1;
    //     } else {
    //         return -1;
    //     }
    // }

    @Override
    public int compareTo(Member member) {
        // The same result as the above compareTo method but simplied in one line
        // We can use this for integers
        // How it works
        // Subtracting the heights:
        // If this.height is 182 and member.getHeight() is 187: 182 - 187 = -5 (negative number) -> this comes first.
        // If this.height is 187 and member.getHeight() is 182: 187 - 182 = 5 (positive number) -> this comes after.
        // If this.height is 182 and member.getHeight() is 182: 182 - 182 = 0 (zero) -> they are equal.
        return this.height - member.getHeight();
    }
}
