package entities;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<Project> projects;

    public Group(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project plan) {
        this.projects.add(plan);
    }

    /**
     * Count one if project is true.
     *
     * @return number of projects opens or if the dateEnd is after the system date.
     */
    public int countActiveProjects(int opc){
        int ap = 0;

        for(Project p : projects) {
            if(opc == 1) {
                if(p.isActive()) {
                    ap++;
                }
            }
            else if(opc == 2) {
                ap += p.countActiveIterations();
            }
            else if(opc == 3) {
                ap += p.countCloseActivities();
            }
        }

        return ap;
    }


}
