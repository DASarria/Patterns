package edu.eci.cvds.patterns.shapes;

public interface ShapeFactory {
    public Shape create(RegularShapeType type);
}
