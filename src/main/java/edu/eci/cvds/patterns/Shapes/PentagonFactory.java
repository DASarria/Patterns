package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Pentagon;

public class PentagonFactory implements ShapeFactory{

    @Override
    public Shape create(RegularShapeType type) {
        return new Pentagon();
    }

}
