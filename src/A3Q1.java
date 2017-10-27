/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nate
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q1 test = new A3Q1();
        int[] numbers = new int[]{55,41,80,12,45,59,84,90,60,36,89,93,96,50,87,66,45,60,12,16,11,4,94,83,96,82,59,57,3,45,12,96,70,69,52,5,65,28,83,6,23,44,91,92,53,100,59,51,68,28,43,88,44,14,66,67,25,22,60,40,73,93,81,29,31,86,80,48,70,73,78,82,71,8,66,93,55,85,40,77,76,1,14,90,68,57,31,8,9,32,0,8,30,33,67,99,16,85,67,98,70};

        test.selectionSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void swap(int[] array, int p1, int p2) {
        //p2 becomes p1
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;

    }

    public void selectionSort(int[] array) {
        for (int position = 0; position < array.length; position++) {
            for (int i = position + 1; i < array.length; i++) {
                //check if smaller
                if (array[i] < array[position]) {
                    int stored = i;
                    // look through the array again exclude stored
                    for (int j = position; j < array.length; j++) {
                        
                        if (array[stored] > array[j]) {
                            stored = j;
                        }
                    }
                 swap(array, stored, position);   
                    
                }
                
            }
        }

    }
}
