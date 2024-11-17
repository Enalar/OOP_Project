public Stuff {
    private double salary;
    private String grade;
    private static int count;

    public Stuff() {};
    public Stuff(double salary, String grade) {
        this.salary = salary;
        this.grade = grade;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }

    public int getCount() {
        return count;
    }

    public void removeBook() {}

    public void updateMemberInfo() {}
}