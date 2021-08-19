public class HSStudent extends StudentTest {
    private int serviceHours;

    public HSStudent(String name, int mathScore, int elaScore, int serviceHours) {
        super(name, mathScore, elaScore);
        this.serviceHours = serviceHours;
    }

    public int getServiceHours() {
        return serviceHours;
    }

    public void setServiceHours(int serviceHours) {
        this.serviceHours = serviceHours;
    }

    public boolean passMath() {
        return super.getMathScore() >= 525;
    }

    public boolean passEla() {
        return super.getElaScore() >= 560;
    }

    public boolean completeService() {
        return serviceHours >= 75;
    }

    public boolean gradQualify() {
        return passMath() && passEla() && completeService();
    }

    public String toString() {
        if (gradQualify()) {
            return super.getName() + " has qualified for graduation.";
        }

        return super.getName() + " has not yet qualified for graduation.";
    }
}

