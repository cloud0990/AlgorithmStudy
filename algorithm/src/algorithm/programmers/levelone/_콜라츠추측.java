package algorithm.programmers.levelone;

import java.util.Scanner;

/*

:::���� ���� �ڷ��� ���:::

- ����
1 <= n < 8000000

������ ������ ���� ���� int�ڷ����� ũ�⸦ �����������,
num�� Ȧ���� ��� 3�� ���ؾ��ϱ� ������ �־��� ��쿡�� ��� �� �ִ�.

�׷��� ���޹��� num�� long������ ����Ȯ�� �� �����ؾ��Ѵ�.


- if~else�� �� �� �ִ� ������ ���׿����ڷε� �����ϴ�.
���׿����� Ȱ���غ���

*/

public class _�ݶ������� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�� �Է¹ޱ�
		int num = sc.nextInt();
		
		System.out.println(solution1(num));
		System.out.println(solution2(num));
		
	}
	
	//�ʱ� �����
	public static int solution1(int num) {
		
		int answer = 0;
		int cycle  = 0;
		
		//Ż������ ����
		while(true) {
			
			cycle++;
			
			//Ż������
			if(cycle==500) break;
			if(num==1)     break;
			
			//1-1. num�� ¦���� ���
			if(num%2==0) {
				
				num = num / 2;
				answer++;
			//1-2. num�� Ȧ���� ���
			}else if(num%2==1) {
				num = (num*3) + 1;
				answer++;
			} 
		}//while end
		
		if(cycle>=500) {
			return -1;
		}else {
			return answer;
		}
	}//solution1() end
	
	
	
	//�����ڵ�
	public static int solution2(int num) {
		
		long n = (long)num;
		
		//�ݺ��� ������ 500ȸ
		for(int answer=0; answer<500; answer++) {
			
			//Ż������
			if(n==1) return answer;
			
			n = (n%2==0) ? n/2 : (n*3)+1;
			
		}//for end
		
		//500ȸ �ݺ��� ������ (num==1)�� �������� ������ ���
		return -1;
		
	}
}