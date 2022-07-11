package algorithm.java.reviewio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class _oosTest {

	public static void main(String[] args) throws Exception{
		
		//                       �����ε������ �����س��� ������ �ٷ� �ʱ�ȭ ����
		_voTest vo = new _voTest(20, "ȫ�浿", "����Ư���� ���Ǳ�");
		
		//����ȭ -> �����͸� ������� �����ؼ� �����Ѵ�
		OutputStream os = new FileOutputStream("voTest.dat");
		
		//����ȭ ��ü ����           os�� ����ȭ�ؼ� ������ ���� �̸��� �ּҸ� �����߱� ����
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		//����ȭ -> writeObject
		oos.writeObject(vo);
		
		//�ݱ� -> ��������
		oos.close();
		os.close();
		
		
		//������ȭ -> ����ȭ�� ���ص� �����͸� ������� �������ؼ� �о�´�
		InputStream is = new FileInputStream("voTest.dat"); // voTest.dat������ fileInputStream���� �о�ͼ� is�������� �ȿ� ����
		
		ObjectInputStream ois = new ObjectInputStream(is);
		
		//����ȭ�� �� ��ü�� is���� �о���, ���� ������ objectInputStream���� �������ߴ�
		//�������Ǿ� �ٽ� ��ü�� �� �����͸� �о�´�
		_voTest v = (_voTest)ois.readObject();
		//�������� ������Ÿ���� readObject�� ������, Object�� �ֻ���class�̱⶧���� ��� �о�� �� �ִ�
		//������, _voTest�� Object�� ����Ŭ�����̱⶧���� object�� ������ _voTest������ �� �� �ֵ��� down-casting����Ȯ���� �ؾ��Ѵ�.
		
		System.out.println(v);
		
		//�ݱ� -> ��������
		ois.close();
		os.close();
		
	}
}