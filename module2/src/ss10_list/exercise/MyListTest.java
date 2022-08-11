package ss10_list.exercise;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString() {
            return "name" + getName() + "id" + getId();
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Vinh");
        Student b = new Student(2, "Vi");
        Student c = new Student(3, "Vy");
        Student d = new Student(4, "Van");
        Student e = new Student(5, "Viet");
        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println(studentMyList.elements[i]);
        }
        System.out.println(studentMyList.get(1));
    }
}
// Em sẽ cập nhật hoàn chỉnh vào cuối tuần.
