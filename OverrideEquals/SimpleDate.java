package OverrideEquals;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    // Object compared: Accepts any object (even if it's not a SimpleDate), which is important for overriding because the default equals method uses this signature.
    public boolean equals(Object compared) {

        // This checks if the two references point to the exact same object in memory.
        //      - If they do, they are definitely equal. No need to check further.
        //      - 'this' refers to the current object.
        //      - '==' checks reference equality, not data equality.
        if (this == compared) {
            return true;
        }

        // This checks if the object passed is not a SimpleDate:
        //     - instanceof checks the type.
        //     - If compared is not a SimpleDate, then they can’t be equal because they aren't even the same type of object.
        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        // Casts the Object into a SimpleDate
        //     - Now we can access its day, month, and year values.
        //     - We are telling Java: "Trust me, this really is a SimpleDate."
        //     - This cast is safe because we already checked the type using instanceof.
        SimpleDate comparedSimpleDate = (SimpleDate) compared;

        // Compare the values of the objects
        if(this.day == comparedSimpleDate.day && this.month == comparedSimpleDate.month && this.year == comparedSimpleDate.year) {
            return true;
        }

        // If any of the fields don’t match, we return false
        return false;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
