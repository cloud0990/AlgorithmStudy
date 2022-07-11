package algorithm.boj.���ǹ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2525_����ð� {

	static StringBuilder sb = new StringBuilder();
	
	public static String time(int h, int m, int tl) {
		
		//m+tl�� �Ʒ��� ������ ���������ʴ´ٸ�, h�� ������, m�� timelapse�� ���� ������ ���
		m = m + tl;
		
		if(m>59) {
			
			h = h + (m/60);
			
			m = m%60;
			
			if(m==60) {
				m = 0;
			}else if(h>23) {
				h = h - 24;
			}
		}
		
		return sb.append(h).append(" ").append(m).toString();
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		
		//�ð�, �� �Է¹ޱ�
		int H = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		//�ҿ�ð� �Է¹ޱ�
		int timeLapse = Integer.parseInt(st.nextToken());
		
		bw.write(time(H,M,timeLapse));
		bw.flush();
		bw.close();
		br.close();
	}
}