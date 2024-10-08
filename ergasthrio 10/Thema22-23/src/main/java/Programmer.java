public class Programmer extends Employee{

    private String glwssaProg;

    public Programmer(){}

    public Programmer(String name, double ethErgasias, String glwssaProg){
        super(name,ethErgasias);
        this.glwssaProg = glwssaProg;
    }

    public String getGlwssaProg() {
        return glwssaProg;
    }

    public void setGlwssaProg(String glwssaProg) {
        this.glwssaProg = glwssaProg;
    }
}
