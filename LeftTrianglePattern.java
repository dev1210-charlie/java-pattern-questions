//3
public class LeftTrianglePattern  
{    
public static void main(String args[])   
{    
int i, j, row = 6;       
for (i=0; i<row; i++)   
{  
for (j=2*(row-i); j>=0; j--)         
{  
//prints space between two stars      
System.out.print(" ");   
}   
for (j=0; j<=i; j++ )   
{   
//prints star      
System.out.print("* ");   
}   
System.out.println();   
}   
}   
}