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
1. �ߺ������� count�ؾ��ϴϱ� target�� ��ġ�ϴ��� ��� Ž���ϴ� ���� ã��
2. �ð��ʰ�

*/

public class _10816_����ī��_�̺�Ž��_�ð��ʰ� {

	
	public static int binarySearch(int [] arr, int target) {
		
		int start = 0;
		int end   = arr.length-1;
		int mid   = 0;
		int count = 0;
		
		while(start<=end) {
			
			mid = (start+end)/2;
			
			if(arr[mid]==target) {
				
				//for�� ������ �ð��ʰ� �ߴ� ��
				for(int i=0; i<arr.length; i++) {
					if(arr[i]==arr[mid]) count++;
				}
				
				break;
			
			}else if(arr[mid]<target) {
				start = mid+1;
			}else if(arr[mid]>target) {
				end = mid-1;
			}
		}//while end
		return count;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int [] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//Arrays.sort(arr);
		
		st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		
		//-------------[�����Է¿Ϸ�]--------------
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<t; i++) { //for�� �ȿ��� binary�޼ҵ� ȣ���ؾ� target�� t��ŭ ����
			int target = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(arr, target)).append(" ");
		}
		
		out.write(sb.toString());
		out.flush();
		
		br.close();
		out.close();
	}
}