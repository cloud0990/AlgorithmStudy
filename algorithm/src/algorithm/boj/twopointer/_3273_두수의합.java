package algorithm.boj.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*

1. ����
N���� �Է¹޾� N���� �̷���� ������ �����Ѵ�.
X�� �Է¹޾� �� ���� ���� X�� �Ǵ� ��츦 ī��Ʈ�Ͽ� ����Ѵ�.


2. �������
���������� ���������� ��ġ���� => start = 0; end = n-1; (�� ������ �� ������ ���̴� ����)
���Ŀ��� ����             => �������� ����

�������� 3���� ���� ������ ����
sum > x / sum < x�� ���� ����� ������ �����͸� �̵��ϸ鼭 x�� ������ ���� ã�������̴�
�� ������ ��� 1 2 3 5 7 9 10 11 12���� 5 7 9�κ��� ������ �̵��� ����غ���
5 + 9 = 14 > x ���� ũ�ϱ� end--�� �������� ã�´�
5 + 7 = 12 < x �̹� 14�� ������ end�� --�� �� 13���� ũ�ϱ� �������� ã������ �� ĭ ������ �̵��� �ǵ�
������ �̵��� ���� ���� x���� �����ϱ� 7 + 9�� �� ���� �ȴ�

�ᱹ, �� ������ ���� x�� �������� ã������ �����͸� �����س����ٴ� ���̴�.

�߿��� ����, �ݺ����� ���Ǽ��� ��, start�� end�� ������ ��츦 ����ؾ��Ѵ�.
start != end ��� ���� ������ ���ɼ��� ������� ���� ���̴�.
-> start < end start�� end���� Ŀ���� �����Ǵ� �Ŵϱ� �������ɼ��� ���� �� �ִ�


3. ������
start�� end�� �������ɼ��� ��������ʾұ� ������, out of length ���� �߻�
���������� ������ ����� �������� ���� ���¿��� ���ǽ��� ����ߴ�. -> x�� �������� ã������ 3���� ����� ������ ������ �ϴ� ���̴�.
StringTokenizer�� �ʱ�ȭ�ϴ� ��� -> ���� ���� ���� �ݺ��ϸ鼭 �Է¹޾ƾ��� ���
�� ��� �ƴϰ���, Integer.parseInt(br.readLine()); �� ����ϸ�ȴ�.
st �ʱ�ȭ ������ �迭�ȿ� �Է¹��� ���� ��������� �߶� �ֱ� �����̴ϱ�

-> ������ �ݺ����� ���ǽ�����, ��ȣ�� �ǵ��� �����������


+) StringBuilder�� ����ؼ� ����� ����غô�
   ���� ����ϴ� ������ �޼ҵ�� �и��ߴ�

*/


public class _3273_�μ����� {

	//static���� �� ����
	//main()�� ���� ó�� ���۵Ǵµ�, �� ���� �̸� �������־�� main()���� ȣ�Ⱑ��
	public static int twoPointer(int n, int x, int [] nArr) {
		
		int start = 0;   //��������
		int end   = n-1; //��������(0base)
		int count = 0;   //���ī��Ʈ
		
		Arrays.sort(nArr); //�������� ����
		
		
		//start�� end�� �����Ǵ� ��� ���
		while(start<end) {
			
			int sum = nArr[start] + nArr[end];
			
			if(sum == x) {
				
				count++;
				end--;
				start++;
			
			}else if(sum < x) {
				
				start++;
			
			}else {
				
				end--;
			
			}
		}//while end
		
		return count;
	}//twoPointer() end
	
		
		
	public static void main(String[] args) throws IOException {
		 
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		int    n    = Integer.parseInt(st.nextToken()); //������ ũ��
		int [] nArr = new int[n];
		
		//���� ���� �� �Է¹ޱ� ������ StringTokenizer�ʱ�ȭ
		st = new StringTokenizer(br.readLine()); //���⼭ �Է¹��� ����, for�� �ȿ��� ������ �������� �ϳ��� ����
		
		//����
		for(int i=0; i<nArr.length; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int x = Integer.parseInt(br.readLine());
		
		//������
		sb.append(twoPointer(n, x, nArr));
		System.out.println(sb);
		
	}
}