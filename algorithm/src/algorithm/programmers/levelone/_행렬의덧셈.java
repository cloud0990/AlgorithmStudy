package algorithm.programmers.levelone;

import java.util.Scanner;

/*

1. �������

arr1�� arr2�� ũ��� �����ϴ�.

solution�Լ��� ���ڰ����� ���� 2���� �迭�� 0���� �� �ִ�.

*/

public class _����ǵ��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�迭�� ũ�� �Է¹ޱ�
		int n = sc.nextInt();
		
		//�Է¹��� n��ŭ �迭 ����
		int[][] arr1 = new int[n][n];
		int[][] arr2 = new int[n][n];
		
	
		//arr1 �� �Է�
		for(int i=0; i<n; i++) {
			
			for(int k=0; k<n; k++) {
				
				arr1[i][k] = sc.nextInt();
			}
		}
		
		//arr2 �� �Է�
		for(int i=0; i<n; i++) {
			
			for(int k=0; k<n; k++) {
				
				arr2[i][k] = sc.nextInt();
			}
		}
		
		
		//�Լ�ȣ��
		int[][] temp = solution(arr1, arr2);

		
		System.out.println("-----[������]-----");
		
		for(int i=0; i<temp.length; i++) {
			for(int k=0; k<temp[i].length; k++) {
				
				System.out.print(temp[i][k] + " ");
				
			}
			System.out.println();
		}
		
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2){
		
		//answer�迭�� ũ�⸦ arr1��ŭ �����ϱ����� ��������
		int row = arr1.length;
		int col = arr1[0].length;
		
		int[][] answer = new int[row][col];
		
		
		//���ڰ����� ���� �迭�� ���� 0�� ��� -> �ݺ� 1������ ����
		if(col==0) {
			
			for(int i=0; i<row; i++) {
				answer[i][0] = arr1[i][0] + arr2[i][0];
			}
		
	    //���ڰ����� ���� �迭�� ���� 0 �̻��� ��� -> �ݺ�2������ ����
		}else {
			
			for(int i=0; i<row; i++) {
				for(int k=0; k<col; k++) {
				
					answer[i][k] = arr1[i][k] + arr2[i][k];
				}
			}
		}//if end
		
		return answer;
	}
	
}