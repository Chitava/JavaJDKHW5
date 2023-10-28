
public class Main {
    public static void main(String[] args) {
        Room room = new Room();
        Monk monk1 = new Monk("Кеша",0, 1, room);
        Monk monk2 = new Monk("Леша",1, 2, room);
        Monk monk3 = new Monk("Вениамин",2, 3, room);
        Monk monk4 = new Monk("Петр",3, 4, room);
        Monk monk5 = new Monk("Семен",4, 5, room);
        monk1.start();
        monk2.start();
        monk3.start();
        monk4.start();
        monk5.start();
        }
    }
