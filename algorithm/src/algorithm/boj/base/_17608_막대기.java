package algorithm.boj.base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _17608_����� {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		//������� ���� �Է¹ޱ�
		int n     = Integer.valueOf(st.nextToken());
		int max   = 0; //�������� : ���������� �ؾ� max���� �������ŵ�
		int count = 0;
		//�Է¹��� n��ŭ�� �迭 ����
		int[] arr = new int[n];
		
		//�Է¹ޱ� -> ������ �� �ٷ� �Է¹��� ���� �߶� n�ȿ� �����߱⶧����, �����ִ� ��ū�� ����
		for(int i=0; i<n; i++) {
			//�����̽�(������� �� ��)�� �Է¹޴´ٸ� for�� �ۿ��� �ʱ�ȭ�ؾ�������, ���������� ���ͷ� �����ϱ⶧����
			//�� �� �Է¹��� �� ���� �ʱ�ȭ�ؾ���
			st = new StringTokenizer(br.readLine()); 
			arr[i] = Integer.parseInt(st.nextToken());
		} //�����Է¿Ϸ�
		
		for(int k=n-1; k>=0; k--) {
			
			if(max<arr[k]) {
				max = arr[k];
				count++;
			}
		}
		
		
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();//��¹��ۿ� ����� ���� ����ϰ� ���۸� ����
		bw.close();
		br.close();
	}
}