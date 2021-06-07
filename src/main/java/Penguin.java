public class Penguin extends Bird implements Swimable{
    static  int count = 0;
    public Penguin(String id){
        this.id = id;
    }

    public void eat(){
        System.out.println("Penguin is eating");
    }

    public void swin(){
        System.out.println("Penguin is swin");
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