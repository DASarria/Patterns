package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Hexagon;

public class HexagonFactory implements ShapeFactory{
    @Override
    public Shape create() {
        return new Hexagon();
    }

}
