package algorithm.boj.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
5 4
3 1
3 2
4 3
5 3
*/

public class _1325_ȿ��������ŷ_��� {
	
	//��������
	//�湮Ƚ���迭
	static int[] computer;

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer>[] list = new ArrayList[N+1];
		
		for (int i=1; i<=N; i++) {
			list[i] = new ArrayList<>();
		}
		
		
		for (int i=0; i<M; i++) {
		
			st = new StringTokenizer(br.readLine()); //�Է��ʱ�ȭ
			
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			list[u].add(v);
		}
		
		
		//�� ��ǻ��(����)���� ��ŷ�� �� �ִ� ��ǻ�� �� ī��Ʈ
		//�� ��, �ִ밪�� ���� ��ǻ�͸� ���
		computer = new int[N+1];
		
		int max = 0;
		
		
		for (int i=1; i<=N; i++) {
			
			//�湮�迭 �ʱ�ȭ
			boolean[] visited = new boolean[N + 1];
			
			DFS(i, visited, list);
		
		}
		
		
		
		//�ִ�� ��ŷ�� �� �ִ� ��ǻ�� ���� ����
		for (int i=1; i<=N; i++) {
			
			max = Math.max(max, computer[i]);
		}
		
		
		
		//���� ���� ��ǻ�͸� ��ŷ�� �� �ִ� ��ǻ�Ͱ� �������ϼ��� �ֱ� ������ for���� ���鼭 �� ��ǻ�� ��ȣ�� ���
		for (int i=1; i<=N; i++) {
			
			if (computer[i] == max) {
				
				//��¹��ۿ� ����
				bw.write(i + " ");
			}
		}
		
		//���
		bw.flush();
		bw.close();
		br.close();
	
	}//main() end
	
	
	
	public static void DFS(int start, boolean[] visited, ArrayList<Integer>[] list) {
	
		//���۳�� �湮üũ
		visited[start] = true;

		for (Integer node : list[start]) {
			
			//�湮���� ���� �迭�� �湮
			if (!visited[node]) {
			
				//�湮Ƚ�� �߰�
				computer[node]++;
			
				//����Լ� ȣ��
				DFS(node, visited, list);
			
			}//if end
		}//for end
		
	}//while end

}