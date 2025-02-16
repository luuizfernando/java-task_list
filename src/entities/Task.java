package entities;

public class Task {
    private Integer taskID;
    private String taskDescription;
    private Boolean isDone;

    public Task() {}
    public Task(Integer taskID, String taskDescription, Boolean isDone) {
        this.taskID = taskID;
        this.taskDescription = taskDescription;
        this.isDone = isDone;
    }

    public Integer getTaskID() {
        return taskID;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }
}