package algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
�����ؼ� : �������� �ִ�� ���� �� �ִ� �� ���ϱ�
�� �� �ִ� �ൿ
1. ���� ������ �ֽ��� 1�� �� �� �ִ�
2. �� �ֽ��� ���ϴ¸�ŭ, ���� ���ݿ� �� �� �ִ�
3. �ƹ��͵� �� �Ѵ�
            
1. �������
�ִ밪 ���ϱ�(�ݺ��� ���鼭 max�� ����) : ���� �� �ϰ� max�� ��� ã�� �� �ִ� ���
�ּҰ��� �� ��� �ִ밪�� �� �Ǵ�
�ְ��� �������� ��Ȳ�̶�� ���� �ε��������� �۾����� �Ǵ�.

������ ���ϴ� �� : max-nArr[i] -> nArr[i]��°���� �ش� �ε������� ���� �Ŵϱ�, �� �� ����� �� ���� ����

�ϴ� count ���� �������� ������ ���ϴ� ����� �غ���
�ݺ��� �տ������� ���� �ְ� �������� �ͱ��� ����ؾ��ϴµ� �ڿ������� max�� ���Ž�Ű�� �ְ� �������� �׳� ������ ���ϴ� �ĸ� �����

+) �ݺ����� �������� ������ ����� �����ϴ� �� ���� �߿��ߴ� �� ����
���������� ����ϸ� �ְ��� �������� �� ���� ����ؾ��ϴµ� �ڿ������� max�� ���Ž�Ű�鼭 max���� ���� ���� �ε������� ���� �ٷ� �������� ���Դ�


2. ������
StringTokenizer�� ����� ���ظ��ϰ� �־ �� ������ NoSuchElement Error �߻�
-> BufferedReader�� StringTokenizer �ٽ� ����

�ݺ������� ����� ������ ������ġ�� �� ����ϰ� �����ؾ߰ڴ�
StringBuilder�� �������� ���� �ݺ��� �ȿ��� ������ �ع����� �ڲ� ���� �̻��ϰ� ���Դ�

���ݸ� ������ �ٲٸ� �ݹ� Ǯ �� �ִ� ��������, �ʹ� ���� �״�� �����ϰ� �����Ϸ��� �ϴϱ� �ð��� ���� �ɸ��� �ᱹ ó�� ������ ���� ��� ����
���� ���� Ǯ ���� �ִ��� ���� Ǯ �� �ִ� ����� ���������� ����ϸ鼭 �����ؾ߰ڴ�

Error
NumberFormatException
-> int������ ������ ū �ڷ����� Integer.parseInt()�Ϸ��� �� �� �߻��Ѵ�.
long�� int�� �ڷ����� �� ���缭 �߻��� �� ����.
*/

public class _11501_�ֽ�_�׸���˰��� {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder     sb = new StringBuilder();
		StringTokenizer st;
		
		int testCase = Integer.parseInt(br.readLine()); 
		
		
		for(int k=0; k<testCase; k++) {
			
			//testCase �� ������ �ʱ�ȭ
			long profit = 0;
			long max    = 0;
			
			int n = Integer.parseInt(br.readLine());
			long [] nArr = new long[n];
			
			
			st = new StringTokenizer(br.readLine());
	
			for(int i=0; i<n; i++) {
				nArr[i] = Integer.parseInt(st.nextToken());
			}//for i end
			
			for(int j=n-1; j>=0; j--) {
				
				if(max<nArr[j]) {
					max = nArr[j];
				}else { //max���� �ƴ� ���� ���
					
					profit = profit + (max - nArr[j]); //max-nArr[i] (�ִ밪���� �̵� ���� �Ŵϱ� ������ ���Ϸ��� ��� �ֽ� ������)
				
				}//if end
			}//for j end
			sb.append(profit + "\n");
		}//for end
		
		System.out.println(sb);
	}
}