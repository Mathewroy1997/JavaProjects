import java.util.Scanner;

public class Multi_array {
    public static void main(String[] args){
        String[][] fruit=new String[3][3];
        Scanner fruits=new Scanner(System.in);
        System.out.println("Enter 9 fruit names:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                fruit[i][j]=fruits.nextLine();
            }
        }
        System.out.println("The fruit matrix is :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(fruit[i][j]+"\t");
            }
            System.out.println();
        }

    }

}
