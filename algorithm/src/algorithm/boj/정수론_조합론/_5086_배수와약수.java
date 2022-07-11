package algorithm.boj.������_���շ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _5086_����;�� {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder   sb = new StringBuilder();
		StringTokenizer st;
		
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			//Ż�������� ������, A�� B�� �Է¹ް� ���ǹ� ���� ���� �ٷ� Ȯ������� �ʿ���� �ڵ������ �����ʴ´�.
			//������ �߻��ߴ� ������, 0������ ������/�� ������ �� �Ǳ� �����̴�.
			if(A==0 && B==0) break;
			
			//A�� B�� ����� ���
			if(B%A==0) {
				sb.append("factor").append("\n");
			
			//A�� B�� ����� ���
			}else if(A%B==0) {
				sb.append("multiple").append("\n");
			
			//�� �� �ƴ� ���
			}else {
				sb.append("neither").append("\n");
			}
			
			
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}