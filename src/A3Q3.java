/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nate
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q3 test = new A3Q3();
        int[] numbers = new int[]{0, 0, 1, 0, 1, 1, 1, 1};

        int ones = test.countOnes(numbers);
        System.out.println(ones);
    }

    public int countOnes(int[] array) {
        int counter = 0;
        //goes through the array and add one to a counter if there is a one
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                counter++;
            }
        }
        //return the total of ones
        return counter;

    }

   
}
