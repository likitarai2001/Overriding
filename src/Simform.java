public class Simform {
    public int founding_year;
    public String headquarters;

    Simform(int founding_year, String headquarters){
        this.founding_year = founding_year;
        this.headquarters = headquarters;
    }

    protected void info(){
        System.out.println("Simform was founded in the year " + this.founding_year +
                "\nIt's headquarters is in " + this.headquarters);

    }

    public void totalProjects(int n){
        System.out.println("Simform has total " + n + " projects\n");
    }
}
