package algorithm.boj.�⺻����1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _10757_ū��AB_�������е� {

	public static void main(String[] args) throws IOException {
		
		//����°�ü ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		//BigInteger ����
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		//��� ���
		sb.append(A.add(B));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}