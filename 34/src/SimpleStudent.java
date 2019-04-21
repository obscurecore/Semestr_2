public class SimpleStudent {
    private int age;
    public String name;

    public SimpleStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return  name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}