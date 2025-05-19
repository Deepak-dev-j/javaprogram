public class Laptop {
    String  name="";
    String processor="";
    int RAM=0;
    int storage=0;
    int price=0;

    public static void main (String args[])
    {
        Laptop laptop1=new Laptop();
        laptop1.name="HP";
        laptop1.processor="i5";
        laptop1.RAM=8;
        laptop1.storage=128;
        laptop1.price=25000;
        System.out.println("Laptop 1");
        System.out.println("Name: "+laptop1.name);
        System.out.println("Processor: "+laptop1.processor);
        System.out.println("RAM: "+laptop1.RAM);
        System.out.println("Storage: "+laptop1.storage);
        System.out.println("Price: "+laptop1.price);
        {
         Laptop laptop2=new Laptop();
         laptop2.name="Dell";
         laptop2.processor="i7";
         laptop2.RAM=16;
         laptop2.storage=2800;
         laptop2.price=50000;
         System.out.println("Laptop 2");
         System.out.println("Name: "+laptop2.name);
         System.out.println("Processor: "+laptop2.processor);
         System.out.println("RAM: "+laptop2.RAM);
         System.out.println("Storage: "+laptop2.storage);
         System.out.println("Price: "+laptop2.price);
        }

    }
    
}
