package algorithm.java.reviewsort;

import java.util.Scanner;

public class _SelectionSort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		int [] n = {x,y,z};
		
		
		//Selection Sort
		for(int i=0; i<n.length-1; i++) {     //�������� �ִ� ���� �̹� ���ĵǾ� �ڷ� �и� ���̱⶧���� ���� �ʿ䰡 ���� -1
			for(int j=i+1; j<n.length; j++) { // �ڱ��ڽŰ��� ���� �ʿ䰡 ���� ������ i+1
				
				if(n[i]<n[j]) { // > �� ������������ < �� �������� ����
					
					//n[i]�� n[j]�� �� ��ȯ => �ڹٿ����� ���� �ٷ� ��ȯ�� �� ���⶧����, �ӽú����� ���ؼ� ��ȯ�ؾ���
					int temp = n[i]; //temp������ n[i]�� ���� ��
					n[i] = n[j];     //n[j]�� ���� n[i]�� ����
					n[j] = temp;     //n[j]�� ���� n[i]�� ���� => ������ n[i]�� ���� temp��� �ӽú��� �ȿ� ��������
				}
			}
		}
		
		//��� ���
		for(int k=0; k<n.length; k++) {
			System.out.print(n[k]+" ");
		}
	}
}