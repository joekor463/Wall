public class Wall {
    private double width;
    private double heigth;

    public Wall() {
        this.width = 0;
        this.heigth = 0;
    }

    public Wall(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;

    }

    public double getWidth() {
        if (width < 0) return 0;
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        if (heigth <= 0) return 0;
        else return heigth;
    }



    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }



    public double getArea(){
        if((heigth <= 0)|(width <= 0)) return 0;
        double area = heigth * width;
        return area;


    }
}
