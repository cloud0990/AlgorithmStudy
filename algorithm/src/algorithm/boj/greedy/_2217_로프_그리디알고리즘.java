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
�ݵ�� �־��� ��� ������ ����� �ʿ䰡 ����.
����, 10 10 6 �̷��� �ִ� ���, 6�� ������ ���Խ����� ������ �� ū �ִ��߷����� ���� �� �ִ�.

�ֽĹ����� ����ϰ� ���������س��� ���¿��� ���������� ���ϸ� ����� ��������.
�׸���˰����� �ٽ��� ���� �̵��� �� �� �ִٸ� ������ ���ص� �����ϴ� ���̱� ������,
���������� �ؼ� ó������ �� �ʿ䰡 ���� ���̴�. ������ �׸���˰����� �� Ǯ�Եȴٸ� �ִ밪�� ���� ���߰ڴ�.
��� ��Ұ� ������ �ִ��߷��� �����ϴ� �� �ƴ϶�, �ִ��߷��� �� ���� �ִٸ�, �ּҰ��̳� �� ���� ������ ������ �ȴ�.
�ִ밪���� �񱳸� ������ ��, i+1�� ������, �ߺ����� ���ٰ� �������� ��, ���ڰ� �۾��� ����, ���ؾ��� ������ ������ �������⶧���̴�.
�ּҰ��� ������� ����, �ּҰ����� ���� ũ���� �ּҰ��� �ִ��߷��� ���� �����ϱ⶧���� �ش� ������ �����ؾ��Ѵ�.



2. ������
�˰��� �з������� �� �˰����� ���� �� �̿��� ���ֵ��� ����ؾ��ϴµ� Ȯ�� �س��� Ȱ���� ������ ���� ���� ����ϱ�����ϸ� ���Ѵ�.
�̹� ���� Ǯ�鼭 Ȯ���� ���� ����, ������ ������������ ������ Ǫ�ϱ� �ݷʰ� ����� �����������ϰ� ��� �ݷʿ� �°� �ڵ带 �����ϴϱ�
�� �ٸ� �ݷʰ� ������ �� Ʋ���� �� �ٽ� �ݷʿ� �°� �ڵ带 �����ߴ�.
���� �׷��� Ǯ�� ������, �� ���� ���� Ǯ�鼭 �޼ҵ� ȣ���ؼ� ����� ���ϴ� �Ŷ� boolean�� �޼ҵ��� ���ϰ����� ����� �����ϴ� �� �����غ��� ���Ҵ�.
�׸��� ������ ������ ���� ��� �����ؾ����� ���� ���� �� �Դµ� ������ Ʋ������ �̷� ������ Ǯ�� ���� ������ ������ �ƴٴ� �� Ȯ�� �� �� �ִ� ��������
�׸���˰����� ��κ� ������ �ؼ� �ִ밪���� Ž���ϴ� �� ����. ������ �׸���˰����� �� Ǯ�� �ȴٸ� ���� �� �ִ밪�� ���� Ž���ϴ� ����� ����غ��߰ڴ�.
*/


public class _2217_����_�׸���˰��� {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder   sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		Integer[] arr = new Integer[n];
		
		for(int i=0; i<n; i++) {
			st     = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, Collections.reverseOrder()); //�������� ����
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if( max < arr[i]*(i+1) ) {
				max = arr[i]*(i+1);
			}
		}
		
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}