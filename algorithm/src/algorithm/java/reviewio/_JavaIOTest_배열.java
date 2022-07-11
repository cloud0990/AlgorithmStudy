package algorithm.java.reviewio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class _JavaIOTest_�迭 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		PersonVo p = new PersonVo("ȫ�浿", 20, "����� ������ ������");
		
		
		//����ȭ -> �迭���� (�迭�� ����ȭ����� ��)
		PersonVo [] p_arr = {
								new PersonVo("ȫ�浿", 20, "����� ������ ����1��"),
								new PersonVo("�ϱ浿", 21, "����� ������ ����2��"),
								new PersonVo("��浿", 22, "����� ������ ����3��"),
								new PersonVo("�̱浿", 23, "����� ������ ����4��"),
								new PersonVo("���浿", 24, "����� ������ ����5��")
							};
		
		
		OutputStream os = new FileOutputStream("person_arr.dat"); //1
		
		///����ȭ�� ��, ��ü�� ���� ����, ��ü Ÿ��(����), ��ü�� ������Ű������ ������... ��� ����
		//����ȭ ó����ü�� ����
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		//����ȭ -> ������ ����
		oos.writeObject(p_arr);
		
		
		//���� �������� �ݾƾ���
		os.close();
		oos.close();
		
		
		//�о���� ���� objectinputstream���� �о���Ѵ�. -> outputstream���� ������ �����ʹ� ����� �� ����
		//input���� ������ �����ؼ� ���� �츮�� ���� �� ���� -> ���ص� ������ �츮�� ���Ƿ� �����ϸ�, �����Ͱ� �ļյǼ� ���߿� ������ �� ���� ����
		
		//������ �о���̴� ��ü ����
		InputStream is = new FileInputStream("person_arr.dat");
		
		ObjectInputStream ois = new ObjectInputStream(is);
		
		//������ȭ -> ������ ����
		//�о�� ���� �ش� �ڷ������� ĳ����
		//object�� �ֻ���Ŭ�����̱⶧����, �о���� �������� Ÿ������ �ٿ�ĳ����(����Ȯ��)�� �ؾ� ���� �� ��
		PersonVo [] p_arr1 = (PersonVo [])ois.readObject();
		
		System.out.println("---������ ���� : ������ȭ---");
		
		for(PersonVo v : p_arr1) {
			System.out.println(v);
		}
		
		ois.close();
		is.close();
		
	}
}