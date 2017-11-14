import java.util.ArrayList;
import java.util.List;

public class main {
    public static String author2 = "Akshat";


    public static void main(String[] args){
        System.out.println("In the main function");
    }

    public static void func1(Integer i){
        //move the following lines to last
        System.out.println("This is the first line. Which would be moved to last");
        if(i > 0){
            System.out.println("This is inside a block");
        }

        int x = i;
        int modifyVariableName = 0;
        double modifyVariableType = 0.0;
        int changeVariableNameAndType = 0;

        int a = 1;
        int b = 1;
        int c = 1;

        int modifyThisExpression = (a+3)/(b-10)*(c+1);
        int changeThisExpression = (a+3)/(b-10)*(c+1);
        int changeVariableNames = (a+3)/(b-10)*(c+1);

        System.out.println("Modify this line");
        System.out.println(x);


        //Swap the following lines
        System.out.println("First");
        System.out.println("Second");


        System.out.println("1");
        String move = "This is the line that would be moved";

        System.out.println("2");
        String moveInBlock = "This is the line that would be moved into the block";

        System.out.println("3");
        for(int z=0; z<10; z--) {
            x++;
        }

        System.out.println("4");

        System.out.println("5");

        System.out.println("6");
        //remove the line from inside the for loop initialisation
        for(int init=0; init<10; init--) {
            x++;
        }

        System.out.println("7");

        System.out.println("8");
        System.out.println("Move this line to different function");
    }

    void func2(String s){
        int addAnotherVarAfterThis = 0;

        System.out.println("This is the static line");

        int changeVariableNameAfterMoving = 99;
        int changeValueAfterMoving = 99;
        System.out.println("This is another base line");


    }

    void func3(Double d){
        int deleteThisVar = 1111;
        System.out.println("This is base for this function");


    }
}
