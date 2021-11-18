package ss15_xu_ly_ngoai_le_va_debug.bai_tap.su_dung_lop_illegal_triangle_exception;

public class TriangleEdgesCheck {
    // Ham kiem tra tam giac hop le
    public void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Loi: Tam giác không hợp lệ!");
        } else {
            System.out.println("Tam giác hợp lệ!");
        }
    }
}
