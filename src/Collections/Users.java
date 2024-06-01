package Collections;

public class Users implements Comparable {

    private int id;
    private String name;

    public Users(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
