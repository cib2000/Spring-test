import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] ars){
        Source source1=new Source();
        source1.fruit="banana";
        source1.sugar="candy";
        source1.size="small";
        source1.out();

        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext(
                        "ApplicationContext.xml");
        Source source2=(Source)applicationContext.getBean("source");
        source2.out();

        Juice juice=(Juice)applicationContext.getBean("juice");
        juice.out();

    }
}
