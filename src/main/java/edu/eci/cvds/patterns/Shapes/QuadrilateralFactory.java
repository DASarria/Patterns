package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;

public class QuadrilateralFactory implements ShapeFactory{
    @Override
    public Shape create() {
        return new Quadrilateral();
    }

}
