package chap01;

//3개의 정수값 가운데 최댓값을 구하여 출력
public class Max3Method {
	// a, b, c의 최댓값을 구하여 반환
	public static int max(int a, int b, int c) {
		int max = a;	// 최댓값
		if(b > max)
			max = b;
		if (c > max)
			max = c;
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max(3, 2, 1)); // a > b > c
		System.out.println("max3(3,2,2) = " + max(3, 2, 2)); // a > b = c
		System.out.println("max3(3,1,2) = " + max(3, 1, 2)); // a > c > b
		System.out.println("max3(3,2,3) = " + max(3, 2, 3)); // a = c > b
		System.out.println("max3(2,1,3) = " + max(2, 1, 3)); // c > a > b
		System.out.println("max3(3,3,2) = " + max(3, 3, 2)); // a = b > c
		System.out.println("max3(3,3,3) = " + max(3, 3, 3)); // a = b = c
		System.out.println("max3(2,2,3) = " + max(2, 2, 3)); // c > a = b
		System.out.println("max3(2,3,1) = " + max(2, 3, 1)); // b > a > c
		System.out.println("max3(2,3,2) = " + max(2, 3, 2)); // b > a = c
		System.out.println("max3(1,3,2) = " + max(1, 3, 2)); // b > c > a
		System.out.println("max3(2,3,3) = " + max(2, 3, 3)); // c = b > a
		System.out.println("max3(1,2,3) = " + max(1, 2, 3)); // c > b > a
		
	}
}

