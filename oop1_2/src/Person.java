public class Person {
    private String name;
    private String surname;
    private int age;


    public void setName(String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Person()
    {
        this("", "", 0);

    }
    public Person(String name)
    {
        this(name, "", 0);

    }
    public Person(String name, String surname)
    {
        this(name, surname, 0);

    }
    public Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
