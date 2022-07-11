package algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
1. �������
���� �� �ִ� �ﰢ�� �� ���� �ִ����� ���Ѵ�.
�ִ����� ���ϱ����ؼ� �迭�� ó������ ���� �� �ƴ϶� �������� �����ؼ� �ִ��պ��� Ȯ���ϸ� ���� �ð� �ȿ� ã�� �� �ִ�.

���⼭�� �������� ��� ArraysŬ������ �̿��ؼ� reverseOrder()�� ����ߴ�.
�������� �� �����̱������� �������ķ� ä���� ��Ȱ��� �ð����̰� �� ����.

2. ������
�ִ밪���� ã�� �� ��������, �ڲ� ���� ������ �°� �ڵ带 ¥�� �ݷʿ��� �׻� ������.
�׻� �ߴ� �Ǽ��� �� ������ ������ Ư�� ���� ���߸� �ݷʿ��� ������ �� ����.
�̹� �������� ��쿡�� �������� ������ ������ max�� arr[0]���� �������״µ�
�ﰢ���� ���� �� ���� ���ǿ� ������ �� ��� Ʋ�ȴ�.

���� ����Ǯ ���� ��� ���� �ϳ��� Ư������ ��������, ��� ��쿡 ���밡���� �� �ֵ��� ����ؼ� �����ؾ߰ڴ�.
*/

public class _1448_�ﰢ��_�׸���˰��� {

	public static int triangle(Integer[] arr, int n) {
		
		int max = 0;
		
		for(int i=0; i<n-2; i++) {
			
			if(arr[i]<arr[i+1]+arr[i+2]) {
				max = Math.max(max, (arr[i]+arr[i+1]+arr[i+2]) );
			}
			
			//���⼭ else if�� �ع����� ���� ������ �������� �ʾ��� �� ���� �ִ밪�� ã�� �� �ƴ϶� �ٷ� max==0�����
			//�����ϱ� ������ �̷� ��Ȳ������ ���� if���� ����ؼ� �������� üũ���ִ� �� ����.
			if(max==0) { 
				max = -1;
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br  = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder    sb  = new StringBuilder(); 
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		Integer[] arr = new Integer[n];
		
		for(int i=0; i<n; i++) {
			st     = new StringTokenizer(br.readLine());
			arr[i] = Integer.valueOf(st.nextToken());
		}//�����Է¿Ϸ�

		Arrays.sort(arr, Collections.reverseOrder()); //�������� ����
		
		sb.append(triangle(arr, n));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}