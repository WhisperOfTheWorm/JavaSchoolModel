public class School {
    private String name;
    private Section Section[] = new Section[200];
    private int sectionCount;

    public School(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = name;

    }

    public void addSection(Section s){
        Section[sectionCount] = s;
        sectionCount++;
    }

    public Section[] getSection() {
        this.Section = Section;
        return Section;
    }

    public String toString(){
        return "The school named " + this.getName() + " has " + this.sectionCount + " sections. ";
    }

    public String countSection(){
        String o = "";
        for(int i = 0; i<sectionCount;i++){
            o += this.Section[i].getName() + Section[i].countSize();
        }
        return o;
    }
}
