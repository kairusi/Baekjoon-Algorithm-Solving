package Complete;

import java.util.Scanner;

public class LevelThree2439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i=input; i>=1; i--){
			for(int j=1; j<=input; j++){
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
