public enum MonthEnum {
    JANUARY("Январь", 1),
    FEBRUARY("Февраль", 2),
    MARCH("Март", 3),
    APRIL("Апрель", 4),
    MAY("Май", 5),
    JUNE("Июнь", 6),
    JULY("Июль", 7),
    AUGUST("Август", 8),
    SEPTEMBER("Сентябрь", 9),
    OCTOBER("Октябрь", 10),
    NOVEMBER("Ноябрь", 11),
    DECEMBER("Декабрь", 12);

    private final String value;
    private final int i;

    MonthEnum(String value, int i) {
        this.value = value;
        this.i = i;

    }

    public String getValue() {
        return value;
    }

    public static String getMonth(Integer numberMonth) {
        String value = MonthEnum.values()[numberMonth-1].name();
        return value;
    }
    //Немного переработал ваш вариант, я так понимаю, чтобы получать номер месяца по значению.
    // Теперь выводится русский язык, месяцев, если что могу и ваш вариант сделать.
    // Можете подсказать почему не срабатывают лямда выражения на swith и ламбок не подтягивается корректно(где почитать), если не затруднит.
    // И что-то по спрингу я сейчас читаю (Карнелл Д., Санчес И.: Микросервисы Spring в действии) можете ещё что-то подсказать
}
