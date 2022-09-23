class Detail {

    private int age;
    private String name;

    public int getAge() {

        return this.age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}




public class Student {
    public static void main(String[] args){
        Detail detail=new Detail();
        detail.setAge(9);
        detail.setName("Piramabhinav");
        System.out.println(detail.getAge()+ "\n" +detail.getName());
    }
}


