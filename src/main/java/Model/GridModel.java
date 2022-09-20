package Model;

public class GridModel {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public GridModel(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public GridModel(){}

    @Override
    public String toString() {
        return "GridModel{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
