public class Bug {

    String bugDescription;
    String bugCreatorEmail;
    int bugPriority;
    boolean bugStatus;

    Bug(String bugDescription, String bugCreatorEmail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugCreatorEmail = bugCreatorEmail;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    void getAllBugInfo() {
        System.out.println(bugDescription + " " + bugCreatorEmail + " " + bugPriority + " " + bugStatus);
    }

    void getBugCreatorEmail() {
        System.out.println(bugCreatorEmail);
    }

    void getBugStatus() {
        System.out.println(bugStatus);
    }

    int getBugPriority() {
        return bugPriority;
    }
}
