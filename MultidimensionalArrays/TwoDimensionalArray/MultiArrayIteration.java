package MultidimensionalArrays.TwoDimensionalArray;

public class MultiArrayIteration {
    public static void main(String[] args) {

        // Define the rows and columns. Default value is 0.
        int rows = 2;
        int columns = 3;

        // Create 2D array with [][]
        int[][] twoDimensionalArray = new int[rows][columns];

        // Change the values.
        // Format - arrayName[rowIndex][columnIndex] = newValue;
        twoDimensionalArray[0][1] = 2;
        twoDimensionalArray[1][2] = 4;

        System.out.println("Array in gird format:");

        // Double loop to print out the values
        for(int row = 0; row < twoDimensionalArray.length; row++) {
            for(int column = 0; column < twoDimensionalArray[row].length; column++) {

                // Get the value at specific row and column index
                int value = twoDimensionalArray[row][column];

                // Print the values
                System.out.print(value + " ");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
