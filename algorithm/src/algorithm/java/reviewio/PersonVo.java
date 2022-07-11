package algorithm.java.reviewio;

import java.io.Serializable;


				      //����ȭ�� �����ϵ��� ����ȭ�� ������ ��ü�� ������ش� -> Serializable �������̽��� ��ӹ޴´�6
public class PersonVo implements Serializable {
	
	/*
	Vo(Value Object)
	1. �����͸� ��������ϴ� ��ü
	2. getter/setter�� �ݵ�� �����س����� => Vo ��ü�� �� �� �ݵ�� ����
	
	cf) DTO or To
		Date Transfer Object(������ ���ް�ü)
	*/
	
		
		private String name;
		transient private  int age; //transient : �ش��ʵ�� ����ȭ���� ���ܵȴ�
		private String addr;
		
		
		//Overload�� �����ڰ� ���� ���, �ݵ�� �⺻�����ڵ� ����
		public PersonVo() {
		}
		
		
		public PersonVo(String name, int age, String addr) {
			super();
			this.name = name;
			this.age = age;
			this.addr = addr;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		
		
		public String toString() {
			String str = String.format("%s-%d-%s", name, age, addr);
			return str;
		}
}