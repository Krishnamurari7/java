import java.util.Scanner;
public class sorting {
public static void bubbleSort(int[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
for (int j = 0; j < n - i - 1; j++) {
if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
}
public static void selectionSort(int[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
int minIndex = i;
for (int j = i + 1; j < n; j++) {
if (arr[j] < arr[minIndex]) {
minIndex = j;
}
}
int temp = arr[minIndex];
arr[minIndex] = arr[i];
arr[i] = temp;
}
}
public static void insertionSort(int[] arr) {
int n = arr.length;
for (int i = 1; i < n; i++) {
int key = arr[i];
int j = i - 1;
while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j--;
}
arr[j + 1] = key;
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter elements:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
System.out.println();
bubbleSort(arr);
System.out.println(" Bubble Sort:");
for (int i = 0; i < n; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
selectionSort(arr);
System.out.println(" Selection Sort:");
for (int i = 0; i < n; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
insertionSort(arr);
System.out.println(" Insertion Sort:");
for (int i = 0; i < n; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
}
}
