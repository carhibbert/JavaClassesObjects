public class Pet {
 
    private String name = "";
    private int age = 0;
    private String location = "";
    private String type = "";

    // get methods
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getType(){
        return this.type;
    }

    //set methods
    public void setName (String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setLocation(String location){
        this.location = location;
    }

    //constructors
    public Pet (String name, String type){
      
    }

    public Pet (String name, int age){

    }
}
