package algorithm.boj.reviewplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*

5 5 1
1 4
1 2
2 3
2 4
3 4

- ���
node 1 : 2 -> 4
node 2 : 1 -> 3 -> 4
node 3 : 2 -> 4
node 4 : 1 -> 2 -> 3
node 5 : 

*/

public class _��������Ʈ {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//������ ����
		int N = Integer.parseInt(st.nextToken());
		//������ ����
		int M = Integer.parseInt(st.nextToken());
		
		//��������Ʈ ��ü ����
		List<ArrayList<Integer>> adj_list = new ArrayList<>();
		
		//��������Ʈ 1base�ʱ�ȭ (Vertex�� ������ŭ)
		for(int i=0; i<=N; i++) {
			adj_list.add(new ArrayList<Integer>());
		}
				
		//����(Edge) �Է¹ޱ�
		for(int i=0; i<M; i++) {
			
			//�Է��ʱ�ȭ
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			//����⸮��Ʈ
			adj_list.get(u).add(v);
			adj_list.get(v).add(u);
		}
		
	}
}