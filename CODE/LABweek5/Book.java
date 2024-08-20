public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
   
    public Book(String name,Author author , double price){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }
    public Book(String name,Author author , double price,int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    //get 
    public String getName(){
        return name;
    }
    public Author getArthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    //Set
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    @Override
   public String toString() {
       return "Book[name="+name+","+author+",price="+price+",qty="+qty+"]";
               
    }
}
