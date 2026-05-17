package exam;

import java.util.*;

public class QuizManager {

        public static String quizTitle = "Software Development Life Cycle (SDLC) Quiz";

        public static ArrayList<Question> questions = new ArrayList<>();

        // ================= LOAD DEFAULT QUIZ =================

        public static void loadDefaultQuiz() {

                if (questions.size() == 0) {

                        questions.add(new Question(
                                        "What does SDLC stand for?",
                                        "Software Development Life Cycle",
                                        "System Design Level Cycle",
                                        "Software Data Life Cycle",
                                        "System Development Link Cycle",
                                        "A",
                                        true));

                        questions.add(new Question(
                                        "Which phase comes first in SDLC?",
                                        "Testing",
                                        "Planning",
                                        "Deployment",
                                        "Maintenance",
                                        "B",
                                        true));

                        questions.add(new Question(
                                        "Which SDLC model follows sequential phases?",
                                        "Agile Model",
                                        "Spiral Model",
                                        "Waterfall Model",
                                        "RAD Model",
                                        "C",
                                        true));

                        questions.add(new Question(
                                        "Requirement gathering is done in which phase?",
                                        "Analysis",
                                        "Maintenance",
                                        "Testing",
                                        "Deployment",
                                        "A",
                                        true));

                        questions.add(new Question(
                                        "Which phase converts requirements into software design?",
                                        "Planning",
                                        "Coding",
                                        "Design",
                                        "Maintenance",
                                        "C",
                                        true));

                        questions.add(new Question(
                                        "Debugging is mainly performed during?",
                                        "Testing Phase",
                                        "Planning Phase",
                                        "Requirement Phase",
                                        "Maintenance Phase",
                                        "A",
                                        true));

                        questions.add(new Question(
                                        "Which SDLC model is best for small projects?",
                                        "Waterfall",
                                        "Agile",
                                        "Spiral",
                                        "Prototype",
                                        "A",
                                        true));

                        questions.add(new Question(
                                        "Which document contains software requirements?",
                                        "SRS",
                                        "DFD",
                                        "ERD",
                                        "UML",
                                        "A",
                                        true));

                        questions.add(new Question(
                                        "Which phase comes after coding?",
                                        "Planning",
                                        "Design",
                                        "Testing",
                                        "Analysis",
                                        "C",
                                        true));

                        questions.add(new Question(
                                        "Software maintenance is performed after?",
                                        "Deployment",
                                        "Planning",
                                        "Requirement Analysis",
                                        "Design",
                                        "A",
                                        true));

                }
        }

        // ================= ADD MCQ =================

        public static void addMCQQuestion(
                        String question,
                        String a,
                        String b,
                        String c,
                        String d,
                        String correct) {

                questions.add(
                                new Question(
                                                question,
                                                a,
                                                b,
                                                c,
                                                d,
                                                correct,
                                                true));
        }

        // ================= ADD QA QUIZ =================

        public static void addQuestionAnswerQuiz(
                        String question,
                        String answer) {
                questions.add(new Question(
                                "Software maintenance is performed after?",
                                "Deployment",
                                "Planning",
                                "Requirement Analysis",
                                "Design",
                                "A",
                                true));

                // ================= QUESTION ANSWER QUIZ =================

                questions.add(new Question(
                                "What is SDLC?",
                                "",
                                "",
                                "",
                                "",
                                "Software Development Life Cycle",
                                false));

                questions.add(new Question(
                                "Which SDLC model is flexible?",
                                "",
                                "",
                                "",
                                "",
                                "Agile",
                                false));
                questions.add(
                                new Question(
                                                question,
                                                "",
                                                "",
                                                "",
                                                "",
                                                answer,
                                                false));
        }
}