package Model;

import Model.enums.MapEnum;

public class AspiratorModel {
    private int x;
    private int y;
    private MapEnum map;
    private int direction;

    public AspiratorModel() {
    }

    public AspiratorModel(int x, int y, MapEnum map) {
        this.x = x;
        this.y = y;
        this.map = map;
        switch(map){
            case N:
                this.direction = 0;
                break;
            case E:
                this.direction = 1;
                break;
            case S:
                this.direction = 2;
                break;
            case W:
                this.direction = 3;
                break;

        }


    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MapEnum getMap() {
        return map;
    }

    public void setMap(MapEnum map) {
        this.map = map;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setDirectionAndMap(int direction){
        this.direction = direction % 4;
        switch (this.direction) {
            case 0:
                this.map = MapEnum.N;
                break;
            case 1:
                this.map = MapEnum.E;
                break;
            case 2:
                this.map = MapEnum.S;
                break;
            case 3:
                this.map = MapEnum.W;
                break;
        }

    }

    @Override
    public String toString() {
        return "AspiratorModel{" +
                "x=" + x +
                ", y=" + y +
                ", Direction=" + map +
                '}';
    }
}
