package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Triangle;

public class TriangleFactory implements ShapeFactory{

    public Shape create() {
        return new Triangle();
    }

}
