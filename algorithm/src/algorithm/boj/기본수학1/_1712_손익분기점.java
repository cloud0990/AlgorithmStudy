package algorithm.boj.�⺻����1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1712_���ͺб��� {

	public static void main(String[] args) throws IOException {
		
		//����°�ü ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		//A B C �Է¹ޱ�
		long A = Long.parseLong(st.nextToken()); //�������
		long B = Long.parseLong(st.nextToken()); //�������
		long C = Long.parseLong(st.nextToken()); //�Ǹź��
		
		//�޼ҵ� ȣ�� + ������
		sb.append(break_even_point2(A,B,C));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}//main() end
	
	
	public static long break_even_point2(long A, long B, long C) {
		
		
		if(C-B<=0) {
			return -1;
		}else {
			
			return A/(C-B)+1;
			
		}
	}
	
	
	//���ͺб��� �޼ҵ�
	public static long break_even_point(long A, long B, long C) {
		
		long cnt     = 1; 
		long profit  = 0;
		long mutable = 0;
		
		
		while(true) {
			
			//Ż������
			if( A+mutable < profit ) return cnt-1; //�ؿ��� �߰������� cnt++�ϰ� �����Ա� ������ -1�ؼ� ���
			
			if( A+mutable >= profit ) {

				mutable = B * cnt;
				profit  = C * cnt;
				
				cnt++;
			}
		}//while end
		
	}//profit() end
	
}