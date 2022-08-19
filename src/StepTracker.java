
public class StepTracker {
    private int goal = 10000;

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public void addSteps(Integer month, Integer day, Integer steps) {
        Data.setStat(month,day,steps);
    }

    public Integer CurrentSteps(Integer month) {
        Dto monthName = Data.getStat().get(month);
        return monthName.getStepsByDay().values().stream().reduce(0,Integer ::sum);
    }

    public Integer getStepInDay(Integer month, Integer day) {
       return Data.getStat().get(month).getStepsByDay().get(day);
    }

    public String getMonthName(Integer month) {
        return Data.getStat().get(month).getMonth().name();
    }
}
