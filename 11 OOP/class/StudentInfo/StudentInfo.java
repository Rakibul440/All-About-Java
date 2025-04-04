
class Student{
    public int roll ;
    public String name;
    public String course;
    public float marks1 , marks2, marks3;

    public float totalMarks(){
        return marks1 + marks2 + marks3;
    }

    public float avgMarks(){
        return (marks1 + marks2 + marks3) / 3 ;
    }

    public char grade(){
        if(avgMarks() >= 60){
           return 'A';
        }else{
            return 'B';
        }
    }

    public void Details(){
        System.out.println("*******Student Details********");
        System.out.println("Name : "+ name);
        System.out.println("Roll : "+ roll);
        System.out.println("Course : "+ course);
        System.out.println("Total Marks : "+ totalMarks());
        System.out.println("Grade : "+ grade());
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Rakibul Islam Mondal";
        st.course = "CSE";
        st.roll = 31;
        st.marks1 = 90;
        st.marks2 = 80;
        st.marks3 = 70;

        System.out.println(st.grade());

        st.Details();
        
    }    
}
