package algorithm.programmers.levelone;

import java.util.Scanner;

/*

��� �����, �ڷ��� ���
������ �ش� �ڷ����� ��������Ѵ�.

short -> int  ���� ��, ū �ڷ����� �������� ������ ���� downcasting�� ���� �ʾƵ� ������,
int   -> long ���� ��, ������� long������ Ȯ���ϱ� ���ؼ� �� (long)���� �����ؾ��Ѵ�.

�������ڷ������� �⺻ �ڷ����� int����, long���� ������ ���� ����� �� long����
int�ڷ����� ������ Ȯ��������Ѵ�.

int  : 4byte
long : 8byte

*/

public class _x��ŭ�����ִ�n���Ǽ��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		//�Լ�ȣ��
		solution(x,n);
		
		//������
		
	}
	
	public static long[] solution(int x, int n) {
		
		long[] answer = new long[n];
		
		for(int i=0; i<n; i++) {
			answer[i] = (long)x * (i+1);
		}
		
		return answer;
	}
	
	public static long[] solution2(int x, int n) {
		
		long[] answer = new long[n];
		
		for(int i=1; i<=n; i++) {
			
			answer[i-1] = (long)x * i; 
		}
		
		return answer;
	}
	
}