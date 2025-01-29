package edu.eci.cvds.patterns.shapes;

public class ShapeMain {

    public static void main(String[] args) {
        if (args == null || args.length != 1) {
            System.err.println("Parameter of type RegularShapeType is required.");
            return;
        }
        try {
            RegularShapeType type = RegularShapeType.valueOf(args[0]);
            Shape shape = null;
            switch (type){
                case Triangle:
                    shape = new TriangleFactory().create();
                    break;
                case Quadrilateral:
                    shape = new QuadrilateralFactory().create();
                    break;
                case Pentagon:
                    shape = new PentagonFactory().create();
                    break;
                case Hexagon:
                    shape = new HexagonFactory().create();
                    break;
            }
            System.out.println(
                    String.format(
                            "Successfully created a %s with %s sides.",
                            type,
                            shape.getNumberOfEdges()
                    )
            );
        } catch (IllegalArgumentException ex) {
            System.err.println(
                    "Parameter '" + args[0] + "' is not a valid RegularShapeType"
            );
            return;
        }
    }
}