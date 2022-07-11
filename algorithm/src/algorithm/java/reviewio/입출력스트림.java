package algorithm.java.reviewio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ����½�Ʈ�� {

	public static void main(String[] args) {
		
		//05�� : InputStreamReader, OutputStreamWriter
		//06�� : ScannerŬ����
		
		
		/*

		Stream : �����͸� ������ϱ����� ��� (��ġ�� �����ϰ� ������ ������� �����)
	  			 FIFO(���Լ���)���� : ������ ���ٸ� ����Ѵ� -> �������� ������ �ٲ����ʴ´�    +) �ܹ���
	  	
	  	
	  	����Ʈ��Ʈ��(1byte) : �ѱ�(2byte) �� �о�´�.
	  	1. InputStream -> System.in���� in
	  	2. OuputStream -> System.out���� out 
		
		���ڽ�Ʈ��(2byte) 
		1. InputStreamReader
		2. OutputStreamWriter
		*/
		
		
		FileReader     fr = null; //�ý��ۿ� �ִ� ���������� ���� �� �ִ� ��� ����
		BufferedReader br = null;
		
		
		try {
			
			fr = new FileReader("C:\\Work\\text.txt"); //�о�� ���ϰ��  
			br = new BufferedReader(fr); //������ �� �� ������ �о���ڴ�
			
			//br = new BufferedReader(new FileReader("�о�� ���� ���"))

			String msg;
			
			//readLine(); == ������ ���� ������ ������, �� �ٴ����� ���ۿ� ����
			
			try {
				while( (msg = br.readLine()) != null) { //�� �� ������ �о�� msg�� �����Ѵٸ�
					System.out.println(msg);            //ȭ�鿡 ����ض�
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) { //�ش��ο� ������ ��������������� ����ó��
			e.printStackTrace();
			
		}finally { //���ܿ� ������� ������ ���� -> �ַ� �����ִ� ���� ���� �� ��� 
			
			try {
				if(fr != null) fr.close(); //FileReader��     ���������� �ݾƶ�
				if(br != null) br.close(); //BufferedReader�� ���������� �ݾƶ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}