package algorithm.programmers.levelone;

import java.util.Scanner;

public class _�ϻ���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		//������
		System.out.println(solution(x));
	}
	
	
	public static boolean solution(int x) {
		
		//�Է¹��� ������ String������ ��ȯ�Ѵ�
		String x_str = String.valueOf(x);
		
		//������ �ڸ��� ���ϱ�
		int sum = 0;
		
		for(int i=0; i<x_str.length(); i++) {
			
			//x_str�� Integer������ ��ȯ�Ͽ� �ڸ����� ���� ���Ѵ�
			//������ �� : charAt�� �ƽ�Ű�ڵ� ������ ���ϴ� �������� Ȯ���ϱ����� 0 / 48�� �����Ѵ�
			sum += Integer.valueOf(x_str.charAt(i)-'0');
		}
		
		boolean answer = false;
		
		if(x%sum==0) {
			answer = true;
		}else {
			answer = false;
		}
		
		return answer;
	}
}