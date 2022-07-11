package algorithm.boj.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/*

������ �� N (5 �� N �� 100,000)
������ �� M (1 �� M �� 200,000)
���� ���� R (1 �� R �� N)

*/


public class _24445_�ʺ�켱Ž��2 {
	
	//��������Ʈ
	static List<ArrayList<Integer>> adj_list = new ArrayList<>();
	static int N;
	static int M;
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//1. Vertex, Edge, start Vertex �Է¹ޱ�
		N = Integer.parseInt(st.nextToken()); //������ ��
		M = Integer.parseInt(st.nextToken()); //������ ��
		
		int R = Integer.parseInt(st.nextToken()); //���� ����
		
		
		for(int i=0; i<=N; i++) {
			//2-1. �Է¹��� ������ ������ŭ ArrayList����
			adj_list.add(new ArrayList<>());
		}
		
		//2. Vertex��ŭ ArrayList ���� + ���� u v�� ����� ����Ʈ ����
		for(int i=0; i<M; i++) {

			st = new StringTokenizer(br.readLine());
			
			//2-2. ���� u v �Է¹ޱ�
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			//2-3. ����� ����Ʈ �߰�
			adj_list.get(u).add(v);
			adj_list.get(v).add(u);
			
		}//���� �Է¿Ϸ�
		
		//3. �������� ����
		for(int i=1; i<=N; i++) {
			Collections.sort(adj_list.get(i), Collections.reverseOrder());
		}
		
		//�湮���� ��� �迭 ����
		int[] arr = new int[N+1];
		
		//4. BFS() ȣ��
		BFS(R, arr);
		
		//5. ������
		for(int i=1; i<=N; i++) {
			System.out.println(arr[i]);
		}
	}//main() end
	
	
	
	public static void BFS(int start, int[] arr) {
		
		//1. ť ����
		Queue<Integer> q = new LinkedList<>();
		
		//2. �������� �湮üũ
		boolean[] visited = new boolean[N+1];
		
		visited[start] = true;
		
		//3. �������� ť�� �߰�
		q.add(start);
		
		//�湮���� üũ ����
		int cnt = 1;
		
		//4. �ݺ�
		while(!q.isEmpty()) {
			
			//4-1. ť���� ��ȯ���� ���� �������� ������ ��´�
			int now = q.poll();
			
			//4-2. ���������� �湮���� ���
			arr[now] = cnt++;
			
			for(Integer i : adj_list.get(now)) {
				
				//4-3. �湮���� ���� ���, ���� ���� �ִ� ����� ���� üũ
				if(!visited[i]) {
					
					//4-2. ���� �湮���� �湮üũ
					visited[i] = true;
					
					//4-3. ���� �湮���� ť�� �߰�
					q.add(i);
				}
			}
		}//while end
	}//BFS() end
	
}