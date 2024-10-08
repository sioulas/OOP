
package development;


public class Development extends Project{
    private float TotalDuration;
    private int DevelopersCount;
    Task[] tasks = new Task[6];
    
    public Development(String Name, int ProjectType, float TotalDuration, int DevelopersCount) {
        super(Name, ProjectType);
        this.TotalDuration = TotalDuration;
        this.DevelopersCount = DevelopersCount;
        this.tasks = new Task[6];
    }

    

    public float getTotalDuration() {
        return TotalDuration;
    }

    public void setTotalDuration(float TotalDuration) {
        this.TotalDuration = TotalDuration;
    }

    public int getDevelopersCount() {
        return DevelopersCount;
    }

    public void setDevelopersCount(int DevelopersCount) {
        this.DevelopersCount = DevelopersCount;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }
    
    public void addTask(int WorkType, int pos, float duration) {
        if (pos < 6) {
            try {
                int cost = -1;
                for (int[] wt : WorkTypeMMCostsDB.WorkTypeMMCosts) {
                    if (WorkType == wt[0]) {
                        cost = wt[1];
                        break;
                    }
                }
                if (cost != -1) {
                    Task task = new Task(WorkType, duration);
                    this.tasks[pos] = task;
                    this.TotalDuration += duration / DevelopersCount;
                } else {
                    throw new WorkTypeNotFoundException("WorkType Not Found");
                }
            } catch (WorkTypeNotFoundException err) {
                System.out.println(err.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        String result = "Development Project: " + getName() + "\n" +
                        "Project Type: " + getProjectType() + "\n" +
                        "Total Duration: " + TotalDuration + " months\n" +
                        "Developers Count: " + DevelopersCount + "\n" +
                        "Tasks:\n";
        float totalMM = 0;
        for (Task task : tasks) {
            if (task != null) {
                result += task.toString() + "\n";
                totalMM += task.getDuration();
            }
        }
        result += "Total Duration in person-months (TotalMM): " + totalMM + "\n";
        return result;
    }
    
    
    @Override
    public String getName() {
        return super.getName();
    }
    
    @Override
    public void setName(String Name) {
        super.setName(Name);
    }
    
    @Override
    public int getProjectType() {
        return super.getProjectType();
    }
    
    @Override
    public void setProjectType(int ProjectType) {
        super.setProjectType(ProjectType);
    }
}
