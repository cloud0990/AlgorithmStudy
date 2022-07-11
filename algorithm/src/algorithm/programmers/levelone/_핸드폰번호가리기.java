package algorithm.programmers.levelone;

import java.util.Scanner;

public class _�ڵ�����ȣ������ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�޴�����ȣ �Է¹ޱ�
		String phone_number = sc.nextLine();
		
		//������(�޼ҵ�ȣ��)
		System.out.println(solution(phone_number));
		System.out.println(solution2(phone_number));
		
	}
	
	
	//substring() ���
	public static String solution(String phone_number) {
		
		StringBuilder sb = new StringBuilder();
		
		//4�ڸ� �����Ѹ�ŭ * �߰�
		for(int i=0; i<phone_number.length()-4; i++) {
			sb.append("*");
		}
		
		int n = phone_number.length();
		
		//�޴�����ȣ�� ���ڸ� 4�ڸ� �ڸ���
		sb.append(phone_number.substring(n-4, n));
		
		String answer = sb.toString();
		
		return answer;
	}

	
	//char[] ���
	public static String solution2(String phone_number) {
		
		//�޴�����ȣ char�迭�� ���ڷ� ���
		char[] pN = phone_number.toCharArray();
		
		//�迭 �ȿ� ��� ���� �� 4�ڸ� �����ϰ� *���� �ʱ�ȭ
		for(int i=0; i<pN.length-4; i++) {
			pN[i] = '*';
		}
		
		//char[] -> String��ü�� ��ȯ
		String answer = String.valueOf(pN);
		
		return answer;
	}

}