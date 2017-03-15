import data.Student;
import data.Teacher;
import data.WorkWithTeacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by Oleg on 3/15/2017.
 */
public class App {

    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        WorkWithTeacher workWithTeacher =
                (WorkWithTeacher) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher = workWithTeacher.addTeacher(teacher);
        teacher.setBirthDate(new Date());
        workWithTeacher.saveTeacher(teacher);


    }

}
