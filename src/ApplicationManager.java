import java.util.ArrayList;

public class ApplicationManager {

    int id = 1;

    ArrayList<JobApplication> applications = new ArrayList<>();

    public void addApplication(String company, String position) {

        JobApplication application = new JobApplication(id, company, position, ApplicationsStatus.APPLIED);
        applications.add(application);
        id++;
    }

    public void viewApplications() {
        if (applications.isEmpty()) {
            System.out.println("No applications found.");
        }
    }

    public JobApplication findById(int id) {

        for (JobApplication app : applications) {
            if (app.Getid() == id) {
                return app;
            }
        }
        return null;
    }

    public void updateStatus(int id, ApplicationsStatus newStatus) {
        JobApplication app = findById(id);
        if (app == null) {
            System.out.println("Application not found.");
        } else {
            app.setStatus(newStatus);
        }
    }

    public void deleteApplication(int id) {
        JobApplication app = findById(id);
        if (app == null) {
            System.out.println("Application not found.");
        } else {
            applications.remove(app);
        }
    }

    public void DisplayApplications() {

        if (applications.isEmpty()) {
            System.out.println("No applications found.");
            return;
        }

        for (JobApplication app : applications) {
            app.DisplayApplicationDetails();
        }
    }

}
