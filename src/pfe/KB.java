/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import static pfe.Application.cnode;
import static pfe.Application.fnode;
import static pfe.Application.namegraphe;
import static pfe.Application.narule;
import static pfe.Application.nnode;
import static pfe.Application.sntype;
import static pfe.Application.srule;

/**
 *
 * @author salahinfo
 */
public class KB extends Application{
    public String tbox;
  

public void KB_TBOX(){
    tbox="";          
          
          tbox="     ----- voici la base de connaissance de notre system -----\n\n"+
                  "       TBOX = { \n\tGTS \u2291 \u22A4 ,\n"
                  
                  
                  
                  +"\tGraph \u2261 GTS \u2293 \u2200hasNode.Node ,\n"
                  +"\tRule   \u2261 GTS \u2293 \u02E5Graphe ,\n"
                  +"\tTypes  \u2261 GTS \u2293 \u02E5Rule \u2293 \u02E5Graphe ,\n"
                  +"\tColor  \u2291 Types ,\n" 
                  +"\tForme  \u2261 Types \u2293 \u02E5Color ,\n"
                  +"\tNode   \u2261 Types \u2293 \u02E5Color \u2293 \u02E5Forme \u2293 \u2200edge.Node "
                  + "\u2294 \u2203hasColor.Color \u2294 \u2203hasForme.Forme ,\n"
                  +"\n\tedge \u2291 \u22A4role ,\n"     
                  +"\tedgedash   \u2291 edge ,\n"     
                  +"\tedgesolide \u2261 edge \u2293 \u02E5edgedash ,\n"
                  +"\tedgedot \u2261 edge \u2293 \u02E5edgesolid \u2293 \u02E5edgedash ,\n"
                  +"\thasForme \u2261 edge \u2293 \u02E5edgesolid \u2293 \u02E5edgedash \u2293 \u02E5edgedot ,\n"
                  +"\thasColor \u2261 edge \u2293 \u02E5edgesolid \u2293 \u02E5edgedash \u2293 \u02E5edgedot \u2293 \u02E5hasForme ,\n"
                  +"\thasNode \u2261 edge \u2293 \u02E5edgesolid \u2293 \u02E5edgedash \u2293 \u02E5edgedot \u2293 \u02E5hasForme \u2293 \u02E5hasColor ,\n"
                  +"\n\n\t}"
                  ;           
    
    }

String h="",abox="",abox_source="",abox_cible="",abox_rule="",abox_meta="";

public void ABOX(){
    abox="ABOXtype= {\n";
    for(int i=0;i<sntype;i++){
        
                              abox+= "\n\tNode("+tnnode[i]+") , Forme("+tfnode[i]+") , "
                                      + "hasForme("+tnnode[i]+","+tfnode[i]+"), Color("+tcnode[i]
                                      +") , hasColor("+tnnode[i]+","+tcnode[i]+")\n";
                             }
    if(stg!=0){
               abox+=("\n\tGraph("+nametypegraphe+")\n\t");
              for(int i=0;i<sntg;i++){
                                      abox+= "Node("+nnodeTG[i]+"),\n\thasNode("+nametypegraphe+","+nnodeTG[i]+")\n\t";
                                     }
              
             for(int i=0;i<estg;i++){
                                     abox+=edgeTG[i]+"\n\t";
                                     }
            
             }
    
    abox+="\n\n\t}\n";
      abox_source="ABOXgs={\n"+ "\tGraph("+namegraphe+"),\n";

    for(int i=0;i<sng;i++){ 
                            abox_source+= "\tNode("+nnode[i]+") \t hasNode("+namegraphe+","+nnode[i]+")\n";
                           }
   for(int i=0;i<esg;i++){
                          abox_source+="\t"+edge[i]+"\n";
                         }
   
   abox_source+="\n\n\t}\n";
   h=abox_source;
   h=h.replace("ABOXgs", "ABOXgc");
   abox_cible=h;
   
   
   for(int i = 0; i <  srule; i++){
                             
             abox_rule+=("ABOXr"+(i+1)+"= { \n\tRule("+narule[i]+")\n");
             for(int j = 0 ; j < strule[i] ;j++){
                                                abox_rule+=("\n\n\tGraph("+typerule[i][j]+")\n\n");
      
                switch(typerule[i][j]){
                        
                    
                               case "LHS" :   {   for(int k=0;k<sizenLHS[i];k++){
                                                                           abox_rule+=("\tNode("+NLHS[i][k]+"),\thasNode(LHS , "+NLHS[i][k]+"),\n");
                                                                                 }
                                                  for(int l=0;l<siezeeLHS[i];l++){
                                                                           abox_rule+=("\t"+edgeLHS[i][l]+"\n");
                                                                                  }
                                                  break;
                                              }
                              case "RHS" :    {  abox_rule+="\n"; for(int k=0;k<sizenRHS[i];k++){
                                                                           abox_rule+=("\tNode("+NRHS[i][k]+"),\thasNode(RHS , "+NRHS[i][k]+"),\n");
                                                                                }
                                                  for(int l=0;l<siezeeRHS[i];l++){
                                                                           abox_rule+=("\t"+edgeRHS[i][l]+"\n");
                                                                                }
                                                  break;
                                               }
                                      } 
                                               }
                             
                             //aplicationt condition 
                             
           if(apllc){
                      if(Nac[i]){
                                  abox_rule+="\n\n\tGraph(NAC)\n\n";
                                  for(int m=0;m<sizenNAC[i];m++){
                                                                abox_rule+=("\tNode("+NNAC[i][m]+"),\thasNode(NAC , "+NNAC[i][m]+"),\n");                                                                
                                                                 }
                                  for(int y=0;y<siezeeNAC[i];y++){
                                                                abox_rule+=("\t"+edgeNAC[i][y]+"\n");       
                                                                 }
                                 }
                     if(Pac[i]){
                                   abox_rule+="\n\n\tGraph(PAC)\n\n";
                                   for(int m=0;m<sizenPAC[i];m++){
                                                                abox_rule+=("\tNode("+NPAC[i][m]+"),\thasNode(PAC , "+NPAC[i][m]+"),\n");
                                                                 }
                                   for(int y=0;y<siezeePAC[i];y++){
                                                                abox_rule+=("\t"+edgePAC[i][y]+"\n");
                                                                   }
                                 }
                     if(Gac[i]){
                                    abox_rule+="\n\n\tGraph(GAC)\n\n";
                                    for(int m=0;m<sizenGAC[i];m++){
                                                                abox_rule+=("\tNode("+NGAC[i][m]+"),\thasNode(GAC , "+NGAC[i][m]+"),\n");
                                                                  }
                                   for(int y=0;y<siezeeGAC[i];y++){
                                                                abox_rule+=("\t"+edgeGAC[i][y]+"\n");
                                                                   }
                                 }
                               
                    }
 abox_rule+=("\n\n\t}\n");                                    }
aboxrule=abox_rule;

}
public String get_tbox(){
                         return (tbox);   
                        }
 
public String get_abox(){
                        return (abox);
                        }
public String get_abox_gs(){
                           return (abox+abox_source);
                           }
public String get_abox_gc(){
                           return (abox+abox_cible);
                           }
public String get_abox_r(){
                            return (abox+abox_rule);
                           }
public String get_abox_source(){
                   return(abox+abox_rule+abox_source);
}
public String get_abox_cible(){
                   return(abox+abox_rule+abox_cible);
}

}