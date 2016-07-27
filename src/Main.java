import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by georgec on 27.07.16.
 */
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sayHello();
        dog.eat("Pedigree");
        dog.love("everybody");
        dog.sleep();
        System.out.println("_____________");

        Humster faggot = new Humster();
        faggot.sayHello();
        faggot.eat("seeds");
        faggot.play();
        faggot.sleep();
        System.out.println("_____________");

        Cat cat = new Cat();
        cat.sayHello();
        cat.eat("fish");
        cat.hate("everybody");
        cat.play();
        cat.sleep();

    }
}
