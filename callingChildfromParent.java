
abstract class maths {
    abstract void OddNumber();
    abstract void EvenNumber();
   void rational(){
       System.out.println("maths");
   }
   public void mathWorld(){
       System.out.println("WELCOME TO THE WORLD OF NUMBERS");
   }
}
class numbers extends maths {
    void rational() {
        System.out.println("Maths is fun with numbers");
    }

    @Override
    void OddNumber() {
        System.out.println("Even Numbers 2 4 6...");
    }

    @Override
    void EvenNumber() {
        System.out.println("Odd numbers 1 3 5...");
    }

    void print() {
        System.out.println("Calling from numbers(child class) to maths (parent class)");
        mathWorld();
    }
}
class callingChildfromParent {
    public static void main(String[] args) {
        maths myMat = new numbers();
        myMat.rational();
        myMat.EvenNumber();
        myMat.OddNumber();
        numbers myNum=new numbers();
        myNum.print();
    }
}

