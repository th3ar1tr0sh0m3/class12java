package arrays;

import java.util.Scanner;

/**
 * Selection Sort
 *
 * @author Aritro Shome
 * @apiNote 0.0.1
 */
class SelectionSort {
    int[] array;
    int len;

    SelectionSort(int len) {
        this.len = len;
        this.array = new int[this.len];
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort(10);
        //take input of the elements of the array
        obj.input();
        //sort the array in descending order
        obj.sortDescending();
        //display sorted array
        obj.display();
        //sort the array in ascending order
        obj.sortAscending();
        //display sorted array
        obj.display();
    }

    /**
     * takes input of the elements of the array from console.
     */
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + this.len + " integers = ");
        for (int i = 0; i < this.len; ++i)
            this.array[i] = sc.nextInt();
        sc.close();
    }
    //same logic as ascending but reversed inequalities

    /**
     * sorts the array ascending order
     */
    void sortAscending() {
        //the outer loop chooses the position of element to be 'cleaned'
        for (int i = 0; i < this.len - 1; ++i) {
            //fix reference point at current i
            int min = i;
            for (int j = i + 1; j < this.len; ++j) {
                //if you find a 'cleaner' value save its index
                if (this.array[j] < this.array[min])
                    min = j;
            }
            //swap reference with the 'cleanest'
            int temp = this.array[i];
            this.array[i] = this.array[min];
            this.array[min] = temp;
        }
    }

    /**
     * sorts the array descending order
     */
    void sortDescending() {
        for (int i = 0; i < this.len - 1; ++i) {
            int max = i;
            for (int j = i + 1; j < this.len; ++j) {
                if (this.array[j] > this.array[max])
                    max = j;
            }
            int temp = this.array[i];
            this.array[i] = this.array[max];
            this.array[max] = temp;
        }
    }

    public void display() {
        System.out.println("The array = ");
        for (int i : this.array)
            System.out.print(i + " ");
        System.out.println();
    }
}