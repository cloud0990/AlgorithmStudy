package algorithm.boj.dynamicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11660_������5 {

	public static void main(String[] args) throws Exception {

		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //�迭�� ũ��
		int m = Integer.parseInt(st.nextToken()); //���� ���ؾ��� ��
		
		int [][] arr  = new int[n+1][n+1];
		int [][] nArr = new int[n+1][n+1]; //������ ���� �迭

		//�迭 �Է¹ޱ�
		for(int i=1; i<arr.length; i++) { //�� ä���
			
			st = new StringTokenizer(br.readLine(), "");
			
			for(int k=1; k<arr[i].length; k++) { //�� ä���
				
				arr[i][k] = Integer.parseInt(st.nextToken());
				
				//������ �迭�� �ֱ�
				nArr[i][k] = nArr[i][k-1] + nArr[i-1][k] - nArr[i-1][k-1] + arr[i][k];
			}
		}
		
		
		
		//���� ������ ���ϱ�
		for(int i=0; i<m; i++) { //m�� ��ŭ ����
			
			st = new StringTokenizer(br.readLine(), " ");
			
			//����1
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			//����2
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			System.out.println( nArr[x2][y2] - nArr[x2][y1-1] - nArr[x1-1][y2] + nArr[x1-1][y1-1] );
		}
		
		
	
	}
}