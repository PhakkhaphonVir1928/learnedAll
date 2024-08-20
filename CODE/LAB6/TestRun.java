public class TestRun {
    
    public static void main (String [] args) {
        
    System.out.println ("========================== Staff ============================");    
    
    Staff ck = new Staff("Chanakarn Kingkaew","85/1 PIM Nonthaburi","PIM",1_000_000);
    System.out.println(ck);
    
    System.out.println ("========================== Student1 ============================");
    
    Student cv = new Student("Kim Taeyeon","85/1 PIM Nonthaburi","CPE",2558,50000);
    System.out.println(cv);
   
    System.out.println ("========================== Student2 ============================");
    
    Student pk = new Student("Jay Jay","24/5 PIM Nonthaburi","DIT",2564,48000);
    System.out.println(pk);
    
    System.out.println ("========================== Student3 ============================");
    
    Student gw = new Student("Luminous K","25/5 PIM Nonthaburi","DIT",2560,45500);
    System.out.println(gw);
    }
    
}