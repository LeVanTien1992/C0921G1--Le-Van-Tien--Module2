package ss6_ke_thua.bai_tap.lop_point_va_lop_moveablepoint;

import ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d.Point2DTest;

public class Point {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point(){

    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return this.y;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] f = new float[2];
        f[0] = x;
        f[1] = y;
        return f;
    }
    
    public String toString(){
        return ("X= " +x+ "Y=" +y);
    }
}
