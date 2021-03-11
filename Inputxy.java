import java.util.Scanner;
import java.util.Arrays;
public class Inputxy{
public int count;
public static int oo[];
public int[] Input(){

  Scanner scan=new Scanner(System.in);
  int count=scan.nextInt();
System.out.println(count+"の要素の配列を作成します");
  var oo=new int[count];

      for(int i=0 ; i<count; i++){
      int kazu=scan.nextInt();
      oo[i]=kazu;
}
System.out.println(Arrays.toString(oo));
Arrays.sort(oo);
System.out.println("並べ替えます");
System.out.println(Arrays.toString(oo));
return this.oo;
    }}
