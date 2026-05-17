package records;

public class AttemptRecord {

    private String studentId;
    private String studentName;
    private int marks;
    private long time;

    public AttemptRecord(String studentId,
            String studentName,
            int marks,
            long time) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
        this.time = time;
    }

    public void show() {

        System.out.println(
                "ID: " + studentId +
                        " | Name: " + studentName +
                        " | Marks: " + marks +
                        " | Time: " + time + " sec");
    }
}