import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so hang: ");
        int n = scanner.nextInt();
        System.out.print("Nhap vao so cot: ");
        int m = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap vao phan tu matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.print("Ma tran vua nhap la");
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        int sum = 0;
        System.out.println();
        System.out.print("Nhap cot muon tinh tong: ");
        int cot = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (cot == j) {
                    {
                        sum += matrix[i][cot];
                    }
                }
            }
        }
        System.out.println();
        System.out.print("Tong cot " + cot + " la: " + sum);
    }
}
