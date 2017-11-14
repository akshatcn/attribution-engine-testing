import java.util.ArrayList;
import java.util.List;

public class main {
    public static String author2 = "Akshat";


    public static void main(String[] args){
        System.out.println("In the main function");
    }

    public static void func1(Integer i){

        int x = i;
        int variableNameModified = 0;
        float modifyVariableType = 0;
        double changeVariableNameAndType = 0;

        int a = 1;
        int b = 1;

        int c = 1;
        int d=1, e=1, f=1, g=1;

        int modifyThisExpression = (a+3)+(b-1)/(c-1);
        int changeThisExpression = a+b+c;
        int changeVariableNames = (d+3)/(e-10)*(f+1);

        System.out.println("Modify this line");
        System.out.println(x);


        //Swap the following lines
        System.out.println("Second");
        System.out.println("First");


        System.out.println("1");

        System.out.println("2");

        System.out.println("3");
        for(int z=0; z<10; z--) {
            x++;
            String moveInBlock = "This is the line that would be moved into the block";
        }

        System.out.println("4");
        String move = "This is the line that would be moved";

        System.out.println("5");

        System.out.println("6");
        //remove the line from inside the for loop initialisation
        int init = 0;
        for(; init<10; init--) {
            x++;
        }

        System.out.println("7");

        System.out.println("8");

        //move the following lines to last
        System.out.println("This is the first line. Which would be moved to last");
        if(i > 0){
            System.out.println("This is inside a block");
        }

    }

    void func2(String s){
        //Let's just add a comment
        int addAnotherVarAfterThis = 0;
            System.out.println("Move this line to different function");

        System.out.println("This is the static line");

        System.out.println("This is another base line");

        int variableNameChangedAfterMoving = 99;

        int changeValueAfterMoving = 0;

    }

    void func3(Double d){

        System.out.println("This is base for this function");

        System.out.println("This is not a base for this function");

    }
}
