
package development;


public abstract class Project {
    
    private String Name;
    private int ProjectType;

    public Project() {
    }

    public Project(String Name, int ProjectType) {
        this.Name = "";
        this.ProjectType = 0;
    }
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getProjectType() {
        return ProjectType;
    }

    public void setProjectType(int ProjectType) {
        this.ProjectType = ProjectType;
    }
    
    
    
}
