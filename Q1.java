class Q1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        int c = 5;
        if (a>b){
           
            if(a>c){
                System.out.println("a is greater");
            }else if(c>a){
                System.out.println("a is greater");
            }else{
                System.out.println("a is equal to b");
            }
        }else if(a<b){
              
               if(b>c){
                System.out.println("b is greater");
               }else if(c>b) {
                System.out.println("c is greater");
               }else{
                System.out.println(" c is equal to b");
               }
        }else {
            System.out.println(" a is equal to b");
        }
    }
}