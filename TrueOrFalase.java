public class TrueOrFalase implements Question {
	private int[] answerCount = {0, 0};

	public String printAnswer() {
		return ("True: " + answerCount[0] + "\nFalse: " + answerCount[1]);
	}

	public void addAnswers(Answer a) {

		if (a.getAnswer().toUpperCase() == "T") {
			answerCount[0]++;
		} else if (a.getAnswer().toUpperCase() == "F") {
			answerCount[1]++;
		}

	}

}

