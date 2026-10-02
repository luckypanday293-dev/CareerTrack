public class JobApplication {
    
    private String company;
    private String position;
    private String status;

    public JobApplication(String company, String position, String status) {
        this.company = company;
        this.position = position;
        this.status = status;
    }

    public void displayApplication() {
        System.out.println("Company: " + company);
        System.out.println("Position: " + position);
        System.out.println("Status: " + status);
    }


}
