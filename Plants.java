public class Plants {
    
    private String commonName;
    private String sciName;
    private boolean petSafe;
    // Difficulty of care: 1 for easy, 3 for hard

    // A constructor
    public Plants(){}

    // A constructor that uses 2/3 instance variables
    public Plants(String commonName, boolean petSafe){}

    // A constructor that uses 3/3 instance variables
    public Plants(String commonName, String sciName, boolean petSafe){}

    // get methods

    public String getCommonName(){
        return this.commonName;
    }

    public String getSciName() {
        return this.sciName;
    }

    public boolean isPetSafe(){
        return this.petSafe;
    }

    // set methods

    public void setCommonName(String commonName){
        this.commonName=commonName;
    }

    public void setSciName(String sciName){
        this.sciName=sciName;
    }

    public void setPetSafe(boolean petSafe){
        this.petSafe=petSafe;
    }

    // A boolean method
    public boolean isBeautiful(){
        return true;
    }
    // A string method
    public String thirsty(){
        return "Please give me some water!";
    }

    public static void main(String[] args){
        Plants monstera = new Plants("Swiss Cheese Plant", "Monstera Deliciosa", false);
        System.out.println(monstera.commonName + " Says: " + monstera.thirsty());
    }
}


