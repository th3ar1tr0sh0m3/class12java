package arrays;

import java.util.Scanner;

/**
 * Bubble Sort
 *
 * @author Aritro Shome
 * @apiNote 0.0.1
 */
public class BubbleSort {
    int[] array;
    int len;

    BubbleSort(int len) {
        this.len = len;
        this.array = new int[this.len];
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort(10);
        obj.input();
        obj.sortAscending();
        obj.display();
        obj.sortDescending();
        obj.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + this.len + " integers = ");
        for (int i = 0; i < this.len; ++i)
            this.array[i] = sc.nextInt();
        sc.close();
    }

    public void display() {
        System.out.println("The array = ");
        for (int i : this.array)
            System.out.print(i + " ");
        System.out.println();
    }

    void sortAscending() {
        //ascending matlab shuru se dekhte raho, agar bada element chota se pehle hai to bubble karwao
        for (int i = 0; i < this.len; ++i) {
            for (int j = 0; j < this.len - i - 1; ++j) {
                //bada element chota ke pehle hai which is not ascending
                if (this.array[j] > this.array[j + 1]) {
                    int temp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                }
            }
        }
    }

    void sortDescending() {
        //descending matlab shuru se dekhte raho, agar chota element bada se pehle hai to bubble karwao
        for (int i = 0; i < this.len; ++i) {
            for (int j = 0; j < this.len - i - 1; ++j) {
                //chota element bada ke pehle hai which is not descending
                if (this.array[j] < this.array[j + 1]) {
                    int temp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                }
            }
        }
    }
}
