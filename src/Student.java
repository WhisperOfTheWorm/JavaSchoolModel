public class Student extends Person {
    private Section[]  sections = new Section[10];
    private int grade;
    private int sectionsCount;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;

    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int g){
        this.grade = grade;
    }

    public Section[] getSections(){
        return sections;
    }

    public void addSection(Section s){
        sections[sectionsCount] = s;
        sectionsCount++;
    }

    public String toString(){
        return  this.getName() + " is in grade " + this.getGrade() +  " and is enrolled in the following sections: " + this.sectionsCount;
    }

    public String countSection(){
        String o = "";
        for(int i = 0; i < sectionsCount; i++){
             o += this.sections[i].getName() + this.sections[i].getTeacher();
        }
        return o;
    }
}
