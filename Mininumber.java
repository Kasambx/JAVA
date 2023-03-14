public class Minnumber{
public static void main(String args[]){
double x  = 21.5;
double y= 2.0;
double z = minvalfunc(x,y);
System.out.println("The returned value is "+z);
}
public static double minvalfunc (double num1, double num2) {
double minval;
if (num1 > num2)
minval = num2;
else
minval = num1;
return minval;
}


}




