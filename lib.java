import java.util.Scanner;
public class lib {
    static int get_num(){
        Scanner iScanner = new Scanner (System.in);
        System.out.println("Введите количество блинов : ");
        int n = iScanner.nextInt();
        iScanner.close();
        return n;
        }
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
        
    }
    
}
