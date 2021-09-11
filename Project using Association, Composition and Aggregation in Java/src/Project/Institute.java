package Project;

import java.util.List;

public class Institute {
    String name;
    List<Department> departments;
    Institute(String name ,  List<Department> departments)
    {
        this.name = name;
        this.departments = departments;
    }
    public int getTotalNoOfStudent()
    {
        int countOfStudent = 0;
        List<Student> listOfStudent;
        for(Department dept : departments)
        {
            listOfStudent = dept.getStudentsList();
            for(Student s : listOfStudent)
            {
                countOfStudent = countOfStudent + 1;
            }
        }

        return countOfStudent;
    }
    void print1()
    {
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Unviersity Name : "+this.name);
        System.out.println("++++++++++++++++++++++++++");
        for(Department dept : departments)
        {
            List<Student> student = dept.studentsList;
            for(Student st : student)
            {
                System.out.println("Department Name : "+st.dept);
                System.out.println("Student Name : "+st.name);
                System.out.println("CMS ID : "+st.cmsId);
                System.out.println("Semester : "+st.semester);
                System.out.println("-----------------------------------");
            }

        }


    }


}
class Department
{
    String name;
    List<Student> studentsList;
    Department(String name , List<Student> studentsList)
    {
        this.name = name;
        this.studentsList = studentsList;
    }
    List<Student> getStudentsList()
    {
        return  studentsList;
    }
}
class Student
{
    String name;
    String cmsId;
    String semester;
    String dept;

    Student(String name , String cmsId, String semester,String dept)
    {
        this.name = name;
        this.cmsId = cmsId;
        this.semester  = semester;
        this.dept = dept;
    }
}
