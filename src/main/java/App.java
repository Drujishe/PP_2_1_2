import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld world1 = applicationContext.getBean(HelloWorld.class);
        HelloWorld world2 = applicationContext.getBean(HelloWorld.class);
        System.out.println( "HelloWorld's link equals - " + (world1 == world2) );

        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);
        System.out.println( "Cat's link equals - " + (cat1 == cat2) );
    }
}