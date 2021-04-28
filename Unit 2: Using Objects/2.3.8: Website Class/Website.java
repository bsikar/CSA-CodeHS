public class Website {
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

    public String toString() {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";

        return res;
    }
}
