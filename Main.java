import java.util.*;

import exam.*;
import users.*;
import result.*;
import records.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        QuizManager.loadDefaultQuiz();

        while (true) {
            System.out.println("\n=================================");
            System.out.println("\n=========== EXAMS HUB ===========");
            System.out.println("\n=================================");
            System.out.println("1. Student Login");
            System.out.println("2. Teacher Login");
            System.out.println("3. Admin Login");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    studentPanel();
                    break;

                case 2:
                    teacherPanel();
                    break;

                case 3:
                    adminPanel();
                    break;

                case 4:
                    System.out.println("System Closed...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // ================= STUDENT PANEL =================

    public static void studentPanel() {

        System.out.println("\n=========== STUDENT LOGIN ===========");
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        Student student = null;

        for (Student s : DataStore.students) {

            if (s.getId().equals(id)
                    && s.getPassword().equals(pass)) {

                student = s;
                break;
            }
        }

        if (student == null) {

            System.out.println("Invalid Login");
            return;
        }

        while (true) {
            System.out.println("\n=====================================");
            System.out.println("\n=========== STUDENT MENU ============");
            System.out.println("\n=====================================");
            System.out.println("1. Attempt MCQ Quiz");
            System.out.println("2. Attempt Question/Answer Quiz");
            System.out.println("3. Back");

            System.out.print("Enter Choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    attemptMCQQuiz(student);
                    break;

                case 2:
                    attemptQAQuiz(student);
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // ================= MCQ QUIZ =================

    public static void attemptMCQQuiz(Student student) {

        int score = 0;

        for (Question q : QuizManager.questions) {

            if (q.isMcq()) {

                System.out.println("\n" + q.getQuestion());

                System.out.println("A. " + q.getA());
                System.out.println("B. " + q.getB());
                System.out.println("C. " + q.getC());
                System.out.println("D. " + q.getD());

                String ans;

                while (true) {

                    System.out.print("Enter Answer (A/B/C/D): ");
                    ans = sc.nextLine().toUpperCase();

                    if (ans.equals("A")
                            || ans.equals("B")
                            || ans.equals("C")
                            || ans.equals("D")) {

                        break;

                    } else {

                        System.out.println(
                                "ERROR: Enter only A/B/C/D");
                    }
                }

                if (ans.equalsIgnoreCase(q.getCorrect())) {
                    score++;
                }
            }
        }

        Result.showResult(score, QuizManager.questions.size());
    }

    // ================= QUESTION ANSWER QUIZ =================

    public static void attemptQAQuiz(Student student) {

        int score = 0;

        for (Question q : QuizManager.questions) {

            if (!q.isMcq()) {

                System.out.println("\n" + q.getQuestion());

                System.out.print("Enter Answer: ");
                String ans = sc.nextLine();

                if (ans.equalsIgnoreCase(q.getCorrect())) {
                    score++;
                }
            }
        }

        Result.showResult(score, QuizManager.questions.size());
    }

    // ================= TEACHER PANEL =================

    public static void teacherPanel() {

        System.out.println("\n=========== TEACHER LOGIN ===========");

        System.out.print("Enter Teacher ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Teacher Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        Teacher teacher = null;

        for (Teacher t : DataStore.teachers) {

            if (t.getId().equals(id)
                    && t.getPassword().equals(pass)) {

                teacher = t;
                break;
            }
        }

        if (teacher == null) {

            System.out.println("Invalid Login");
            return;
        }

        while (true) {
            System.out.println("\n=====================================");
            System.out.println("\n=========== TEACHER MENU ============");
            System.out.println("\n=====================================");
            System.out.println("1. Make MCQ Quiz");
            System.out.println("2. Make Question/Answer Quiz");
            System.out.println("3. Delete Quiz Question");
            System.out.println("4. View Attempt Record");
            System.out.println("5. Back");

            System.out.print("Enter Choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                // ================= ADD MCQ =================

                case 1:

                    System.out.print("Enter Question: ");
                    String q = sc.nextLine();

                    System.out.print("Option A: ");
                    String a = sc.nextLine();

                    System.out.print("Option B: ");
                    String b = sc.nextLine();

                    System.out.print("Option C: ");
                    String c = sc.nextLine();

                    System.out.print("Option D: ");
                    String d = sc.nextLine();

                    String correct;

                    while (true) {

                        System.out.print(
                                "Correct Option (A/B/C/D): ");

                        correct = sc.nextLine().toUpperCase();

                        if (correct.equals("A")
                                || correct.equals("B")
                                || correct.equals("C")
                                || correct.equals("D")) {

                            break;

                        } else {

                            System.out.println(
                                    "ERROR: Enter only A/B/C/D");
                        }
                    }

                    QuizManager.addMCQQuestion(
                            q, a, b, c, d, correct);

                    System.out.println(
                            "MCQ Quiz Added Successfully");

                    break;

                // ================= ADD QA =================

                case 2:

                    System.out.print("Enter Question: ");
                    String ques = sc.nextLine();

                    System.out.print("Enter Correct Answer: ");
                    String ans = sc.nextLine();

                    QuizManager.addQuestionAnswerQuiz(
                            ques,
                            ans);

                    System.out.println(
                            "Question/Answer Quiz Added Successfully");

                    break;

                // ================= DELETE QUESTION =================

                case 3:

                    System.out.println(
                            "\n=========== QUIZ QUESTIONS ===========");

                    for (int i = 0; i < QuizManager.questions.size(); i++) {

                        System.out.println(
                                (i + 1) + ". "
                                        + QuizManager.questions
                                                .get(i)
                                                .getQuestion());
                    }

                    System.out.print(
                            "Enter Question Number To Delete: ");

                    int del = Integer.parseInt(sc.nextLine());

                    if (del >= 1
                            && del <= QuizManager.questions.size()) {

                        QuizManager.questions.remove(del - 1);

                        System.out.println(
                                "Question Deleted Successfully");

                    } else {

                        System.out.println("Invalid Number");
                    }

                    break;

                // ================= VIEW RECORD =================

                case 4:

                    System.out.println(
                            "\n=========== ATTEMPT RECORDS ===========");

                    if (DataStore.records.size() == 0) {

                        System.out.println(
                                "No Record Found Yet...");
                        System.out.println(
                                "No student has attempted the quiz.");

                    } else {

                        for (AttemptRecord r : DataStore.records) {
                            r.show();
                        }
                    }

                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // ================= ADMIN PANEL =================

    public static void adminPanel() {
        System.out.print("Enter Admin ID : ");
        String id = sc.nextLine();
        System.out.print("Enter Admin Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Pasword : ");
        String pass = sc.nextLine();
        while (true) {
            System.out.println("\n=====================================");
            System.out.println("\n============ ADMIN MENU =============");
            System.out.println("\n=====================================");
            System.out.println("1. Student Record");
            System.out.println("2. Teacher Record");
            System.out.println("3. Result Record");
            System.out.println("4. Back");

            System.out.print("Enter Choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    for (Student s : DataStore.students) {

                        System.out.println(
                                s.getId() + "  "
                                        + s.getName());
                    }

                    break;

                case 2:

                    for (Teacher t : DataStore.teachers) {

                        System.out.println(
                                t.getId() + "  "
                                        + t.getName());
                    }

                    break;

                case 3:

                    if (DataStore.records.size() == 0) {

                        System.out.println(
                                "No Record Found Yet...");
                        System.out.println(
                                "No student has attempted the quiz.");

                    } else {

                        for (AttemptRecord r : DataStore.records) {
                            r.show();
                        }
                    }

                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}