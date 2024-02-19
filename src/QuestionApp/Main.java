package QuestionApp;

public class Main {
    public static void main(String[] args) {
        QuestionService play = new QuestionService();
        play.displayQuestion();
        play.playQuiz();
        play.score();
    }
}
