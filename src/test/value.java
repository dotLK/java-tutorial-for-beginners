package test;

import java.util.*;
class value{
public static void main(String[]args){
Scanner s = new Scanner (System.in);
double sum=0.0;
int i=0;
	while(i<3){
	System.out.println("Enter the real number");
if(s.hasNextDouble())
{
	sum += s.nextDouble();
i++;
}
else
{
String value=s.next();
if(value.equals("Exit"))
{
break;}
}
}
if(i==3)
{
System.out.println("Mean is "+calcMean(sum));
}}
public static  double calcMean(double sum)
{
double m=(sum)/3;
return m;
}}