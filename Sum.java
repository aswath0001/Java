public class Sum {
   /*  void sum(int a,int b){
     System.out.println(a+b);
     System.out.println(a-b);
     System.out.println(a*b);
     System.out.println(a/b);
    }
    public static void main(String[] args) {
        Sum ob = new Sum();
        ob.sum(22,33);
    } 
    
   int sum(int a,int b) {
    int c = a+b;
    return c;
   }

    public static void main(String[] args) {
        Sum sum =new Sum();
        int Res= sum.sum(2,2);
        System.out.println(Res);
    }*/
    String getName(String Fname){
      String fullName = Fname;
      return fullName;
    }
    Long getNumber(long  num){
        long MobileNumber = num;
        return MobileNumber;
    }
    public static void main(String[] args) {
      Sum ob1 =new Sum();
     String Name=  ob1.getName("Aswath");
      Long Mobile = ob1.getNumber(8668134590L);
      System.out.println(Name);
      System.out.println(Mobile);
    }
}
