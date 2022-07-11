package algorithm.java.reviewio;

import java.util.Scanner; //ScannerŬ������ util��Ű���� ���ԵǾ� �����ȴ�

public class JavaIo_Scanner {

	public static void main(String[] args) {
		
		//�Է°�(���ڿ�, ����, �Է½�Ʈ��)�� ���ڿ��̳� �⺻�ڷ������� �м��Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		/*
		������  : �Է°��� ���ڿ��� ���� 
		 	    �⺻���� �����ڴ� �� ����(White Space), \n \t...
	
		��ū    : �����ڳ� ������������ ���е� �ܾ�
			     ���е� ��ū�� next�ڷ���(); �޼ҵ带 ����Ͽ� �ٸ� Ÿ���� ������ �ٲ��.
		*/
		
		int    n  = sc.nextInt();
		double d  = sc.nextDouble();
		String s  = sc.next();     //������ ���ڷ� �νĺҰ� -> ���� �������� ���� �����´�
		String s1 = sc.nextLine(); //���鵵 ���ڿ��� �νİ���
		
		//Ű������� ��, Enter���� �����ؾ��� (nextLine �� �� ���ǻ���)
		//�����ִ� ���Ͱ� ����
		sc.nextLine();

		//����, Scanner ��ü�� ���� ��ū�� ������ true ����
		// hasNext�ڷ��� : �ش��ڷ����� ��ġ�ϴ� ��ū�� �������� ���, ��ū�� �ڷ��������� ��ȯ�ϴ� �޼ҵ�
		sc.hasNextInt();
		
		
		
		sc.close(); //������ ����. Scanner��ü������ ���ÿ� ������ġ�ڵ�� �ۼ��ؼ� ���
		
		
		/*
		 * 
		Scanner vs BufferedReader
		
		ScannerŬ������ �Է¹��� ���ڸ� ���Խ����� �˻��ϰ� �� ��, ��ȯ
		BufferedReaderŬ������ ���ٸ� ���Խ� ����, readLine()�� ���پ� �о�� �� �ִ�
		
		���⼭ �ӵ����� �߻�
		*/
		
	}
}