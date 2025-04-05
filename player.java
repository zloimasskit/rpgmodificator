import java.util.Random;
import java.util.Scanner;

public class player {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    int min = 10;
    int hp;
    int attack;
    public void inital(){
        System.out.println("хп игрока");
        hp = sc.nextInt();
        System.out.println("ведите ваш макс урон(минимальный 10)");
        attack = sc.nextInt();

    }
    public void outhp(){
        System.out.println("хп игрока = " + hp);
    }
    public int fight(int hpp){
        System.out.println("бьете вы");
        hp = hpp - r.nextInt(min, attack);
        System.out.println("нанесли урона " + (hpp - hp));
        return hp;
    }
}
