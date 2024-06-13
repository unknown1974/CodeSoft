import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Question {
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    String answer;

    Question(String question, String option1, String option2, String option3, String option4, String answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }
}

class QuizGame {
	static int correct = 0;
    Question[] questions = {
        new Question("Which of the following computer language is written in binary codes only?","Pascal","Machine Language","C","C++","B"),
        new Question("What is the largest planet in our solar system?", "Jupiter", "Saturn", "Mars", "Earth", "A"),
        new Question("What is the smallest country in the world?", "Monaco", "San Marino", "Vatican City", "Liechtenstein", "C"),
        new Question("How many States are there in india?","27","28","29","30","B"),
        new Question("What is the capital of telangana?","Hyderabad","Secunderabad","Warangal","Golconda","A"),
        new Question("What is the capital of Germany?","Combodia","Hong-Kong","Berlin","Paris","C"),
        new Question("What is the capital of UTTARAKHAND?","Raipur","Chandigarh","Aizwal","None","D"),
	new Question("Which of the following is not a type of computer code?","EDIC","ASCII","BCD","EBCDIC","A")
    };

    void start() throws Exception{
        Scanner scanner = new Scanner(System.in);
        long totalTime = 0;

        for (int i = 0; i < questions.length; i++) {
            
            
            // Clear the console
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } 
            else {
                System.out.print("\033\143");
            }
            
            Question question = questions[i];
            System.out.println(question.question);
            System.out.println("A. " + question.option1);
            System.out.println("B. " + question.option2);
            System.out.println("C. " + question.option3);
            System.out.println("D. " + question.option4);

            long startTime = System.currentTimeMillis();
            System.out.print("Enter your answer (A, B, C, or D): ");
            
            
            String answer = scanner.next().toUpperCase();

            long endTime = System.currentTimeMillis();
            
            totalTime += TimeUnit.MILLISECONDS.toSeconds(endTime - startTime);

            

            System.out.println();
            long remainingTime = 30 - (endTime - startTime) / 1000;
            
            
            System.out.println("Remaining time for this Question is: " + remainingTime + " seconds");
            
            
            
            if (answer.equals(question.answer) ) {
                System.out.println("Correct Answer!");
                correct++;
                try {
                    TimeUnit.SECONDS.sleep(2);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
            else {
                System.out.println("Incorrect. The correct answer is: " + question.answer);
                try {
                    TimeUnit.SECONDS.sleep(2);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            if (answer.equals(question.answer)) {
                remainingTime =0;
                continue;
            }
            
            System.out.println();

            
        }
        System.out.println("\nYou Took: "+totalTime+" seconds to Finish The Quize."); 
        System.out.println("You Answered "+correct+" Correctly!");
        if(correct>6)
        	System.out.println("Awesome!!");
        else if(correct >4)
        	System.out.println("Nice! You Can Perform more Better.");
        else if(correct >2)
        	System.out.println("Good! Try to score better next time.");
        else
        	System.out.println("Very Poor! Better Luck Next Time.");
        try {
                    TimeUnit.SECONDS.sleep(1);
                }
        catch (InterruptedException e) {
                    e.printStackTrace();
        }
        System.out.println("\nThank You For Playing My Quize.\nI Hope You Enjoyed #codenest\n");
        try {
                    TimeUnit.SECONDS.sleep(1);
                }
        catch (InterruptedException e) {
                    e.printStackTrace();
        }
        System.out.println("Exiting....\n");
        try {
                    TimeUnit.SECONDS.sleep(2);
                }
        catch (InterruptedException e) {
                    e.printStackTrace();
        }              
     }

    
}


public class Quize {
    public static void main(String[] args) throws Exception{
        QuizGame quizGame = new QuizGame();
        quizGame.start();
    }
}
