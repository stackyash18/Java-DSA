public class ConcatenateArrayOfWords {
  public static void main(String args[])
  {
    String arr[] = {"Yash"," Yashika", " Mayank", " Deepanshi", " Mahima"};

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i<arr.length; i++)
    {
     sb.append(arr[i]);
    }
    System.out.println(sb);
  }
}
