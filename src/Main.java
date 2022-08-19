import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите что вас интересуе:");
            System.out.println("1 - Количестве пройденных шагов за определенный месяц");
            System.out.println("2 - Количества шагов за день");
            System.out.println("3 - статистики за определённый месяц");
            System.out.println("4 - Внести цель");
            System.out.println("5 - Добавить шаги в день");
            System.out.println("0 - выход");
            int startMenu = scanner.nextInt();
            if (startMenu == 1) {
                System.out.println("Выберите месяц по номеру 1-12 закоторый получить статистику, чтобы закрыть 0");
                int numberMonth = scanner.nextInt();
                if (numberMonth!=0) {
                    MonthEnum monthEnum = stepTracker.getMonthByNumber(numberMonth - 1);
                    Integer sum = stepTracker.CurrentSteps(monthEnum);
                    System.out.printf("За %s месяц вы прошли %d шагов.%n", monthEnum.name(), sum);
                } else break;
            }
            if (startMenu == 2) {
                System.out.println("Выберите месяц 1-12");
                MonthEnum monthEnum = stepTracker.getMonthByNumber(scanner.nextInt() - 1);
                System.out.println("Выберите день месяца 1-30");
                int day = scanner.nextInt();
                if (day>=30 && day<0) System.out.println("Ввели день выходящий за статистику");
                else {
                    int stepDay = stepTracker.getStepInDay(monthEnum, day);
                    System.out.printf("В этот день вы сделали %s шагов. Ваша цель %s.%n", stepDay, stepTracker.GoalInDay(stepDay));
                }
            }
            if (startMenu == 3){
                System.out.println("Выберите месяц по номеру 1-12 закоторый получить статистику");
                MonthEnum monthEnum = stepTracker.getMonthByNumber(scanner.nextInt() - 1);
                Integer sum = stepTracker.CurrentSteps(monthEnum);
                System.out.printf("За %s месяц вы прошли %d шагов.%n", monthEnum.name(), sum);
                System.out.printf("В среднем %s шагов в день.%n",(sum/30));

            }
            if (startMenu == 4){
                System.out.println("Введите цель");
                int goal = scanner.nextInt();
                stepTracker.Goal(goal);
                System.out.printf("Цель теперь %s.%n",goal);
            }
            if (startMenu == 5){
                System.out.println("Выберите месяц 1-12");
                MonthEnum monthEnum = stepTracker.getMonthByNumber(scanner.nextInt() - 1);
                System.out.println("Выберите день месяца 1-30");
                Integer day = scanner.nextInt();
                System.out.println("Введите количество шагов");
                stepTracker.addSteps(monthEnum,day,scanner.nextInt());
            }
            if (startMenu == 0){
                System.out.println("Выход");
                break;
            }
        }
    }
}

