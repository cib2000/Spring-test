public class Source {
    String fruit;
    String sugar;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    String size;

    public String getFruit() {
        return fruit;
    }
    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public void out() {
    System.out.println(fruit);
    System.out.println(sugar);
    System.out.println(size);
    }
}
