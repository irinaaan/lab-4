class Student {
    private String surname;
    private String name;
    private int course;
    private int group;
    private double average;

    public Student(String surname, String name, int course, int group, double average) { //constructor
        this.surname = surname;
        this.name = name;
        this.course = course;
        this.group = group;
        this.average = average;
    }

    public void setSurname(String Surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public int nextCourse() { //transfer to the next course
        return course++;
    }

    public double changeAverage() { //decrease the average score by one
        return average-- ;
    }

    public double getScholarship(double average) { //here we look whether students will have a scholarship
        double Scholarship;
        if (average <= 3) {
            Scholarship = 0;
        }

        else if (average == 4) {
            Scholarship = 800;
        }

        else {
            Scholarship = 1000;
        }

        return Scholarship;
    }

    public void printInfo() { //student information
        System.out.println("Surname and name: " + getSurname() + " " + getName() + ". Course: " + getCourse() +  ". Group: " + getGroup() + ". Average: " + getAverage() + ". Scholarship: " + getScholarship(average));
    }
}