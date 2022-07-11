package algorithm.java.reviewio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JavaIO_Study {

	public static void main(String[] args) throws IOException {
		
		/*
		  1. 1byte������ �о�´�.
		     InputStream  : System.in��  in  = InputStream
		     OutputStream : System.out�� out = OutputStream 
			
		  2. 2byte������ �о�´�. (����)
		     InputStreamReader
		     OutputStreamWriter -> ���ڴ����� ���
		   
		  3. �� �� ������ �о�´� -> readLine()��� (\n , \r�� �� ��츦 �� ���� ������ ����)
		     BufferedReader
		     -> readLine()�� ����ؼ� ��������δ�, �ƹ��� ���� ���ڸ� �Է��ϴ��� �� �� ������ ������ �о���� �� �ִ�.
		     Scanner(System.in)��, BufferedReader�� ������� ���� �ӵ����̰� �ִ�.
		     
		     Scanner sc = new Scanner(System.in);
		*/
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader    br  = new BufferedReader(isr);
		
		//+) �Ű�����(parameter)��, �Լ��� ���ǿ��� ���޹��� �μ���, �Լ� ���η� �����ϱ� ���� ����ϴ� ������ �ǹ��Ѵ�.
		//���� �� ���� �ڵ带 �ϳ��� ����� �� ���� : BufferedReader��ü ������, �Ű������� �ٷ� ��������
		BufferedReader    br2 = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		
		�� �ڵ��� �ؼ�
		=> System.in(InputStream) 1byte������ �о��
		   InputStreamReader�� 2byte����(����) �о��
		   BufferdReader�� ���ڿ�(�� ��)������ �о��	
		   
	    1byte������ �о�� ������ -> 2byte���ڸ� ���� �� �ִ� inputStreamReader�� -> BufferedReader���� char������ �����ϸ�, BufferedReader�� Line���� �о�´�(readLine()) 
		
		
		System.in(1Byte������ �о�´�) -> InputStreamReader(char������ �о�´�:���ڽ�Ʈ��) -> BufferedReader(���ڿ�Line������ �о�´�)
		
		BufferedReader�� ����ϸ� ���ڿ��� �о���⶧���� ���������� �Է¹ް������, Integer.parseInt() �� �� ����ȯ ������Ѵ�.
		
		
		*/
		
		System.out.print("id>>");
		
		//IO�� ����� �������� ���߰ų�, ����� �о���� ������ ��쿡 ���� ����ó�� �ؾ��� -> IOException
		String id = br2.readLine();
		
		System.out.print("pwd>>");
		String pwd = br2.readLine();
		
		int password = Integer.parseInt(pwd);
		
		
		//consoleâ�� ���
		//OutputStreamWriterŬ������ �Ű�������, System.out��ü�� �����߱� ������, ����� ȭ�鿡 ����� �� �ִ�.
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		
		System.out.println("-------[1.OutputStreamWriter]-------");
		
		out.write(id);
		
		System.out.println();
		
		out.write("pwd>>" + password); 
		
		System.out.println();
		
		
		System.out.println("id>>" + id);
		
		
		//out.write�� ��¹��ۿ� ���� �����Ѵ�. ����� ���� flush�޼ҵ带 ����Ͽ� ȭ�鿡 ����� �� �ִ�.
		//bufferd�� ���� �о�� ���� �Ѱ���
		//���ۿ� �����Ͱ� �����Ǵ� �������� ���ܻ�Ȳ �߻���, ���۰� ����������ؼ� �����Ͱ� �״�� ���ǵǴ� ��찡 �ִ�
		//�� ���� �����ϱ�����, ���۸��� �̿��ϴ� Ŭ�������� flush() �޼ҵ带 �����Ѵ�.
		//���۸� ���� ������ϸ�, �⺻������ ��Ʈ���� ����Ǹ�, �ڵ����� �۵��ϱ�������, �߿��ѵ����͸� �����ϴ� ���� �ڿ��� �� flush�� ���ִ� �� ����
		out.flush();
		
		System.out.println("-------[2. System.out.print]-------");
		System.out.printf("id>> %s\n", id);
		System.out.printf("pwd>> %d\n", password);
		
		
		
	}
}