/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nate
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q2 test = new A3Q2();
        int[] numbers = new int[]{1, 2, 3, 4, 7, 8, 9, 11, 12};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = numbers[i] * -1;
            }
        }

        int lowestNumber = test.smallestMissingNumber(numbers);
        System.out.println("the lowest number is " + lowestNumber);
    }

    public int smallestMissingNumber(int[] array) {
        int ln = 0;

        for (int i = 0; i < array.length; i++) {
            //check the lowest number and if is not return the number that is not 
            if (array[i] != i) {
                ln = i;
                break;
            }

        }

        return ln;
    }
}
