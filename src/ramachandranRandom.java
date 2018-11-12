import java.util.Random;

public class ramachandranRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		int flip=0;
		int min=0;
		int max=100;
		int heads=0;
		int tails=0;
			do
			{
				int randomNum=min+generator.nextInt(max-min+1);
				if(randomNum<=50)
				{
				heads++;
				}
				else
				{
					tails++;
				}
				flip++;
			}
			while(flip!=100000);
			System.out.println("heads:" +heads);
			System.out.println("tails:" +tails);
			}

		

	}


