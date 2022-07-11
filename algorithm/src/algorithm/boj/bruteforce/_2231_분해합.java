package algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*

�ڿ��� N (1 �� N �� 1,000,000)

- Edge Case : int�� (�����ص� 20�� �� ���� ��)

������ : N + N�� �̷�� �� �ڸ����� ��

� �ڿ��� M�� �������� N�� ���, M�� N�� �����ڶ�� �Ѵ�.
ex)
245�� ������ = 256(245+2+4+5)
256�� �����ڴ� 245�̴�.

���� : M�� �־����� ��, N�� ���� ���� �����ڸ� ���Ͻÿ�
��, �����ڰ� ���� ��� 0�� ����Ѵ�.

1. ���� ���� �����ڴ� ��� ����
2. �����ڰ� ���� ���� ��� ��
  -> �� �ڸ����� ���� ���� �� ���� 1�� �ڸ������� ��?

-----------------------------------

3�ڸ���(N)�� �Է¹޾Ҵٰ� �����Ѵ�.
N + (N%1000/100) + (N%100/10) + (N%10)

������ �� ���� ���� N�� �ڸ����� �˰��ִٴ� ���� �Ͽ� ����� �� �ִ�.
N�� ���������� �����ʰ� ���ڿ��� �Է¹޴´ٸ�?
�ٵ� ������ �ؾ��ϴϱ� String ���ٴ� char�� ����ؼ� -48�ؼ� ������ �����ϸ�?
StringBuilder�� �߰��� �� �ڸ����� toCharArray()�� ���� char[] �� ��ȸ�Ѵ�.

�־��� M�� ������ ���ϱ�
M = M + (M�� �� �ڸ����� ��)
---------------------------------------------
toCharArray()�� ����Ѵٸ� �ʿ���� ��		
		
for(int i=0; i<M.length(); i++) {
	//�ڸ��� ���ϱ�
	N = M.substring(0, i);
	sb.append(N);
}//for end
//������ ���� ����
int sum = 0;

//�Է¹��� M�� �� �ڸ����� char[]�� ��ȸ ��, �ڸ��� ����
for(char m : M.toCharArray()) {
	sum -= m-'0';
}

int sum = mChar[0]-48; //������ ���� ����

System.out.println(sum);

*/

public class _2231_������ {

	public static void main(String[] args) throws IOException {
		
		//����°�ü ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		//���� �Է�
		int M = Integer.parseInt(st.nextToken());
		
		//�����ڸ� ���� �� ���� ��� ��� ��, �ٷ� ����
		if(M<10) {
			sb.append(0);
			bw.write(sb.toString());
			bw.flush();
			return;
		}
		
		int answer = solution(M);
		
		System.out.println(answer);
		
		
	}
	
	public static int solution(int M) {
		
		//String mStr = Integer.toString(M);
		String mStr = String.valueOf(M);
		
		//M�� char[] ����
		char[] mChar = mStr.toCharArray();
		
		int sum = 0;
		
		//char[] �ʱ�ȭ
		for(int i=0; i<mChar.length; i++) {
			
			sum -= (mChar[i]-48);
		}
		
		//M�� ������ ����
		int N = Integer.valueOf(M) + sum + (mChar[0]-48);
		
		
		//���� ���� ������ ���ϱ�
		
		
		
		
		
		
		
		
		
		
		
		
		return N;
	}
}