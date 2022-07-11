package algorithm.boj.�ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _8393_�� {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		
		//������
		int answer = 0;
		
		for(int i=n; i>0; i--) {
			
			answer = i;
			sb.append(answer).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}