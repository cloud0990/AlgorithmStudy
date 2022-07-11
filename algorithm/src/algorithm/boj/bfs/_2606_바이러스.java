package algorithm.boj.bfs;

import java.io.*;
import java.util.*;

/*

��������(1)���� �湮�� �� �ִ� ���������� ���� ���ϱ�

*/

public class _2606_���̷��� {

	//��������
	//1. ��������Ʈ
	static List<ArrayList<Integer>> adj_list = new ArrayList<>();
	//2. ������ ��
	static int N;
	//3. �������� ���� ��
	static int M;
	//4. ��°�ü
	static StringBuilder   sb = new StringBuilder();
	static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

	
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
		
		
		//4. ������
		bw.write(BFS(start).toString());
		bw.flush();
		bw.close();
		br.close();
		
	}//main() end
	
	
	//BFS�޼ҵ� ����
	public static String BFS(int start) {
		
		//1. ť ����
		Queue<Integer> q = new LinkedList<>();
		
		//2. �湮���¹迭
		boolean[] visited = new boolean[N+1];
		
		//2-1. �������� �湮���� üũ (��������=1)
		visited[start] = true;
		
		//3. �������� ť�� �߰�
		q.add(start);
		
		//4. �湮Ƚ�� ���� ����
		int answer = 0;
		
		//5. �ݺ�
		while(!q.isEmpty()) {
			
			//5-1. ������ġ ť���� ��������
			int now = q.poll();
			
			//5-2. start�� ����� ��������Ʈ ���� �ϳ��� �����鼭 �湮�� �� �ִ� �������� üũ
			for(Integer i : adj_list.get(now)) {
				
				//6. ����) �湮���� �ʾҴٸ�
				if(!visited[i]) {
	
					//6-1. �����湮���� �湮üũ
					visited[i] = true;
					
					//6-2. �����湮���� ť�� �߰�
					q.add(i);
					
					//6-3. �湮Ƚ�� üũ
					answer++;
				}
				
			}//for end
		}//while end

		//��� StringBuilder�� �߰�
		sb.append(answer);
		
		//7. cnt return
		return sb.toString();
		
	}//BFS() end

}