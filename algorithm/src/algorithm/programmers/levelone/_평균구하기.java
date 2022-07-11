package algorithm.programmers.levelone;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/*

- Ǯ�̹��
forEach ����غ���

- ����
arr�� ��Ұ� ���� ��쵵 ����ؾ��Ѵ�.
arr�� ��Ұ� ���� ����� üũ�� arr[i] == null
��Ұ� �ִ� ��쿡 ���� ���


- ������
�Է¹޴� ���� ���� ��츦 ��������ʰ�, ������ �Է°��� ���´ٰ� �����ߴ�.
�̹� ������ ���ؼ�, �Է°��� ���� ����� ������ üũ�ϴ� ����� �˾Ҵ�.
������ ���� Ǯ ����, �Է°��� ���� ��쵵 ����غ��߰ڴ�.


- �߰��� �˰Ե� ��

�������ڷ���
byte  : 8bit
short : 16bit
int   : 32bit
long  : 64bit

�Ǽ����ڷ���
float  : 32bit
double : 64bit


- ū �ڷ���Ÿ�Կ� ���缭 ����ȴ�.

double + int    = double
float  + double = double


- �ǿ������� Ÿ���� int ���� ���� Ÿ���̸� int�� ��ȯ�ȴ�.
byte + short = int
char + short = int

*/

public class _��ձ��ϱ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�迭�� ũ�� �Է¹ޱ�
		int N = sc.nextInt();
		
		//�Է¹��� ���� 0�̶��
		if(N==0) {
			
			System.out.println(0);
			
		//�迭�� ������ �� �ִ� ���ǿ��� �迭���� ��, ����޼ҵ� ȣ��
		//�޼ҵ峻�� �ڵ�� ������ ���޹��� ���� �ִ� ����� �����ϰ� �ڵ�
		//�Է¹޴� ���� ������ main���� ����
		}else {
			
			//�迭 ũ�� ����
			int[] arr = new int[N];
			
			//�迭 �Է¹ޱ�
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			//�޼ҵ� ȣ��
			System.out.println(solution1(arr));
			
			//�޼ҵ� ������ ����� ����� ��� : forEach
			solution2(arr);
			
			//Arrays.stream ���
			System.out.println(solution3(arr));
		}
	}
	
	
	//�ʱ� ���� �ڵ�
	public static double solution1(int[] arr) {
		
		double answer = 0;
		
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
		}
		
		return answer/arr.length;
	}//solution1() end
	
	
	//���� �ڵ�
	public static void solution2(int[] arr) {
		
		double answer = 0;
		
		//arr�迭�� ��Ұ��� i������ ��� �ϳ��� �����´�
		for(int i : arr) {
			answer += i;
		}
		
		System.out.println(answer/arr.length);
		
	}//solution2() end
	
	
	//Arrays.stream().average() ���
	public static double solution3(int[] arr) {
		
		return  Arrays.stream(arr).average().getAsDouble();
	}//solution2() end
}