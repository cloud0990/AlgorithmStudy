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

public class _24444_�ʺ�켱Ž��1 {

	static int N;
	static int M;
	static List<ArrayList<Integer>> adj_list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	    	N = Integer.parseInt(st.nextToken()); //Vertex (= node)
		    M = Integer.parseInt(st.nextToken()); //Edge
		int R = Integer.parseInt(st.nextToken()); //Start Vertex
		
		//��������Ʈ N��ŭ �߰�����
		for(int i=0; i<=N; i++) {
			adj_list.add(new ArrayList<>());
		}
		
		
		//���� �Է¹ޱ�
		for(int i=0; i<M; i++) {
			
			//�Է��ʱ�ȭ
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			//����� ����Ʈ
			adj_list.get(u).add(v);
			adj_list.get(v).add(u);
		}
		
		//��������Ʈ �������� ���� -> ������������ �������� �湮
		for(int i=0; i<=N; i++) {
			Collections.sort(adj_list.get(i));
		}
		
		//�湮���� �迭 �ʱ�ȭ
		int[] arr = new int[N+1];
		
		//�޼ҵ� ȣ��
		BFS(R,arr);
		
		
		//��� ���
		for(int i=1; i<=N; i++) {
			System.out.println(arr[i]);
		}
		
	}//main() end
	
	
	
	//BFS �޼ҵ�
	public static void BFS(int R, int[] arr) {
		
		//1. ť ��ü����
		Queue<Integer> q = new LinkedList<>();
		
		//2. �湮���� �迭 ����
		boolean[] visited = new boolean[N+1];
		
		//3. �������� �湮üũ
		visited[R] = true;
		
		//4. �������� ť�� �߰�
		q.add(R);
		
		//5. �������� �湮���� ���� ����
		int cnt = 1;

		
		//�ݺ��� �ȿ��� ó���ϸ� �� -> ���������� ť�� �����ϰ� ù��° �ݺ��� ����
		//6. �������� �湮���� �迭�� �߰�
		//arr[R] = cnt;
		
		//�ݺ��� ����
		while(!q.isEmpty()) {
			
			//1. �������� ���� ����
			int now = q.poll();

			//3. �������� count �迭�� �߰�
			//���� now�� �ε����� cnt ������ �� ���
			arr[now] = cnt++;
			
			//2. now�� ����� ��������Ʈ �ϳ��� ������
			for(Integer i : adj_list.get(now)) {
				
				//2-1. �ش� �������� �湮üũ
				//�̹� �湮�� ������ �湮�����ʴ´�
				if(!visited[i]) { //= if( visited[i] == false )
					
					visited[i] = true;
				
					//2-2. �ش� �������� �湮 ��, ť�� ����
					q.add(i);
				}
			}//for end
			
			
			//now������ �湮�� �� �ƴ϶�, forEach�� �ȿ��� ���������� ����� ���������� �ش��ϴ� �ε��� �湮ó��
			//2. ���� ���� �湮üũ
			//visited[now] = true;
			
			//�湮ó���ϴ� �Ͱ� ����, now(��������)�� ����� ��������Ʈ�� ���� ť�� �߰��ؾ��Ѵ�
			//4. �������� ť�� �߰�
			//q.add(now);
			
		}//while end
		
	}//BFS(R) end
}