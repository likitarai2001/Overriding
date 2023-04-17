public class JavaTeam extends Simform implements DevTeam{
    JavaTeam(int founding_year, String headquarters){
        super(founding_year, headquarters);
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Java team has 32 members");
    }

    @Override
    public void totalProjects(int n){
        System.out.println("Java department has total " + n + " projects");
    }

    @Override
    public String listTechnologies(){
        return "Java, Maven, Spring Boot, Hibernate";
    }
}