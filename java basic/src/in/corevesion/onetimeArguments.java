package in.corevesion;

public class onetimeArguments {
public static void main(String[]args) {
//System.out.print("Hello" +args[0] );
//System.out.print(" mr" +args[1]);
//System.out.print( args[2] + " sons");

//if(args.length==3) {
//System.out.println("hello"+args[0]);
//}else {
//System.out.println("Parameter name is required");
//for(int i=0; i<args.length;i++) {
//System.out.print(i+"=hello" +args[i]);
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int div=a/b;
System.out.println("sum is"+div);

}
}



