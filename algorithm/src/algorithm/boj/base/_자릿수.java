package algorithm.boj.base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*

�����������ڷ� ���� �ڸ��� ���ϱ�

�ڸ����� ���ϰ���� �ڿ��� = n

1���ڸ���       : n % 10 
10�� �ڸ���     : n % 100 / 10
100�� �ڸ���    : n % 1000 / 100
1000�� �ڸ���   : n % 10000 / 1000
10000�� �ڸ���  : n % 100000 / 10000
100000�� �ڸ��� : n % 1000000 / 100000

*/

public class _�ڸ��� {

	public static void main(String[] args) throws IOException {

		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		
		//�Է��ʱ�ȭ
		st = new StringTokenizer(br.readLine());
		
		int b = Integer.parseInt(st.nextToken());
		
		sb.append(a * (b%10)).append("\n")
		  .append(a * (b%100/10)).append("\n")	
		  .append(a * (b/100)).append("\n")	
		  .append(a * b);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}