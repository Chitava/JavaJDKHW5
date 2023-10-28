import java.util.ArrayList;

public class Room {
    private volatile boolean[] forks;
    private volatile boolean finish;
    private volatile ArrayList<Monk> monks;
    private volatile int fedMonk;

    public Room() {
        this.forks = new boolean[] {true, true, true, true, true, true};
        monks = new ArrayList<>();
    }

    public boolean getFork(int i){
        return forks[i];
    }

    public void takeFork(int i){
        forks[i] = false;
    }

    public void returnFork(int i){
        forks[i] = true;
    }

    public int getLenth(){
        return forks.length;
    }

    public void printFork(int i){
        System.out.println(forks[i]);
    }

    public boolean isFinish(){
        if (fedMonk == 5){
            finish = true;
        }
        return finish;
    }

    public void fullFedMonk(){
        fedMonk++;
    }

}
