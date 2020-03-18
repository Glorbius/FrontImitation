package kz.lesson.dbpractic.model;

public class User {


    private int id;
    private String name;
    private int age;
    private String sex;
    private int legSize;
    private String status;

    public User() {

    }

    public User(int id, String name, int age, int legSize, String sex, String status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.legSize = legSize;
        this.sex = sex;
        this.status = status;
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

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 130) {
            age = 0;
        } else {
            this.age = age;
        }
    }


    public int getLegSize() {

        return legSize;
    }

    public void setLegSize(int legSize) {
        this.legSize = legSize;
    }


    public int pensiya() {
        int let = 63 - this.age;
        if (this.age > 63) {
            return 0;
        } else
            return let;
    }


}
