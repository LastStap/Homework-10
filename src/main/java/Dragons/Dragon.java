package Dragons;

public class Dragon {

    private String name;
    private int age;
    private int weight;
    private String type;

    public Dragon(){};

    public Dragon(String name, int age, int weight, String type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
    }

    public Dragon(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
    }

        public void setAge(int age){
            this.age = age;
    }

        public void setWeight(int weight){
            this.weight = weight;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
