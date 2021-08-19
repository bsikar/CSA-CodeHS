public class CompanyTester {
    public static void main(String[] args) {
        OnlineCompany online = new OnlineCompany("CodeHS", "https://codehs.com");
        Company company = new Company("Google", "1600 Amphitheatre Pkwy.", "Mountain View", "CA");

        System.out.println(online);
        System.out.println(company);
    }
}
