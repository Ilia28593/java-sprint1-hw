
public class StepTracker {
    private int goal = 10000;

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public void addSteps(Integer month, Integer day, Integer steps) {
        BaseSteps.setStat(month,day,steps);
    }

    public Integer CurrentSteps(Integer month) {
        WorkingInfo monthName = BaseSteps.getStat().get(month);
        return monthName.getStepsByDay().values().stream().reduce(0,Integer ::sum);
    }

    public Integer getStepInDay(Integer month, Integer day) {
       return BaseSteps.getStat().get(month).getStepsByDay().get(day);
    }

    public String getMonthName(Integer month) {
        return BaseSteps.getStat().get(month).getMonth().name();
    }
}
