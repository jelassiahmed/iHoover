package Model;

import Model.enums.MoveEnum;

import java.util.ArrayList;
import java.util.List;

public class ParamModel {
    private AspiratorModel aspirator;
    private GridModel grid;
    private List<MoveEnum> moves = new ArrayList<>();

    public ParamModel() {
    }

    public AspiratorModel getAspirator() {
        return aspirator;
    }

    public void setAspirator(AspiratorModel aspirator) {
        this.aspirator = aspirator;
    }

    public GridModel getGrid() {
        return grid;
    }

    public void setGrid(GridModel grid) {
        this.grid = grid;
    }

    public List<MoveEnum> getMoves() {
        return moves;
    }

    public void setMoves(List<MoveEnum> moves) {
        this.moves = moves;
    }

    @Override
    public String toString() {
        return "ParamModel{" +
                "aspirator=" + aspirator +
                ", grid=" + grid +
                ", moves=" + moves +
                '}';
    }
}
