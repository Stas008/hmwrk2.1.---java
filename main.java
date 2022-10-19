/** ХАНОЙСКИЕ БАШНИ
 * main
 */
public class main {
    public static void tower_game(String with, String on,  String some, int count){
        if (count>1){
            tower_game(with, some, on, count-1);
        }
        System.out.println("Переносим с "+with+" на "+on);
        if (count>1){
            tower_game(some, on, with, count-1);
        }
    }
    public static void main(String[] args) {
        tower_game("1", "3", "2",4);
    }
}