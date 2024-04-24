import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class validationNumber {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        int i = 0;
		while(i < testCases){
			String pattern = in.nextLine();
            if(valid(pattern)){
                System.out.println("Valid");
            } else{
                System.out.println("Invalid");
            }
            i++;
          	//Write your code
		}
	}
    public static Boolean valid(String pattern){
        try{
            Pattern.compile(pattern);
            return true;
        }catch(PatternSyntaxException e){
            return false;
        }
    }
}
