package Controller;

import Model.AspiratorModel;
import Model.GridModel;

public class LimitController {
    //verification que l'aspirateur ne sort pas du grille
    public static void LimitGrid(GridModel grid, AspiratorModel aspirator){
        if(aspirator.getY() > grid.getHeight() || aspirator.getX()> grid.getWidth() || aspirator.getY()<0 || aspirator.getX()<0){
            System.out.println("l'aspirateur va sortir du map");
            System.exit(0);
        }
    }
}
