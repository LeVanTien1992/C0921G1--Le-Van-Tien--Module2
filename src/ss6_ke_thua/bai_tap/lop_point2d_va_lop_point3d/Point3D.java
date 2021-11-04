package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import java.awt.*;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){

    }
    public Point3D(float z, float x, float y){
        super(x, y);
        this.z = z;
    }

    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] f = new float[3];
        f[0] = getX();
        f[1] = getY();
        f[2] = z;
        return f;
    }
    public String toString(){
        return ("X =" +getX()+ "Y= " +getY()+ "Z=" +z);
    }
}
