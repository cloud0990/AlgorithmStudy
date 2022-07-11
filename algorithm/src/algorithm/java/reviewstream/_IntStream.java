package algorithm.java.reviewstream;

import java.util.Arrays;
import java.util.stream.IntStream;

/*

- IntStream (java 8.0 later)

java.util.stream �� API
-> primivive(����)�������� int�� Stream���� ������ �� �ְ� ����

- IntStream.of()
of�� ���ڷ�, ���� / �迭 ����


- IntStream.range(�����ε���, �����ε���)

range(1,5) : 1 2 3 4  int Stream ����
��� : 1 2 3 4

- IntStream.rangeClosed(�����ε���, �����ε���) : 1 2 3 4 5 int Stream ����
��� : 1 2 3 4 5


+) Arrays.stream(�迭�� ����)

*/

public class _IntStream {

	public static void main(String[] args) {
		
		int   N   = 5;
		int[] arr = {1, 2, 3, 4, 5};
		
		//IntStream�� ����Ͽ� max / min �� ���ϱ�
		int max = IntStream.range(1, N).max().getAsInt(); 
		int max2 = Arrays.stream(arr).max().getAsInt();
	
		int min = IntStream.rangeClosed(1, N).min().getAsInt(); 
		int min2 = Arrays.stream(arr).min().getAsInt();
		
		//IntStream�� ����Ͽ� �հ� ���ϱ�
		int sum  = IntStream.of(arr).sum();
		int sum2 = Arrays.stream(arr).sum();
		
		//IntStream�� ����Ͽ� ��հ� ���ϱ� : average()�� double�� ����
		double avg  = IntStream.of(arr).average().getAsDouble();
		double avg2 = Arrays.stream(arr).average().getAsDouble();
		
		//���ٽ��� ����ؼ� �迭�� ��� �ϳ��� ���
		System.out.println("IntStream");
		IntStream.of(arr).forEach(System.out::println);
		
		System.out.println("Arrays.stream");
		Arrays.stream(arr).forEach(System.out::println);
		
		
		System.out.printf("�ִ밪    : %d\n", max);
		System.out.printf("arr�ִ밪 : %d\n", max2);
		System.out.println();
		System.out.printf("�ּҰ�    : %d\n", min);
		System.out.printf("arr�ּҰ� : %d\n", min2);
		System.out.println();
		System.out.printf("IntStream     �հ� : %d\n", sum);
		System.out.printf("Arrays.stream �հ� : %d\n", sum2);
		System.out.println();
		System.out.printf("IntStream     ��� : %.3f\n", avg);
		System.out.printf("Arrays.stream ��� : %f\n", avg2);
		
	}
}