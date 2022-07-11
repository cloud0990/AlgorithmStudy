package algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*

�ڿ��� N (1 �� N �� 1,000,000)

- Edge Case : int�� (�����ص� 20�� �� ���� ��)

������ : N + N�� �̷�� �� �ڸ����� ��

� �ڿ��� M�� �������� N�� ���, M�� N�� �����ڶ�� �Ѵ�.
ex)
245�� ������ = 256(245+2+4+5)
256�� �����ڴ� 245�̴�.

���� : M�� �־����� ��, N�� ���� ���� �����ڸ� ���Ͻÿ�
��, �����ڰ� ���� ��� 0�� ����Ѵ�.

1. ���� ���� �����ڴ� ��� ����
2. �����ڰ� ���� ���� ��� ��
  -> �� �ڸ����� ���� ���� �� ���� 1�� �ڸ������� ��?

*/

public class _2231_������2 {

	public static void main(String[] args) throws IOException {
		
		//����°�ü ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		//�����Է�
		int M = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		
		while(M>0) {
			
			//Ż������ ����
			if(sum==M) {
				System.out.println(M);
				break;
			}
			
			if(M==1 && sum != M) {
				System.out.println(0);
				break;
			}
			
			sum += (M%10);
			
			//������ �ڸ��� �� ĭ�� �̵�
			M /= 10;
			
		}//while end
		
		
	}
}