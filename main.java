import java.util.Scanner;
public class ValidPalindromeII680 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("input the String: ");
		String inputStr = input.nextLine();
		
		int start=0;
		int end =inputStr.length()-1;
		while(start<end) {
			if(inputStr.charAt(start)!= inputStr.charAt(end)) {
				System.out.print(isPalindrom(inputStr, start+1,end)   || isPalindrom(inputStr, start,end-1 ));
						// a b fe    e b a  // a b e    ef b a
			}
			start++;
			end--;
		}
		System.out.print(true);
		
	}
	
	public static boolean isPalindrom(String str, int start, int end) {
		
		while(start<end) {
			if(str.charAt(start)!= str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
