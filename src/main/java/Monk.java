public class Monk extends Thread{
    private String name;
    private boolean leftForkInArm;
    private boolean rightForkInArm;
    private int leftArm;
    private int rightArm;
    private Room room;
    private int quantity = 3;

    public Monk(String name, int leftArm, int rightArm, Room room) {
        this.room = room;
        this.name = name;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
    }

    @Override
    public void run() {
        while (room.isFinish()==false){
            if (quantity == 0){
                room.fullFedMonk();
                interrupt();
            }else {
                leftForkInArm = room.getFork(leftArm);
                rightForkInArm = room.getFork(rightArm);

                if (leftForkInArm && rightForkInArm){
                    room.takeFork(leftArm);
                    room.takeFork(rightArm);
                    eat();
                    quantity--;
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    room.returnFork(leftArm);
                    room.returnFork(rightArm);
                }else {
                    think();
                }
            }


        }
    }

    public void eat(){
        System.out.println("Монах " + name + " ест");
    }

    public void think(){
        System.out.println("Монах " + name + " думает");
    }
}
