package ru.springTest.shapeDraw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Lazy
public class Scene {
    List<Shape> objects;

    public Scene() {}

    public void draw() {
        objects.forEach(Shape::draw);
    }

    public Scene(List<Shape> objects) {
        this.objects = objects;
    }

    public List<Shape> getObjects() {
        return objects;
    }

    @Autowired
    public void setObjects(List<Shape> objects) {
        this.objects = objects;
    }
}
