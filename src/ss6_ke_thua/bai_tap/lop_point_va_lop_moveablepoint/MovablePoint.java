package ss6_ke_thua.bai_tap.lop_point_va_lop_moveablepoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;


    public MovablePoint(){

    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed, float x, float y){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed(){
        return this.xSpeed;
    }
    public void setXSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getYSpeed(){
        return this.ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] f = new float[2];
        f[0] = xSpeed;
        f[1] = ySpeed;
        return f;
    }
    public String toString(){
        return ("Xspeed="+xSpeed+ " YSpeed="+ySpeed+ " and X= "+getX()+ " Y= " +getY());
    }
    public  MovablePoint move(){
        // x += xSpeed hay x = x + xSpeed
        // setX(getX() + xSpeed)
       setX(getX() + xSpeed) ;
       setY(getY() + xSpeed);
        return this;
    }

}
