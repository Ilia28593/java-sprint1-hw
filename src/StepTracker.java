import java.util.Scanner;

public class StepTracker {

    private static final Scanner scanner = new Scanner(System.in);
    private static int goal = 10000;

    public static int getGoal() {
        return goal;
    }

    public static void setGoal(int goals) {
        goal = goals;
    }

    public static void addSteps(Integer month, Integer day, Integer steps) {
        BaseSteps.setStat(month, day, steps);
    }

    public static Integer currentSteps(Integer month) {
        workingInfo monthName = BaseSteps.getStat().get(month);
        return monthName.getStepsByDay().values().stream().reduce(0, Integer::sum);
    }

    public static Integer getStepInDay(Integer month, Integer day) {
        return BaseSteps.getStat().get(month).getStepsByDay().get(day);
    }

    public static String getMonthName(Integer month) {
        return BaseSteps.getStat().get(month).getMonth().name();
    }

    static void staticStepsMonth() {
        Integer numberMonth = choMonth();
        Integer sum = currentSteps(numberMonth);
        System.out.printf("За %s месяц вы прошли %d шагов.%n", MonthEnum.valueOf(getMonthName(numberMonth)).getValue(), sum);
        Integer bestSteps = getStepInDay(numberMonth, 1);
        int bestDay = 0;
        for (int i = 2; i < 30; i++) {
            if (bestSteps < getStepInDay(numberMonth, i)) {
                bestSteps = getStepInDay(numberMonth, i);
                bestDay = i;
            }
        }
        System.out.printf("Лучший результат за месяц %s был сделан %s день.%n", bestSteps, bestDay);
    }

    public static void staticDay() {
        Integer numberMonth = choMonth();
        int day = choDay();
        int stepDay = getStepInDay(numberMonth, day);
        System.out.printf("В этот день вы сделали %s шагов. Ваша цель %s.%n", stepDay, getGoal());
        staticConverter(stepDay);
    }

    public static void staticMonth() {
        Integer numberMonth = choMonth();
        Integer sum = currentSteps(numberMonth);
        System.out.printf("За %s месяц вы прошли %d шагов.%n", MonthEnum.valueOf(getMonthName(numberMonth)).getValue(), sum);
        System.out.printf("В среднем %s шагов в день.%n", (sum / 30));
        staticConverter(sum);
    }

    public static void goal() {
        System.out.println("Введите новую цель");
        int a = scanner.nextInt();
        setGoal(a);
        System.out.printf("Цель теперь %s.%n", a);
    }

    public static void addStep() {
        Integer numberMonth = choMonth();
        int day = choDay();
        System.out.println("Введите количество шагов");
        addSteps(numberMonth, day, scanner.nextInt());
    }

    private static Integer choMonth() {
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

    private static Integer choDay() {
        boolean pin = true;
        int numberDay = 0;
        while (pin) {
            System.out.println("Выберите день месяца 1-30");
            numberDay = scanner.nextInt();
            if (0 < numberDay && 30 >= numberDay) {
                pin = false;
            }
        }
        return numberDay;
    }

    private static void staticConverter(Integer step) {
        int calory = step * 50;
        int Kcalory = 0;
        if (calory > 1000) {
            Kcalory = calory / 1000;
        }
        System.out.printf("Вы сожгли %s Калорий или %s КилоКалории.%n", calory, Kcalory);
        int distance = (step * 75) / 1000;
        double endDistance = (step * 75) % 1000;
        if (distance == 1) {
            System.out.printf("Вы прошли %s километр %s сантиметра.%n", distance, endDistance);
        } else {
            System.out.printf("Вы прошли %s километр %s сантиметра.%n", distance, endDistance);
        }
    }

    public static void exit() {
        System.out.println("Выход.");
        System.exit(0);
    }

    public static int tegScanner() {
        return scanner.nextInt();
    }

    static void startMenu() {
        System.out.println("Выберите что вас интересуе:");
        System.out.println("1 - Количестве пройденных шагов за определенный месяц");
        System.out.println("2 - Статистика шагов за день");
        System.out.println("3 - Cтатистики за определённый месяц");
        System.out.println("4 - Внести цель");
        System.out.println("5 - Добавить шаги в день");
        System.out.println("0 - Выход");
    }
}
