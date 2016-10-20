package bean;

import java.io.Serializable;

/**
 * Created by john on 2016/10/20.
 * 只是为了 值栈的存储 valueStack
 */
public class Student implements Serializable {
    private String name;
    private String age;
    private String number;

    public Student() {
    }

    public Student(String name, String age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
