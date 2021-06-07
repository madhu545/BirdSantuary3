public class Parrot extends Bird implements Flyable {
    static  int count = 0;

    public Parrot(String id){
        this.id = id;
    }
    public void eat() {
        System.out.println("parrot is eating");
    }

    @Override
    public void fly() {
        System.out.println("parrot is flying");
    }

    @Override
    int getCount(){
        return count;
    }

    @Override
    void incrementCount(){ count++; }

    @Override
    void decrement(){
        count--;
    }

}
