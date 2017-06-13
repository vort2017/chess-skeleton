package chess;

/**
 * Created on 12.06.2017.
 */
public final class PositionFactory {

    // TODO not tested
    public static Position createPosition(int x, int y) {
        if (x < Position.MIN_AXIS || x > Position.MAX_AXIS || y < Position.MIN_AXIS || y > Position.MAX_AXIS) {
            return null;
        }

        int row = y + 1;
        String colrow = null;
        switch (x) {
            case 0:
                colrow = "a" + row;
                break;
            case 1:
                colrow = "b" + row;
                break;
            case 2:
                colrow = "c" + row;
                break;
            case 3:
                colrow = "d" + row;
                break;
            case 4:
                colrow = "e" + row;
                break;
            case 5:
                colrow = "f" + row;
                break;
            case 6:
                colrow = "g" + row;
                break;
            case 7:
                colrow = "h" + row;
                break;
        }
        return new Position(colrow);
    }
}
