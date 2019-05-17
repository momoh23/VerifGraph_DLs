package pfe;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class parser extends Application{
String system,regle,graphe,typegraphe,edgeforme;int ind ,indf ,indc ,indcc;
                  reche n=new reche();String source="",target="";
                    Element nns = null,nnt=null;
public String getGTS(Document xml){
 
system="";graphe="";regle="";typegraphe="";
    Element root = xml.getRootElement();
    

system=("\n l'élément root du document xml est: " +root.getName());
system+=("\n le nbr des Attributes du Document est ="  +root.getAttributes().size());
system+=("\n le nbr des fils du Document est ="  +root.getChildren().size());


Element GraphTransformationSystem=root.getChild("GraphTransformationSystem");
Element TaggedValue1=GraphTransformationSystem.getChild("TaggedValue");
Element Types=GraphTransformationSystem.getChild("Types");
Element Graphh=GraphTransformationSystem.getChild("Graph");
Element Rule=GraphTransformationSystem.getChild("Rule");
Element TypeGraph=Types.getChild("Graph");
Element Graphrule=Rule.getChild("Graph");
String re="[Element: <ApplCondition/>]";

List Document = root.getChildren("GraphTransformationSystem");
List NodeType = Types.getChildren("NodeType");
List EdgeType = Types.getChildren("EdgeType");
List GraphType = Types.getChildren("Graph");
List TagguedValue = GraphTransformationSystem.getChildren("TaggedValue");
List TagguedValue1 = TaggedValue1.getChildren("TaggedValue");
List Graph = GraphTransformationSystem.getChildren("Graph");
List NodeGraph=Graphh.getChildren("Node");


List EdgeGraph=Graphh.getChildren("Edge");
List ruleGraph=Rule.getChildren("Graph");

List Ruule=GraphTransformationSystem.getChildren("Rule");
system+=("\n     *******GraphTransformationSystem*******\n\n");
            for (int i = 0; i < Document.size(); i++){
	                                                Element Gt = (Element) Document.get(i);
                                  	                system+=("\nID grtrsyt = "  +Gt.getAttributeValue("ID"));
                                                        system+=("\norienter grtrsyt =" +Gt.getAttributeValue("directed")); 
	                                                system+=("\nname grtrsyt = :" +Gt.getAttributeValue("name"));  
                                                        system+=("\nparallele grtrsyt = "+Gt.getAttributeValue("parallel"));	
                                                     }
            
system+=("\n      *******The static part of System*******");
	   
            for (int i = 0; i < TagguedValue.size(); i++){
	                	                           Element Tagge = (Element)TagguedValue.get(i);
	                                                   system+=("\nle module de commandes qui gère les librairies and their conditions est:"+Tagge.getAttributeValue("Tag"));
                                                           system+=("\nce module est il applicable ou bien le type d'expression java:"+Tagge.getAttributeValue("TagValue"));
                                                         }
            
            for (int j = 0; j < TagguedValue1.size(); j++){
	         	                                    Element Tagge1 = (Element)TagguedValue1.get(j);
                                                            system+=("\nle module de commandes qui gère les librairies and their conditions est:"+Tagge1.getAttributeValue("Tag"));
                                                            system+=("\nle nom des "+Tagge1.getAttributeValue("Tag")+" = "+Tagge1.getAttributeValue("TagValue"));
                                                           }
            
system+=("\n      *******The type of node,edge and Graph in GTS******* \n");
       
       sntype=NodeType.size();
       for (int i = 0; i < NodeType.size();i++){ 
                                                  Element Node = (Element) NodeType.get(i);
	                                          system+=("\nID Nd ="  +Node.getAttributeValue("ID"));
	    	                                  system+=("\nabs=" +Node.getAttributeValue("abstract"));
                                                  ind=Node.getAttributeValue("name").indexOf("%");
                                                  indf=Node.getAttributeValue("name").indexOf("java");
                                                  indc=Node.getAttributeValue("name").indexOf("Color");
                                                  indcc=Node.getAttributeValue("name").indexOf(":[NODE]:");                                                        reche n=new reche();
                                                  tnnode[i]=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                  tfnode[i]=n.getformenode(Node.getAttributeValue("name").substring(ind+1,indf));
                                                  tcnode[i]=n.getcolornode(Node.getAttributeValue("name").substring(indc+5,indcc));
                                                  system+=("\ntype of Nd  : "+Node.getAttributeValue("name"));
                                                }
       
       for (int i= 0; i < EdgeType.size(); i++){
                                                  Element Edge  = (Element) EdgeType.get(i);
	    	                                  system+=("\nID Edge="  +Edge.getAttributeValue("ID"));
	    	                                  system+=("\nabs Edge=" +Edge.getAttributeValue("abstract"));
	    	                                  system+=("\nTYP Edge=" +Edge.getAttributeValue("name"));
	                                       }
       stg=GraphType.size();
 if(GraphType.size()!=0){
 typegraphe=("\n      *******The Type Graph******* \n ");
                    
	    	   Element TG  = (Element) GraphType.get(0);
                   typegraphe+=("\nID graphe  ="  +TG.getAttributeValue("ID"));
	    	   typegraphe+=("\nname graphe =" +TG.getAttributeValue("name"));
	    	   nametypegraphe=TG.getAttributeValue("name");
                   typegraphe+=("\nkind graphe :" +TG.getAttributeValue("kind"));
	           List NodeTypeGraph=TypeGraph.getChildren("Node");
                   List EdgeTypeGraph=TypeGraph.getChildren("Edge");
typegraphe+=("\n      *******The node and edge of Type Graph******"+nametypegraphe+" \n      -------The number of node is :: "+NodeTypeGraph.size()+"\n      -------The number of edge is :: "+EdgeTypeGraph.size());
        sntg=NodeTypeGraph.size();
	for (int i = 0; i < NodeTypeGraph.size(); i++){
	    	                                        Element Nodetgra  = (Element) NodeTypeGraph.get(i);
	                                                typegraphe+=("\nID node ="  + Nodetgra.getAttributeValue("ID"));
	    	 
	    	for (int j = 0;j <NodeType.size() ; j++){
                                                            Element Node = (Element) NodeType.get(j);
                                                            if(Nodetgra.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                              {  typegraphe+=("\nTYP node  :" + Nodetgra.getAttributeValue("type").replace(Nodetgra.getAttributeValue("type"),Node.getAttributeValue("name")));
                                                                 ind=Node.getAttributeValue("name").indexOf("%");
                                                                 indf=Node.getAttributeValue("name").indexOf("java");
                                                                 indc=Node.getAttributeValue("name").indexOf("Color");
                                                                 indcc=Node.getAttributeValue("name").indexOf(":[NODE]:");
                                                                 nnodeTG[i]=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                 fnodeTG[i]=n.getformenode(Node.getAttributeValue("name").substring(ind+1,indf));
                                                                 cnodeTG[i]=n.getcolornode(Node.getAttributeValue("name").substring(indc+5,indcc));
                                                              }
                                                        }
                                                      } 
  
        estg=EdgeTypeGraph.size();//les edges utiliser dans le graphe source;
        for (int i = 0; i < EdgeTypeGraph.size(); i++){
                                                       Element Edgetgra  = (Element) EdgeTypeGraph.get(i);
	                                               graphe+=("\nID Edge ="  + Edgetgra.getAttributeValue("ID"));
	    for (int j = 0;j <EdgeType.size() ;j++){
                                                       Element edgee = (Element) EdgeType.get(j);
                                                       if(Edgetgra.getAttributeValue("type").equalsIgnoreCase(edgee.getAttributeValue("ID")))
                                                         {
                                                          typegraphe+=("\nTYPe Edge  :" + edgee.getAttributeValue("name"));
	                                                  typegraphe+=("\nsource edge= :" +  Edgetgra.getAttributeValue("source"));
                                                          typegraphe+=("---->Tragetedge=  :" +  Edgetgra.getAttributeValue("target")+"\n");
                                                          ind=edgee.getAttributeValue("name").indexOf("%");
                                                          indf=edgee.getAttributeValue("name").indexOf("java");
                                                          edgeforme=n.getformeedge(edgee.getAttributeValue("name").substring(ind+1,indf));
                        for(int u = 0; u < NodeTypeGraph.size();u++){
                                                                Element g=(Element) NodeTypeGraph.get(u);
                                                                if(g.getAttributeValue("ID").equalsIgnoreCase(Edgetgra.getAttributeValue("source"))) nns=g;
                                                                if(g.getAttributeValue("ID").equalsIgnoreCase(Edgetgra.getAttributeValue("target"))) nnt=g;
                                                               }
                       for (int l = 0;l <NodeType.size() ; l++){
                                                                Element Node = (Element) NodeType.get(l); 
                                       if(nns.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                  {                    
                                                                  ind=Node.getAttributeValue("name").indexOf("%");
                                                                  source=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                  }
                                                                if(nnt.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                  {                    
                                                                  ind=Node.getAttributeValue("name").indexOf("%");
                                                                  target=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                  }
                                                               }
                                               edgeTG[i]=n.edge(source, target,edgeforme);
                    
                }}}}
                       
graphe=("\n      *******The Graph******* \n ");
                    
        	    	               Element Graphp  = (Element) Graph.get(0);
	                               graphe+=("\nID graphe  ="  +Graphp .getAttributeValue("ID"));
	    	                       graphe+=("\nname graphe =" +Graphp .getAttributeValue("name"));
	    	                       namegraphe=Graphp.getAttributeValue("name");
                                       graphe+=("\nkind graphe :" +Graphp .getAttributeValue("kind"));
	  
graphe+=("\n      *******The node and edge of graph******"+namegraphe+" \n      -------The number of node is :: "+NodeGraph.size()+"\n      -------The number of edge is :: "+EdgeGraph.size());
                      
        sng=NodeGraph.size();reche n=new reche();
	for (int i = 0; i < NodeGraph.size(); i++){
	             	                            Element Nodegra  = (Element) NodeGraph.get(i);
	                                            graphe+=("\nID node ="  + Nodegra.getAttributeValue("ID"));
	        for (int j = 0;j <NodeType.size() ; j++){
                                                          Element Node = (Element) NodeType.get(j);
                                                          if(Nodegra.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                            {
                                                             graphe+=("\nTYP node  :" + Nodegra.getAttributeValue("type").replace(Nodegra.getAttributeValue("type"),Node.getAttributeValue("name")));
                                                             ind=Node.getAttributeValue("name").indexOf("%"); 
                                                             indf=Node.getAttributeValue("name").indexOf("java");
                                                             indc=Node.getAttributeValue("name").indexOf("Color");
                                                             indcc=Node.getAttributeValue("name").indexOf(":[NODE]:");
                                                             nnode[i]=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                             fnode[i]=n.getformenode(Node.getAttributeValue("name").substring(ind+1,indf));
                                                             cnode[i]=n.getcolornode(Node.getAttributeValue("name").substring(indc+5,indcc));
                                                            } 
                                                        }
	                                          }
        esg=EdgeGraph.size();                   Element nns = null,nnt=null;
        for (int i = 0; i < EdgeGraph.size(); i++){
                                                    String source="",target="";          
                                                    Element Edgegra  = (Element) EdgeGraph.get(i);
	                                            graphe+=("\nID Edge ="  + Edgegra.getAttributeValue("ID"));
	    	for (int j = 0;j <EdgeType.size() ;j++){
                                                          Element edgee = (Element) EdgeType.get(j);
                                                          if(Edgegra.getAttributeValue("type").equalsIgnoreCase(edgee.getAttributeValue("ID")))
                                                           {
                                                             graphe+=("\nTYPe Edge  :" + edgee.getAttributeValue("name"));
	                                                     graphe+=("\nsource edge= :" +  Edgegra.getAttributeValue("source"));
                                                             graphe+=("---->Tragetedge=  :" +  Edgegra.getAttributeValue("target")+"\n");
                                                              ind=edgee.getAttributeValue("name").indexOf("%");
                                                              indf=edgee.getAttributeValue("name").indexOf("java");
                                                             edgeforme=n.getformeedge(edgee.getAttributeValue("name").substring(ind+1,indf));
                        for(int u = 0; u < NodeGraph.size();u++){
                                                                  Element g=(Element) NodeGraph.get(u);
                                                                  if(g.getAttributeValue("ID").equalsIgnoreCase(Edgegra.getAttributeValue("source"))) nns=g;
                                                                  if(g.getAttributeValue("ID").equalsIgnoreCase(Edgegra.getAttributeValue("target"))) nnt=g;
                                                                }
                        for (int l = 0;l <NodeType.size() ; l++){
                                                                  Element Node = (Element) NodeType.get(l);             
                                                                  if(nns.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                    {                    
                                                                       ind=Node.getAttributeValue("name").indexOf("%");
                                                                       source=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                             
                                                                    }
                                                                  if(nnt.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                    {                    
                                                                        ind=Node.getAttributeValue("name").indexOf("%");
                                                                        target=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                    }
                                                                } 
                                                                edge[i]=n.edge(source, target,edgeforme);
                                                             } 
                                                        } 
                                                   }
                  
 regle=("\n\t\t THE GTS have ::"+Ruule.size()+" regles ");
 regle+=("\n\t voici les regeles du system \n");   int h=0;String source="",target="";
         
        srule=Ruule.size();       
        for (int i = 0; i < Ruule.size(); i++){
                                               Element rule = (Element) Ruule.get(i);
	                                       regle+=("\n on a dans la regle n° "+i+1+" sans nom :'"+rule.getAttributeValue("name")+"'\n"); 
                                               regle+=("\nID rule ="  + rule.getAttributeValue("ID"));
	                                       regle+=("\nname rule  :" +rule.getAttributeValue("name"));
                                               narule[i]=rule.getAttributeValue("name");
                                               regle+=("\nformula rule  :" + rule.getAttributeValue("formula")); 
                                               regle+=("\n voici les types de la regle ::("+rule.getAttributeValue("name")+")\n"); 
                                               strule[i]=ruleGraph.size();
                                               for (int l = 0; l < ruleGraph.size(); l++){
	                	                           Element graphrule =(Element) ruleGraph.get(l);
                                                           regle+=("\n on a dans la partie :  "+ graphrule.getAttributeValue("kind")+"\n");
                                                           typerule[i][l]=graphrule.getAttributeValue("kind");
	                                                   regle+=("\nID rule ="  + graphrule.getAttributeValue("ID"));
	    	                                           regle+=("\ntype rule  :" + graphrule.getAttributeValue("kind"));
                                                           regle+=("\nname of type rule  :" + graphrule.getAttributeValue("name"));
                                                           regle+=("\n \t\tvoici les nodes de la partie "+ graphrule.getAttributeValue("kind")+" de la regle '"+rule.getAttributeValue("name")+"'\n");
                     List Nodepartrulle=graphrule.getChildren("Node");
                     List Edgepartrulle=graphrule.getChildren("Edge");
                     
                     switch(typerule[i][l]){
                        
                    
    case "LHS" :      sizenLHS[i]=Nodepartrulle.size();
                         for (int j = 0; j < Nodepartrulle.size(); j++){
	    	                                                        Element noderule = (Element) Nodepartrulle.get(j);
	    	                                                        regle+=("\nID node ="  + noderule.getAttributeValue("ID"));
                   	  	 for (h = 0;h <NodeType.size() ; h++){
                                                                       Element Node = (Element) NodeType.get(h);
                                                                       if(noderule.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                        {   regle+=("\nTYP node  :" + Node.getAttributeValue("name"));
                                                                            ind=Node.getAttributeValue("name").indexOf("%"); 
                                                                            NLHS[i][j]=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                         }
                                                                      } 
                                                                        }
regle+=("\n voici les Edge  du regles "+ graphrule.getAttributeValue("name")+"\n");
                                                     siezeeLHS[i]= Edgepartrulle.size();       
                                  for (int k=0;k < Edgepartrulle.size();k++){
	    	                                                             Element edgrule = (Element) Edgepartrulle.get(k);
	    	                                                             regle+=("\nID edge ="  + edgrule.getAttributeValue("ID"));
	    	                                                             regle+=("\nsource edge= :" + edgrule.getAttributeValue("source")+"---->Tragetedge=  :" + edgrule.getAttributeValue("target")+"\n");
                                        for (int j = 0;j <EdgeType.size() ;j++){
                                                                                Element edgee = (Element) EdgeType.get(j);
                                                                                if(edgrule.getAttributeValue("type").equalsIgnoreCase(edgee.getAttributeValue("ID")))
                                                                                 {
                                                                                 regle+=("\nTYPe Edge :" + edgee.getAttributeValue("name"));
	                                                                         ind=edgee.getAttributeValue("name").indexOf("%");
                                                                                 indf=edgee.getAttributeValue("name").indexOf("java");
                                                                                 edgeforme=n.getformeedge(edgee.getAttributeValue("name").substring(ind+1,indf));
                                 
                                            for(int u = 0; u < Nodepartrulle.size();u++){
                                                                                         Element g=(Element) Nodepartrulle.get(u);
                                                                                         if(edgrule.getAttributeValue("source").equalsIgnoreCase(g.getAttributeValue("ID"))) nns=g;
                                                                                         if(g.getAttributeValue("ID").equalsIgnoreCase(edgrule.getAttributeValue("target"))) nnt=g;
                                                                                         }
                                            for (int p = 0;p <NodeType.size() ; p++){
                                                                                      Element Node = (Element) NodeType.get(p);
                                                                                      if(nns.getAttributeValue("type").endsWith(Node.getAttributeValue("ID")))
                                                                                        {                    
                                                                                         ind=Node.getAttributeValue("name").indexOf("%");
                                                                                         source=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                                         }
                                                                                      if(nnt.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                                        {                    
                                                                                          ind=Node.getAttributeValue("name").indexOf("%");
                                                                                          target=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                                         }
                                                                                    }//fin definir le nom du node source et cible de chaque edge
                                                                                  edgeLHS[i][k]=n.edge(source, target,edgeforme);
                                                                                 }//fin definir le type et les node de edge 
                                                                               }//fin de definir le edge son propre nom
                                                                            }//fin de definir les edge de partie LHS
                                            
    case "RHS" :      sizenRHS[i]=Nodepartrulle.size();
                         for (int j = 0; j < Nodepartrulle.size(); j++){
	    	                                                        Element noderule = (Element) Nodepartrulle.get(j);
	    	                                                        regle+=("\nID node ="  + noderule.getAttributeValue("ID"));
                   	  	 for (h = 0;h <NodeType.size() ; h++){
                                                                       Element Node = (Element) NodeType.get(h);
                                                                       if(noderule.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                        {   regle+=("\nTYP node  :" + Node.getAttributeValue("name"));
                                                                            ind=Node.getAttributeValue("name").indexOf("%"); 
                                                                            NRHS[i][j]=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                         }
                                                                      } 
                                                                        }
regle+=("\n voici les Edge  du regles "+ graphrule.getAttributeValue("name")+"\n");
                                                            siezeeRHS[i]=Edgepartrulle.size();
                                  for (int k=0;k < Edgepartrulle.size();k++){
	    	                                                             Element edgrule = (Element) Edgepartrulle.get(k);
	    	                                                             regle+=("\nID edge ="  + edgrule.getAttributeValue("ID"));
	    	                                                             regle+=("\nsource edge= :" + edgrule.getAttributeValue("source")+"---->Tragetedge=  :" + edgrule.getAttributeValue("target")+"\n");
                                        for (int j = 0;j <EdgeType.size() ;j++){
                                                                                Element edgee = (Element) EdgeType.get(j);
                                                                                if(edgrule.getAttributeValue("type").equalsIgnoreCase(edgee.getAttributeValue("ID")))
                                                                                 {
                                                                                 regle+=("\nTYPe Edge :" + edgee.getAttributeValue("name"));
	                                                                          ind=edgee.getAttributeValue("name").indexOf("%");
                                                                                  indf=edgee.getAttributeValue("name").indexOf("java");
                                                                                 edgeforme=n.getformeedge(edgee.getAttributeValue("name").substring(ind+1,indf));
                                 
                                            for(int u = 0; u < Nodepartrulle.size();u++){
                                                                                         Element g=(Element) Nodepartrulle.get(u);
                                                                                         if(edgrule.getAttributeValue("source").equalsIgnoreCase(g.getAttributeValue("ID"))) nns=g;
                                                                                         if(g.getAttributeValue("ID").equalsIgnoreCase(edgrule.getAttributeValue("target"))) nnt=g;
                                                                                         }
                                            for (int p = 0;p <NodeType.size() ; p++){
                                                                                      Element Node = (Element) NodeType.get(p);
                                                                                      if(nns.getAttributeValue("type").endsWith(Node.getAttributeValue("ID")))
                                                                                        {                    
                                                                                         ind=Node.getAttributeValue("name").indexOf("%");
                                                                                         source=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                                         }
                                                                                      if(nnt.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                                        {                    
                                                                                          ind=Node.getAttributeValue("name").indexOf("%");
                                                                                          target=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                                         }
                                                                                    }//fin definir le nom du node source et cible de chaque edge
                                                                                  edgeRHS[i][k]=n.edge(source, target,edgeforme);
                                                                                 }//fin definir le type et les node de edge 
                                                                               }//fin de definir le edge son propre nom
                                                                            }//fin de definir les edge de partie RHS
                                            
                                       
                                                                               

                     }//fin switch
                                                                 }//fin definir les partie de  rule
                                               
                                               apllc=Rule.cloneContent().toString().contains(re);
                                               
                                               Nac[i]=Gac[i]=Pac[i]=false;
if(Rule.cloneContent().toString().contains(re)){


regle+="\n on a dans la partier Applicationcondition";
if(Rule.getChild("ApplCondition").cloneContent().toString().contains("[Element: <NAC/>]")){
   
List NodeNac=Rule.getChild("ApplCondition").getChild("NAC").getChild("Graph").getChildren("Node");
List EdgeNac=Rule.getChild("ApplCondition").getChild("NAC").getChild("Graph").getChildren("Edge");
    
    
    Nac[i]=true;
   
                             ////////////////////////////////////////////////:Nac
    regle+=("\n\t\t on a dans l'Applcond ::::NAC");
    regle+=("\nID ApplCond ="  +Rule.getChild("ApplCondition").getChild("NAC").getChild("Graph").getAttributeValue("ID"));
    regle+=("\nle type de cette ApplCond est :" +Rule.getChild("ApplCondition").getChild("NAC").getChild("Graph").getAttributeValue("kind"));
    regle+=("\nname de cette ApplCond est  :" +Rule.getChild("ApplCondition").getChild("NAC").getChild("Graph").getAttributeValue("name"));
    regle+=("\n \t\tvoici les nodes de l'Applcond "+ "::NAC"+" de la regle "+rule.getAttributeValue("name")+"\n");
                         ////////////////////////////////////////////////:node Nac            
     sizenNAC[i]=NodeNac.size();
                         for (int j = 0; j < NodeNac.size(); j++){
	    	                                                        Element node = (Element) NodeNac.get(j);
	    	                                                        regle+=("\nID node ="  + node.getAttributeValue("ID"));
                   	  	 for (h = 0;h <NodeType.size() ; h++){
                                                                       Element Node = (Element) NodeType.get(h);
                                                                       if(node.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                        {   
                                                                            regle+=("\nTYP node  :" + Node.getAttributeValue("name"));
                                                                            ind=Node.getAttributeValue("name").indexOf("%"); 
                                                                            NNAC[i][j]=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                         }
                                                                      } 
                                                                        }
                         

                         
////////////////////////////////////////////////:edge Nac
    regle+=("\n voici les Edge de l'Applcond ::NAC \n");
                               siezeeNAC[i]= EdgeNac.size();       
                                  for (int k=0;k < EdgeNac.size();k++){
	    	                                                           Element edg = (Element) EdgeNac.get(k);
	    	                                                           regle+=("\nID edge ="  + edg.getAttributeValue("ID"));
	    	                                                           regle+=("\nsource edge= :" + edg.getAttributeValue("source")+"---->Tragetedge=  :" + edg.getAttributeValue("target")+"\n");
                                        for (int j = 0;j <EdgeType.size() ;j++){
                                                                                Element edgee = (Element) EdgeType.get(j);
                                                                                if(edg.getAttributeValue("type").equalsIgnoreCase(edgee.getAttributeValue("ID")))
                                                                                 {
                                                                                 regle+=("\nTYPe Edge :" + edgee.getAttributeValue("name"));
	                                                                         ind=edgee.getAttributeValue("name").indexOf("%");
                                                                                 indf=edgee.getAttributeValue("name").indexOf("java");
                                                                                 edgeforme=n.getformeedge(edgee.getAttributeValue("name").substring(ind+1,indf));
                                 
                                            for(int u = 0; u < NodeNac.size();u++){
                                                        Element g=(Element) NodeNac.get(u);
                                       if(edg.getAttributeValue("source").equalsIgnoreCase(g.getAttributeValue("ID"))) nns=g;
                                       if(g.getAttributeValue("ID").equalsIgnoreCase(edg.getAttributeValue("target"))) nnt=g;
                                                                                         }
                                            for (int p = 0;p <NodeType.size() ; p++){
                                                                                      Element Node = (Element) NodeType.get(p);
                                                                                      if(nns.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                                        {                    
                                                                                         ind=Node.getAttributeValue("name").indexOf("%");
                                                                                         source=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                                         }
                                                                                      if(nnt.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                                        {                    
                                                                                          ind=Node.getAttributeValue("name").indexOf("%");
                                                                                          target=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                                         }
                                                                                    }//fin definir le nom du node source et cible de chaque edge
                                                                                  edgeNAC[i][k]=n.edge(source, target,edgeforme);
                                                                                 }//fin definir le type et les node de edge 
                                                                               }//fin de definir le edge son propre nom
                                                                            }
                         
                         
                         
                                                                                         }

if(Rule.getChild("ApplCondition").cloneContent().toString().contains("[Element: <PAC/>]")){
    
List NodePac=Rule.getChild("ApplCondition").getChild("PAC").getChild("Graph").getChildren("Node");
List EdgePac=Rule.getChild("ApplCondition").getChild("PAC").getChild("Graph").getChildren("Edge");
    
    
    Pac[i]=true;
    //////////////////////////////////////::pac
    regle+=("\n\t\t on a dans l'Applcond ::::PAC");
    regle+=("\nID ApplCond ="  +Rule.getChild("ApplCondition").getChild("PAC").getChild("Graph").getAttributeValue("ID"));
    regle+=("\nle type de cette ApplCond est :" +Rule.getChild("ApplCondition").getChild("PAC").getChild("Graph").getAttributeValue("kind"));
    regle+=("\nname de cette ApplCond est  :" +Rule.getChild("ApplCondition").getChild("PAC").getChild("Graph").getAttributeValue("name"));
    regle+=("\n \t\tvoici les nodes de l'Applcond "+ "::PAC"+" de la regle "+rule.getAttributeValue("name")+"\n");                                           
    
    //////////////////////////////////////::node pac     
    
    sizenPAC[i]=NodePac.size();
                         for (int j = 0; j < NodePac.size(); j++){
	    	                                                        Element nodee = (Element) NodePac.get(j);
	    	                                                        regle+=("\nID node ="  + nodee.getAttributeValue("ID"));
                   	  	 for (h = 0;h <NodeType.size() ; h++){
                                                                       Element Node = (Element) NodeType.get(h);
                                                                       if(nodee.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                        {   
                                                                            regle+=("\nTYP node  :" + Node.getAttributeValue("name"));
                                                                            ind=Node.getAttributeValue("name").indexOf("%"); 
                                                                            NPAC[i][j]=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                         }
                                                                      } 
                                                                        }
    

                         
//////////////////////////////////////::edge pac
                         regle+=("\n voici les Edge de l'Applcond ::PAC \n");
        siezeePAC[i]= EdgePac.size();       
                                  for (int k=0;k < EdgePac.size();k++){
	    	                                                           Element edg = (Element) EdgePac.get(k);
	    	                                                           regle+=("\nID edge ="  + edg.getAttributeValue("ID"));
	    	                                                           regle+=("\nsource edge= :" + edg.getAttributeValue("source")+"---->Tragetedge=  :" + edg.getAttributeValue("target")+"\n");
                                        for (int j = 0;j <EdgeType.size() ;j++){
                                                                                Element edgee = (Element) EdgeType.get(j);
                                                                                if(edg.getAttributeValue("type").equalsIgnoreCase(edgee.getAttributeValue("ID")))
                                                                                 {
                                                                                 regle+=("\nTYPe Edge :" + edgee.getAttributeValue("name"));
	                                                                         ind=edgee.getAttributeValue("name").indexOf("%");
                                                                                 indf=edgee.getAttributeValue("name").indexOf("java");
                                                                                 edgeforme=n.getformeedge(edgee.getAttributeValue("name").substring(ind+1,indf));
                                 
                                            for(int u = 0; u < NodePac.size();u++){
                                                        Element g=(Element) NodePac.get(u);
                                       if(edg.getAttributeValue("source").equalsIgnoreCase(g.getAttributeValue("ID"))) nns=g;
                                       if(g.getAttributeValue("ID").equalsIgnoreCase(edg.getAttributeValue("target"))) nnt=g;
                                                                                         }
                                            for (int p = 0;p <NodeType.size() ; p++){
                                                                                      Element Node = (Element) NodeType.get(p);
                                                                                      if(nns.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                                        {                    
                                                                                         ind=Node.getAttributeValue("name").indexOf("%");
                                                                                         source=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                                         }
                                                                                      if(nnt.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                                        {                    
                                                                                          ind=Node.getAttributeValue("name").indexOf("%");
                                                                                          target=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                                         }
                                                                                    }//fin definir le nom du node source et cible de chaque edge
                                                                                  edgePAC[i][k]=n.edge(source, target,edgeforme);
                                                                                 }//fin definir le type et les node de edge 
                                                                               }//fin de definir le edge son propre nom
                                                                            }
                         
                         




                                                                                          }



if(Rule.getChild("ApplCondition").cloneContent().toString().contains("[Element: <NestedAC/>]")){
  
List NodeGac=Rule.getChild("ApplCondition").getChild("NestedAC").getChild("Graph").getChildren("Node");
List EdgeGac=Rule.getChild("ApplCondition").getChild("NestedAC").getChild("Graph").getChildren("Edge");            
    
    
    Gac[i]=true;         
    ////////////////////////////////////////////////////// Gac
regle+=("\n\t\t on a dans l'Applcond ::::NAC");    
    regle+=("\nID ApplCond ="  +Rule.getChild("ApplCondition").getChild("NestedAC").getChild("Graph").getAttributeValue("ID"));
    regle+=("\nle type de cette ApplCond est :: GAC\n");
    regle+=("\nname de cette ApplCond est  :" +Rule.getChild("ApplCondition").getChild("NestedAC").getChild("Graph").getAttributeValue("name"));
    regle+=("\n \t\tvoici les nodes de l'Applcond "+ "::GAC"+" de la regle "+rule.getAttributeValue("name")+"\n");
    
    //////////////////////////////////////////////////////Node Gac
    
    sizenGAC[i]=NodeGac.size();
                         for (int j = 0; j < NodeGac.size(); j++){
	    	                                                        Element nod = (Element) NodeGac.get(j);
	    	                                                        regle+=("\nID node ="  + nod.getAttributeValue("ID"));
                   	  	 for (h = 0;h <NodeType.size() ; h++){
                                                                       Element Node = (Element) NodeType.get(h);
                                                                       if(nod.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                        {   
                                                                            regle+=("\nTYP node  :" + Node.getAttributeValue("name"));
                                                                            ind=Node.getAttributeValue("name").indexOf("%"); 
                                                                            NGAC[i][j]=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                         }
                                                                      } 
                                                                        }
    
                         
//////////////////////////////////////////////////////edge Gac
                         
                         regle+=("\n voici les Edge de l'Applcond ::GAC \n");
        siezeeGAC[i]= EdgeGac.size();       
                                  for (int k=0;k < EdgeGac.size();k++){
	    	                                                           Element edg = (Element) EdgeGac.get(k);
	    	                                                           regle+=("\nID edge ="  + edg.getAttributeValue("ID"));
	    	                                                           regle+=("\nsource edge= :" + edg.getAttributeValue("source")+"---->Tragetedge=  :" + edg.getAttributeValue("target")+"\n");
                                        for (int j = 0;j <EdgeType.size() ;j++){
                                                                                Element edgee = (Element) EdgeType.get(j);
                                                                                if(edg.getAttributeValue("type").equalsIgnoreCase(edgee.getAttributeValue("ID")))
                                                                                 {
                                                                                 regle+=("\nTYPe Edge :" + edgee.getAttributeValue("name"));
	                                                                         ind=edgee.getAttributeValue("name").indexOf("%");
                                                                                 indf=edgee.getAttributeValue("name").indexOf("java");
                                                                                 edgeforme=n.getformeedge(edgee.getAttributeValue("name").substring(ind+1,indf));
                                 
                                            for(int u = 0; u < NodeGac.size();u++){
                                                        Element g=(Element) NodeGac.get(u);
                                       if(edg.getAttributeValue("source").equalsIgnoreCase(g.getAttributeValue("ID"))) nns=g;
                                       if(g.getAttributeValue("ID").equalsIgnoreCase(edg.getAttributeValue("target"))) nnt=g;
                                                                                         }
                                            for (int p = 0;p <NodeType.size() ; p++){
                                                                                      Element Node = (Element) NodeType.get(p);
                                                                                      if(nns.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                                        {                    
                                                                                         ind=Node.getAttributeValue("name").indexOf("%");
                                                                                         source=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                                         }
                                                                                      if(nnt.getAttributeValue("type").equalsIgnoreCase(Node.getAttributeValue("ID")))
                                                                                        {                    
                                                                                          ind=Node.getAttributeValue("name").indexOf("%");
                                                                                          target=n.getnamenode(Node.getAttributeValue("name").substring(0,ind));
                                                                                         }
                                                                                    }//fin definir le nom du node source et cible de chaque edge
                                                                                  edgeGAC[i][k]=n.edge(source, target,edgeforme);
                                                                                 }//fin definir le type et les node de edge 
                                                                                }//fin de definir le edge son propre nom
                                                                       }
                                                                                               }

                                                }
//fin definir tous les rules
        }
  
                     system+=typegraphe+graphe+regle;
                     return system;
}

public String getgraphe(int g){
    if(g==0)
    return (typegraphe+graphe);
    else return null;
}

public String getrule(int kk){
    if(kk==0)
return (typegraphe+regle);
    else return null;
}


                                       }