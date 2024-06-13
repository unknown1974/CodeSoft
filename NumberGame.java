import java.util.*;

class NumberGame{
	public static void main(String atgs[]){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int comp = r.nextInt(100-1)+1;
		
		int score = 100;
		int choice = 1;
		while(choice == 1){
			int wrong = 0;
			System.out.println("Enter The Number you Guessed Between(1-100) : ");
			for(int i = 1;i<=10;i++){
				int user = sc.nextInt();
				if(user == comp){
					System.out.println("\n---Congratulation You Guessed Correct Number in "+i+" Trails---");
					System.out.println("Score : "+score);
					System.out.println("Number is : "+comp);
					break;
				}
				else if (user >=1 && user < comp){
					System.out.println("Please Guess a Higher Number than this : ");
					score -=10;
				}
				else if (user > comp && user <=100){
					System.out.println("Please Guess a Lower Number than this : ");
					score -=10;
				}
				else{
					System.out.println("Please Guess the Number within range Between (1-100) : ");
					i--;
					wrong++;
				}
				if(wrong == 3){
					System.out.println("\nYou Lost the Game Since Your Guessing the Number Out of Range");
					break;
				}
				if(i == 10){
					System.out.println("\n\nYour Lost all the Trails");
					System.out.println("Better Luck Next Time");
				}
				
			}
			System.out.println("\n\nEnter '0' to Exit \nAny Other Key to play Again");
			choice = sc.nextInt();
		}
		System.out.println("Thanks For Playing My Game #codnest ");
			
	}
}
