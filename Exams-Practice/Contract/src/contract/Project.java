/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contract;

/**
 *
 * @author User
 */
public class Project extends Contract {
    private String projectName;
    private float totalDuration;
    private int employessCount;
    Task[] tasks = new Task[5];

    public Project(String customerName,double budget, String projectName, float totalDuration, int employessCount) {
        super(customerName, budget);
        this.projectName = projectName;
        this.totalDuration = totalDuration;
        this.employessCount = employessCount;
        this.tasks = new Task[5];
    }
    
    public void addTask(int taskType, int pos, float duration) {
        if (pos < 6) {
            try {
                int cost = -1;
                for (int[] wt : TaskTypeCostDB.TaskTypeCost) {
                    if (taskType == wt[0]) {
                        cost = wt[1];
                        break;
                    }
                }
                if (cost != -1) {
                    Task task = new Task(taskType, duration);
                    this.tasks[pos] = task;
                    this.totalDuration += duration / employessCount;
                } else {
                    throw new TaskTypeNotFoundException("TaskType Not Found");
                }
            } catch (TaskTypeNotFoundException err) {
                System.out.println(err.getMessage());
            }
        }
    }

    public String toString() {
        String result = "Project Name: " + getProjectName() + "\n" +
                        "Customer Name: " + getCustomerName() + "\n" +                        
                        "Employees Count: " + employessCount + "\n" +
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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public float getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(float totalDuration) {
        this.totalDuration = totalDuration;
    }

    public int getEmployessCount() {
        return employessCount;
    }

    public void setEmployessCount(int employessCount) {
        this.employessCount = employessCount;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }
    
    
    
    @Override
    public String getCustomerName() {
        return super.getCustomerName();
    }
    
    @Override
    public void setCustomerName(String customerName) {
        super.setCustomerName(customerName);
    }
    
    @Override
    public double getBudget() {
        return super.getBudget();
    }
    
    @Override
    public void setBudget(double budget) {
        super.setBudget(budget);
    }
}
