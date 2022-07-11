package algorithm.java.reviewsort;

public class _MergeSort_Asc {
	
	public static int [] src;  //�Է¹��� �迭
	public static int [] temp; //�迭�� ���纻
	
	
	public static void main(String[] args) {
		
		src  = new int [] { 1, 9, 8, 5, 4, 2, 3, 7, 6 };
		
		//src�迭 ũ�� ��ŭ�� ���纻 �迭 ����
		temp = new int [src.length]; 
		
		//Before sort
		printArray(src); 
		
		//sorting
		mergeSort(0, src.length-1);
		
		
		//After sort
		printArray(src);
	}//main() end
	
	
	public static void mergeSort(int start, int end) {
		
		if(start<end) {
			
			//�迭 ũ���� �߰� �� ���ϱ�
			int mid = (start+end)/2;
			
			mergeSort(start, mid);
			mergeSort(mid+1, end);
			
			//�߰� �������� ���� ��������
			int p   = start;
			int idx = p;
			
			//�߰��������� ������ ��������
			int q = mid + 1;
			
			
			//���ʰ�(p)�� mid���� �۰ų�������, �Ǵ� ������(q)���� end���� �۰ų� ������ �ݺ��ض�. ��, ����� �������� ���� �����ʸ�ŭ�� �ݺ�
			while(p<=mid || q<=end) {
				
				//��, ������ ���� üũ�ϸ鼭, ���ʰ��� �߾Ӱ��� ħ������ �����鼭 ���ʹ迭�� ���� ������ �迭�� ������ ���� ���,
				if(q>end || (p<=mid && src[p]<src[q])) {
					temp[idx++] = src[p++]; //���ʰ����� �迭�� ���纻�� �ϳ��� �߰��Ѵ�.
				}else { //�ƴ� ����, �����ʰ��� �迭�� ���纻�� �ϳ��� �����Ѵ�.
					temp[idx++] = src[q++];
				}
			}//while end
			
			//start=0����, end��(�迭�ǳ�)���� �ϳ��� ���鼭, �迭�� ���纻�� �־���� ������, �ٽ� ���� �迭�� �ϳ��� �����Ѵ�.
			for(int i=start; i<=end; i++) {
				src[i] = temp[i];
			}//for end
			
		}//if end
		
	}//mergeSort end
	
	
	public static void printArray(int [] a) {
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}
	
}