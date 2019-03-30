package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

        //int number [] = new int[10];

        //one way to do arrays
//        number[0]=55;
//        number[1]=670;
//        number[2]=450;

        //System.out.println(number[1]);

        //initializing and array
       // int num []={4,6,2,8,1,};
        //System.out.println(num[2]);

        //initializing and index of arrays
        //String names[]={"henry", "george", "terry", "robby"};
        //System.out.println(names[2]);

//        int newNumb []= {56,33,68,11,88,63};
//        System.out.println("Index   Value");
//
//        for(int counter = 0; counter <newNumb.length; counter++){
//            System.out.println(counter + "        "+ newNumb [counter]);
//        }


//        int moneyOwed [] = new int[5];
//        moneyOwed [0]=44;
//        moneyOwed [1]=67;
//        moneyOwed [2]=89;
//
//        System.out.println(moneyOwed[2]);
//
//        String name [] ={" johnny"," Gerry"," jim"};
//        for(int count =0;count <3; count++) {
//
//
//            System.out.println(count+ name[count]);
//
//
//            String phoneNumber [] = {"02890675782","02892333444","02897666555","02895888000"};
//            for(int counting=0; counting<phoneNumber.length; counting++) {
//                System.out.println("Phone number " + counting+ " is " + phoneNumber[counting]);
//            }
//
//
//        }
//
//        //code to add numbers in an array
//        double sumOfNum = 0;
//        double num [] = {455,223,899,122,55,345,900,378};
//
//            for (int add =0; add<num.length; add++){
//
//                sumOfNum+=num[add];
//                System.out.println("Sum of values "+sumOfNum);
//        }

        //enhanced for statement
        int total=0;
        int numbers []= {5,6,8,2,5,9,4};

        for (int x:numbers){
            total+=x;
            //System.out.println(total); -- in the loop if you want to show it incrementing each time a number is added

        }
        System.out.println(total);//outside the loop if you just want the answer
    }
}
