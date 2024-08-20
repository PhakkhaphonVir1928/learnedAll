public class Author {
    private String name;
    private String email;
    private char gender;
    //con
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender == 'M' || gender == 'F' ? gender : '?'; //Ternary Oparetor
    }
    //get
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(char gender){
     if (gender == 'M' || gender == 'F')    {this.gender = gender;
    }
    }
    @Override
    public String toString() {
        return String.format("Name: %s Email: %s Gender: %s  ",name , email , gender);
    }
    
}
