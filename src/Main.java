import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Cat cat1 = new Cat();
        System.out.println("Enter cat's name: ");
        cat1.setName(reader.readLine());
        System.out.println("Enter cat's food: ");
        cat1.setFood(reader.readLine());
        System.out.println("Enter cat's place of living: ");
        cat1.setPlaceOfLiving(reader.readLine());
        cat1.introduction();

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
        System.out.println("_____________");

        cat.setName("Adolf");
        cat.setFood("Jews");
        cat.setPlaceOfLiving("in Berlin.");
        cat.introduction();
    }
}
