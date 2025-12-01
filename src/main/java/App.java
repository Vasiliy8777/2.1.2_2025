import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHw =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(beanHw == bean);
        Cat beanCat = (Cat) applicationContext.getBean("Cat");
        Cat beanCatNew = (Cat) applicationContext.getBean("Cat");
        System.out.println(beanCat.getName());
        System.out.println(beanCatNew == beanCat);
    }
}