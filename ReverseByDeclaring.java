
//Lab 2-Question 2 part 2
//Author: Tadisa Jakarasi

public class ReverseByDeclaring {
    public static void main(String[] args) {
        double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0 };
        //for loop to reverse array starting from the end of array to beginning
        double[] newArray = new double[myArray.length];//declaring the new array for reversed values
        for (int i = 6; i >= 0; i--) //iterates until index negative then loop stops
        {
            newArray[6-i] = myArray[i]; //copying old array values reversed into new array
        }
        //enhanced for loop to showcase elements in new array
        for (double item : newArray)
        {
            System.out.print(item + "," + " ");
        }
    }
}