package algorithm.boj.dynamicprogramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1149_RGB�Ÿ�_for�� {
	
	public static void main(String[] args) throws IOException {
		
		//����°�ü ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		
		//�� : N / �� : R,G,B
		int[][] arr  = new int[N][3];
	
		//2���� �迭������ ���� ��ġ�� R,G,B�� �������ֱ� ������ ����for������ �Է¹����ʴ´�.
		for(int i=0; i<N; i++) {
			
			//�Է� �ʱ�ȭ
			st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}//���� �Է¿Ϸ�
		
		for(int i=1; i<N; i++) {
			
			//���� �ٸ� ���� �߿��� �ּڰ��� ã�Ƽ� ����
			//i-1�� 0�� �ε����� �������� i(=1)�� �����Ѵ�.
			//���� : ������ �������� ��ġ���ʴ´�.
			arr[i][0] += Math.min( arr[i-1][1], arr[i-1][2] );
			arr[i][1] += Math.min( arr[i-1][0], arr[i-1][2] );
			arr[i][2] += Math.min( arr[i-1][1], arr[i-1][0] );
		}
		
		sb.append(Math.min(Math.min(arr[N-1][0], arr[N-1][1]), arr[N-1][2]));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}