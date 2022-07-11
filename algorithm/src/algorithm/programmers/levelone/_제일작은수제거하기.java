package algorithm.programmers.levelone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _���������������ϱ� {

//��������
	static int[] arr;  //�����迭
	static int[] temp; //���纻�迭
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		
		arr  = new int[N];
		temp = new int[N]; //���纻�迭 �ʱ�ȭ
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}//�Է¿Ϸ�
		
//�������� ����
		mergeSort(0, arr.length-1);
		
		//���� �� �����ϱ�
		int[] answer = new int[N-1];
		
		for(int i=0; i<answer.length; i++) {
			
			answer[i] = arr[i];
		}
		
		
	}
//�������� : �׻� O(nlogn) 	
	public static void mergeSort(int start, int end) {
		
		//���۹����� ��������� �ʰ����� �ʾҴٸ�,
		if(start<end) {
			
			//�߾����� ����
			int mid = (start+end)/2;
			
			//��� : left / right half
			mergeSort(start, mid); //left  half
			mergeSort(mid+1, end); //right half
			
			int p   = start; //��������
			int q   = mid+1; //half�� ��������
			int idx = p;
			
			//���������� half �����̰ų�, half ���������� �������� ������ ���, (���� ���� �ִ� ��� ����)
			while(p<=mid || q<=end) {
				
				//half���������� ���������� �ʰ��߰ų� / ���������� half�������������̸鼭, leftside��Ұ� rightside��Һ��� Ŭ ��
				//����                    asc/desc ����
				if(q>end || (p<=mid && arr[p]>arr[q])) {
					
					temp[idx++] = arr[p++];
				
				}else {
					
					temp[idx++] = arr[q++];
				}
			}//while end
			
			//���ĵ� ���纻 �迭�� �ٽ� �����迭�� ����
			for(int i=start; i<=end; i++) {
				arr[i] = temp[i];
			}
			
		}//if end
		
	}//mergeSort() end
}