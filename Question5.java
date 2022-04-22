import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Question5
{
  public static void main(String[] args)
  {
    int n, x;
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter no. of elements you want in array:");
    n = in.nextInt();
    ArrayList<Integer> a = new ArrayList<Integer>();
    //System.out.println("Enter all the elements:");
    for(int i = 0; i < n; i++)
    {
      int ans = in.nextInt();
      a.add(ans);
    }

    HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
    for(int num : a)
    {
      if(d.containsKey(num))
      {
        int exist = d.get(num) + 1;
        d.put(num, exist);
      }
      else
      {
        d.put(num, 1);
      }
    }

    int m = 0;
    for(int i : d.values())
    {
      if(i > m)
      {
        m = i;
      }
    }

    int result = 0;
    for(int i : d.keySet())
    {
      if(d.get(i) == m)
      {
        result = i;
      }
    }

    System.out.println(result);

  }
}
