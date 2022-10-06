package javaexercises.src;

import java.util.Arrays;

public class SortNonZero {
    public static void main(String[] args) {
        
        int[] array = new int[] {1, 0, -2, 0, 0, 3, 4, 0, 0};
        
        //Show array before to sort
        System.out.println("Array before to sort");
        System.out.println(Arrays.toString(array));
        System.out.println("");
        System.out.println("-------------------");
        
        //Use the function sort and asign to count
        int count = sort(array);

        //Show array after to sort and count of non-zeros
        System.out.println("Array after to sort");
        System.out.println(Arrays.toString(array));
        System.out.println("");
        System.out.println("And the non-zero cant is: "+count);
        

    }

    public static int sort(int[] array){

        //Init the vars that are pointers
        int j = array.length-1;
        int i = 0;

        //array traversal
        while (i<=j){
            //If the firstone is a zero and the lastone is a non-zero then Switch
            if ((array[i]==0) && (array[j]!=0)) {
                array[i] = array[j];
                array[j] = 0;
                i++;
                j--;
            }
            //If the firstone is a non-zero and the lastone is a zero, its rigth
            if ((array[i]!=0) && (array[j]==0)) {
                i++;
                j--;
            }
            //Search non-zero in j position    
            if ((array[i]==0) && (array[j]==0)) {
                j--;
            }
            //Search zero in i position
            if ((array[i]!=0) && (array[j]!=0)) {
                i++;
            }
        }
        return i;
    
    };

}