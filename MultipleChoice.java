public class MultipleChoice implements Question {
	private int[] answerCount = { 0, 0, 0, 0 };
	// print out the answers
	public String printAnswer() { 
		return ("A: " + answerCount[0] + "\nB: " + answerCount[1]
				+ "\nC: " + answerCount[2] + "\nD: " + answerCount[3]);
	}

	public void addAnswers(Answer a) {

		if (a.getAnswer().toUpperCase() == "A") {
			answerCount[0]++;
		} else if (a.getAnswer().toUpperCase() == "B") {
			answerCount[1]++;
		} else if (a.getAnswer().toUpperCase() == "C") {
			answerCount[2]++;
		} else if (a.getAnswer().toUpperCase() == "D") {
			answerCount[3]++;
		}
	}

}

