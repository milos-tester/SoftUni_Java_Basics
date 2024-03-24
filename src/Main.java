import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String naziv=scanner.nextLine();
        int film=Integer.parseInt(scanner.nextLine());
        int vreme=Integer.parseInt(scanner.nextLine());
        double pauza;
        double rucak;
        double ukupno;
        pauza=vreme/8.0;
        rucak=vreme/4.0;
        ukupno=vreme-(pauza+rucak);
        //System.out.println(ukupno);
        if (film<=ukupno){
            int more_time = (int) Math.ceil(ukupno-film);
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.",naziv, more_time);
        }
        else {
            int need_time = (int) Math.ceil(film-ukupno);
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.", naziv, need_time);
        }
    }
}