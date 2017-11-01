/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nate
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q5 test = new A3Q5();
        String[] letters = new String[]{"p","n" , "a" ,"m"};
        test.insertionSort(letters);
        for (int i = 0; i < letters.length; i++) {

            System.out.println(letters[i]);
        }
    }

    public void swap(String[] array, int p1, int p2) {
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;

    }

    public void insertionSort(String[] array) {
        //start goight through the array
        for (int i = 0; i < array.length - 1; i++) {
            //store position
            int position = i;
            //check values beside others
            while (position >= 0 && array[position].compareTo(array[position + 1]) >0) {
                
                //if out of place swap downwards
                swap(array, position, position + 1);
                //untill correct position reached
                position--;
            }

        }

    }

}
