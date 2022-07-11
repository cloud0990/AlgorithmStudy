package algorithm.boj.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

/*
���Ʈ���� �˰���

�ִ��� ���� ����� ���� ��� Ž���Ѵ�. 
-> ������ ���ڹ��������� ũ�� �ʾƼ� ���� for���� 2�� ������ �ð����⵵�� �־��� ������ ���� ���� �Ŷ�� �Ǵ�

ù�� ° �ݺ����� �� ������� �����Կ�, �ι� ° �ݺ����� ������� Ű�� ���� Ž���Ѵ�.

������ ������ x<p && y<q �� ��´�.

+) ����, i�� k�� ���ٸ� ���� ����̱� ������ ���� �ʿ䰡 ���� : continue;


*break vs continue

break : Ư�� ������ �������� ��, �ݺ����� ��� �� ����ϸ� ����

�ڽ��� ���Ե� ���� ����� �ݺ����� ����Ż���Ѵ�. (���� ���� ��� �������� �ʴ´�)
if���� ���ǹ��̴�. if ������ break�� �ߴٸ�, if�� ���ΰ� �ִ� ���� ����� �ݺ����� Ż���� ���̴�.

continue : ��ü �ݺ� �߿��� Ư�� ������ �����ϴ� ��츦 �����ϰ���� �� ����ϸ� ����

�ݺ����� ������ �̵��Ͽ� ���� �ݺ����� �Ѿ��. break�� �ٸ��� �ݺ��� ��ü�� ������ʰ�
���� �ݺ��� ��� ������ �� �ִ�.

-> for���� ��� ���������� �̵�
    while, do-while���� ��� ���ǽ����� �̵�


continue����

for(int i=0; i<10; i++){
	
	if(i%2==0){ //¦����
		continue;
	}
	
	System.out.println(i);
	
} -> ���ǿ� �������� �� �̵��Ǵ� continue�� ��ġ

��� : 1 3 5 7 9 -> if�� ���ǿ� �����ϸ� �ݺ����� ������ �̵��ϱ� ������ �ش簪�� ��µ����ʴ´�
*/

public class _7568_��ġ {
	
	//�����ڿ�
	static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder   sb = new StringBuilder();
	
	
	public static String weightRank(int n, int[][] arr) {
		
		for(int i=0; i<n; i++) {
			
			int rank = 1;
			
			for(int k=0; k<n; k++) {
				
				//�ش������� �����ϴ� ��츦 �����ϰ����
				//break�� ����ϰԵǸ� for k�ݺ����� ����� ������ ���ϴ� ����� Ȯ���� �� ����
				if(i==k) continue; 
				
				if( (arr[i][0]<arr[k][0]) && (arr[i][1]<arr[k][1]) ) {
					
					rank++;
				}
			} //continue
			sb.append(rank).append(" ");
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		
		int[][] arr = new int[n][2];
		
		
		for(int i=0; i<arr.length; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int k=0; k<arr[i].length; k++) {
				arr[i][k] = Integer.parseInt(st.nextToken());
			}
		}
		
		bw.write(weightRank(n, arr));
		bw.flush();
		bw.close();
		br.close();
	}
}