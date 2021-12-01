package case_study.models;

import java.util.Objects;

public class Room extends Facility{
    private  String dichVuMienPhiDiKem;

    public Room() {

    }

    public Room(String maDichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue,
                int soLuongNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
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
        return  getMaDichVu() +"," +
                getTenDichVu() +"," +
                getDienTichSuDung() + "," +
                getChiPhiThue() + "," +
                getSoLuongNguoiToiDa() +"," +
                getKieuThue() + "," +
                dichVuMienPhiDiKem
               ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Room room = (Room) o;
        return getMaDichVu().equals(room.getMaDichVu()) &&
                getTenDichVu().equals(room.getTenDichVu())&&
                Double.compare(room.getDienTichSuDung() , getDienTichSuDung())==0 &&
                Double.compare(room.getChiPhiThue(), getChiPhiThue())==0 &&
                Integer.compare(getSoLuongNguoiToiDa(), room.getSoLuongNguoiToiDa())== 0 &&
                getKieuThue().equals(room.getKieuThue()) &&
                dichVuMienPhiDiKem.equals(room.dichVuMienPhiDiKem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),getMaDichVu(), getTenDichVu(),getDienTichSuDung(),
                getChiPhiThue(),getSoLuongNguoiToiDa(),getKieuThue(),dichVuMienPhiDiKem);
    }
}
