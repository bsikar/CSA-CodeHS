public class Project extends Assignment {
    private String dueDate;
    private boolean groups;

    public Project(String name, double availablePoints, double earnedPoints, String dueDate, boolean groups) {
        super(name, availablePoints, earnedPoints);
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isGroups() {
        return groups;
    }

    public void setGroups(boolean groups) {
        this.groups = groups;
    }

    public String toString() {
        return super.toString() + "\t" + dueDate + "\t" + groups;
    }
}

