package algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*

1. ����
�Է¹��� ���� N�� 3������ ����, M���� �۰ų� ���� �� �߿��� max�� ���ϱ�

2. �������
���� �� �ִ� ��� ����� �� Ž��
out of length�� ������ �ʵ���, �ݺ����� �ε������� ����

3. �ʱ����
for���� 3�� ������ 0 1 2���� Ž���� �� �ֵ��� ��������
3���� ���� M�� �����ʴ� ������ �����ϸ�, 3���� �� �� max�� �����ϴ� ���� -> max ���
�ε��� ����ϱ� ���ϵ��� ���� ũ�⺸�� +1��ŭ�� �������� ����


*/

public class _2798_���� {

	public static void main(String[] args) throws IOException{
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //n���� ��
		int m = Integer.parseInt(st.nextToken()); //�� ���� �տ� ���� ����
		
		int [] nArr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		//�� �Է¹ޱ�
		for(int i=0; i<nArr.length; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		
		
		//�ݺ��� ���� �����ϱ�
		//�� ���� ���� ���� �� �ִ� ����� �� ��� Ȯ���ϱ� ���ؼ� for�� 3��
		for(int i=0; i<nArr.length-2; i++) {
			
			for(int k=i+1; k<nArr.length-1; k++) {
				
				for(int j=k+1; j<nArr.length; j++) {
					
					int sum = 0;
					
					sum = nArr[i]+nArr[k]+nArr[j];
					
					if(sum<=m){
						if(max<sum) {
							max = sum;
						}
					}
				}//for j end
			}//for k end
		}//for i end
		
		System.out.println(max);
		
	}
}