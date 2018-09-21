public class B {
    String name;
    public B(){
        name = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String doAwesomeStuff(String type) {
        if(type == "super") {
            return "Super Awesome Stuff";
        }
        return "Awesome Stuff";
    }

    public void print(){
        System.out.println(name);
    }
}
