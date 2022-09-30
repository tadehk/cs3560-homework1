import java.util.ArrayList;

public class IVotingService {

	// array list
	ArrayList<Student> studentList = new ArrayList<Student>();
	Question question;


	public void getQuestionType(String type) {
		if (type.equalsIgnoreCase("T/F")) {
			question = new TrueOrFalase();
		} else if (type.equalsIgnoreCase("MCQ")) {
			question = new MultipleChoice();
		}
	}


	public void addStudents(int numberOfStudents) {
		for (int i = 1; i <= numberOfStudents; i++) {
			studentList.add(new Student(i));
		}
	}
	

	public void setAnswer(int studentID, String answer) {
		System.out.println("Student " + studentID + "\tAnswer=" + answer);
		studentList.get(studentID).setAnswer(answer);
	}


	public void getFinalAnswer() {
		for (Student s:studentList){
		question.addAnswers(s.getAnswer(null));
		}
	}
	
	public void answerStats() {
		System.out.println(question.printAnswer());
	}

}
