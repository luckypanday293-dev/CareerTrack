public class JobApplication {
    
    private int id;
    private String company;
    private String position;
    private ApplicationsStatus status;

    public JobApplication(int id,String company, String position, ApplicationsStatus status) {
       
        this.id = id;
        this.company = company;
        this.position = position;
        this.status = status;
    }

    public int Getid() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String GetPosition(){
        return position;
    }

    public ApplicationsStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationsStatus status) {
        this.status = status;
    }

    public void DisplayApplicationDetails(){
        System.out.println(id + " | " + company + " | " + position + " | " + status);
    }

    

}
