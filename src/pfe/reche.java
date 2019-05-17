/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

public class reche {
    String namenode,formenode,colornode,namegraphe,namerule,namesystem;
  
    public String getnamenode(String name){
     if(name=="") return null;
     else return name;
    
    }
   
   
   public String getformenode(String forme){
       switch(forme){ 
       case ":RECT:" :formenode="Rectangle";break;
       case ":ROUNDRECT:" :formenode="RoundRectangle";break;
       case ":OVAL:" :formenode="Ovale";break;
       case ":CIRCLE:" : formenode="Circle";break;
       }
       return formenode;
           
   }
   public String getformeedge(String formee){
      String formedge="";
       switch(formee){ 
       case ":SOLID_LINE:" :formedge="edgesolide" ;break;
       case ":DOT_LINE:" :formedge="edgedot" ;break;
       case ":DASH_LINE:" :formedge="edgedash" ;break;
       
       }
       
       return formedge;
           
   }
   
   public String edge(String source,String target,String forme){
      String edge="";
       edge=(forme+"("+source+","+target+")");
       return edge;
           
   }
   public String getcolornode(String color){
String ne1,ne2,ne3; int n1=0,n2=0,n3=0,n4=0,num1=0,num2=0,num3=0;
     System.out.print("\n"+color+"\n");

n1=color.indexOf("[r=");
n2=color.indexOf(",g=");
n3=color.indexOf(",b=");
n4=color.indexOf("]");
num1=Integer.parseInt(color.substring(n1+3,n2).toString());
num2=Integer.parseInt(color.substring(n2+3,n3).toString());
num3=Integer.parseInt(color.substring(n3+3,n4).toString());
ne1=color.substring(n1+3,n2);
ne2=color.substring(n2+3,n3);
ne3=color.substring(n3+3,n4);
System.out.print("\n"+num1+"\n"+num2+"\n"+num3+"\n");
    
       colornode=ne1+ne2+ne3;
       return colornode;
   }    
                   }














