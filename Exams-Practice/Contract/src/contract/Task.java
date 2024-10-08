/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contract;


public class Task implements iWork {
    private int taskType;
    private float duration;

   

    public Task(int taskType, float duration) {
        this.taskType = taskType;
        this.duration = duration;
    }
    
     public int getTaskType() {
        return taskType;
    }

    public void setTaskType(int taskType) {
        this.taskType = taskType;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
    
    @Override
    public int getTaskCost() {
        for (int[] cost : TaskTypeCostDB.TaskTypeCost) {
            if (taskType == cost[0]) {
                return (int) (duration * cost[1]);
            }
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return "Task{" + "WorkType=" + taskType + ", Duration=" + duration + ", Cost=" + getTaskCost() + '}';
    }
    
}
