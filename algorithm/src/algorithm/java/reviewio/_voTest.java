package algorithm.java.reviewio;

import java.io.Serializable;

                   //����ȭ ���ü�� ����ȭ�� �����ϵ���, Serializable �������̽��� ��ӹ޴´�
public class _voTest implements Serializable{

	private int age;
	private String name;
	private String addr;
	
	
	public _voTest() { //�⺻ ������ ����
	
	}
	
	public _voTest(int age, String name, String addr) { //�����ε� ������
		super();
		this.age = age;
		this.name = name;
		this.addr = addr;
	}


	//getter/setter ���� -> �ܺο��� private�� �����ϱ� ����
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	public String toString() {
		
		String str = String.format("[%d]-[%s]-[%s]", age, name, addr);
		return str;
	}
	
	
	
	
}