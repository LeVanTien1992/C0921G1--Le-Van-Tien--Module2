package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "John";
    private String classes = "Co2";

    public Student(){

    }

    public Student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }
    public String getName(){
        return this.name;
    }
    public String getClasses(){
        return this.classes;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }

}
