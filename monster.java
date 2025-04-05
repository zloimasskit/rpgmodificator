import java.util.Random;
import java.util.Scanner;

public class monster {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);
    int min = 10;
    int hp;
    int attack;
    public void outhp(){
        System.out.println("хп монстра = " + hp);
    }
    public void inital() {
        System.out.println("хп монстра");
        hp = sc.nextInt();
        System.out.println("ведите его макс урон(минимальный 10)");
        attack = sc.nextInt();
    }
    public int fight(int hpp){
        System.out.println("бьет монстр");
        hp = hpp - r.nextInt(min, attack);
        System.out.println("нанес урона " + (hpp - hp));
        return hp;
    }


}
