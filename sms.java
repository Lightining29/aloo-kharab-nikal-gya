
import java.util.*;

/* ------------------------------- inheritance ------------------------------ */
//INFO:it is a student class
class student {

    int roll_no;
    String apka_naam;
    String college_name;
    int total;
    double per;

    // NOTE:it is a constructor
    public student() {
        System.out.println("aapka swagat hai");
    }

    public void student_reg(int roll_no, String apka_naam, String college_name, int total) {
        this.roll_no = roll_no;
        this.college_name = college_name;
        this.total = total;
        this.apka_naam = apka_naam;

    }

    // HACK: here are all things displaying
    public void display() {
        System.err.println("student rollno=" + this.roll_no);
        System.err.println("name=" + this.apka_naam);
        System.err.println("college ka naam =" + this.college_name);
        System.err.println("total=" + this.total);
        per = total / 5;
        System.err.println("total percentage=" + per);
        if (per > 60) {
            System.out.println("bahut badhiya");
        } else if (per < 50) {
            System.out.println("mehnat kro");
        } else if (per < 33) {
            System.out.println("failure");

        }

    }
}

// TODO:it is the main class here
class sms {

    public static void main(String[] args) {
        // INFO:here we taking all inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your rollno");
        int roll_no = sc.nextInt();
        // BUG:option is not showing to enter my name
        System.out.println("");
        sc = new Scanner(System.in);
        String apka_naam = sc.nextLine();
        System.out.println("enter your college name ");
        String college_name = sc.nextLine();
        System.out.println("enter total marks");
        int total = sc.nextInt();
        student st = new student();
        st.student_reg(roll_no, apka_naam, college_name, total);
        st.display();
    }
}
