package WriteToAFile.HandlingExceptions;

// Don't need to import PrintWriter here because Storer handles it.
public class Main {

    // 'throws Exception' in in the main method means that if any methods in main methods or any method calls
    // in main method also throw exception, the program will simply terminate and report the exception
    public static void main(String[] args) throws Exception {
        Storer storer = new Storer();

        // we don't need a try-catch block here.
        storer.writeToFile("diary.txt", "Dear diary, today was a good day.");

        System.out.println("Diary entry written to diary.txt successfully.");
    }
}

// IMPORTANT !!!
// PrintWriter by default overwrite files (earlier contents are erased if the file already exists.)
// To append text, FileWriter class is more appropriate for that.