package lab4.task2.singleton;

public final class SingletonClass {
    private static SingletonClass instance;
    private Integer x;

    private SingletonClass(Integer x){
        this.x = x;
    }

    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass(0);
        }
        return instance;
    }

    public Integer getX() {
        return x;
    }

    public void incrementX() {
        this.x++;
    }
}
