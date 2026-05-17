package exam;

public class Question {

    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private String correct;

    // true = MCQ
    // false = Question/Answer
    private boolean mcq;

    public Question(String question,
            String a,
            String b,
            String c,
            String d,
            String correct,
            boolean mcq) {

        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.correct = correct;
        this.mcq = mcq;
    }

    public String getQuestion() {
        return question;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public String getCorrect() {
        return correct;
    }

    public boolean isMcq() {
        return mcq;
    }
}