//Lab 2- Question 1
// Author: Tadisa Jakarasi

public class JaggedArray {
    public static void main(String[] args) {
        int [][] jagged = new int [10][]; //declare 2d array and create memory


        //for loop to print out the values
        //the outer loop for the rows
        int i = 1; //input counter
        //jagged[i] = new int[i]; //stating size of columns needed
        for (int row = 0; row < jagged.length; row++)
        {
            jagged[row] = new int[row + 1]; //stating size of columns needed
            //the inner loop for the columns
            for (int col = 0; col < jagged[row].length; col++)
            {
                jagged[row][col] = i++; // incrementing the input values
                //print the row and column must increment each time
                System.out.print(jagged[row][col] + " " );
            }
            System.out.println(); //to move to the next line
        }

    }
}