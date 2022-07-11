package algorithm.boj.������_���շ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*

testCase : �ִ� 100
�ǻ� ��  : �ִ� 30

1. �������� �� ����

-Map�� key value�� �����Ͱ��� Ȱ��

key   : �ǻ��̸� ���� -> �ǻ��̸��� �ߺ��� �� ����. ex) hat      turban    sunglasses
value : �ǻ����� ���� -> �ǻ������� �ߺ��� �� �ִ�. ex) headgear headgear  eyewear


üũ�ؾ��� ������ ũ�� 2������ ������.
1. value�� �߿��� �ߺ����� �ִ� ���
  -> �ߺ��Ǵ� ������ �����Ѵ�.
  
2. value�� �߿��� �ߺ����� ���� ���
  -> ��� ���ư��鼭 ������ �� �ִ�.


*/

public class _9375_�мǿս��غ� {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder   sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//�׽�Ʈ���̽� �Է¹ޱ�
		int testCase = Integer.parseInt(st.nextToken());
		
		
		//�׽�Ʈ���̽�
		for(int i=0; i<testCase; i++) {
			
			//1. Map ����
			Map<String, Integer> map = new HashMap<>();
			
			st = new StringTokenizer(br.readLine()); //�Է��ʱ�ȭ
			
			//2. �ǻ� ���� �Է¹ޱ�
			int n = Integer.parseInt(st.nextToken());
			
			//3. �ǻ� �Է¹ޱ�
			for(int k=0; k<n; k++) {
		
				st = new StringTokenizer(br.readLine()); //�Է��ʱ�ȭ
				
				//�ǻ��̸��� �ʿ���� ������ �Է��� ������ ������������
				st.nextToken();
				
				//3-1. �ǻ����� �Է¹ޱ�
				String type = st.nextToken();
				
				//3-2. �̹� map�� �Է¹��� �ǻ������� �ִٸ�
				//ù��° for�������� map�� ��������ϱ� üũ��������. �� ��° for�� ���� ����� üũ
				if(map.containsKey(type)) {
					
					/* �Է¹��� �ǻ������� �ش�Ǵ� key���� �ִ� ���
					  - key���� ���� �ߺ��� �� ���� ������ �ߺ��Ǵ� ���� �߰��Ǹ�
					    ������ key���� �������ִ� value��, �߰��� key�� �������ִ� value�� ��������� */

					                //get() : �ش� key���� �������ִ� value���� ��ȯ�Ѵ�.
					map.put(type, map.get(type)+1);
					//���⼭�� type�� �������ִ� Integer value�� ���� ��ȯ�ϱ� ������ ���� ������ �����ϴ�.
				
					
				//3-3. map�� �Է¹��� �ǻ������� ���ٸ�
				}else {
					//�Է¹��� �ǻ������� �ش�Ǵ� key���� ���ٸ�, map�� �߰�
					//value�� 1�� �����ϴ� ���� : �ش� �ǻ������� count�ϱ� ����
					map.put(type, 1);
				}
			}//���� �Է¿Ϸ�
	
			/*
				map�� ����� value���� ó������ ���������� ���鼭
	
				1. ���� �ε����� �����ϴ� ���      = ���� �Դ� ���
				2. ���� �ε����� �������� �ʴ� ��� = ���� �����ʴ� ���
				
				�ΰ����� ��� ��츦 ����Ž���Ѵ�.
			*/
			
			
			//����� �� ���ϱ�
			int answer = 1;
			
			//forEach�� ����ؼ� map�� ����� value�� ����(values())�� �ϳ���(value) ��ȸ
			for(Integer value : map.values()) {
				
				//�ϳ��� ���Ҹ� �����ϴ� ��� + ���Ҹ� �������� �ʴ� ���
				//���������� ���� �Դ� ���(value) + ���� ������ ���� ���� �ʴ� ���(1)
				answer = answer * (value+1);
				
			}//forEach end
			
			//���� �� �Դ� ���� �����Ѵ� = -1
			sb.append(answer-1).append("\n");
			
		}//testCase end

		//������
		bw.write(sb.toString());
		bw.close();
		br.close();
		
	}
}