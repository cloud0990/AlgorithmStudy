package algorithm.boj.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

/*

��������(1)���� �湮�� �� �ִ� ���������� ���� ���ϱ�

*/

public class _2606_���̷���_���� {

	//��������
	//1. ��������Ʈ
	static List<ArrayList<Integer>> adj_list = new ArrayList<>();
	//2. ������ ��
	static int N;
	//3. �������� ���� ��
	static int M;

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//1. �����Է�
		//������ �� �Է¹ޱ�
		N = Integer.parseInt(st.nextToken()); 
		
		//1-1. �Է��ʱ�ȭ + �������� ���� �� �Է¹ޱ�
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		
		//1-2. �־��� �������� ���� ����
		int start = 1;
		
		//2. ������ ����ŭ ArrayList ����
		for(int i=0; i<=N; i++) {
			adj_list.add(new ArrayList<Integer>());
		}
		
		//3. ������������ �� �Է¹ޱ�
		for(int i=0; i<M; i++) {
			
			st = new StringTokenizer(br.readLine()); //�Է� �ʱ�ȭ
			
			//�������� �Է¹ޱ�
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			//����⸮��Ʈ ����
			adj_list.get(u).add(v);
			adj_list.get(v).add(u);
		}// ���� �Է¿Ϸ�
		
		System.out.println(DFS(start));
		
	}//main() end
	

	public static int DFS(int start) {
		
		//���� ����
		Stack<Integer> stack = new Stack<>();
		
		boolean[] visited = new boolean[N+1];
		
		//�������� �湮ó��
		visited[start] = true;
		
		//�������� ���ÿ� �߰�
		stack.push(start);
		
		int answer = 0;
		
		while(!stack.isEmpty()) {
			
			//�������� stack���� ��������
			int now = stack.pop();
			
			for(Integer node : adj_list.get(now)) {
				
				//�湮�������� ��쿡�� �湮
				if(!visited[node]) {
					
					//�湮ó��
					visited[node] = true;
					
					//�����湮���� ���ÿ� �߰�
					stack.push(node);
					
					//�湮Ƚ�� ī��Ʈ
					answer++;
				}//if end
				
			}//for end
		}//while end
		
		return answer;
	}//DFS() end
}