package algorithm.boj.bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1012_��������{
	
	//��������
	
	//1. �湮�迭
	static boolean[][] visited;
	
	//2. 4���� Ž�� ���� �迭 
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	//3. �־��� �迭
	static int[][] arr;
	
	//4. ������ ����
	static int answer;
	
	//5. ������ �Է¹��� ������
	static int M,N,K;
	
	
	public static void main(String[] args) throws IOException {
		
		//����°�ü ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//�����Է¹ޱ�
		int tc = Integer.parseInt(st.nextToken());
		
		//�����Է�
		for(int i=0; i<tc; i++) {

			st = new StringTokenizer(br.readLine());
			
			//�ݺ����� �ε����� ���ڰ����� �����Ѵ�.
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			//�Է¹��� M�� N��ŭ arr / visited �迭 �ʱ�ȭ
			arr     = new int[M][N];
			visited = new boolean[M][N];
			answer  = 0;
			
			for(int j=0; j<K; j++) {
				
				st = new StringTokenizer(br.readLine());
				
				int m = Integer.parseInt(st.nextToken());
				int n = Integer.parseInt(st.nextToken());
				
				arr[m][n] = 1;
			}//for k end
			
			
			for(int x=0; x<M; x++) {
				
				for(int y=0; y<N; y++) {
					
					//�湮�� �� �ִ� ���� �湮
					if(!visited[x][y] && arr[x][y]==1) {
						
						//BFS�޼ҵ� ȣ��
						BFS(x,y);
						//��� 1�� ����
						answer++;
					}
				}//for y end
			}//for x end
		
			
			//��¹��ۿ� ����
			bw.write(answer + "\n");
		}//tc ����
		
		//���
		bw.flush();
		bw.close();
		br.close();
	}//main() end
	
	
	
	public static void BFS(int x, int y) {
		
		//1. ť ����
		Queue<int[]> q = new LinkedList<>();
		
		//2. ������ �湮üũ
		visited[x][y] = true;
		
		//3. ������ ť�� �߰�
		q.add(new int[] {x,y});
		
		//3. ������ ���� �ʱ�ȭ
		//answer = 0;
		
		//4. �ݺ�����
		while(!q.isEmpty()) {
			
			//5. �������� ť���� ��������
			//poll() -> ť�� �� �տ��ִ� ���� ��ȯ �� �����Ѵ�.
			int[] now = q.poll();
			
			/*
			 	- peek() -> ť�� �� �տ� �ִ� �� Ȯ���ϱ�
				int nowX = q.peek()[0];
				int nowY = q.peek()[1];
				
				q.poll();
				
				peek()�� ����� �Ÿ�, ������ Ȯ�� ��, poll()�� ���� �����ؾ��Ѵ�.
				
			*/
			
			//������ �湮üũ
			visited[now[0]][now[1]] = true;
			//visited[nowX][nowY] = true;
			
			//6. �ݺ����� ���� �������� �� ����� ��ġ ���ϱ�
			for(int i=0; i<4; i++) {
				
				int nextX = now[0] + dx[i];
				int nextY = now[1] + dy[i];
				
				//int nextX = nowX + dx[i];
				//int nextY = nowY + dy[i];
				
				//7. �湮�� �� �ִ� ������ üũ
				//7-1. �迭�� ���� ���� �ִ���
				if(nextX>=0 && nextY>=0 && nextX<M && nextY<N) {
					
					//7-2. ���� �湮�����ʾ�����, �� �� �ִ� ������
					if(!visited[nextX][nextY] && arr[nextX][nextY]==1) {
						
						//8. �����湮��� �湮üũ
						visited[nextX][nextY] = true;
						
						//9. �����湮��� ť�� �߰�
						q.add(new int[] {nextX, nextY});
					}
				}
				
			}
		}//while end
		
	}//BFS() end
	
}