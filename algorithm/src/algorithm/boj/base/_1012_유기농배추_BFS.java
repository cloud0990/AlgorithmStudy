package algorithm.boj.base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1012_��������_BFS {

	//��������
	//1. �湮���¹迭
	static boolean[][] visited;
	//2. ����Ž�� dx, dy
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	//3. �����迭
	static int[][] arr;
	
	//4. ��, ��
	static int M, N;
	
	public static void main(String[] args) throws IOException {
		
		//0. ����°�ü ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//1. �׽�Ʈ���̽� �Է¹ޱ�
		int tc = Integer.parseInt(st.nextToken());
		
		//2. �׽�Ʈ���̽� �ݺ� ����
		for(int i=0; i<tc; i++) {
			
			//�Է��ʱ�ȭ
			st = new StringTokenizer(br.readLine());
			
			//3. ��, ��, ��������� ��ġ �Է¹ޱ�
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			//4. �����迭/�湮�迭 �ʱ�ȭ (���⼭ �ʱ�ȭ �ؾ� ���� �׽�Ʈ���̽� �� ���ο� ������ ���۰���)
			arr     = new int[M][N];
			visited = new boolean[M][N];
			int answer = 0;
			
			//5. �����Է¹ޱ�
			for(int j=0; j<K; j++) {
				
				//�Է��ʱ�ȭ
				st = new StringTokenizer(br.readLine());
				
				int m = Integer.parseInt(st.nextToken());
				int n = Integer.parseInt(st.nextToken());
				
				arr[m][n] = 1;
			}//�����Է� �Ϸ�
			
			//6. �־��� ��� ����ŭ �ݺ��ϸ鼭 �ʺ�켱Ž�� (�޼ҵ� ȣ��)
			for(int x=0; x<M; x++) {
				for(int y=0; y<N; y++) {
					//���� �湮���� ���� ���۳���̰ų�, �� �� �ִ� ���̸� �湮
					if(!visited[x][y] && arr[x][y]==1) {

						BFS(x, y); //�迭�� �ε����� ���۳��� ����
						//6-1. Ž���� �� �ִ� ���������ġ�� ���� ī��Ʈ ����
						answer++;
					}
				}
			}//�ʺ�켱Ž�� �Ϸ�
			
			//7. �׽�Ʈ���̽� �� ��Ʈ ���� ��, ��¹��ۿ� �������
			bw.write(answer + "\n");
		}//�׽�Ʈ���̽� ����
		
		
		//��¹��� ����
		bw.flush();
		bw.close();
		br.close();
		
	}//main() end

	
	public static void BFS(int x, int y) {
		
		//1. ť ����
		Queue<int[]> q = new LinkedList<>();
		
		//2. ���۳�� �湮üũ
		visited[x][y] = true;
		
		//3. ���۳�� ť�� �߰�
		q.add(new int[] {x,y});
		
		//4. ť�� �� ������ �ݺ�
		while(!q.isEmpty()) {
			
			//4-1. ������ ť���� ��������
			int nowX = q.peek()[0];
			int nowY = q.peek()[1];
			
			//+) ť ����
			q.poll();
			
			//4-2. ������ �湮üũ
			visited[nowX][nowY] = true;
			
			//5. ���tŽ��
			for(int i=0; i<4; i++) {
				
				//5-1. �����湮��� üũ�ϱ�
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				//6. ���Ǽ��� �� �����湮��� Ž��
				//6-1. �����湮����� ��ġ�� �迭���� ���� �ִ°�
				if(nextX>=0 && nextY>=0 && nextX<M && nextY<N) {
					//6-2. �湮�������� ���ΰ�, Ž���� �� �ִ� ���ΰ�
					if(!visited[nextX][nextY] && arr[nextX][nextY]==1) {
						
						//7. �����湮��� �湮üũ
						visited[nextX][nextY] = true;	
						
						//7-1. �����湮��� ť�� �߰�
						q.add(new int[] {nextX, nextY});
					}
				}
				
			}//for end : ����Ž�� ����
			
		}//while end
	}//BFS() end
}