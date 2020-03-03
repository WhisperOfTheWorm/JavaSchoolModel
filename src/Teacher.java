public class Teacher extends Person {
    private Section sections [] = new Section[10];
    private String subject;
    private int sectionCount;


    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String n){
        this.subject = subject;
    }

    public Section[] getSection(){
        return sections;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        return this.getName() + " teaches the following sections: " +  this.getSubject() + this.sectionCount;

    }

    public String countSection(){
        String o = "";
        for(int i = 0; i<sectionCount;i++){
            o += this.sections[i].getName() + sections[i].getTeacher();
        }
        return o;
    }


}
