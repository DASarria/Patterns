package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Triangle;

public class TriangleFactory implements ShapeFactory{

    @Override
    public Shape create(RegularShapeType type) {
        return new Triangle();
    }

}
