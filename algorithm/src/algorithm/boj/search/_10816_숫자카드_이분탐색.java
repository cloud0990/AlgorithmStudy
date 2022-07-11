package algorithm.boj.search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*

�������
�Ʊ� Ǯ���� �̺�Ž�� ������ ���������, ���� ���ڰ� ���´ٸ� ���� ��ġ�� append�ؾ��Ѵ�.
+) ���� ����Ž���� �ߺ��������� ������ ������ �����Ѵ�.

1. �ߺ������� count�ؾ��ϴϱ� target�� ��ġ�ϴ��� ��� Ž���ϴ� ���� ã��
2. �ð��ʰ�

end������ n-1�� ��⶧����, start�� �迭 ������ ���� �Ϸ��� ó���� while�ݺ� �������� start<=end�� ���
�ٵ� end������ n�� �������, start<end�ϸ� start�� �ᱹ �迭�� ������ �� �� �����鼭 end���� ���� ������ �ݺ��ϴ� �Ŵϱ�
��ɼ��� �Ϸ� �� �ݺ����� Ż���� �� �ִ�.

while �ݺ��������� start<end ���� ��, end���� �״�� n-1�� �ϴϱ�, �迭�� ������ �ε����� üũ�������ߴ�.


*/

public class _10816_����ī��_�̺�Ž�� {

	
	//���� �̺�Ž��
	public static int leftBound(int target) {
		
		int start = 0;
		int end   = n; //ex) n=10
		
		while(start<end) { //start�� end���� ���� ���� �ݺ�
			
			int mid = (start+end)/2;
			
			if(arr[mid]==target) {
				end = mid; //end���� mid�� ���̱�
			}else if(arr[mid]>target) {
				end = mid;
			}else if(arr[mid]<target) {
				start = mid+1;
			}
		}//while end
		return start;
	}
	
	//������ �̺�Ž��
	public static int rightBound(int target) {
		
		int start = 0;
		int end   = n; //�ε������ ������ -1 �߾��µ� -1�ϸ� �� ��
		
		while(start<end) {
			
			int mid = (start+end)/2;
			
			if(arr[mid]<=target) { //= arr[mid]==target / arr[mid]<target
				start = mid+1;
			}else if(arr[mid]>target) {
				end = mid;
			}
		}//while end
		return end;
	}
	
	
	public static int count(int target) {
	
		int start = leftBound(target);
		int end   = rightBound(target);
		
		return end-start;
	}
	
	
	//static ���� ���� -> Ŭ���� �� ��𼭵� ���� ���� �ٷ� ��� ���� -> 1ȸ�� ����
	static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder  sb  = new StringBuilder();
	static int n;
	static int t;
	static int [] arr;
	
	
	
	public static void main(String[] args) throws IOException{
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n   = Integer.parseInt(st.nextToken());
		arr = new int[n];
		
		//StringTokenizer �ʱ�ȭ
		st = new StringTokenizer(br.readLine());
		//arr �Է¹ޱ�
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//�������� ����
		Arrays.sort(arr);
		
		//StringTokenizer �ʱ�ȭ
		st = new StringTokenizer(br.readLine());

		//���� ���� ī�� ���� �Է¹ޱ�
		t  = Integer.parseInt(st.nextToken());
		
		//StringTokenizer �ʱ�ȭ
		st = new StringTokenizer(br.readLine());
		
		//���� ���� ī�� ������ŭ, target�Է¹޾Ƽ� �ݺ�1ȸ���� count()�� ���ڰ����� �־ ����
		while( t-- > 0 ) { 
			int target = Integer.parseInt(st.nextToken());
			sb.append(count(target)).append(" ");
		}
		
		out.write(sb.toString());
		out.flush();
		br.close();
		out.close();
	}
}