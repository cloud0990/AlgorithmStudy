package algorithm.programmers.levelone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _�Ҽ�ã�� {

	static int[] arr = new int[1000001];
	static int n;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		Arrays.fill(arr, 1);
		
		int answer = 0 ;
		
		//�Ҽ�ã�� �޼ҵ� ȣ��
		primeNumberSeive();
		
		//�Ҽ�ī��Ʈ �޼ҵ� ȣ�� -> ������
		count_primeNumber(answer);
		
	}
	
	public static void primeNumberSeive() {
		
		for(int i=2; i<=Math.sqrt(1000000); i++) {
			
			if(arr[i]==0) continue;
			
			for(int k=i+i; k<=1000000; k+=i) {
				
				arr[k] = 0;
			}
		}
	}//end
	
	
	public static void count_primeNumber(int answer) {
		
		
		for(int i=2; i<=n; i++) {
			
			if(arr[i]==1) answer++;
		}
		
		System.out.println(answer);
	}//end

}