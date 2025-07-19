package WriteToAFile.HandlingExceptions;

import java.io.PrintWriter;

public class Storer {

    // 'throws Exception' = this method might throws an exception 
    public void writeToFile(String fileName, String text) throws Exception {
        PrintWriter writer = new PrintWriter(fileName);

        writer.println(text);
        writer.close();
    }
}
