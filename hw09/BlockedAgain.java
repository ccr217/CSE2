import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
	    //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
       allBlocks(m);

}

public static int getInt(){
    int m;
    System.out.print("Enter an in int between 1 and 9, inclusive: ");
    m= checkInt();
    m= checkRange(m);
    return m;
  }// end method 

public static int checkInt(){
    int m;
     while (true){
    Scanner scan=new Scanner(System.in);
       if (scan.hasNextInt()){
        m= scan.nextInt();
        return m;
       }// end if
       else{
        System.out.print("You did not enter an int; try again: ");
       }
     }
     }// end method
      
public static int checkRange(int x){
    while (true){
        if ((x<=9)&&(x>0)){
            return x;
        }
        else {
            System.out.print("You did not enter an int in [1,9]; try again: ");
            x= checkInt();
        }
    }//end while
    }// end method

public static void allBlocks(int m){
    for (int i=1; i<=m; i++){
        block(i, m); 
    }
    }// end method

public static void block(int i, int m){
    for (int j=1; j<=i; j++){
        line(i,m);
    }
    for (int k=1; k<=(m-i);k++ ){
    System.out.print(" ");
    }
    for (int y=1; y<= ((2*i)-1); y++){
    System.out.print("-");
    }
    System.out.println();
    }// end method

public static void line(int i, int m){
    for (int k=1; k<=(m-i);k++ ){
    System.out.print(" ");
    }
    for (int y=1; y<= ((2*i)-1); y++){
    System.out.print(i);
    }
    System.out.println();
    }// end method


}// end class
