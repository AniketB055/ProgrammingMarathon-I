import java.util.*;
public class SecretMsgApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		
	   SecretMsg decoder = new SecretMsg();
	  
	   System.out.println(SecretMsg.decodeCharacter(ch));
				

	}

}
