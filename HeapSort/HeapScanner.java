package HeapSort;

import java.util.Scanner;

public class HeapScanner {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            HeapScanner.heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            HeapScanner.heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;

        int left = 2 * i + 1;

        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {

            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {

            largest = right;
        }

        if (largest != i) {

            int swap = arr[i];

            arr[i] = arr[largest];

            arr[largest] = swap;

            HeapScanner.heapify(arr, n, largest);
        }
    }

    private static int[] Input()  {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");

        int size = sc.nextInt();

        int[] arr = new int[size];

        int i = 0;

        do {

            System.out.print("Value " + (i + 1) + ": ");

            arr[i] = sc.nextInt();

            i++;

        } while (i < size);

        sc.close();

        return arr;
    }

    public static void print(int[] arr) {

        for (int each : arr) {

            System.out.print(each + " ");
        }

        System.out.println();
    }

    public static void Function() {

        int[] arr = Input();

        System.out.println("Input Array:");

        print(arr);

        heapSort(arr);

        System.out.println("Sorted Array:");

        print(arr);
    }

    public static void main(String[] args) {

        HeapScanner.Function();

    }


}


