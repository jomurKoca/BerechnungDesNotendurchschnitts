import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int Physik;
        int Mathe;
        int Deutsch ;
        int Chemie;;
        int Geschichte;
        int Durchschnitt;

        Scanner display = new Scanner(System.in);
        System.out.println("Geben Sie Physiksnote ein:");
        Integer Physiknote = new Integer(display.nextLine());

        Scanner display1 = new Scanner(System.in);
        System.out.println("Geben Sie Mathenote ein:");
        Integer Mathenote = new Integer(display1.nextLine());

        Scanner display2 = new Scanner(System.in);
        System.out.println("Geben Sie Chemienote ein:");
        Integer Chemienote = new Integer(display2.nextLine());

        System.out.println(" Notendurchschnitt ist : " + (Mathenote+Physiknote+Chemienote)/3)
    }
}
