import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        player pl = new player();
        monster m = new monster();
        pl.inital();
        m.inital();
        sc.nextLine();
        while(pl.hp > 0){
            pl.hp = m.fight(pl.hp);
            pl.outhp();
            if(pl.hp <= 0){
                System.out.println("вы умерли");
                break;
            }
            sc.nextLine();
            m.hp = pl.fight(m.hp);
            m.outhp();

            if(m.hp <= 0){
                System.out.println("он умер");
                break;
            }
            sc.nextLine();
        }
    }

}