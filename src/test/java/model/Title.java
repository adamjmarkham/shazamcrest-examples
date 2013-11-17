package model;

public class Title {
    private final String title;

    private Title(String title) {
        this.title = title;
    }

    public static Title title(String title) {
        return new Title(title);
    }
}
