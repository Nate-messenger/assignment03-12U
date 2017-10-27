/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nate
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] number = new int[101];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 101);

        }
        System.out.println("test");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        int[] trackerArray = new int[100];

        System.out.println("sorted");
        countingSort(number);

    }

    static public void countingSort(int[] array) {
        //tracker array and starting postition
        int[] trackerArray = new int[101];
        int position = 0;
//check the array and if the position in the unsorted array is the one we are looking for the tracker array adds one to the position
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {

                    trackerArray[position] += 1;

                }
            }
            position++;

        }
        //goes throught the tracker array and if there is a number in that position write out that position then reduce the tracker array by one
        for (int i = 0; i < trackerArray.length; i++) {
            while (trackerArray[i] > 0) {
                System.out.println(i);
                trackerArray[i] -= 1;
            }
        }

    }

}
