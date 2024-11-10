import java.util.*;
class Player//parent class or base class or super class
{
String name1="M.S Dhoni";
String name2="Cristiano Ronaldo";
String name3="Mandeep Singh";
int age2=37;
int age1=41;
int age3=27;
}
class Cricket_Player extends Player//1st child class
{
int runs=10000;
int wickets=100;
void Cricket_info(){
System.out.println("Name of the Player is : "+name1);
System.out.println("Runs made by "+name1+" is "+runs);
System.out.println("Age of "+name1+" is "+age1);
System.out.println("Wickets taken by "+name1+" is "+wickets);
System.out.println();
}
}
class Football_Player extends Player//2nd child class
{
int goals =100;
int assist =500;
void Football_info(){
System.out.println("Name of the Player is : "+name2);
System.out.println("Goals by "+name2+" are "+goals);
System.out.println("Age of "+name2+" is "+age2);
System.out.println("Assist by "+name2+" are "+assist);
System.out.println();
}
}
class Hockey_Player extends Player//3rd child class
{
int stricks=300;
void Hockey_info(){
System.out.println("Name of the Player is : "+name3);
System.out.println("Stricks by "+name3+" are "+stricks);
System.out.println("Age of "+name3+" is "+age3);
System.out.println();
}
}
class TestPlayer{
public static void main(String[] args){
Cricket_Player cp=new Cricket_Player();
Football_Player fp=new Football_Player();
Hockey_Player hp=new Hockey_Player();
System.out.println("Cricket Player Info :");
cp.Cricket_info();
System.out.println("Football Player Info :");
fp.Football_info();
System.out.println("Hockey Player Info :");
hp.Hockey_info();
}
}