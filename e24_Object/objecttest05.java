import java.util.Objects;

public class objecttest05 {
    public static void main(String[] args) {
        Student s1 = new Student(123,"HDU" );
        Student s2 = new Student(123,"HDU" );
        System.out.println(s1.equals(s2));
    }
}
class Student{
    int no;
    String school;

    public Student(){}
    public Student(int no ,String school){
        this.no = no;
        this.school= school;
    }
    public String toString(){
        return "xuehao:"+no+"school:"+school;
    }
/*
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no && Objects.equals(school, student.school);
    }
*/

    public boolean equals(Object o){
        if (this == o)return true;
        if ( o == null || !(o instanceof Student) )return false;
        Student student =(Student) o;
        return no==student.no && this.school.equals(student.school);
    }

}