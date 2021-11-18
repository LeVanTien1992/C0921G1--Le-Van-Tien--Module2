package ss12_java_collection_framework.thuc_hanh.sap_xep_voi_comparable_va_comparator;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private Integer age;
    private String address;

    public Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        return this.getName().compareTo(student.getName());
//    }
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        return this.getName().compareTo(student.getName());
//    }
}
