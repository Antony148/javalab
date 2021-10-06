class Shape{
void perimeter( int l,int b,char ch){
if (ch=='r'){
System.out.println("rectangle :"+ (2*(l+b)));
}
else {
System.out.println("not a rectangle");
}
}
void perimeter( int a,char ch){
if (ch=='s'){
System.out.println("square :"+ 4*a);
}
else{
System.out.println("not a square");
}
}
void perimeter( int r,float ch){
if (ch=='c'){
System.out.println("circle :"+ 2*3.14*r);
}
else{
System.out.println("not a circle");
}
}
}

 class Figure{
public static void main (String[] args){
Shape sh = new Shape();
sh.perimeter(2,2,'r');
sh.perimeter(2,'s');
sh.perimeter(2,'c');
}
}








