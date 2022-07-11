package algorithm.java.reviewio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class _JavaIOTest_ArrayList {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		PersonVo p = new PersonVo("ȫ�浿", 20, "����� ������ ������");
		
		
		List<PersonVo> list = new ArrayList<>();
		
		//����ȭ -> ArrayList���� (ArrayList�� ����ȭ����� ��)
		list.add(new PersonVo("ȫ�浿", 25, "����� ������ ����1��"));
		list.add(new PersonVo("�ϱ浿", 24, "����� ������ ����1��"));
		list.add(new PersonVo("�̱浿", 23, "����� ������ ����1��"));
		list.add(new PersonVo("��浿", 22, "����� ������ ����1��"));
		list.add(new PersonVo("��浿", 21, "����� ������ ����1��"));
		
		OutputStream os = new FileOutputStream("list.dat"); //1
		
		///����ȭ�� ��, ��ü�� ���� ����, ��ü Ÿ��(����), ��ü�� ������Ű������ ������... ��� ����
		//����ȭ ó����ü�� ����
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		//����ȭ -> ������ ����
		oos.writeObject(list);
		
		
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
		List<PersonVo> list2 = (List<PersonVo>)ois.readObject();
		
		
		System.out.println("---������ ���� : ������ȭ---");
		
		for(PersonVo v : list2) {
			System.out.println(v);
		}
		
		ois.close();
		is.close();
		
	}
}