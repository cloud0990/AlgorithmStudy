package algorithm.boj.�ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1110_���ϱ����Ŭ {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		//2�ڸ��� �ڿ��� �Է�
		int n = Integer.parseInt(st.nextToken());
	
		//�ʱⰪ ����
		int cycle = n;
		int im    = 0;
		
		//���(����Ŭ ��)
		int count = 0;
		
		while(true) {
			
			//10�� �ڸ��� + 1�� �ڸ���
			im = (cycle%100/10) + (cycle%10);
			
			//������ ���� ����� 1�� �ڸ����� 10�� �ڸ����� �����
			cycle = ((cycle%10)*10) + (im%10);
			
			count++;
			
			//Ż������
			if(cycle==n) break;
			
		}//while end
		
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}