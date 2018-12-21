package problemSolving;

public class repeatedString {
	
	static long repeatedString(String s, long n) {
		long count = 0;
		int len = s.length();
		if(len<n) {
			System.out.println("String should be enlarged");
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abs";
		long n = 10;
		long res = repeatedString(s,n);
		System.out.println("Result is "+res);
	}

}