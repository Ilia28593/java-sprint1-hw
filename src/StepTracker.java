import java.util.HashMap;

public class StepTracker {
    private int goal = 10000;
    private final HashMap<Integer, MonthEnum> monthHashSet = new HashMap<>();
    private final HashMap<MonthEnum, Dto> mapStepsByMonth = new HashMap<>();

    public void Goal(int goalInDay){
        goal = goalInDay;
    }
    public String GoalInDay ( Integer step) {
        String infGoal;
        if( step>goal){
            infGoal = "достигнута";
        }else {
            infGoal = "не достигнута";
        } return infGoal;
    }
    public void addSteps(MonthEnum monthEnum, Integer day, Integer steps) {
        HashMap<Integer,Integer> step = new HashMap<>();
        if (mapStepsByMonth.get(monthEnum) != null) {
            Dto dto = mapStepsByMonth.get(monthEnum);
            step.put(day,steps);
            dto.setStepsByDay(step);
        }
    }
    public Integer CurrentSteps(MonthEnum monthEnum){
        int sum = 0;
        if (mapStepsByMonth.get(monthEnum) != null) {
            Dto dto = mapStepsByMonth.get(monthEnum);
            for(int step:dto.getStepsByDay().values()){
                sum+=step;
            }
        }
        return sum;
    }

    public Integer getStepInDay (MonthEnum monthEnum, Integer day) {
        Integer stepInDay = 0;
        if (mapStepsByMonth.get(monthEnum) != null) {
            Dto dto = mapStepsByMonth.get(monthEnum);
          stepInDay = dto.getStepsByDay().get(day);
        } return stepInDay;
    }

    public MonthEnum getMonthByNumber(Integer number) {
        addMonth();
        addDay();
        return monthHashSet.get(number);
    }

    private void addMonth() {
        monthHashSet.put(0, MonthEnum.JANUARY);
        monthHashSet.put(1, MonthEnum.FEBRUARY);
        monthHashSet.put(2, MonthEnum.MARCH);
        monthHashSet.put(3, MonthEnum.APRIL);
        monthHashSet.put(4, MonthEnum.MAY);
        monthHashSet.put(5, MonthEnum.JUNE);
        monthHashSet.put(6, MonthEnum.JULY);
        monthHashSet.put(7, MonthEnum.AUGUST);
        monthHashSet.put(8, MonthEnum.SEPTEMBER);
        monthHashSet.put(9, MonthEnum.OCTOBER);
        monthHashSet.put(10, MonthEnum.NOVEMBER);
        monthHashSet.put(11, MonthEnum.DECEMBER);
    }
    void addDay(){
        mapStepsByMonth.put(MonthEnum.JANUARY, new Dto());
    }
}
