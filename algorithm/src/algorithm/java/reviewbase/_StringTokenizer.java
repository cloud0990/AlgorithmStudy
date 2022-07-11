package algorithm.java.reviewbase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _StringTokenizer {

	public static void main(String[] args) throws IOException{
		
		//���ڸ� �� �� ������ �Է¹��� �� ���� -> readLine() ����
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		
		//BufferedReader�� readLine()�� �ٷ� �����ڿ� �ʱ�ȭ�ϸ鼭 ��ü �����߱� ������ �̹� ���⼭���� �Է¹޴� ����
		//���࿡ ���� �� �Է¹��� ���� �ؿ��� �� �� �� �ʱ�ȭ �������
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//�̷��� �����ϸ� �� �� ������ �о���� ������ �����̽����� ���ڷ� �ν��ؼ� �� ����� �� ��
		//���ͷ� �� �Է��� �Ÿ� ������µ� "4 2" �̷��� �Է��� �Ÿ� ������ for input String "4 2"
		//int n = Integer.parseInt(br.readLine());
		//�����̽�(����)���� �Է� ���� �Ÿ� Integer.parseInt(st.nextToken()); ���� �ؾ��� -> ������ ��ū ��ü�����ϸ鼭 �ٷ� br.readLine
		//�����ϱ� ���⼭ �Է¹��� ���� ��������� �߶� int n �ȿ� ���� �� ����
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		//�̷��� �ؾ� ������ �������� �� �ٷ� �Է¹޾��� �� ���� �ϳ��� ���� ���� �ȿ� ���� �� ����
		//�� �ٿ� ��������� �Է��� �Ŵϱ� ��׳����� ��ü �ϳ� �����س��� �׳� �� �� �߶� ���� ����
		
		int [] arr = new int[5];
		
		//������ st.nextToken�ϰ�, �ؿ��� �� �Է¹޾ƾ��� ��, st = new ... �̰� ��ü ���� �� �������
		//������ �̹� �� �� �Է¹޾Ƽ� ��������� �߶� ����� �� ���� �ȿ� �־ ���⼭ �ʱ�ȭ �� ���ָ� ��ū ���ٰ� ������
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		//�ݺ��� �� �� �� ������ �� �ٿ� ��������� �Է��� ���ڵ��� �ϳ��� ���� �ε����� �� �߰��ϴ� ����
		//�Է��� for�� �ȿ��� st.nextToken�� �޴� �� �ƴ϶� �ݺ��� ���� br.readLine�ʱ�ȭ�ϸ鼭 ��ü������ ���⼭ �Է¹ް�
		//�� �Է¹��� ���� ��������� �߶� ���� �ȿ� �ִ� ����
		//�ʹ� Integer.parseInt�� ��ȯ�ؼ� ���� �͸� �ؼ� String���� �� ���� �� �򰥸��µ�,
		//BufferedReader�� ���ڿ��� �νĵǼ� String�� ���� ���� Integer����ȯ �� ���൵ ��
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//-> String���� �Է¹޾Ƽ� ��ũ������ ��ü ���� ���
		//������ �� ��ū �� �����ϱ� ���⼭ �� �ʱ�ȭ
		System.out.print("���ڿ� �Է� : ���� 3��>>");
		st = new StringTokenizer(br.readLine());
		
		String [] str_arr = new String[3];
		
		for(int i=0; i<str_arr.length; i++) {
			str_arr[i] = st.nextToken();
		}
		
		for(String str : str_arr) {
			System.out.print(str + " ");
		}
		
		//�Է¹��� ���ڿ��� �迭 �ȿ� ���� ���� ���� ������� �ϸ� �ǰ�, �׳� �Է¸� ���� ���� ��ũ������
		//�ʿ���� �ٷ� br.readLine(); �ϸ� �ɵ�
		//��ũ������ ��ü �������� ��, �׳� br.readLine()�ϸ� �ڵ����� ���� �������� �߶���
		//Ư������ �������� �ڸ��� ������ br.readLine(), "-" �ϸ� ��
		st = new StringTokenizer(br.readLine(), "-");
		String [] strArr = new String[3];
		
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = st.nextToken();
		}
		
		for(String str : strArr) {
			System.out.print(str + " ");
		}
		
		//��� : ��ũ������ ��ü ���� br.readLine���� �Ѵٰ� �س���
		//Integer.parseInt(br.readLine)�ϸ� �� ������
		//������ �� �� ������ �Է¹ްڴٰ� ���� ������ �Ŵϱ� 
		//������ ���� �ȿ� �������� �������ڷ� st.nextToken����� ���ϴ´�� ���� �� ����
		//���⿡ �� ���� ��������� ������ ���� �����ϴ� ����
		//BufferedReader�� StringTokenizer ���� �� ��
		//�׳� �ڵ� �ܿ��ٰ� �� �������� ��� br.readLine()���� �Է¹ް�
		//��� ��ũ������ ������ ��� �����ϸ鼭 ����
		
		
		
		//������ �ڿ� true false
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ", true);
		//�⺻��(������) false
		//true�� �����ڵ� ��ū�� ���Խ�Ű��, false�� �����ڴ� ��ū�� ���Խ�Ű�� �ʴ´�.
		
		/*
		StringTokenizer
		���ڿ��� ������ �������� �߶� ��ū�� �����Ѵ�. ������� ���ڿ��̴�.
		
		split
		���ڿ��� ����ǥ�������� �����ϸ�, �����ڱ��� �ν��Ѵ�.
		������� �迭�̴�.
		
		*/
	}
}