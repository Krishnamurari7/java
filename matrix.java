import java.util.Scanner;
public class matrix {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Matrix 1\n ");
System.out.print("Enter row number: ");
int rows1 = sc.nextInt();
System.out.print("Enter column number: ");
int cols1 = sc.nextInt();
int[][] matrix1 = new int[rows1][cols1];
System.out.println("\nEnter the elements:");
for (int i = 0; i < rows1; i++) {
for (int j = 0; j < cols1; j++) {
matrix1[i][j] = sc.nextInt();
}
}
System.out.print("Enter Matrix 2\n ");
System.out.print("Enter row number: ");
int rows2 = sc.nextInt();
System.out.print("Enter column number: ");
int cols2 = sc.nextInt();
if (cols1 != rows2) {
System.out.println("Matrix multiplication is not possible!");
return;
}
int[][] matrix2 = new int[rows2][cols2];
System.out.println("Enter the elements: ");
for (int i = 0; i < rows2; i++) {
for (int j = 0; j < cols2; j++) {
matrix2[i][j] = sc.nextInt();
}
}
int[][] sum = new int[rows1][cols1];
for (int i = 0; i < rows1; i++) {
for (int j = 0; j < cols1; j++) {
sum[i][j] = matrix1[i][j] + matrix2[i][j];
}
}
int[][] product = new int[rows1][cols2];
for (int i = 0; i < rows1; i++) {
for (int j = 0; j < cols2; j++) {
int sumProduct = 0;
for (int k = 0; k < cols1; k++) {
sumProduct += matrix1[i][k] * matrix2[k][j];
}
product[i][j] = sumProduct;
}
}
System.out.println("\n");
System.out.println("Sum of matrix : ");
displayMatrix(sum);
System.out.println("Product of matrix :");
displayMatrix(product);
}
public static void displayMatrix(int[][] matrix) {
int rows = matrix.length;
int cols = matrix[0].length;
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
}
}
