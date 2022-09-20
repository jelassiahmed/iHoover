package Controller;

import Model.AspiratorModel;
import Model.GridModel;
import Model.enums.MoveEnum;

import java.util.List;

public class MoveController {
    private final static int UNIT= 1;
    //retourne la position finale de l'aspirateur
  public static AspiratorModel getFinalPosition(GridModel grid, AspiratorModel aspirator, List<MoveEnum> moves){
      for(MoveEnum moveEnum : moves){
          switch(moveEnum){
              case A:
                  switch (aspirator.getDirection()){
                      case 0:
                          aspirator.setY(aspirator.getY()+UNIT);
                          break;
                      case 1:
                          aspirator.setX(aspirator.getX()+UNIT);
                          break;
                      case 2:
                          aspirator.setY(aspirator.getY()-UNIT);
                          break;
                      case 3:
                          aspirator.setX(aspirator.getX()-1);
                          break;
                  }
                  LimitController.LimitGrid(grid,aspirator);
                  break;
              case G:
                  aspirator.setDirectionAndMap(3+ aspirator.getDirection());
                  break;
              case D:
                  aspirator.setDirectionAndMap(1+ aspirator.getDirection());
                  break;
              default:
                  break;
          }
      }
      return aspirator;
  }
}
