abstract class animal{
    protected String name;
    public animal (String name){
        this.name = name;
    }
    abstract String getName();

    protected String getInfo(){
        return "animal: "+name;
    }
}

class cat extends animal{
    int age;
    public cat(String name, int age){
        super(name);
        this.age = age;
    }
    protected String getName(){
        return name;
    }
    @Override
    protected String getInfo(){
        return name+" "+age;
    }

}

public class test{
    public static void main(String[] args){
        cat qoravoy = new cat("Mosh", 32);
        System.out.println(qoravoy.getName());
        System.out.println(qoravoy.getInfo());
    }
}