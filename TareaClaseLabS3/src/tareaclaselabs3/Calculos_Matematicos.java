 package tareaclaselabs3;
public class Calculos_Matematicos {
    
    public int x1;
    public int x2;
    public int x3;
    
    public Calculos_Matematicos(int x,int y,int z){
        this.x1 = x;
        this.x2 = y;
        this.x3 = z;
    }
    
    public int mcd_euclides(int x,int y, int c){
       if(c == 0){
           return x;
       }
       if(y == 0){
           return mcd_euclides(c,y,x%c);
       }
       else{
           return mcd_euclides(y,x%y,c);
       }
    }
    
   
}

