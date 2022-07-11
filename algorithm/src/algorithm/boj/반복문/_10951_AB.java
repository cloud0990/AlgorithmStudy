package algorithm.boj.�ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*

EOF : End Of File

�Է¿��� �� �̻� ���� �� �ִ� �����Ͱ� ���� ���
-> �� �̻� �Է��� �־��������� ���

BufferedReader�� ���� �Է°��� ���� ��� null�� ��ȯ�Ѵ�.
�׽�Ʈ���̽��� �Է¹����� ��ŭ ���� �� �𸥴� -> �ݺ��� Ƚ���� �� �� ���� -> while���

Scanner��� ��, ���� �о�� �����Ͱ� �ִ� ��� -> hasNext
ex) sc.hasNext 
�Է¹��� �����Ͱ� ������ true, ������ false��ȯ

Scanner����,


while(sc.hasNextInt()){
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	sb.append(A+B).append("\n");
}


+) ������ ��
StringTokenizer�� ���ڿ��� '�Է�'�޴� �� �ƴ϶� �Է¹��� ���ڿ��� '����'�ϴ� �����̴�.
EOFó���� �ϱ����� StringTokenizer�� ����� ���� ����.
-> BufferedReader's readLine() ���

*/

public class _10951_AB {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder   sb = new StringBuilder();
		
		String str;
		
		//�Է¹��� str�� null�� �ƴ� ���
		//BufferedReader�� �Է°��� ���� ���(EOF) -> null ��ȯ
		while( (str=br.readLine())!=null ) {
			
			//������ �������� ���ڸ��� ���� �־����⶧���� charAt���� ������ ��ġ�� �������ִ�.
			//�츮�� ����� ���ڷ� ��ȯ�Ϸ��� -48 or -'0'�� �ϸ� ���������� ��ȯ�ȴ�.
			int A = str.charAt(0) - 48;
			int B = str.charAt(2) - '0';
			
			sb.append(A+B).append("\n");
		}
		
		System.out.print(sb.toString());
	}
}