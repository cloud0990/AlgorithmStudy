package algorithm.java.reviewsort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*

�ʿ��� ��

1. �����迭
   �����迭�� ���纻�迭

2. �迭�� start��
   �迭�� end��
   �迭�� mid �� -> (start+end)/2

3. mergeSort(start, end)�� ���ڰ��� �־ �ش� �޼ҵ忡 ����
   
4. mergeSort������ left/rightBound���� �����ؼ� �����ȣ��
   mergeSort(start, mid) / mergeSort(mid+1, end)
   
   if���� ���� ���� -> start<end : out of length �� �ߴ� ���������� ����         

*/

public class �������� {
	
	static BufferedWriter bw;
	static StringBuilder  sb;
	
	static int[] arr;  //�����迭
	static int[] temp; //�����迭 ���纻
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		
		
		int n = Integer.valueOf(st.nextToken());
		
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}//�迭 �Է� �Ϸ�
		
		//Before sorting
		display(arr);
		
		mergeSort(0, arr.length-1); //= n-1
 		
		//After sorting
		display(arr);
		
	}//main() end
	
	
	public static void mergeSort(int start, int end) {
		
		//���ǿ� ������ ���� ����
		if(start<end) {
			
			//�߰��� ����
			int mid = (start+end)/2;
			
			//���� ����
			mergeSort(start, mid); //leftBound
			//������ ����
			mergeSort(mid+1, end); //rightBound
			
			//�ش� �ε����� ���� ���ؼ�, � ���Ҹ� �������� �����ϱ� ����, �� ������ ù��° �ε����� �ʱ�ȭ
			int p   = start; //���� ������ ù�� ° ���Ұ�
			int q   = mid+1; //������ ������ ù�� ° ���Ұ�
			int idx = p; //idx�ȿ� p(start)�� : temp�� ���ĵȰ� �������� index�ʿ�
			
			//�ݺ����� : start�� �׻� mid����, q(mid+1)�� �׻� end����(�̸����� ���Ǽ�����, ���� 1������ ���Ҹ���)
			while(p<=mid || q<=end) { //&&����, ����������� �� �����Ƿ� ||������ ���
				
				//���ʺ��ҿ��� ���� ������ ���
				if( q>end || (p<=mid && arr[p]<arr[q]) ) { //

					temp[idx++] = arr[p++];
				
				}else {
					temp[idx++] = arr[q++];
				}
			}//while end
			
			//temp�� ���İ��� �����迭�� ����
			for(int i=start; i<=end; i++) {
				arr[i] = temp[i];
			}
			
		}//if end
		
	}//mergeSort end
	
	public static void display(int[] arr) throws IOException {
		
		for(int i : arr) {
			sb.append(i).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}//display() end
}