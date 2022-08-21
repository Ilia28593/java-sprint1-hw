public enum MonthEnum {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

        private final String value;

        MonthEnum(String value) {
                this.value=value;
        }
        public String getValue() {
                return value;
        }
        //немного переработал ваш вариант, я так понимаю чтобы получать номер месяца по значению
        // Так теперь выводится руский язык, месяцев, если что могу и ваш вариант сделать
}
