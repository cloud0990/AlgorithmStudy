package algorithm.boj.�ݺ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2739_������ {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//�� �Է¹ޱ�
		int dan = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=9; i++) {
			
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
		}
	}
}