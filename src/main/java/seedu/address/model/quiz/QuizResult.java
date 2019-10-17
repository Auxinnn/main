package seedu.address.model.quiz;

import java.util.Objects;

import seedu.address.model.question.Answer;
import seedu.address.model.question.QuestionBody;

/**
 * Represents a question. Its answer, questionBody, quizTime and result are guaranteed non-null.
 */
public class QuizResult {
    private final Answer answer;
    private final QuestionBody questionBody;
    private final String quizTime;
    private final boolean result;

    public QuizResult(Answer answer, QuestionBody questionBody, String quizTime, boolean result) {
        this.answer = answer;
        this.questionBody = questionBody;
        this.quizTime = quizTime;
        this.result = result;
    }

    public Answer getAnswer() {
        return answer;
    }

    public QuestionBody getQuestionBody() {
        return questionBody;
    }

    public String getQuizTime() {
        return quizTime;
    }

    public boolean getResult() {
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof QuizResult)) {
            return false;
        }

        QuizResult otherQuizResult = (QuizResult) other;
<<<<<<< HEAD
        return otherQuizResult.getQuestionBody().equals(getQuestionBody());
=======
        return otherQuizResult.getQuizTime().equals(getQuizTime());
>>>>>>> 9b56a138d1200f66ac914863790197ce79798407
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer, questionBody, quizTime, result);
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return answer.toString() + " " + questionBody.toString();
    }
=======
>>>>>>> 9b56a138d1200f66ac914863790197ce79798407
}
