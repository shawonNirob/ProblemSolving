package programmingContest;

public class CoordinatesANdQuadrant {
    public void calculation(int x1, int x2){
        if(x1==0 && x2==0){
            System.out.println(x1+","+x2+" this is the origin point");
        }
        else if(x1==0){
            System.out.println(x1+","+x2+" point on Y axis");
        }
        else if(x2==0){
            System.out.println(x1+","+x2+" point on X axis");
        }
        else if(x1>0){
            if(x2>0){
                System.out.println(x1+","+x2+" this is on quadrant 1");
            }else{
                System.out.println(x1+","+x2+" this is on quadrant 4");
            }
        }
        else {
            if(x2>0){
                System.out.println(x1+","+x2+" this is on quadrant 2");
            }else {
                System.out.println(x1+","+x2+" this is on quadrant 3");
            }
        }
    }

    public static void main(String[] args) {
        CoordinatesANdQuadrant cal =new CoordinatesANdQuadrant();
        cal.calculation(+1,-1);
    }
}
