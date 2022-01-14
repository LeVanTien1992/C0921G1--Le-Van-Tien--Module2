package Candidate_Management_system.models;

public class Experience extends Candidate{
    private int yearOfExperience;
    private String professionalSkill;

    public Experience() {
    }

    public Experience(int id, String firstName, String lastName, String birthDate, String address,
                      String phone, String email, String type, int yearOfExperience, String professionalSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.yearOfExperience = yearOfExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }

    @Override
    public String toString() {
        return getId()+","+ getFirstName()+","+ getLastName()+","+getBirthDate()
                +","+getAddress()+","+getPhone()+","+getEmail()+","+getType()+","
                +yearOfExperience+","+professionalSkill;
    }
}
