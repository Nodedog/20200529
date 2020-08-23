import java.util.Scanner;
/*
*
* 读入一个字符串str,输出字符串str中的连续最长的数字串
*
*输入:"aaad112cccc12312ddddd55484884848"
* 输出:55484884848
* */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str3=sc.next();
        maxLength(str3);
    }

        private static void maxLength(String str) {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    sb.append(str.charAt(i));
                }else{
                    sb.append(' ');
                }
            }
            String str1=sb.toString();
            //利用空格进行分割
            String[] array=str1.split(" ");
            int maxsize=0;
            for(int i=0;i<array.length;i++){
                maxsize=array[i].length()>maxsize?array[i].length():maxsize;

            }
            for(int i=0;i<array.length;i++){
                if(array[i].length()==maxsize){
                    System.out.println((array[i]));
                }
            }
        }

}