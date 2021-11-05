public class Animal {
    private String name;
    private String type;
    public static final String ANIMALS_TYPE = "animal";
    public Animal(String name) {
        this.name = name;
        this.type = ANIMALS_TYPE;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
