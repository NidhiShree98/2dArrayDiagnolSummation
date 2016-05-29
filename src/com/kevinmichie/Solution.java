package com.kevinmichie;

import java.util.Scanner;

public class Solution {

    int leftDiagnolSum = 0;
    int rightDiagnolSum = 0;

    public int leftToRightDiagnolChecker(int[][] twoDArray, int dimension){
        for(int i = 0; i < dimension; i++){
                leftDiagnolSum += twoDArray[i][i];
        }
        return leftDiagnolSum;
    }

    public int rightToLeftDiagnolChecker(int[][] twoDArray, int dimension){
        for(int i = 0; i < dimension; i++){
            rightDiagnolSum += twoDArray[i][dimension - 1 - i];
        }
        return rightDiagnolSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int dimensions = scanner.nextInt();
        int arr[][] = new int[dimensions][dimensions];
        for (int i = 0; i < dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int leftSum = solution.leftToRightDiagnolChecker(arr, dimensions);
        int rightSum = solution.rightToLeftDiagnolChecker(arr,dimensions);

        int absoluteSum = Math.abs(leftSum - rightSum);

        System.out.println(absoluteSum);
    }
}
