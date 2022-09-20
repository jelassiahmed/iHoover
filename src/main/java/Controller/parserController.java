package Controller;

import Model.AspiratorModel;
import Model.GridModel;
import Model.enums.MapEnum;
import Model.enums.MoveEnum;

import java.util.ArrayList;
import java.util.List;

public class parserController {
    private static final String SEPERATOR = " ";

    public static GridModel parseGrid(String gridCord){
        int x = 0;
        int y = 0;
        if(gridCord.contains(SEPERATOR)){
            x = Integer.parseInt(gridCord.split(SEPERATOR)[0]);
            y = Integer.parseInt(gridCord.split(SEPERATOR)[1]);
        }
        return new GridModel(y,x);
    }
    public static AspiratorModel parseAspirator(String aspiratorCord){
        int x = 0;
        int y = 0;
        MapEnum map = null;
        if(aspiratorCord.contains(SEPERATOR)){
            x = Integer.parseInt(aspiratorCord.split(SEPERATOR)[0]);
            y = Integer.parseInt(aspiratorCord.split(SEPERATOR)[1]);
            map = MapEnum.valueOf(aspiratorCord.split(SEPERATOR)[2]);
        }
        return new AspiratorModel(x,y,map);
    }
    public static List<MoveEnum> parseMoves(String movesInstr){
        List<MoveEnum> moves = new ArrayList<>();
        // lister les lettres de l'ensemble d'instructions
        char[] chars = movesInstr.toCharArray();
        //parcour des instructions
        for(char char1 : chars){
            moves.add(MoveEnum.valueOf(Character.toString(char1)));
        }
        return moves;
    }


}
