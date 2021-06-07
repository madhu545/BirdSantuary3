public class Duck extends Bird implements Flyable, Swimable {
    static  int count = 0;
    public Duck(String id){
        this.id = id;
    }

    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void swin() {
        System.out.println("Duck is swin");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
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
