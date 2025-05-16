package ObjectClass;

public class Subject {

    private int student_id ;
    private int dep_id ;
    private int subject_id;
    private int mark;


    public Subject(int student_id , int dep_id ,int subject_id , int mark){
        this.dep_id=dep_id;
        this.student_id=student_id;
        this.subject_id=subject_id;
        this.mark=mark;
    }


    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Subject(){

    }
}
