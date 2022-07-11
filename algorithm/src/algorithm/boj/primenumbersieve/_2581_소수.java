package algorithm.boj.primenumbersieve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2581_�Ҽ� {

	//��������
	//������ ��ü
	static StringBuilder  sb = new StringBuilder();
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws IOException {
		
		//����� ��ü ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//M, N�Է¹ޱ�
		int M = Integer.parseInt(st.nextToken());
		
		st    = new StringTokenizer(br.readLine()); //�Է��ʱ�ȭ
		int N = Integer.parseInt(st.nextToken());
		
		//�Ҽ��迭 �ʱ�ȭ
		int[] arr = new int[10001];
		
		//�Ҽ�ã�� �޼ҵ� ȣ��
		primeNumberSeive(arr);
		
		//��� �޼ҵ� ȣ�� : find_primeNumber
		//���ڰ����� M N �� �ѱ��.
		find_primeNumber(M,N,arr);
	
		//����� �ڿ� ����
		br.close();

	}//main() end
	
	//primNumberSeive() -> �Ҽ�ã�� �޼ҵ�
	public static void primeNumberSeive(int[] arr) {
		
		//�Ҽ��迭 1�� �ʱ�ȭ
		//toIndex�� ������ �� �������� �ʱ�ȭ�Ǳ⶧���� 10001�� ����
		Arrays.fill(arr, 2, 10001, 1);
		
		//�˰���� ������ �����ٱ����� Ž���Ѵ�.
		for(int i=2; i<=Math.sqrt(10000); i++) {
			
			//�̹� ������ ���� �ǳʶڴ� -> ���������� �̵�
			if(arr[i]==0) continue; 
			
			for(int k=i+i; k<=10000; k+=i) {
				
				//����� �����
				arr[k] = 0;
			}
		}
	}//end
	
	
	//find_primNumber(M, N) -> M�� N ������ �Ҽ����� + �Ҽ� �� �ּҰ� ã�� �޼ҵ�
	public static void find_primeNumber(int M, int N, int[] arr) throws IOException {
		
		//�ּڰ��� ã�� ������ ����̱� ������ 10000���� �ʱ�ȭ
		//�ּڰ��� 0�̸�, �翬�� min�� ���� �۱� ������ ���ϴ� ����� Ȯ���� �� ����.
		//�־��� ���� �ִ������ �ʱ�ȭ�Ѵ�.
		//+) Integer.MIN_VALUE -> int���� �ּڰ�
		int min = 10000;
		
		//�Ҽ��� �����ϱ����� ����
		int sum = 0;
		
		//for�� i=M , i<=N���� �ݺ�
		for(int i=M; i<=N; i++) {
			
			//�Ҽ��迭�� �ش� �ε������� 0�� �ƴϸ�, ���� (���������ʾҴٸ� / �Ҽ���� arr[i]==1)
			if(arr[i]!=0) {
			
				sum += i;
				
				//�ּҰ� ã�� -> Math.min() ���
				min = Math.min(min, i);
			}
		}//for end
		
		//�Ҽ��� ���ٸ� -1 ���
		if(sum==0) {
			sb.append("-1");
			bw.write(sb.toString());
			bw.flush();
			bw.close();
		
		}else {
			//�޼ҵ� ������ ������
			sb.append(sum).append("\n").append(min);
			bw.write(sb.toString());
			bw.flush();
			bw.close();
		}
		
	}//end

}