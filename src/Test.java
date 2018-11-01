import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] ars){
        人 Person=new 人();
        Person.姓名="磊磊";
        Person.自我介绍();

        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext(
                        "ApplicationContext.xml");
        人 person=(人)applicationContext.getBean("Person");
        person.自我介绍();

    }
}
