package ru.springTest.shapeDraw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Point extends Shape{
    private Coords coords;

    public Point() {}

    @Autowired
    public Point(Coords coords, @Value("${point1.color}") String color) {
        super(color);
        this.coords = coords;
    }

    @Override
    public void draw() {
        System.out.printf("Нарисована фигура - " + this.toString() + "\n");
    }

    @Override
    public String toString() {
        return String.format("точка с координатами [%d,%d], c цветом - [%s]", this.getX(), this.getY(), this.getColor());
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public int getX() {
        return coords.getX();
    }

    @Value("${point1.x}")
    public void setX(int x) {
        getCoords().setX(x);
    }

    public int getY() {
        return coords.getY();
    }

    @Value("${point1.y}")
    public void setY(int y) {
        coords.setY(y);
    }


}
