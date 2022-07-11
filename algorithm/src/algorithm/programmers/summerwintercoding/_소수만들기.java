package algorithm.programmers.summerwintercoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*

ó������ �Ҽ������� ã�⸦ �ϳ��� �޼ҵ忡�� ��� ����������,
�Ҽ��� ã������ �޼ҵ带 ȣ���ϸ� ȣ���� ������ ��ü �Ҽ��� �ٽ� ã�� ���ʿ��� �ݺ����� ���ٴ� ���� �˰ԵǾ���.
�׷��� ��ü�Ҽ��迭�� 1ȸ�� �����ϰ�, �̹� ������� �Ҽ��� �迭�� �������� �񱳸� �� �� �ְ� ��ɺ��� ���ȭ�ߴ�.

*/

public class _�Ҽ������ {

	//�Ҽ��迭 ��������
	static int[] prime_arr;
	
	public static void main(String[] args) throws IOException {
		
		//1. �Ҽ� �迭 ���� 
		prime_arr = new int[10001];
		
		//1-1. 1�� �ʱ�ȭ
		Arrays.fill(prime_arr, 1);
		
		
		//2. ����� ��ü ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		
		//3. �����Է�
		//3-1. �迭�� ũ�� �Է¹ޱ�
		int N = Integer.parseInt(st.nextToken());
		
		//3-2. �迭 ����
		int[] nums = new int[N];
		
		//3-3. �迭 �ʱ�ȭ
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			nums[i] = Integer.valueOf(st.nextToken());
		}//�����Է� �Ϸ�
		
		//���� ���
		int cnt = 0;
		
		//�Ҽ�ã�� �޼ҵ� ȣ�� -> �Ҽ��� �� ���� ã�Ƴ��� ã���� �Ҽ��� �� ���� ���� �Ҽ����θ� �Ǵ��Ѵ�.
		primeNumberSeive(prime_arr);
		
		//4. 3�� ����� �� ���ؼ� make_primeNo ȣ��
		for(int i=0; i<nums.length-2; i++) {
			for(int k=i+1; k<nums.length-1; k++) {
				for(int j=k+1; j<nums.length; j++) {
					
					//sum������ �ݺ��� 1ȸ���� �ʱ�ȭ�Ѵ�.
					int sum = nums[i] + nums[k] + nums[j];
					
					//�Ҽ������ �޼ҵ��� ��ȯ���� true��, ī��Ʈ ����
					if(make_primeNo(sum)) cnt++;
					
				}//j end
			}//k end
		}//for i end
		
		
		//5. ������
		sb.append(cnt);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}//main() end
	
	
	//�Ҽ�ã�� �޼ҵ�
	public static void primeNumberSeive(int[] prime_arr) {
		
		//ã�� ���� �����ٱ����� �ݺ��Ѵ�.
		for(int i=2; i<=Math.sqrt(10000); i++) {
			
			//�̹� ������ ���� �ǳʶڴ�.
			if(prime_arr[i] == 0) continue;
			
			//2�� ����� �����.
			for(int k=i+i; k<=10000; k+=i) {
				
				prime_arr[k] = 0;
			}
		}
	}//primeNumberSeive() end
	
	
	//�Ҽ������ cnt �޼ҵ�
	public static boolean make_primeNo(int sum) {
		
		//���ڰ����� ���޵� �������� �Ҽ��̸� true ��ȯ
		for(int i=2; i<prime_arr.length; i++) {
			
			//prime_arr�� ���� ���������ʾҴٸ� �Ҽ��̴�.
			if(prime_arr[i]!=0) {
				//���� �ٸ� ���� ��������, ���� ����� �������� �� �ֱ� ������ üũ�� �Ҽ��� �������ʴ´�.
				//prime_arr�� �ε������� �Ҽ��� ��쿡�� �����⶧���� �ݺ����� i������ prime_arr�� �ε����� ����.
				if(i==sum) return true;
			}
		}
		return false;	
	}//make_primeNo() end
	
}