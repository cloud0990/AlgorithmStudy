package algorithm.boj.reviewplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

�� ������    : start�� end�� �̵��� ������ -> �� ������ �̵��ϸ鼭 target�� ������ ���� ã�� ���� if~else�� �������� ���ϸ鼭 ������ �̵�����
�����̵������� : ����� �������Ϳ� ���������, 

���� ��� target�� 3�� ��, 0 1 2 ���� 3ĭ��ŭ �� ĭ �̵����� �� 1 2 3�̴�.
���⼭ 1 2 �� �ߺ��ǰ� 0 3�� �޶�����. �׷��� �� ĭ �� ������ �̵��� �� left++�ϸ鼭, �� ���� ���������� ����
=> sum -= nArr[left++]
3�� right�� �̵��ϸ鼭 �߰��� ���̱� ������ right++�ϸ鼭 �ش� �ε������� �����ش�
=> sum += nArr[right++]
��, ó�� 0 1 2�� �������� ���س��� ����, left++�� ���� �����տ��� ���� �ǰ�, right++�� ���� �����տ� ���ϸ� �ȴ�.

�� ������ right�� �ش� �迭�� ������ �����ϱ� ������ �ݺ��ϸ� �ȴ�.
�������Ϳ����� �� ������ while������ �ߴµ�, while�� �ݺ����ǹ����� ������ ���� �ִ�.
while(right!=arr.length) : arr.length��� �ϸ� �� ������ ���Ŷ�� �����ؼ� ó���� �̷��� ������ �������,
arr.length�� 5��� �������� ��, 5�� �ƴ� ��� ������ while���� ������ �� �ִ�.
�� �ǵ��� 5�������� 4���� ���� �Ŵϱ�, while(right<arr.legnth)��� �ϸ� �ȴ�.
ó���� ����ߴ� ���ǹ��� right�� �迭���� �� ���� ��츦 ������� ���� ���̾���.

*/

public class _2003_��������_�����̵������� {
	
	public static int twoPointer(int [] nArr, int target) {
		
		int count = 0;
		
		
		for(int i=0; i<nArr.length; i++) { //�迭�� ũ�⸸ŭ �ݺ�
			
			int left  = 0; //start
			int right = i; //end : �ݺ��� ������ �� ĭ�� ����
			int sum   = 0; 
			
			//ù ��° for������ right=0�̴�. �׷��� ó������ �� �� ���� �� �ϰ� �ǳʶڴ�.
			//ó������ k<right��� ���ǽ��� �����µ�, �׷��� ù�� ° �ݺ������� sum���� ����� ������ ���ϰ� �Ѿ������. <=
			for(int k=0; k<=right; k++) { 
				sum = sum + nArr[k]; //��������� ù�� ° �ݺ��������� nArr[0]��° ÷�� �ϳ��� �����ߴ�
			}
			
			if(sum==target) count++; //���� �������� target�� ���� ������ ����� ��(���) ī��Ʈ ����
			
			right++; //�׷����� right��ġ �� ĭ ���� -> ù��° �ݺ��������� right = 1
			
			
			while(right<nArr.length) { //ù��° �ݺ��� �������� ���� right=1�̴ϱ� 1���� �迭�������ε������� �ݺ�
				
				sum = sum - nArr[left++]; //���� �� ���鼭 right�� �̵�
				sum = sum + nArr[right++];
				
				if(sum==target) count++;
			}//while end
			
		}//for i end
		
		return count;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder   sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [] nArr = new int[n]; //�Է¹��� n��ŭ�� �迭 ����
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<nArr.length; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		
		sb.append(twoPointer(nArr, m));
		System.out.println(sb);
		
	}
}