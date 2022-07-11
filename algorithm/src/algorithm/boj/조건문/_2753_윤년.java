package algorithm.boj.���ǹ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
main�޼ҵ�� �����Ű�� �޼ҵ�ϱ� �ϴ� ���� ���� �Ѱܹ޴� ������ �� �ִ� �� �����ϰ�, ���θ޼ҵ忡�� �Է°�ü �����ؼ� �Ѱ��ְ�, ������

if~else ���ǹ�
&&������, ||������
*/

public class _2753_���� {

	static StringBuilder sb = new StringBuilder();
	
	public static String yunYear(int year) {
		
		if(year%4==0 && (year%100!=0 || year%400==0) ) {
			sb.append("1");
		}else {
			sb.append("0");
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int year = Integer.parseInt(st.nextToken());
		
		bw.write(yunYear(year));
		bw.flush();
		bw.close();
		br.close();
	}
}