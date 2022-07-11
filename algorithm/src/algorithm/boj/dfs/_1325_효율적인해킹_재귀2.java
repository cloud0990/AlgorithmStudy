package algorithm.boj.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/*
5 4
3 1
3 2
4 3
5 3
*/

public class _1325_ȿ��������ŷ_���2 {
	
	//��������
	static int[]     computer; //�湮Ƚ���迭
	static boolean[] visited;  //�湮���¹迭

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //����� ����
		int M = Integer.parseInt(st.nextToken()); //������� ���� ��
	
		
		//List�迭 ����
		List<Integer>[] list = new ArrayList[N+1];
		
		//List�迭 �ʱ�ȭ
		//�迭 ÷�ڿ� �ʱ�ȭ��Ű�� �ſ��� 1���� �����ص� ��
		for(int i=1; i<=N; i++) {
			
			list[i] = new ArrayList<Integer>();
		}
		
		//�ݺ��ε��� Ȱ���ϴ� �� �ƴ϶� �ݺ�Ƚ����ŭ �Է¹ޱ�
		//ArrayList�� ���� �Է¹ޱ�
		for(int i=0; i<M; i++) {
			
			//�Է��ʱ�ȭ
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			//�ܹ��⸮��Ʈ
			list[u].add(v);
		}//���� �Է¿Ϸ�
		
		//�湮 Ƚ�� �迭 �ʱ�ȭ
		computer = new int[N+1];
		
		//�湮�ִ�Ƚ�� ã������ ����
		int max = 0;
		
		//�ݺ����ε����� ÷�ڸ� ��� ���۳��� �����ؼ� BFS�޼ҵ� ȣ��
		for(int i=1; i<=N; i++) {
			
			//�湮���¹迭 �ʱ�ȭ -> ���۳�尡 ���� ��, �迭�ʱ�ȭ�� �� �Ǿ������� �湮�� �� �ִ� ���� �� ��
			visited = new boolean[N+1];
			
			//�ʺ�켱Ž�� �޼ҵ� ȣ��
			BFS(i, computer, list);
			
		}//���۳�� 1~N �湮�Ϸ�
		
		
		//�ִ밪 ã��
		for(int i=1; i<=N; i++) {
			
			max = Math.max(max, computer[i]);
		}
		
		
		//�ִ밪�� ��ġ�� �湮Ƚ���迭�� �ε��� ��¹��ۿ� ����
		for(int i=1; i<=N; i++) {
			
			if(max==computer[i]) {
				bw.write(i+" ");
			}
		}
		
		//���
		bw.flush();
		bw.close();
		br.close();
	}//main() end

	public static void BFS(int start, int[] computer, List<Integer>[] list) {
		
		//ť ����
		Queue<Integer> q = new LinkedList<>();
		
		//�湮üũ
		visited[start] = true;
		
		//ť�� �߰�
		q.add(start);
		
		
		//ť�� �� ������ ������� �湮
		while(!q.isEmpty()) {
			
			//������ ť���� ��������
			int now = q.poll();
			
			for(Integer node : list[now]) {
				
				//�湮���� ���� ���� �湮
				if(!visited[node]) {
					
					q.add(node);
					
					computer[node]++;
					
				}//if end
				
			}//for end
		}//while end
		
	}//BFS() end
	
}