package seryozha.hovhannisyan.test;

public class AnObject {
    private String name;
    private String desc;

    public AnObject() {
        name = this.getClass().getName();
        System.out.println("Constructor");
    }

    public AnObject(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public AnObject setName(String name) {
        this.name = name;
        System.out.println("Accepting setName " + name);
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
        System.out.println("Accepting setDesc " + desc);
    }


    public static void staticDesc(String desc) {
        System.out.println("Accepting staticDesc " + desc);
    }
}
