import java.util.Scanner;

public class RamachandranNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scoreOne= 0;
		int scoreTwo = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("what is the first score");
		scoreOne = input.nextInt();
		System.out.println("what is the second score?");
		scoreTwo= input.nextInt();
		if (scoreOne>scoreTwo)
		{
			System.out.println("great job!");
			System.out.println(scoreOne-scoreTwo);
		}
		System.out.println("Have a nice day!");
	}

}
