public class store1 {
     String getname(String a,String b){
        String c=a+b;
        
        
        return c;
    }
    String phone(String a){
       // System.out.println(a);
        return a;
    }
    public static void main (String args[]){

        store1 obj=new store1();
       String getname= obj.getname("dee","jd");
       String phone=obj.phone("9025230721");
       
       System.out.println(getname);
       System.out.println(phone);
        
       

    }
}
