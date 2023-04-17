public class Main {
    public static void main(String[] args) {
        Simform simform = new Simform(2010, "Florida");
        simform.info();
        simform.totalProjects(200);

        JavaTeam java_team = new JavaTeam(2010, "Florida");
        java_team.info();
        java_team.totalProjects(10);
        System.out.println("Tech stack: " + java_team.listTechnologies());
    }
}