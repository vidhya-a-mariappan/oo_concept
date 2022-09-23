public class const_sample {
    int x;
    String word;
    public const_sample() {
            x = 5;
        }
    public const_sample(int y) {
        x = y;
    }
    public const_sample(int y, String name) {
        x = y;
        word = name;
    }


    public static void main(String[] args) {
            const_sample myCons = new const_sample();
            const_sample myConsOne = new const_sample(10);
            const_sample myConsTwo=new const_sample(20,"Hello");
            System.out.println(myCons.x);
            System.out.println(myConsOne.x);
            System.out.println(myConsTwo.x+"\t"+myConsTwo.word);


        }
    }

