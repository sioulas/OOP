
package development;



public class Task implements Work {
    private int WorkType;
    private float Duration;

    public Task() {}

    public Task(int WorkType, float Duration) {
        this.WorkType = WorkType;
        this.Duration = Duration;
    }

    public int getWorkType() {
        return WorkType;
    }

    public void setWorkType(int WorkType) {
        this.WorkType = WorkType;
    }

    public float getDuration() {
        return Duration;
    }

    public void setDuration(float Duration) {
        this.Duration = Duration;
    }

    @Override
    public int getTaskCost() {
        for (int[] cost : WorkTypeMMCostsDB.WorkTypeMMCosts) {
            if (WorkType == cost[0]) {
                return (int) (Duration * cost[1]);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Task{" + "WorkType=" + WorkType + ", Duration=" + Duration + ", Cost=" + getTaskCost() + '}';
    }
}
