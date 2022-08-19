import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StartMenu();
        TargetMenu.Teg(scanner.nextInt());
    }


    private static void StartMenu() {
        System.out.println("Выберите что вас интересуе:");
        System.out.println("1 - Количестве пройденных шагов за определенный месяц");
        System.out.println("2 - Количества шагов за день");
        System.out.println("3 - статистики за определённый месяц");
        System.out.println("4 - Внести цель");
        System.out.println("5 - Добавить шаги в день");
        System.out.println("0 - выход");
    }

}

