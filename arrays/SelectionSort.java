/**
 * Selection Sort Program
 * Both Descending and Ascending
 * Follows the Class pattern of questions asked in ISC
 * (c) Aritro Shome 2023 - 2024
 */
import java.util.Scanner;
class SelectionSort {
    int[] array;
    int size;
    SelectionSort(int n) {
        this.size = n;
        this.array = new int[this.size];
    }
    //core method pay attention
    void sortAscending() {
        for(int i = 0; i < this.size; ++i) {
            int min = Integer.MAX_VALUE, idx = 0;
            //the goal is to search the entire array and replace the n-th position with the n-th smallest
            //element
            //the j loop does the searching part, the i loop maintains n and the swapping procedure
            for(int j = i + 1; j < this.size; ++j) {
                if(this.array[j] < min){
                    idx = j;
                    min = this.array[j];
                }
            }
            //the swapping
            int temp = this.array[i];
            this.array[i] = this.array[idx];
            this.array[idx] = temp;
        }
    }

    //core method pay attention
    void sortDescending() {
        for(int i = 0; i < this.size; ++i) {
            int max = Integer.MIN_VALUE, idx = 0;
            //the goal is to search the entire array and replace the n-th position with the n-th largest
            //element
            //the j loop does the searching part, the i loop maintains n and the swapping procedure
            for(int j = i + 1; j < this.size; ++j) {
                if(this.array[j] > max){
                    idx = j;
                    max = this.array[j];
                }
            }
            //the swapping
            int temp = this.array[i];
            this.array[i] = this.array[idx];
            this.array[idx] = temp;
        }
    }


    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + this.size + " integers = ");
        for(int i = 0; i < this.size; ++i)
            this.array[i] = sc.nextInt();
    }

}