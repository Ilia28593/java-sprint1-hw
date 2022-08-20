public class TargetMenu {

    public static void teg(Integer number) {
        switch (number) {
            case 1: {
                StepTracker.staticStepsMonth(); // здесь просто статистика шагов за месяц,показатель лучшкго дня с кол-вом шагов
                break;
            }
            case 2: {
                StepTracker.staticDay(); // количество шагов за день, статистика по сожоным калориям  и дистанцией за день
                break;
            }
            case 3: {
                StepTracker.staticMonth(); // Статистика реализована здесь кол-во шагов за месяц, среднее кол-во шагов за месяц, статистика по сожжоным калориям  и дистанцией за месяц
                break;
            }
            case 4: {
               StepTracker.goal(); // установка цели илпо умолчанию 10000
                break;
            }
            case 5: {
                StepTracker.addStep(); // он и добавляет и редактирует, если день пустой то вносит, если нет то добавляет к тому значению
                break;
            }
            case 0: StepTracker.exit(); // выход из меню

            default: System.out.println("Некорректное значение.");
        }
    }


}
