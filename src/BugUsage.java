public class BugUsage {
    public static void main(String[] args) {
        Bug bug = new Bug("some bug", "test@test.pl", 1);

        int bugPriority = bug.getBugPriority();
        System.out.println(bugPriority);
        bug.getAllBugInfo();
        bug.getBugCreatorEmail();

        bug.bugStatus=true;
        bug.getBugStatus();
    }
}
