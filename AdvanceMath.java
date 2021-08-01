package arthmetic;
public class AdvanceMath
{
   public int square(int a){
     return a*a;
}
  public int cube(int b){
    return a*a*a;
}
 public int pow(int a,int n){
   int pow = 1;
   for(int i =1;i<=n;i++)
      pow = pow * a;
   return pow;
}
}