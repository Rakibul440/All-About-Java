
class Student{
    private String rollNo;
    private String name;
    private String dept;
    private String subject;

    public String getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public Student(String roll, String name, String dept){
        this.rollNo = roll;
        this.name = name ;
        this.dept = dept;
        this.subject = "Set your subject name";
    }
    public Student(String roll, String name, String dept,String subject){
        this.rollNo = roll;
        this.name = name ;
        this.dept = dept;
        this.subject = subject;
    }
}

class Subject{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public String getSubId(){
        return subId;
    }
    public String getName() {
        return name;
    }
    public int getMaxMarks() {
        return maxMarks;
    }
    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(int maxMarks){
        this.maxMarks = maxMarks;
    }
    public void setMarksObtain(int marksObtain){
        this.marksObtain = marksObtain;
    }

    public Subject(String subId, String name){
        this.subId = subId;
        this.name = name;
        this.maxMarks = 100;
        this.marksObtain = 0;
    }
    public Subject(String subId, String name,int maxMarks, int marksObtain){
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
    }

    public void subDetails(){
        System.out.println("Subject ID : "+ getSubId());
        System.out.println("Subject name : "+getName());
        System.out.println("Maximum marks : "+getMaxMarks());
        System.out.println("Marks obtained : "+getMarksObtain());
    }

}

public class ArrayOfObject {
    public static void main(String[] args) {
        //Creating a Array of object
        Subject sub[] = new Subject[3];

        sub[0] = new Subject("BSC101","Math",100,90);
        sub[1] = new Subject("BSC102","DSA",100,80);
        sub[2] = new Subject("BSC103","Physics",100,75);

        for(Subject s: sub){
            s.subDetails();
            System.out.println("");
        }


    }
}
