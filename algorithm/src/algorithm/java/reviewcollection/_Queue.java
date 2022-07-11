package algorithm.java.reviewcollection;

import java.util.LinkedList;
import java.util.Queue;

public class _Queue {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		//Queue�� ���� �߰��Ѵ� add() / offer()
		q.add(1);
		q.add(2);
		q.add(3);
		q.offer(4);
		q.offer(5);
		
		
		//peek()
		//Queue�� ���� ù�� °�� ����� ���� ��ȯ�Ѵ�.
		System.out.println(q.peek());
		//��� : 1
		
		//peek() �޼ҵ带 ����ϸ�, ���� ù�� °�� ����� ���� ��ȯ�� �� ��, ���������ʴ´�.
		System.out.println(q);
		
		//�� ����
		// poll() / remove()
		
		//poll() : ù��° �� ��ȯ �� ���� / Queue�� ��������� null��ȯ
		q.poll();
		System.out.println(q);
		//��� : [2, 3, 4, 5]
		
		//remove() : ù���� �� ����
		q.remove();
		System.out.println(q);
		
		
		//clear() : Queue�� ��� �� �ʱ�ȭ(����)
		q.clear();
		System.out.println(q);
		
		
		
	}
}