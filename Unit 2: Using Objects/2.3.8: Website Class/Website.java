public class Website
{
    // Put your code here
    private String domain;
    private String topLevelDomain;    
    private int numUsers;
    
    public Website() {
        domain = "";
        topLevelDomain = "com";
        numUsers = 0;
    }
    
    public Website(String theDomain, String theTopLevelDomain) {
        domain = theDomain;
        topLevelDomain = theTopLevelDomain;
        numUsers = 0;
    }
    
    public Website(String theDomain, String theTopLevelDomain, int theNumUsers) {
        domain = theDomain;
        topLevelDomain = theTopLevelDomain;
        numUsers = theNumUsers;
    }
    
    // String representation for printing
    // Do not modify this method
    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";
        
        return res;
    }
}
