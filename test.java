abstract class animal{
    protected String name;
    protected int age;

    protected animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    //usage of abstract method, subclass must implement this
    protected abstract void speaks();
    //concrete method, subclass can override this.
    protected void getInfo(){
        System.out.printf("name: %s and age: %d",name,age);
    }
}

class cat extends animal{
    protected String color;
    public cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    protected void speaks(){
        System.out.println("\n meow");
    }
    @Override
    protected void getInfo(){
        System.out.printf("a %s cat whose name is %s and its age is %d",color, name, age);
    }
}

public class test{
    public static void main(String[] args){
        cat regularCat = new cat("Mosh", 4, "grey");
        regularCat.getInfo();
        regularCat.speaks();
    }
}