package algorithm.boj.backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*

ũ�Ⱑ N �� N�� ü���� ���� �� N���� ���� ������ �� ���� ���� �����̴�.

���
ù° �ٿ� �� N���� ���� ������ �� ���� ���� ����� ���� ����Ѵ�.

N-Queen ��Ģ
���� �����¿�, �밢�� 4�������� �Ÿ� ���� ���� �̵��� �� �ִ� �⹰�̴�.
��, ������ ���� �����̴� ��ο� �ٸ� ���� �־�� �� �ȴ�.


1. ���� ���� �� �ִ� ��ġ (�����¿�, �밢��) -> �̵����� üũ
�迭�� ������ �ʰ����� ������ �湮�Ѵٴ� ���� �����

�� : ��-- / �� �״�� ����
�� : ��++ / �� �״�� ����
�� : �� �״�� ���� / ��--
�� : �� �״�� ���� / ��++

�밢��
��
�� : ��--/��--
�� : ��--/��++

��
�� : ��++/��--
�� : ��++/��++


2. �迭�� ��� ��Ұ� �� ä���������� -> dfs/depth==N

3. �湮�ߴ� �� ���󺹱��ؾ���


-- ���� ��ġ�� �� �ִ���/������ Ȯ���ϴ� �޼ҵ�
*/

public class _9663_N_Queen {
	
	//�������� ��ü ����
	static int[] arr; //���� ��ġ�� �迭
	static int   N;   //�迭�� ũ��
	static int   cnt = 0;
	
	public static void main(String[] args) throws IOException {
		
		//����� ��ü ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		//�����Է¹ޱ�
		N = Integer.parseInt(st.nextToken());
		
		//N��ŭ �迭 �ʱ�ȭ
		arr = new int[N];
		
		//dfs �Լ� ȣ��
		dfs(0);
		
		
		//������
		sb.append(cnt);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	public static void dfs(int depth) {
		
		//Ż�� ���� : ��� ���� ��ġ�ȴٸ� cnt ���� �� ����
		//����Ž�� ���� ��� N�� �������ٴ� ����, N������ ��� ���� ��ġ�� �Ϸ�� ���̴�.
		if(depth==N) {
			
			cnt++;
			
			return;
		}
		
		for(int i=0; i<N; i++) {
			
			//���� Ž�� ���� �࿡ �� �߰�
			arr[depth] = i;
			
			//�� �� �ִ� ���̶�� ���� �࿡ �� ��ġ
			if(possibility(depth)) { //possibility==true
				dfs(depth+1);
			}
			
		}//for end
		
	}//dfs end
	
	
	//�� �� �ִ� ������ üũ�ϴ� �޼ҵ�
	public static boolean possibility(int col) {
		
		for(int i=0; i<col; i++) {
			
			//���� ��ġ�� ���� �ִٸ� fasle
			if(arr[col]==arr[i]) return false;
			
			//���� �밢���� �������� ��� false
			if( (col-i) == Math.abs(arr[i]-arr[col]) ) return false;
			
		}//for end
		
		//���� ���ǿ� �ɸ����ʴ´ٸ� ��ġ�� �� �ִ� ��, true ��ȯ
		return true;
	}
	
}