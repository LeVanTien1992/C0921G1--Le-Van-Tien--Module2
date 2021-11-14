package case_study.models;

public class Room extends Facility{
    private  String dichVuMienPhiDiKem;

    public Room() {

    }

    public Room(String tenDichVu, double dienTichSuDung, double chiPhiPhiThue, int soLuongNguoiToiDa,
                String kieuThue, String dichVuMienPhiDiKem) {
        super(tenDichVu, dienTichSuDung, chiPhiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuMienPhiDiKem='" + dichVuMienPhiDiKem + '\'' +
                '}';
    }
}
