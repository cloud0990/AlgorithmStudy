package algorithm.boj.primenumbersieve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*

-�Ҽ�
2~N�� �ڿ�����, �ڱ� �ڽź��� ���� ���� ������ �� �������� 0�� �ƴ� ��

-�����佺�׳׽��� ü
���� ���� �Ҽ��� �Ǻ��� ������ŭ �迭�� ���� ��, �ش��ϴ� ���� �־��ش�.

0. �迭�� �����Ͽ� �ʱ�ȭ�Ѵ�.
1. �ڱ� �ڽ��� �ǳʶڴ�.
2. �̹� ������ ���� �ǳʶڴ�.

���Ŀ� �ϳ��� ��������.


�־��� ���� �� �Ҽ��� ���� ���


1. boolean�� �迭���
2. �Է¹��� su�� �����ٱ����� ����� ����� ��


*/



public class _1978_�Ҽ�ã�� {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		
		//�Ҽ��� �Ǻ��� ������ŭ�� �迭 ����
		int[] arr = new int[1001];
		
		
		//�迭 �ʱ�ȭ
		for(int i=2; i<arr.length; i++) {
			arr[i] = 1;
		}
		
		
		//�Ҽ� ���ϱ�
		for(int i=2; i<=(int)Math.sqrt(1000); i++) {
			
			//�̹� ������ ���� �ǳʶڴ�
			if(arr[i]==0) continue;
			
			//����� 1�� �����
			for(int k=2*i; k<=1000; k+=i) {
				
				arr[k] = 0;
			}
		}//for end
		
		
		//������ ��������
		int answer = 0;
		
		//�Է��ʱ�ȭ
		st = new StringTokenizer(br.readLine());
		
		//N��ŭ �ݺ�
		for(int i=0; i<N; i++) {
			
			//�Է��� ������ ������ �������� cf) �мǿս��غ�
			int su = Integer.parseInt(st.nextToken());
			
			if(arr[su]==1) {
				answer++;
			}
		}
		
		sb.append(answer);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}