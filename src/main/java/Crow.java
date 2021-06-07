public class Crow extends Bird implements Flyable {
    static  int count = 0;
    public Crow(String id){
        this.id = id;
    }

    public void eat() {
        System.out.println("crow is eating");
    }

    @Override
    public void fly() {
        System.out.println("crow is flying");
    }

    @Override
    int getCount(){
        return count;
    }

    @Override
    void incrementCount(){
        count++;
    }

    @Override
    void decrement(){
        count--;
    }
}


