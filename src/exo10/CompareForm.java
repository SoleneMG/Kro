package exo10;

public abstract class CompareForm {

    public static boolean formCanContains(Form form, Form container) {
        if (form instanceof Circle && container instanceof Square) {
            return formCanContains((Circle) form, (Square) container);
        }
        if (form instanceof Circle && container instanceof Rectangle) {
            return formCanContains((Circle) form, (Rectangle) container);
        }
        if (form instanceof Circle && container instanceof Circle) {
            return formCanContains((Circle) form, (Circle) container);
        }
        if (form instanceof Square && container instanceof Square) {
            return formCanContains((Square) form, (Square) container);
        }
        if (form instanceof Square && container instanceof Rectangle) {
            return formCanContains((Square) form, (Rectangle) container);
        }
        if (form instanceof Square && container instanceof Circle) {
            return formCanContains((Square) form, (Circle) container);
        }
        if (form instanceof Rectangle && container instanceof Square) {
            return formCanContains((Rectangle) form, (Square) container);
        }
        if (form instanceof Rectangle && container instanceof Circle) {
            return formCanContains((Rectangle) form, (Circle) container);
        }
        if (form instanceof Rectangle && container instanceof Rectangle) {
            return formCanContains((Rectangle) form, (Rectangle) container);
        }
        return false;
    }

    private static boolean formCanContains(Circle circle, Square container) {
        return circle.diameter() <= container.side;
    }

    private static boolean formCanContains(Circle circle, Rectangle container) {
        return circle.diameter() <= container.width;
    }

    private static boolean formCanContains(Circle circle, Circle container) {
        return circle.diameter() <= container.diameter();
    }

    private static boolean formCanContains(Square square, Square container) {
        return square.side <= container.side;
    }

    private static boolean formCanContains(Square square, Rectangle container) {
        return square.side <= container.width;
    }

    private static boolean formCanContains(Square square, Circle container) {
        return square.diagonal() <= container.diameter();
    }

    private static boolean formCanContains(Rectangle rectangle, Square container) {
        return rectangle.length <= container.side;
    }

    private static boolean formCanContains(Rectangle rectangle, Circle container) {
        return rectangle.diagonal() <= container.diameter();
    }

    private static boolean formCanContains(Rectangle rectangle, Rectangle container) {
        return rectangle.diagonal() <= container.diagonal();
    }
}
