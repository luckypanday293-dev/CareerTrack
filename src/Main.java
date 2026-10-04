public class Main {
    public static void main(String[] args) {
        
        System.out.println("Welcome to CareerTrack");
        System.out.println();

        ApplicationManager manager = new ApplicationManager();

        manager.addApplication("Microsoft", "Software Engineer Intern");
        manager.addApplication("Amazon", "SDE Intern");
        manager.addApplication("Google", "Backend Intern");

        manager.updateStatus(1, ApplicationsStatus.INTERVIEW);
        // manager.deleteApplication(2);
        manager.DisplayApplications();
    }
}