package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.quan_ly_sach;

public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(1,10,2020);
        Ngay ngay2 = new Ngay(10,12,2030);
        Ngay ngay3 = new Ngay(10,12,2030);

        TacGia tacGia1 = new TacGia("Lê Văn Tiến", ngay1);
        TacGia tacGia2 = new TacGia("TonyBaggio", ngay2);
        TacGia tacGia3 = new TacGia("YEYE", ngay3);

        Sach sach1 = new Sach("Lập Trình Không Khó", 100000,2000,tacGia1);
        Sach sach2 = new Sach("Lập Trình Java", 200000,2020,tacGia2);
        Sach sach3 = new Sach("Lập Trình Python", 250000,2020,tacGia3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("So sánh sách 1 với sách 2: " +sach1.kiemTraCungNam(sach2));
        System.out.println("So sánh sách 2 với sách 3: " +sach2.kiemTraCungNam(sach3));

        System.out.println("Giá sau khi giảm 10%: " +sach1.giaSauKhiGiam(10));
        System.out.println("Giá sau khi giảm 20%: " +sach2.giaSauKhiGiam(20));
        System.out.println("Giá sau khi giảm 50%: " +sach3.giaSauKhiGiam(50));


    }
}
