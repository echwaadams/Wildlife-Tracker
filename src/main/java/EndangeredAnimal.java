public class EndangeredAnimal extends Animal implements {
    private String health;
    private String age;

    public static final String ANIMAL_TYPE = "endangered";
    public static final String ADULT = "adult";
    public static final String YOUNG = "youthful";
    public static final String NEWBORN = "newborn";
    public static final String HEALTHY = "very healthy";
    public static final String AVERAGE = "averagely unhealthy";
    public static final String ILL = "very unhealthy";
    public EndangeredAnimal(String name) {
        super(name);
        this.type = ANIMAL_TYPE;
        this.health = health;
        this.age = age;
    }
}
