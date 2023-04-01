public class love {
    public static void main(String[] args) {
        for (float y=1.5f;y>-1.5f;y-=0.15f){
            for (float x=-1.5f;x<1.5f;x+=0.05f){
                float a = x*x+y*y-1;
                if ((a*a*a-x*x*y*y*y)<=0.0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
