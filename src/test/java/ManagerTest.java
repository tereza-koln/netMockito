import org.example.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void testAdd0() {
        MovieManager manager = new MovieManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd1() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd3() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] actual = manager.findLast();
        String[] expected = {"Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast5() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");


        String[] actual = manager.findLast();
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAll() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testLast7() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");


        String[] actual = manager.findLast();
        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
