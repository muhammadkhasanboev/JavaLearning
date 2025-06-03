class testClass <T>{
    protected T name;
    protected T id;

    protected testClass (T name, T id){
        this.name = name;
        this.id = id;
    }

    protected T getName(){
        return name;
    }

    protected T getId(){
        return id;
    }
}

public class genericTest{
    public static void main(String[] args){
        testClass <String> test = new testClass<>("Jack", "1");
        System.out.println(test.getName()+" "+test.getId());
    }
}