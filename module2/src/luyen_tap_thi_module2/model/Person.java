package luyen_tap_thi_module2.model;

public abstract class Person {
    private String id;
    private String name;

    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
//        return "Person{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                '}';
return id+","+name;
    }
}
