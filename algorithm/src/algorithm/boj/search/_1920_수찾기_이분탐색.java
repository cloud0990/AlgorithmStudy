package algorithm.boj.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
�̺�Ž��
�迭�� ������ ���¿��� ����� �� �ִ�. -> ����ϱ����ؼ��� �ݵ�� �����ؾ��Ѵ�.
�������Ϳ� ����ϰ� ���������� ���������� target�� �����ϰ� �̵���Ų��.
�߰��� ���� ó������ ������ �̵���Ű�� �� �ƴ϶� mid���� �����ؼ� mid�� �������� target�� ã�� �� ���ǿ� �°�
mid+1��ŭ ������Ű�� mid-1��ŭ ���ҽ�Ų��.
*/

public class _1920_��ã��_�̺�Ž�� {

	public static boolean binarySearch(int [] nArr, int target) {
		
		int start = 0;
		int end   = nArr.length-1;
		int mid   = 0;
		
		while(start<=end) {
			
			mid = (start+end)/2;
			
			if(nArr[mid]==target) {
				return true;
			}else if(nArr[mid]<target) {
				start = mid+1;
			}else if(nArr[mid]>target) {
				end = mid-1;
			}
		}//while end
		
		return false;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int [] nArr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
	
		Arrays.sort(nArr);
		
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		while(0<t--) {
			
			int target = Integer.parseInt(st.nextToken());
			
			if(binarySearch(nArr, target)) {
				sb.append(1);
			}else {
				sb.append(0);
			}
			
			sb.append("\n");
			
		}//while end
		
		System.out.println(sb);
		
	}
}