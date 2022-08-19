import java.util.Scanner;

public class TargetMenu {
    private static final StepTracker stepTracker = new StepTracker();
    private static final Scanner scanner = new Scanner(System.in);

    public static void Teg(Integer number) {
        switch (number) {
            case 1: {
                Integer numberMonth = ChoMonth();
                Integer sum = stepTracker.CurrentSteps(numberMonth);
                System.out.printf("За %s месяц вы прошли %d шагов.%n", stepTracker.getMonthName(numberMonth), sum);
                break;
            }
            case 2: {
                Integer numberMonth = ChoMonth();
                int day = ChoDay();
                int stepDay = stepTracker.getStepInDay(numberMonth, day);
                System.out.printf("В этот день вы сделали %s шагов. Ваша цель %s.%n", stepDay, stepTracker.getGoal());
                break;
            }
            case 3: {
                Integer numberMonth = ChoMonth();
                Integer sum = stepTracker.CurrentSteps(numberMonth);
                System.out.printf("За %s месяц вы прошли %d шагов.%n", stepTracker.getMonthName(numberMonth), sum);
                System.out.printf("В среднем %s шагов в день.%n", (sum / 30));
                break;
            }
            case 4: {
                System.out.println("Введите новую цель");
                int a = scanner.nextInt();
                stepTracker.setGoal(a);
                System.out.printf("Цель теперь %s.%n", a);
                break;
            }
            case 5: {
                Integer numberMonth = ChoMonth();
                int day = ChoDay();
                System.out.println("Введите количество шагов");
                stepTracker.addSteps(numberMonth, day, scanner.nextInt());
                break;
            }
            case 0: System.out.println("Выход.");
                System.exit(0);
            default:
                System.out.println("Некорректное значение.");
        }
    }

    private static Integer ChoMonth() {
        boolean pin = true;
        Integer numberMonth = null;
        while (pin) {
            System.out.println("Выберите месяц по номеру 1-12");
            numberMonth = scanner.nextInt();
            if (0 < numberMonth && 12 >= numberMonth) {
                pin = false;
            }
        }
        return numberMonth;
    }

    private static Integer ChoDay() {
        boolean pin = true;
        Integer numberDay = null;
        while (pin) {
            System.out.println("Выберите день месяца 1-30");
            numberDay = scanner.nextInt();
            if (0 < numberDay && 30 >= numberDay) {
                pin = false;
            }
        }
        return numberDay;
    }
}
