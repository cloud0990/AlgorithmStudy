package algorithm.programmers.weekly;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _������_�ݾ�_����ϱ� {

	//����°�ü ��������
	//BufferedWriter�� BufferedReader�� ���ڿ� ������̴�.
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder  sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int price = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		
		solution1(price, money, count);
		solution2(price, money, count);
		
		bw.flush();
		bw.close();
		br.close();
	}

	public static void solution1(int price, int money, int count) throws IOException {
		
		long answer1 = 0;
		
		//�ݺ��� �ε���Ȱ��
		for(int i=1; i<=count; i++) { //ex. count=4 / i= 1 2 3 4
			
			answer1 += (price*i);
		}
		
		sb.append( (money-answer1<0) ? (Math.abs(money-answer1)) : 0 + "\n");
		bw.write(sb.toString());
	}//1 end
	
	public static void solution2(int price, int money, int count) throws IOException {
		
		//��� 1
		long answer2 = 0;
		
		answer2 = (long)price*count*(count+1)/2 - money;
		
		sb.append( (money-answer2<0) ? (Math.abs(money-answer2)) : 0 + "\n");
		bw.write(sb.toString());
		
		//��� 2
		long answer3 = Math.max( (long)( Math.abs(price*count*(count+1)/2) - money ) , 0);
		
		sb.append(answer3);
		bw.write(sb.toString());
		
	}//2 end
}