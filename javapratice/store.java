public class store {
    void getsoap (int money){
        System.out.println(money);
        System.out.println("soap");
    }
    void choclate(int money){
        System.out.println(money);
        System.out.println("coclate");
    }
    void powder(int money){
        System.out.println(money);
        System.out.println("powder");
    }
    public static void main (String args[])
    {
        store s1=new store();
        s1.getsoap(20);
        s1.choclate(5);
        s1.powder(30);
    }
    
    
}
