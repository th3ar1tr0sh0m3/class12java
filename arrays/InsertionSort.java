package arrays;

import java.util.Scanner;

/**
 * insertion sort
 *
 * @author Aritro Shome
 * @apiNote 0.0.1
 */
public class InsertionSort {
    int[] array;
    int len;

    InsertionSort(int len) {
        //idhar kar diya + 1 kyunki voh density element ka panga hoyega boht

        this.len = len + 1;
        this.array = new int[this.len + 1];
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort(10);
        obj.input();
        obj.sortAscending();
        obj.display();
        obj.sortDescending();
        obj.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + (this.len - 1) + " integers = ");
        for (int i = 1; i < this.len; ++i)
            this.array[i] = sc.nextInt();
        sc.close();
    }

    public void display() {
        System.out.println("The array = ");
        for (int i = 1; i < this.len; ++i)
            System.out.print(this.array[i] + " ");
        System.out.println();
    }

    void sortAscending() {
        this.array[0] = Integer.MIN_VALUE;
        for (int i = 1; i < this.len; ++i) {
            //current value ko hold rakho
            int temp = this.array[i];
            //piche se check karna chaloo karo
            int ptr = i - 1;
            //jab tak current value ke piche ek bada value hai usko ek place agey shift karwa ke lao
            //jab dekha ki nhi hai bada loop se nikal to gaye par ek decrement zyada hua hai
            //so humlog ka ptr at end of loop will be ek place piche of the actual position
            //jahan current value ko ghusedna hai
            //to plus 1 karke ghused do. simple hai.
            while (this.array[ptr] > temp) {
                this.array[ptr + 1] = this.array[ptr];
                --ptr;
            }
            this.array[ptr + 1] = temp;
        }
    }

    void sortDescending() {
        this.array[0] = Integer.MAX_VALUE;
        for (int i = 1; i < this.len; ++i) {
            int temp = this.array[i];
            int ptr = i - 1;
            while (this.array[ptr] < temp) {
                this.array[ptr + 1] = this.array[ptr];
                --ptr;
            }
            this.array[ptr + 1] = temp;
        }
    }
}
