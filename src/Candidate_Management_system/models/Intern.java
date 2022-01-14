package Candidate_Management_system.models;

public class Intern extends Candidate{
    private String majors;
    private int semester;
    private String universityName;

    public Intern() {
    }

    public Intern(int id, String firstName, String lastName, String birthDate, String address,
                  String phone, String email, String type, String majors, int semester, String universityName) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return  getId()+","+ getFirstName()+","+ getLastName()+","+getBirthDate()
                +","+getAddress()+","+getPhone()+","+getEmail()+","+getType()+","
                + majors+","+semester+","+universityName;
    }
}
