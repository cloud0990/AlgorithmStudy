package algorithm.boj.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*

- ����
0 �� N �� 100,000
0 �� K �� 100,000

- �̵�����
1. now - 1
2. now + 1
3. now * 2


- ����
�ʺ�켱Ž�� �� �״�� Ž���� �켱�̴�.

1. ���Ǽ���        2. ���ǿ� �����ϴ� ���� �湮 (X)

1. �ϴ� ��� �湮  2. ���Ǽ���                  (O)


������������ ���� �ð��� ���Ѵ�.

boolean������ �湮���θ� üũ�ϰ�, �湮�� ������ ���� cnt++�� �ϴ� �� �ƴ϶�,
�湮�� �� �ִ� ��� ������ �湮�ϰ� �湮�� ���� �湮������ üũ�Ѵ�.
(�湮�� ������ ���ÿ� üũ�� �� �ִ� -> int[] time)

��� �湮�ϴٰ� ����������带 �����ԵǸ�, ����湮�������� ����Ѵ�.


- �湮üũ �� ť �߰�����
1. ���� �湮������ N�� K�� ���� ���� �ִ�
2. �湮���� �ʾҴ� (�̹� �湮�� ���� �湮�����ʴ´�)


BFS�� �⺻���� ������ �Ȱ���, �̵��̳� ��쿡 ���� ���Ǹ� �߰����ָ� �ȴ�.


*/

public class _1697_���ٲ��� {
	
	static int[] time = new int[100001];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//��������
		int N = Integer.parseInt(st.nextToken());
		//��������
		int K = Integer.parseInt(st.nextToken());
	
		//������
		//���Ǽ��� : N�� K�� ���� ���� ���� Ž���� �ʿ����
		if(N==K) {
			System.out.print(0);
		}else {
			BFS(N, K);
		}
		
	}//main() end
	
	
	public static void BFS(int start, int end) {
		
		//1. ť ����
		Queue<Integer> q = new LinkedList<>();
		
		//2. �������� �湮üũ -> �湮üũ�� �ð�üũ ���ÿ� �� �� ����. 
		time[start] = 1;
		
		//3. �������� ť�� �߰�
		q.add(start);
		
		
		//�̵�
		while(!q.isEmpty()) {
			
			//1. ���������� ����
			int now = q.poll();
			
			//2. 3���� �̵��� �̸� üũ
			for(int i=0; i<3; i++) { // i = 0 1 2
				
				//�����湮���� �������� : ���ο� �ݺ����� ���� next���� 0���� �ʱ�ȭ
				int next = 0;
				
				if(i==0) {
					next = now + 1;
				}else if(i==1) {
					next = now - 1;
				}else if(i==2) {
					next = now * 2;
				}
				
				//3. �������� �� ������ ���������� ������� ��� �� �޼ҵ�����
				if(next==end) {
					
					//�̸� ����س��� ������, main()������ �޼ҵ�ȣ�⸸ �ϸ� ��
					System.out.print(time[now]);
					
					return;
				}
				
				//4. �湮���Ǽ���
				//�����湮������ ���� ���� �ְ�, �湮���� �ʾ��� ���� �湮
				//time�� next�ε������� 0�̴� = �湮���� �ʾҴ�
				// ��> �湮�ߴٸ� �湮������ �Ű����ִ�
				if( 0<=next && next<time.length && time[next]==0 ) {
					
					//4-1. �����湮�� ������ �����ο�
					time[next] = time[now] + 1;
					
					//4-2. �����湮���� ť�� �߰�
					q.add(next);
				}
				
			}//for end
			
		}//while end

	}//BFS() end
	
}