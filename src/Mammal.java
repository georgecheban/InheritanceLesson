

public class Mammal {

    protected String name;
    protected String food;
    protected String placeOfLiving;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPlaceOfLiving(String placeOfLiving) {
        this.placeOfLiving = placeOfLiving;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void introduction(){
        System.out.println("My name is " + name + ". I eat " + food + ". I live " + placeOfLiving);
    }


    public void eat(String food){
        System.out.println("I am eating " + food);
    }
    public void love(String someOne){
        System.out.println("I love " + someOne);
    }
    public void hate(String everyOne){
        System.out.println("I hate " + everyOne);
    }

}
