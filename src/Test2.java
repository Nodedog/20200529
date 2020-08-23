import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        String a = "aaad112cccc12312ddddd55484884848";
        maxLength2(a,32);
    }
        private static void maxLength2(String str, int n) {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i++){
                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    sb.append(str.charAt(i));
                }else{
                    sb.append(' ');
                }
            }
            String str1=sb.toString();
            //利用空格进行分割
            String[] array=str1.split(" ");
            System.out.println(Arrays.toString(array));
           // int a = array[4].length;
           // System.out.println(a);
     }



}
