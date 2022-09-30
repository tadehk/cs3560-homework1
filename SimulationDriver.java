import java.util.Random;
import java.util.Scanner;
public class SimulationDriver{

	public static void main(String[]args){

		try (Scanner testInput = new Scanner(System.in)) {
			Random randomGenerator = new Random();
			int choice =0 ; 
			
				System.out.println("Choose an option\n");

				System.out.println("1: True or False question \n");
				System.out.println("2: Multiple choice question\n ");
				System.out.println("3: Exit program\n");
				choice = testInput.nextInt(); 

				// for true and false question
				if (choice ==1){

					IVotingService service1 = new IVotingService();
					service1.getQuestionType("True or False");

					int numStudents=randomGenerator.nextInt(40);
					// generate the number of students 
					System.out.println("Number of Students:" + numStudents);
					service1.addStudents(numStudents);
					String answer="";

					for (int i =0; i < numStudents; i++){
						int ans = randomGenerator.nextInt(2);
						if (ans==0){
							answer="True";
						}
						else{
							answer="False";
						}
						service1.setAnswer(i, answer);
					}
					// random student changing their answer
					System.out.println("CHANGING THE ANSWER");
					int ans = randomGenerator.nextInt(2);
					if (ans==0){
						answer="True";
					}
					else{
						answer="False";
					}
					service1.setAnswer(randomGenerator.nextInt(numStudents), answer);
					service1.getFinalAnswer();
					service1.answerStats();
				}

				// for multiple choice question
				else if (choice == 2){
					IVotingService service1 = new IVotingService();
					service1.getQuestionType("MCQ");
					
					// generate number of students
					int numStudents=randomGenerator.nextInt(40);
					System.out.println("Number of Students Generated are:"+ numStudents);
					service1.addStudents(numStudents);
					String answer="";
					for (int i =0; i < numStudents;i++){
						int ans = randomGenerator.nextInt(4);
						if (ans==0){
							answer="A";
						}
						else if (ans==1){
							answer="B";
						}
						else if (ans==2){
							answer="C";
						}
						else if (ans==3){
							answer="D";
						}
						service1.setAnswer(i, answer);
					}

					// random student changing answer
					System.out.println("CHANGING THE ANSWER");
					int ans = randomGenerator.nextInt(4);
					if (ans == 0){
						answer="A";
					}
					else if (ans ==1 ){
						answer="B";
					}
					else if (ans ==2 ){
						answer="C";
					}
					else if (ans == 3){
						answer="D";
					}
					service1.setAnswer(randomGenerator.nextInt(numStudents), answer);
					service1.getFinalAnswer();
					service1.answerStats();

				}
		}
	
	}
}
