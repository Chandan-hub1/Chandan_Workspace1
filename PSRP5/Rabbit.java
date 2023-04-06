package Task;

 public class Rabbit {
/*2: */public static void main(String[] args) {
       /* 3: */Rabbit one = new Rabbit();
        /*4: */Rabbit two = new Rabbit();
        /*5: */Rabbit three = one;
       /* 6:*/ one = null;
      /*  7: */Rabbit four = one;
       /* 8:*/ three = null;
     /*   9:*/ two = null;
       /* 10:*/ two = new Rabbit();
        /*11: */System.gc();
       /* 12:*/ } }


