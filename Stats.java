import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;


class Main {

  public static Scanner input = new Scanner(System.in);

  public static double[] input (){ 
    // Have a user input a VALID list of numbers
    
    
    ArrayList<Double> list = new ArrayList<Double>();
    boolean keepAdding = true;
    double numAdd;

    do {
      try {
        System.out.print("Please enter number for your list (-1 to quit): ");
        numAdd = input.nextDouble();
      } catch (InputMismatchException ex){
        System.out.print("Please enter a valid number: ");
        numAdd = input.nextDouble();
      }

      if(numAdd == -1){
        if (list.isEmpty()){
          System.out.print("You must add at least one number: ");
          numAdd = input.nextDouble();
        } else{
        keepAdding = false;
        break;
        }
      }
      else if (numAdd >= 0){
        list.add(numAdd);
      }
      else {
        System.out.print("Please enter a valid number: ");
        numAdd = input.nextDouble();
      }
    } 
    while (keepAdding); 
      

    double[] aList = new double[list.size()];

    for (int i = 0; i < list.size(); i++){
      aList[i] = list.get(i);
    }

      return aList;
  }	

  public static double median (double[] aList){ 

    
    Arrays.sort(aList);
    int middle  = aList.length / 2;
    int size = aList.length;
    double median;
 
    if ((size % 2) == 0)
    {
    median = (double)(((aList[middle - 1]) + (aList[middle]))/2);
    }
    
    else
    {
    median=aList[middle]; 

    }
    
    return median;
      
  }

  public static double mode (double[] aList) { 

    
    double mode_value = 0.0;
    int mode_count = 0;  
      
    for (int i = 0; i <aList.length; i++){
    
      int count = 0;
      for (int t = 0; t <aList.length; t++){
      
        if (aList[i] == aList[t]){
          count++;
        }  
      
      if (count > mode_count){
        mode_count = count;
        mode_value = aList[i];
      }
    
    }
    }

    return (mode_value);
  
      }
    
      
  public static void main(String[] args) {

      int exit;
      boolean keepPlaying = true;

    do{
      
      double[] numList = input();
      
      System.out.println("\nYour List is: ");
      for (int i = 0; i < numList.length; i++){
        System.out.println(numList[i]);
      }
      
      System.out.println("\nThe median is: " + median(numList));

      System.out.println("The mode is: " + mode(numList));
      
      System.out.print("\nEnter 1 to keep playing or 0 to exit: ");
      exit = input.nextInt();

      if (exit == 1){
        keepPlaying = true;
      }
      else if ( exit == 0){
        keepPlaying = false;
      }
      
      }
      while(keepPlaying);
         
     
      System.out.println("Goodbye");
      
  }
}