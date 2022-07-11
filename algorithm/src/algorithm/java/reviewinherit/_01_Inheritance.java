package algorithm.java.reviewinherit;

class Human {
	
	int arms = 2;
	int legs = 2;
	
	public void armsLegs() {
		
		System.out.printf("Human has arms(%d) and legs(%d)\n", arms, legs);
	}
}


class Baby extends Human {
	
	//Baby�� �߰��Ӽ�
	String cute = "cute";
	
	public void cute() {
		super.legs = 4;
		
		//super(); => [super class�� ������ ȣ��] �ε�, ���⼭�� �� ���� �� ����
		
		System.out.printf("Baby has legs(%d)\n", legs);
		System.out.printf("Baby is %s\n", cute);
	}
}

class Teenager extends Baby {
	
	//Teenager�� �߰��Ӽ�
	String schoolUniform = "schoolUniform";
	
	public void schoolUniform () {
		super.arms = 2;
		super.legs = 2;
		System.out.printf("Teenager has arms(%d) and legs(%d)\n", arms, legs);
		System.out.printf("Teenager wear %s\n", schoolUniform);
	}
}

class Adult extends Teenager {
	
	//Adult�� �߰��Ӽ�
	String exhausted = "exhausted";
	
	public void look() {
		super.arms = 2;
		super.legs = 2;
		System.out.printf("Adult has arms(%d) and legs(%d)\n", arms, legs);
		System.out.printf("Adult looks %s\n", exhausted);
	}
	
}


public class _01_Inheritance{
	
	public static void main(String[] args) {
														
		//Up-casting(�ڵ�����ȯ) => Baby(Human+Baby)�� �Ӽ� ��, �������� Human���� ����
		//    �������� => ������    =>�ڽ�Ŭ������ ��ü�� �θ�Ŭ������ ��üŸ������ ����ȯ
		Baby human = new Baby();
		human.armsLegs();
		//human.cute(); //(X) ��뿵�� Human���� ���ѵǾ��־ ȣ���� �� ����
		
		System.out.println("--------------------------------");
		
		//Down-casting(��������ȯ) => human�� ��뿵���� Human+Baby�� �÷��� Baby�ȿ� �ִ� ������ ��밡��
		//��ĳ�������� Baby�� ��뿵���� human���� �����س��� ������, �ٽ� human�� Baby�� �ٿ�ĳ���� ������
		Baby baby = (Baby)human;  //=> Baby baby = (Baby)new Human : �����ڵ�
		baby.cute(); //Baby�� cute()
		baby.armsLegs(); //Human�� armsLegs() => Human�� sub class�̱⶧���� ���ٰ���
		
		//�ٿ�ĳ������ ���� �������� �ʴ� ���������� ���Ͱ��� ��ĳ������ ����� ���, �ٿ�ĳ���� ������

		System.out.println("---------------------------------");
		
		Teenager tng = new Teenager();
		tng.schoolUniform();
		
		System.out.println("---------------------------------");
		
		Adult adult = new Adult();
		adult.look();
		
	}
}