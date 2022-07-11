package algorithm.boj.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

1. ����
�� ������ �Է¹ް�, A/B�� ����� ����Ѵ�

2. �������
�Ҽ����ڸ� ����� ���� double������ �����Ѵ�.
StringBuilder�� �������ϱ�

*/

public class _1008_divide {

	public static void main(String[] args) throws IOException {

		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
		
		sb.append(divide(A,B));
		System.out.println(sb);
		
		br.close();
	}//main() end
	
	public static double divide(double A, double B) {
		return A/B;
	}//divide() end
}