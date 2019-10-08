public class Board {
    StringBuilder vertical;

    public Board() {
        this.vertical = new StringBuilder();
    }

    public String paintSmall(int width, int height) {
        if (vertical.length() > 0) {
            vertical.delete(0, vertical.length() - 1);
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    vertical.append(" #"); // симво который рисуется
                } else {
                    vertical.append("  ");
                }
            }
            vertical.append('\n');
        }
        return vertical.toString();
    }

    public boolean paintSmall(String s) {
        return false;
    }
}