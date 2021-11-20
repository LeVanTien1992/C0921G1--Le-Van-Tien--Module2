package Candidate_Management_system.models;

public class Fresher extends Candidate{
    private int graduatedTime;
    private String rankOfEducation;
    private String graduatedUniversity;

    public Fresher() {
    }

    public Fresher(int id, String firstName, String lastName, String birthDate, String address,
                   int phone, String email, String type, int graduatedTime, String rankOfEducation, String graduatedUniversity) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.graduatedTime = graduatedTime;
        this.rankOfEducation = rankOfEducation;
        this.graduatedUniversity = graduatedUniversity;
    }

    public int getGraduatedTime() {
        return graduatedTime;
    }

    public void setGraduatedTime(int graduatedTime) {
        this.graduatedTime = graduatedTime;
    }

    public String getRankOfEducation() {
        return rankOfEducation;
    }

    public void setRankOfEducation(String rankOfEducation) {
        this.rankOfEducation = rankOfEducation;
    }

    public String getGraduatedUniversity() {
        return graduatedUniversity;
    }

    public void setGraduatedUniversity(String graduatedUniversity) {
        this.graduatedUniversity = graduatedUniversity;
    }

    @Override
    public String toString() {
        return getId()+"\t"+ getFirstName()+"\t"+ getLastName()+"\t"+getBirthDate()
                +"\t"+getAddress()+"\t"+getPhone()+"\t"+getEmail()+"\t"+getType()+"\t"
                + graduatedTime+"\t"+rankOfEducation+"\t"+graduatedUniversity;
    }
}
