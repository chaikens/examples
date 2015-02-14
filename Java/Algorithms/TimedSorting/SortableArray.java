import java.util.Scanner;
public class SortableArray
{
  private int[] theArray;

  private int[] scratch;

  SortableArray(int[] x)
  {
    theArray = x;
  }

  public void MergeSort()
  {
    scratch = new int[theArray.length];
    MergeSort(0, theArray.length-1);
  }

  private void MergeSort(int from, int to)
  {
    if(from < to)
    {
      int mid = (from + to)/2;
      MergeSort(from, mid);
      MergeSort(mid+1, to);
      Merge(from,mid,mid+1,to);
    }
  }

  private void Merge(int from1, int to1, int from2, int to2)
  {
    int src1 = from1;
    int src2 = from2;
    for(int dest = from1; dest <= to2; dest++)
    {
      if(src1 <= to1 && src2 <= to2)
      {
         if(theArray[src1] < theArray[src2])
         {
            scratch[dest] = theArray[src1++];
         }
         else
         {
            scratch[dest] = theArray[src2++];
         }
      }
      else
      {
        if(src1 <= to1)
          scratch[dest] = theArray[src1++];
        if(src2 <= to2)
          scratch[dest] = theArray[src2++];
      }
    }
    for(int dest = from1; dest <= to2; dest++)
    {
      theArray[dest] = scratch[dest];
    }
  }

    
  public void SelectionSort()
  {
    System.out.println("SelectionSort called.");
    for(int out = 0; out != theArray.length-1; out++)
    {
      for(int scanpos = out+1; scanpos < theArray.length; scanpos++)
      {
        if(theArray[out] > theArray[scanpos])
        {
           int temp;
           temp = theArray[out];
           theArray[out] = theArray[scanpos];
           theArray[scanpos] = temp;
        }
      }
    }
    System.out.println("SelectionSort returns.");
  }

  private static void printArray(int[] x)
  {
    for(int i = 0; i < x.length; i++)
      System.out.println(x[i]);
  }

  public static void main(String[] arg)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many ints to sort?");
    int nToSort = sc.nextInt();
    int[] myArray = new int[nToSort];
    for(int i=0; i<nToSort; i++)
      {
        myArray[i] = nToSort - i;
      }
    System.out.println("Before sorting:");
    if(nToSort < 10) printArray(myArray);

    SortableArray mySorter = new SortableArray(myArray);
    System.out.print("Which algorithm? ");
    System.out.print("SelectionSort");
    System.out.print(" or MergeSort");
    //System.out.print(" or ");  //You Fill in!
    System.out.print("?");
    sc.nextLine(); //Gobble the empty line after the number previously read.
    String response = sc.nextLine();
    Stopwatch sw = new Stopwatch();
    if(response.equals("SelectionSort"))
      mySorter.SelectionSort();
    else if(response.equals("MergeSort"))
      mySorter.MergeSort();
    //else if(response.equals("..."))  //You fill in!
    //  mySorter....();                //You fill in!
    else 
    {
      System.out.println("Unrecognized algorithm name.");
      return ;
    }
    sw.print();
    System.out.println("After " + response + ":\n");
    if(nToSort < 10) printArray(myArray);
  }
}

