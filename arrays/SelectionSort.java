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

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + this.size + " integers = ");
        for(int i = 0; i < this.size; ++i)
            this.array[i] = sc.nextInt();
    }

}