class Animal {
    protected String name = "Animal";
    }

class pet extends Animal {
    private String animalType = "Pet";
    public void sound() {
        System.out.println("Bow Bow!");
    }
    public static void main(String[] args) {
       pet myPet = new pet();
       myPet.sound();
               System.out.println(myPet.name + " " + myPet.animalType);
    }
}
