package algorithm.java.reviewio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class _ObjectOutputStream {

	public static void main(String[] args) throws Exception {
		
		/*//����ȭ -> ����
		PersonVo p = new PersonVo("ȫ�浿", 20, "����� ���Ǳ� ��õ��");
		
		//                                     PersonVo�� person.dat�̶�� �̸����� ����
		OutputStream os = new FileOutputStream("person.dat");
		
		//����ȭ ó����ü�� ����(���͸�)
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		//����ȭ
		oos.writeObject(p);
		
		//�ݱ�� ���� �������� �ݴ´�
		oos.close();
		os.close();
		*/
		
		
		//������ȭ -> �б�(����)
		//ObjectOutputStream���� ����ȭ�� ��ü��, �ݵ�� ObjectInputStream���� �о���Ѵ�
		InputStream is = new FileInputStream("person.dat");
		
		//������ȭ ��ü -> ObjectInputStream
		//������ is�� �а�, ois�� ����ؼ� ��ü�� ���͸���
		ObjectInputStream ois = new ObjectInputStream(is);
		
		
		//�о����           �о�� �� ���صǾ� ����� �����Ͱ� ���� Ÿ������ �𸣴ϱ�, ��ȯ�� �� objectŸ������ ��ȯ�Ѵ�   
		PersonVo p1 = (PersonVo)ois.readObject();
		//             readObject�� Object�� ��ȯ�ϴµ�, object�� �ֻ��� Ŭ�����̱⶧����, ������ȭ�� �������� Ÿ������ �ٿ�ĳ����(����Ȯ��)�� ������Ѵ�
		
		System.out.println(p1);
		
		
		//�ݱ� -> ��������
		ois.close();
		is.close();
		
		
		
		
		
		
	}
}