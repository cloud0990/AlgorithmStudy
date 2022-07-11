package algorithm.boj.primenumbersieve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*

1 <= M <= N <= 1,000,000

M�� N�� ������ �ΰ� �־�����.

������ : �����ϴ� ������� Enter


�Ҽ� : 1�� �ڱ��ڽ� ���� ����� ����.


-�����佺�׳׽��� ü

���� ���� �Ҽ��� �Ǻ��� ������ŭ �迭�� ���� ��, �ش��ϴ� ���� �־��ش�.

0. �迭�� �����Ͽ� �ʱ�ȭ�Ѵ�.
1. �ڱ� �ڽ��� �ǳʶڴ�.
2. �̹� ������ ���� �ǳʶڴ�.

���Ŀ� �ϳ��� ��������.


--> �ε��� ����ϱ� ���ϰ� 1ĭ �߰��� �迭����
1�� �Ҽ��� �ƴϱ� ������ �ݺ����� �ʱ���� 2���� ������ ����

*/

public class _1929_�Ҽ����ϱ� {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		//M�̻� N������ ������ �ִ� �Ҽ� ���ϱ�
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		//�Ҽ����Ǻ��� ������ŭ�� �迭 ����
		//�ε��� ����ϱ� ���ϰ� +1 ����
		//N������ �����ϱ� �迭�� ũ��� N��ŭ ����
		int[] arr = new int[N+1];
		
		//�迭 ä���
		//2~N���� �Է¹��� -> ������ +1ĭ �� ũ�� ���� 0��° �ε����� �� ä�� �Ű�, 1�� �Ҽ��� �ƴϴϱ� 2���� �Է�
		for(int i=2; i<=N; i++) {
			arr[i] = i;
		}
		
		
		//1. �̹� ������ ���� �ǳʶڴ�.
		//2. ����� �����.
		
		//���࿡ 100������ �� �߿��� �Ҽ��� ã�´ٸ�
		//���⼭ ���� 10���� �����س���
		//�ؿ��� 2*i �ʱ��, ������ k+=i��ŭ �����ϸ鼭 ��� �� ����ϱ� 100���� �������
		//���� ���ǽĿ��� 100�ִ� �� ���� ���������� ���ǽ� �����ϸ� �ð����⵵ �پ��
		for(int i=2; i<=Math.sqrt(N); i++) {
			
			//�̹� ������ ���� �ǳʶ� -> 0���� ����
			if(arr[i]==0) continue; //�ǳ� �پ���ϴϱ� continue����� -> break���� �׳� �ݺ��� Ż����
									//���ǿ� �����ؼ� continue����� �����ϰԵǸ� ���� ���������� �ٷ� �̵�
			
			
			//N������ ��� �����
			//        i+i        k=k+i
			for(int k=2*i; k<=N; k+=i) {
				
				arr[k] = 0;
				
			}//for k end
		}//for i end
		
		
		for(int i=M; i<=N; i++) {
			
			//���������ʰ� ���� ���� �Ҽ��ϱ� 0�� �ƴ� �ε����� ���
			if(arr[i]!=0) {
				sb.append(arr[i]).append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}