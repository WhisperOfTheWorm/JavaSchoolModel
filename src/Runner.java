public class Runner {
    public static void main(String[] args){
        School x = new School("Berkeley High");


        Section a = new Section("Computer Science");

        Section b = new Section("Biology");

        Section c = new Section("Math");


        Teacher j = new Teacher("Albinson", "CompSci");

        Teacher k = new Teacher("S'O", "Bio");

        Teacher l = new Teacher("Nathan", "Math");


        Student t = new Student("Diego", 11);

        Student y = new Student("Juan Luis", 11);

        Student u = new Student("Lassi", 11);

        Student i = new Student("Tenzin", 11);

        Student o = new Student("Benny S", 12);

        Student p = new Student("Isa", 12);


        x.addSection(a);
        x.addSection(b);
        x.addSection(c);
        System.out.println(x.toString());

        a.setTeacher(j); a.addStudent(t); a.addStudent(y); a.addStudent(u); a.addStudent(i); a.addStudent(o); a.addStudent(p);
        b.setTeacher(k); b.addStudent(t); b.addStudent(y); b.addStudent(u); b.addStudent(i); b.addStudent(o); b.addStudent(p);
        c.setTeacher(l); c.addStudent(t); c.addStudent(y); c.addStudent(u); c.addStudent(i); c.addStudent(o); c.addStudent(p);

        t.addSection(a); t.addSection(b); t.addSection(c);
        y.addSection(a); y.addSection(b); y.addSection(c);
        u.addSection(a); u.addSection(b); u.addSection(c);
        i.addSection(a); i.addSection(b); i.addSection(c);
        o.addSection(a); o.addSection(b); o.addSection(c);
        p.addSection(a); p.addSection(b); p.addSection(c);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());


        System.out.println(j.toString());
        System.out.println(k.toString());
        System.out.println(l.toString());









        System.out.println(t.toString());
        System.out.println(y.toString());
        System.out.println(u.toString());
        System.out.println(i.toString());
        System.out.println(o.toString());
        System.out.println(p.toString());

    }

}
