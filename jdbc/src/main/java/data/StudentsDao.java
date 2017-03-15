package data;

/**
 * Created by Oleg on 3/14/2017.
 */
public interface StudentsDao {

   void addStudent(Student student);
   Student getStudentById(int id);

}
