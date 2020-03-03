public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;

    public Section(String name){
        this.name = name;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = teacher;
    }



    public void addStudent(Student s){
        students[currentSize] = s;
        currentSize++;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return  this.getName() + " is taught by " + this.teacher.getName() +  " and has " + this.currentSize + " students. ";
    }

    public String countSize(){
        String o = "";
        for(int i = 0; i<this.currentSize;i++){
            o += this.students[i].getName();
        }
        return o;
    }
}
