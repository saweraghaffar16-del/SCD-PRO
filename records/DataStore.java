package records;

import java.util.*;

import users.*;

public class DataStore {

    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Teacher> teachers = new ArrayList<>();
    public static ArrayList<AttemptRecord> records = new ArrayList<>();
    public static ArrayList<Admin> admins = new ArrayList<>();

    static {

        // -------- STUDENTS --------

        students.add(new Student("BSSE012315001", "Muhammad Ali Farooqi", "BSSE012315001"));
        students.add(new Student("BSSE012315002", "Noor Fatima", "BSSE012315002"));
        students.add(new Student("BSSE012315006", "Syed Ali Murtaza", "BSSE012315006"));
        students.add(new Student("BSSE012315008", "Mirza Ali Hassan Baig", "BSSE012315008"));
        students.add(new Student("BSSE012315011", "Zainab Kashif", "BSSE012315011"));
        students.add(new Student("BSSE012315013", "Eman Usman", "BSSE012315013"));
        students.add(new Student("BSSE012315017", "Zara Fawaz", "BSSE012315017"));
        students.add(new Student("BSSE012315019", "Aaima Tanveer", "BSSE012315019"));
        students.add(new Student("BSSE012315021", "Sami Ullah", "BSSE012315021"));
        students.add(new Student("BSSE012315023", "Muhammad Abu Bakar", "BSSE012315023"));
        students.add(new Student("BSSE012315025", "Mouzzam Ali Khan", "BSSE012315025"));
        students.add(new Student("BSSE012315027", "Zoiya Summar", "BSSE012315027"));
        students.add(new Student("BSSE012315028", "Attiya Touqir", "BSSE012315028"));
        students.add(new Student("BSSE012315030", "Mohammed Tayyab Khokhar", "BSSE012315030"));
        students.add(new Student("BSSE012315033", "Amina Fayyaz", "BSSE012315033"));
        students.add(new Student("BSSE012315035", "Ayesha Farooq", "BSSE012315035"));
        students.add(new Student("BSSE012315036", "Alaina Asif", "BSSE012315036"));
        students.add(new Student("BSSE012315037", "Bilal Yasir", "BSSE012315037"));
        students.add(new Student("BSSE012315040", "Abeera Nadeem", "BSSE012315040"));
        students.add(new Student("BSSE012315041", "Andleeb Zahra", "BSSE012315041"));
        students.add(new Student("BSSE012315042", "Ume Hania", "BSSE012315042"));
        students.add(new Student("BSSE012315044", "Zareen Aziz", "BSSE012315044"));
        students.add(new Student("BSSE012315045", "Muzammil Ali", "BSSE012315045"));
        students.add(new Student("BSSE012315046", "Amina Maqsood", "BSSE012315046"));
        students.add(new Student("BSSE012315048", "Sawera Ghaffar", "BSSE012315048"));
        students.add(new Student("BSSE012315049", "Maryam Azhar", "BSSE012315049"));
        students.add(new Student("BSSE012315050", "Adnan Shabbir", "BSSE012315050"));
        students.add(new Student("BSSE012315051", "Danish Mahmood", "BSSE012315051"));
        students.add(new Student("BSSE012315054", "Adeena Noor Asif", "BSSE012315054"));

        // -------- TEACHERS --------

        teachers.add(new Teacher("T1", "Ikram", "12345"));
        teachers.add(new Teacher("T2", "Seemab", "123123"));
        teachers.add(new Teacher("T3", "Maryam", "09876"));

        admins.add(new Admin("A1", "Admin", "admin123"));
        admins.add(new Admin("A2", "Manager", "manager123"));
    }
}