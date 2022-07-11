package algorithm.boj.dynamicprogramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1149_RGB�Ÿ�_��� {
	
	//��������,��ü
	static int[][] arr;
	static int N;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		//����� ��ü ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		//               3 : R(0), G(1), B(2) ����
		arr = new int[N][3];
		
		//�����Է� : ���� �������ֱ� ������ ����for������ �Է¹����ʴ´�.
		for(int i=0; i<N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}//�����Է� �Ϸ�		
		
		//1�࿡ 0���� �� ������ų �ſ��� ������ 1 ����
		dfs(1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void dfs(int depth) {
		
		//depth�� N�� ��������, ��� ���� �� ����
		if(depth==N) {
			
			//N-1(��������)���� �� �������� ����ֱ⶧���� �� �߿��� ���� �ּڰ��� ã�� �����Ѵ�.
			sb.append(Math.min(Math.min(arr[N-1][0], arr[N-1][1]), arr[N-1][2]));
			
			return;
		}
		
		//Ż�� ���ǿ� �ɸ����ʾ����� �Ʒ� �ڵ� ����
		//���� ���� : ������ ���� ���������ʴ´�.
		//ù depth-1�� �� = 0 (0���� ������ R,G,B �߿��� �ּڰ��� ã�� ����)
		arr[depth][0] += Math.min(arr[depth-1][1], arr[depth-1][2]);
		arr[depth][1] += Math.min(arr[depth-1][0], arr[depth-1][2]);
		arr[depth][2] += Math.min(arr[depth-1][0], arr[depth-1][1]);
		
		//depth 1������ �� �����ؼ� ���ȣ��
		dfs(depth+1);
		
	}//dfs() end

}