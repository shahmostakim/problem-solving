package problemSolving;

public class RepeatedString {
	
	static long repeatedString(String s, long n) {
		
		long count=0;
		long len = s.length();
		// s is smaller than n
		if(len<n) {
			System.out.println("string is smaller than n");
			long res = n/len;
			System.out.println("division result: "+res);
			long remainder = n%len;
			
			// find number of 'a' in s and multiply with res
			char c[] = s.toCharArray();
			long lenOfArray = c.length;
			for(int i=0; i<lenOfArray; i++) {
				if(c[i]=='a') {
					count++;
				}
			}
			System.out.println("multiply resxcount");
			count = res*count;
			if(remainder!=0){
				System.out.println("remainder not zero. need to loop thru the remainder");
				for(int k=0; k<remainder; k++) {
					if(c[k]=='a') {
						count++;
					}
				}
			}
		}else { // length of s is >= n
			char c[] = s.toCharArray();
			for(int j=0; j<n; j++) {
				if(c[j]=='a') {
					count++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a";
		int len = 1000500000;
		long res =  repeatedString(s, len);
		
		System.out.println("number of 'a's: "+res);
	}

}
