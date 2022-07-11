package algorithm.boj.reviewplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _0430_ȸ�ǽǹ��� {

	public static void main(String[] args) throws IOException {

		BufferedReader  br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
	
		int [][] timeTable = new int [n][2];
		
		//timeTable �Է¹ޱ�
		for(int i=0; i<n; i++) {
			
			st = new StringTokenizer(br.readLine()); //���� �� �Է� -> stk �ʱ�ȭ
			
			timeTable[i][0] = Integer.parseInt(st.nextToken());
			timeTable[i][1] = Integer.parseInt(st.nextToken());
		}

		
		//timeTable 0��° �� ����
		Arrays.sort(timeTable, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				return o1[0]-o2[0];
			}
		}); //sort end
	
		
		
		//timeTable 1��° �� ����
		Arrays.sort(timeTable, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1]-o2[1]; //o1 < o2
			}
		}); //sort end
		
		
		int count   = 0; //�����
		
		//0���� �迭�� ����ð��� �񱳸� ���ϴϱ� �ϴ� 0���� �������� 0���� ����
		//=>for�� ù ��°������ ������ �� ��° �������� ������ ��
		int end = 0;
		
		for(int i=0; i<n; i++) {
			if(timeTable[i][0]>=end) { //ó���� 0�̴ϱ� ������ ���Ǽ����ؼ� endTime�� 0�� 1���� ���� ��
				end = timeTable[i][1]; //ù��° ȸ�ǽð��� ������ �� �� ����
				count++;
			}//if end
		}//for end
		
		System.out.println(count);
	}
}