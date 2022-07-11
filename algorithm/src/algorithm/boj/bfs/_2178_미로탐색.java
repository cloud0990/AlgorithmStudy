package algorithm.boj.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*

- �Է°� ���� �ʿ��� ����

1. �湮ó�� �迭     : boolean
2. 4���� Ž�� �迭   : dx, dy
3. ���� �� ��ǥ ���� : nextX, nextY
4. ���� ��ǥ �迭    : now (Queue�� ���׸�Ÿ���� int[]�̾ �迭�� ����)


- �޼ҵ�
void BFS(N, M, arr)

*/

public class _2178_�̷�Ž�� {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		//�����Է�
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		//���� �迭 �Է�
		for(int i=0; i<arr.length; i++) {
			
			//�� �پ� �Է¹ޱ�
			String str = br.readLine();
			
			for(int k=0; k<arr[i].length; k++) {
				arr[i][k] = Integer.valueOf(str.charAt(k)-'0');
			}
			
		}//�����Է¿Ϸ�
		
		//�Լ� ȣ��
		BFS(N, M, arr);
		
		//������ : ���üũ �� �������� ������ ���� �ε����� ���
		System.out.print(arr[N-1][M-1]);
	}
	
	
	
	public static void BFS(int N, int M, int[][] arr) {
		
		//Queue ����
		Queue<int[]> q = new LinkedList<>();

		//4�������
		int[] x = {-1, 1, 0, 0}; //��
		int[] y = {0, 0, -1, 1}; //��
		
		//�湮���λ���
		boolean[][] visited = new boolean[N][M];
		
		//�������� �湮ó��
		visited[0][0] = true;
		
		//�������� �߰�
		q.add( new int[] {0,0} );

			
		while(!q.isEmpty()) {
		
			//������ǥ
			//q�� ù ��°�� ����� ���� �����Ѵ� : now[0] �� / now[1] ��
			int[] now = q.poll();
			
			//4���� Ž��
			for(int i=0; i<4; i++) {
				
				//1. �������� �� ��ǥ��, ���簪�� �̵��� ���� �ִ´�
				int nextX = now[0] + x[i]; //��
				int nextY = now[1] + y[i]; //��
				
				//2. �迭�� ������ ��� ��� �ߴ�
				if( nextX<0 || nextX>=N || nextY<0 || nextY>=M )
					continue;
				
				//2-1.�̹� �湮�ߴ� ���̰ų�, �� �� ���� ���� ��� �ߴ�
				if( visited[nextX][nextY]==true || arr[nextX][nextY]==0 )
					continue;
				
				//3. ���� �� ��ǥ ť�� �߰�
				q.add(new int[] {nextX, nextY});
				
				//4. �湮üũ
				visited[nextX][nextY] = true;
				
				//5. ���� �� ��ǥ��, ������ǥ�� �ε����� + 1
				arr[nextX][nextY] = arr[now[0]][now[1]] + 1;
				
			}//for end
		}//while end
	}//end
}