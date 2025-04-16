package lab7.task3.objects;

public class Stereo {
    public void setCD(){
        System.out.println("Вставлен CD");
    }
    public void setDVD(){
        System.out.println("Вставлен DVD");
    }
    public void setVolume(Integer volume){
        System.out.println("Громкость звука " + volume);
    }

    public void on(){
        System.out.println("Проигрыватель включен");
    }
    public void off(){
        System.out.println("Проигрыватель выключен");
    }
}
