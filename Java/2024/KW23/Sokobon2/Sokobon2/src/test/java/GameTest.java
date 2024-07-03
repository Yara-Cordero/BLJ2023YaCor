import org.example.Game;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class GameTest {

    @Test
    void test_moveUp_fromFloor_toFloor() {
        int[][] expected = {{2}, {0}};
        int[][] current = {{0}, {2}};

        Game game = new Game(current);
        game.moveUp();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveUp_Block_toFloor_withPlayer() {
        int[][] expected = {{3}, {2}, {0}};
        int[][] current = {{0}, {3}, {2}};

        Game game = new Game(current);
        game.moveUp();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveUp_Block_toTarget_withPlayer() {
        int[][] expected = {{7}, {2}, {0}};
        int[][] current = {{4}, {3}, {2}};

        Game game = new Game(current);
        game.moveUp();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveUp_fromFloor_toWall() {
        int[][] expected = {{1}, {2}};
        int[][] actual = {{1}, {2}};

        Game game = new Game(actual);
        game.moveUp();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveUp_floor_toTarget() {
        int[][] expected = {{6, 0}};
        int[][] actual = {{4, 2}};

        Game game = new Game(actual);
        game.moveUp();
        assertArrayEquals(expected, game.getField());
    }

    //MOVE DOWN

    @Test
    void test_moveDown_fromFloor_toFloor() {
        int[][] expected = {{0}, {2}};
        int[][] current = {{2}, {0}};

        Game game = new Game(current);
        game.moveDown();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveDown_Block_toFloor_withPlayer() {
        int[][] expected = {{0}, {2}, {3}};
        int[][] current = {{2}, {3}, {0}};

        Game game = new Game(current);
        game.moveDown();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveDown_Block_toTarget_withPlayer() {
        int[][] expected = {{0}, {2}, {7}};
        int[][] current = {{2}, {3}, {4}};

        Game game = new Game(current);
        game.moveDown();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveDown_fromFloor_toWall() {
        int[][] expected = {{2}, {1}};
        int[][] actual = {{2}, {1}};

        Game game = new Game(actual);
        game.moveDown();
        assertArrayEquals(expected, game.getField());
    }

    //MOVE LEFT

    @Test
    void test_moveLeft_fromFloor_toFloor() {
        int[][] expected = {{2, 0}};
        int[][] current = {{0, 2}};

        Game game = new Game(current);
        game.moveLeft();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveLeft_Block_toFloor_withPlayer() {
        int[][] expected = {{3, 2, 0}};
        int[][] current = {{0, 3, 2}};

        Game game = new Game(current);
        game.moveLeft();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveLeft_Block_toTarget_withPlayer() {
        int[][] expected = {{7, 2, 0}};
        int[][] current = {{4, 3, 2}};

        Game game = new Game(current);
        game.moveLeft();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveLeft_fromFloor_toWall() {
        int[][] expected = {{1, 2}};
        int[][] actual = {{1, 2}};

        Game game = new Game(actual);
        game.moveLeft();
        assertArrayEquals(expected, game.getField());
    }

    //MOVE RIGHT

    @Test
    void test_moveRight_fromFloor_toFloor() {
        int[][] expected = {{0, 2}};
        int[][] current = {{2, 0}};

        Game game = new Game(current);
        game.moveRight();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveRight_Block_toFloor_withPlayer() {
        int[][] expected = {{0, 2, 3}};
        int[][] current = {{2, 3, 0}};

        Game game = new Game(current);
        game.moveRight();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveRight_Block_toTarget_withPlayer() {
        int[][] expected = {{0, 2, 7}};
        int[][] current = {{2, 3, 4}};

        Game game = new Game(current);
        game.moveRight();
        assertArrayEquals(expected, game.getField());
    }

    @Test
    void test_moveRight_fromFloor_toWall() {
        int[][] expected = {{2, 1}};
        int[][] actual = {{2, 1}};

        Game game = new Game(actual);
        game.moveRight();
        assertArrayEquals(expected, game.getField());
    }
}
