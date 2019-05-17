package pfe;

import java.io.BufferedWriter;
import org.jdom2.Document;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.omg.CORBA.NameValuePair;
import java.util.List;
import javax.swing.JFileChooser;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class Application extends javax.swing.JFrame  {
    
    private  static int fca=1,fsa=1,gc=1,gs=1,rg=1,taille=30;
    public static int esg=0,stg=0,estg=0,i=0,sng=0,sntg=0,srule=0,snrule=0,sntype=0,sizenRHS[]=new int[taille],sizenLHS[]=new int[taille]
            ,siezeeNAC[]=new int[taille],siezeePAC[]=new int[taille],siezeeGAC[]=new int[taille],siezeeRHS[]=new int[taille],siezeeLHS[]=new int[taille],strule[]=new int[taille] ,sizenPAC[]=new int[taille],sizenNAC[]=new int[taille],sizenGAC[]=new int[taille];
    public static boolean apllc=false,Nac[]=new boolean[taille],Pac[]=new boolean[taille],Gac[]=new boolean[taille] ;
    public  static String  namegraphe,aboxrule="",nametypegraphe,nodegr[]=new String[taille],
                           edge[]=new String[taille],edgeTG[]=new String[taille],
                           typerule[][]=new String[taille][taille],norul[][]=new String[taille][taille],narule[]=new String[taille],
                           nnodeTG[]=new String[taille],cnodeTG[]=new String[taille],fnodeTG[]=new String[taille],
                           nnode[]=new String[taille],cnode[]=new String[taille],fnode[]=new String[taille],
                           tnnode[]=new String[taille],tcnode[]=new String[taille],tfnode[]=new String[taille],
                           edgeLHS[][]=new String[taille][taille],edgeRHS[][]=new String[taille][taille],
                           NLHS[][]=new String[taille][taille],NRHS[][]=new String[taille][taille],
                           edgeNAC[][]=new String[taille][taille],edgePAC[][]=new String[taille][taille],edgeGAC[][]=new String[taille][taille],
                           NNAC[][]=new String[taille][taille],NPAC[][]=new String[taille][taille],NGAC[][]=new String[taille][taille]
            ;
    
    public  JFileChooser ch=new JFileChooser(); File f,fc;
    
    public Application() {
      
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lesregles = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        ruledl = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        ruleparser = new javax.swing.JTextArea();
        Graph = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        graphcibleld = new javax.swing.JTextArea();
        graphciblexml = new javax.swing.JScrollPane();
        graphecibleparser = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        graphsourceld = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        graphesourceparser = new javax.swing.JTextArea();
        xml_dl_source = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        fichier_dl_source = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        fichier_xml_source = new javax.swing.JTextArea();
        xml_dl_cible = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        fichier_dl_cible = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        fichier_xml_cible = new javax.swing.JTextArea();
        dl = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        graphecibledl = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        Rulesdl = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        graphesourcedl = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ss = new javax.swing.JTextField();
        parsersource = new javax.swing.JButton();
        rule_xml_dl = new javax.swing.JButton();
        graph_xml_dl = new javax.swing.JButton();
        save = new javax.swing.JButton();
        DL = new javax.swing.JButton();
        XML_DL_cible = new javax.swing.JButton();
        XML_DL_source = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        fichierxmlsource = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        fichierxmlcible = new javax.swing.JTextPane();
        parsercible = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        fichiersourceanalyser = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        fichiercibleanalyser = new javax.swing.JTextArea();

        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanel2.setLayout(null);

        jLabel6.setText("Les Regles logique de description");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(600, 50, 290, 50);

        jLabel7.setText("Les Regles parser");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(50, 50, 290, 50);

        ruledl.setColumns(20);
        ruledl.setRows(5);
        ruledl.setPreferredSize(new java.awt.Dimension(2000, 9000));
        jScrollPane20.setViewportView(ruledl);

        jPanel2.add(jScrollPane20);
        jScrollPane20.setBounds(590, 100, 600, 440);

        ruleparser.setColumns(20);
        ruleparser.setRows(5);
        ruleparser.setPreferredSize(new java.awt.Dimension(2000, 9000));
        jScrollPane21.setViewportView(ruleparser);

        jPanel2.add(jScrollPane21);
        jScrollPane21.setBounds(20, 100, 560, 440);

        javax.swing.GroupLayout lesreglesLayout = new javax.swing.GroupLayout(lesregles.getContentPane());
        lesregles.getContentPane().setLayout(lesreglesLayout);
        lesreglesLayout.setHorizontalGroup(
            lesreglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lesreglesLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        lesreglesLayout.setVerticalGroup(
            lesreglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lesreglesLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setLayout(null);

        jLabel2.setText("Graphe cible logique de description");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(670, 370, 460, 29);

        jLabel3.setText("Graph cible parser");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(670, 30, 310, 29);

        graphcibleld.setColumns(20);
        graphcibleld.setRows(5);
        graphcibleld.setPreferredSize(new java.awt.Dimension(2000, 9000));
        jScrollPane6.setViewportView(graphcibleld);

        jPanel3.add(jScrollPane6);
        jScrollPane6.setBounds(650, 400, 600, 260);

        graphecibleparser.setColumns(20);
        graphecibleparser.setRows(5);
        graphecibleparser.setPreferredSize(new java.awt.Dimension(2000, 9000));
        graphciblexml.setViewportView(graphecibleparser);

        jPanel3.add(graphciblexml);
        graphciblexml.setBounds(640, 60, 570, 260);

        graphsourceld.setColumns(20);
        graphsourceld.setRows(5);
        graphsourceld.setPreferredSize(new java.awt.Dimension(2000, 9000));
        jScrollPane9.setViewportView(graphsourceld);

        jPanel3.add(jScrollPane9);
        jScrollPane9.setBounds(20, 400, 570, 260);

        jLabel4.setText("Graph source parser");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(40, 30, 290, 29);

        jLabel5.setText("Graphe source logique de description");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(40, 370, 380, 29);

        graphesourceparser.setColumns(20);
        graphesourceparser.setRows(5);
        graphesourceparser.setPreferredSize(new java.awt.Dimension(2000, 9000));
        jScrollPane12.setViewportView(graphesourceparser);

        jPanel3.add(jScrollPane12);
        jScrollPane12.setBounds(20, 60, 570, 260);

        javax.swing.GroupLayout GraphLayout = new javax.swing.GroupLayout(Graph.getContentPane());
        Graph.getContentPane().setLayout(GraphLayout);
        GraphLayout.setHorizontalGroup(
            GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1364, Short.MAX_VALUE)
        );
        GraphLayout.setVerticalGroup(
            GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );

        jPanel6.setLayout(null);

        jLabel14.setText("voici le fichier source  logique de description");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(610, 40, 250, 40);

        jLabel15.setText("voici le fichier source  XML");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(110, 50, 200, 40);

        fichier_dl_source.setColumns(20);
        fichier_dl_source.setRows(5);
        fichier_dl_source.setPreferredSize(new java.awt.Dimension(2000, 9000));
        jScrollPane13.setViewportView(fichier_dl_source);

        jPanel6.add(jScrollPane13);
        jScrollPane13.setBounds(640, 90, 580, 600);

        fichier_xml_source.setColumns(20);
        fichier_xml_source.setRows(5);
        fichier_xml_source.setPreferredSize(new java.awt.Dimension(2000, 9000));
        jScrollPane15.setViewportView(fichier_xml_source);

        jPanel6.add(jScrollPane15);
        jScrollPane15.setBounds(20, 90, 590, 600);

        javax.swing.GroupLayout xml_dl_sourceLayout = new javax.swing.GroupLayout(xml_dl_source.getContentPane());
        xml_dl_source.getContentPane().setLayout(xml_dl_sourceLayout);
        xml_dl_sourceLayout.setHorizontalGroup(
            xml_dl_sourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xml_dl_sourceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        xml_dl_sourceLayout.setVerticalGroup(
            xml_dl_sourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        jPanel5.setLayout(null);

        jLabel12.setText("voici le fichier cible logique de description");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(660, 40, 250, 40);

        jLabel13.setText("voici le fichier cible  XML");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(110, 50, 200, 40);

        fichier_dl_cible.setColumns(20);
        fichier_dl_cible.setRows(5);
        fichier_dl_cible.setMinimumSize(new java.awt.Dimension(100, 1000));
        fichier_dl_cible.setPreferredSize(new java.awt.Dimension(2000, 9000));
        jScrollPane5.setViewportView(fichier_dl_cible);

        jPanel5.add(jScrollPane5);
        jScrollPane5.setBounds(650, 90, 600, 600);

        fichier_xml_cible.setColumns(20);
        fichier_xml_cible.setRows(5);
        fichier_xml_cible.setPreferredSize(new java.awt.Dimension(2000, 9000));
        jScrollPane1.setViewportView(fichier_xml_cible);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 590, 600);

        javax.swing.GroupLayout xml_dl_cibleLayout = new javax.swing.GroupLayout(xml_dl_cible.getContentPane());
        xml_dl_cible.getContentPane().setLayout(xml_dl_cibleLayout);
        xml_dl_cibleLayout.setHorizontalGroup(
            xml_dl_cibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xml_dl_cibleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        xml_dl_cibleLayout.setVerticalGroup(
            xml_dl_cibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        jPanel4.setLayout(null);

        graphecibledl.setColumns(20);
        graphecibledl.setRows(5);
        graphecibledl.setPreferredSize(new java.awt.Dimension(20000, 10000));
        jScrollPane14.setViewportView(graphecibledl);

        jPanel4.add(jScrollPane14);
        jScrollPane14.setBounds(580, 50, 540, 250);

        Rulesdl.setColumns(20);
        Rulesdl.setRows(5);
        Rulesdl.setPreferredSize(new java.awt.Dimension(20000, 10000));
        jScrollPane16.setViewportView(Rulesdl);

        jPanel4.add(jScrollPane16);
        jScrollPane16.setBounds(30, 350, 540, 240);

        graphesourcedl.setColumns(20);
        graphesourcedl.setRows(5);
        graphesourcedl.setPreferredSize(new java.awt.Dimension(20000, 10000));
        jScrollPane17.setViewportView(graphesourcedl);

        jPanel4.add(jScrollPane17);
        jScrollPane17.setBounds(30, 50, 540, 250);

        jLabel8.setText("Les  regles en logique de description");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(40, 300, 290, 50);

        jLabel9.setText("Graphe  cible  en logique de description");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(610, 0, 260, 50);

        jLabel10.setText("Graphe  source en logique de description");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(40, 0, 340, 50);

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\salahinfo\\Documents\\NetBeansProjects\\pfe\\Sans titre - 1.png")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setPreferredSize(new java.awt.Dimension(1500, 1200));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 0, 1700, 800);
        jPanel4.add(jTabbedPane5);
        jTabbedPane5.setBounds(605, 350, 410, 170);

        javax.swing.GroupLayout dlLayout = new javax.swing.GroupLayout(dl.getContentPane());
        dl.getContentPane().setLayout(dlLayout);
        dlLayout.setHorizontalGroup(
            dlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 2000, Short.MAX_VALUE)
        );
        dlLayout.setVerticalGroup(
            dlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setText("choisir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 20, 120, 30);

        ss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssActionPerformed(evt);
            }
        });
        jPanel1.add(ss);
        ss.setBounds(160, 20, 360, 40);

        parsersource.setText("parser(Analyse XML source)");
        parsersource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parsersourceActionPerformed(evt);
            }
        });
        jPanel1.add(parsersource);
        parsersource.setBounds(510, 110, 230, 50);

        rule_xml_dl.setText("Transformation Rule  (XML-->DL)");
        rule_xml_dl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rule_xml_dlActionPerformed(evt);
            }
        });
        jPanel1.add(rule_xml_dl);
        rule_xml_dl.setBounds(510, 260, 230, 50);

        graph_xml_dl.setText("Transformation graph  (XML-->DL)");
        graph_xml_dl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graph_xml_dlActionPerformed(evt);
            }
        });
        jPanel1.add(graph_xml_dl);
        graph_xml_dl.setBounds(510, 210, 230, 50);

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(510, 460, 230, 40);

        DL.setText("Fichier DL");
        DL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DLActionPerformed(evt);
            }
        });
        jPanel1.add(DL);
        DL.setBounds(510, 410, 230, 50);

        XML_DL_cible.setText("(XML-->DL) cible");
        XML_DL_cible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XML_DL_cibleActionPerformed(evt);
            }
        });
        jPanel1.add(XML_DL_cible);
        XML_DL_cible.setBounds(510, 360, 230, 50);

        XML_DL_source.setText("(XML-->DL) source");
        XML_DL_source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XML_DL_sourceActionPerformed(evt);
            }
        });
        jPanel1.add(XML_DL_source);
        XML_DL_source.setBounds(510, 310, 230, 50);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        fichierxmlsource.setPreferredSize(new java.awt.Dimension(2000, 200));
        fichierxmlsource.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(fichierxmlsource);

        jTabbedPane1.addTab("voici le fihier XML source", jScrollPane2);

        jScrollPane18.setViewportView(fichierxmlcible);

        jTabbedPane1.addTab("voici le fihier XML cible ", jScrollPane18);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(30, 90, 480, 430);

        parsercible.setText("parser(Analyse XML cible)");
        parsercible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parsercibleActionPerformed(evt);
            }
        });
        jPanel1.add(parsercible);
        parsercible.setBounds(510, 160, 230, 50);

        fichiersourceanalyser.setColumns(20);
        fichiersourceanalyser.setRows(5);
        jScrollPane19.setViewportView(fichiersourceanalyser);

        jTabbedPane4.addTab("voici le fichier analyser (source)", jScrollPane19);

        fichiercibleanalyser.setColumns(20);
        fichiercibleanalyser.setRows(5);
        jScrollPane7.setViewportView(fichiercibleanalyser);

        jTabbedPane4.addTab("voici le fichier analyser (cible)", jScrollPane7);

        jPanel1.add(jTabbedPane4);
        jTabbedPane4.setBounds(760, 80, 510, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1295, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssActionPerformed

    }//GEN-LAST:event_ssActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(i==0){
        ch.showSaveDialog(null); 
        f=ch.getSelectedFile();
        ss.setText(f.getPath());    
        rg=0;gs=0;fsa=0;
        graphesourceparser.setText("");
        ruleparser.setText("");
        graphsourceld.setText("");
        try {
                           fichierxmlsource.setPage(f.toURI().toURL());
                          } 
                  catch(Exception e) {
                                e.printStackTrace();
                                    }
        i++;
          }
        else if (i==1){
                     graphcibleld.setText("");
                     graphecibleparser.setText("");
                     gc=0;fca=0;                    
                     ch.showSaveDialog(null); 
                     fc=ch.getSelectedFile();
                     ss.setText(fc.getPath());    
                         try {
                                fichierxmlcible.setPage(fc.toURI().toURL());
                              } 
                         catch(Exception e) {
                                           e.printStackTrace();
                                           }
    i=0;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rule_xml_dlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rule_xml_dlActionPerformed
       lesregles.setSize(1400, 850);
       lesregles.show();
       
       if(rg==0){
       
         parser re=new parser();
         re.getGTS(xml(0));
         ruleparser.append(re.getrule(0));
        
         KB r=new KB();
         r.KB_TBOX();
         r.ABOX();
         ruledl.append(r.get_tbox()+"\n"+r.get_abox_r());
         rg=1;
       }     
    }//GEN-LAST:event_rule_xml_dlActionPerformed

    private void graph_xml_dlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graph_xml_dlActionPerformed
          
       Graph.setSize(1400, 850);
       Graph.show();
       parser graphe=new parser();
       KB g=new KB(),h=new KB();
  if(gs==0){
       
       graphe.getGTS(xml(0));
       graphesourceparser.append(graphe.getgraphe(0));
       
  
       
       g.KB_TBOX();
       g.ABOX();
       graphsourceld.append(g.get_tbox()+"\n"+g.get_abox_gs());
       gs=1;
  } 
  if(gc==0){
      
    graphe.getGTS(xml(1));
    graphecibleparser.append(graphe.getgraphe(0));
    h.KB_TBOX();
    h.ABOX();
    graphcibleld.append(g.get_tbox()+"\n"+h.get_abox_gc());
       gc=1;
  }
    }//GEN-LAST:event_graph_xml_dlActionPerformed
public Document xml(int i){
      SAXBuilder builder = new SAXBuilder();

Document xml =null;
           //lecture du document xml JFileChooser ch=new JFileChooser();
    
try { if(i==0)
	   xml= builder.build(new File(f.getPath())); 
else    xml= builder.build(new File(fc.getPath())); 
}
	catch  (JDOMException e) {
	 e.printStackTrace();
}

   catch   (IOException e) {  
     e.printStackTrace();
   }
return xml;
}
long debut;
    private void parsersourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parsersourceActionPerformed
debut = System.currentTimeMillis();
    parser m=new parser();
    if(fsa==0){
     fichiersourceanalyser.append(m.getGTS(xml(0)));
    fsa=1;
    }System.out.printf("ddddddddddddddddddddddddd\n"+((System.currentTimeMillis()-debut)/1000));
    }//GEN-LAST:event_parsersourceActionPerformed


    private void DLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DLActionPerformed
dl.setSize(1500,900);
dl.show();// TODO add your handling code here:
graphesourcedl.setText(graphsourceld.getText());
graphecibledl.setText(graphcibleld.getText());
Rulesdl.setText(ruledl.getText());

    }//GEN-LAST:event_DLActionPerformed

    private void XML_DL_cibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XML_DL_cibleActionPerformed
xml_dl_cible.setSize(1500,1000);
xml_dl_cible.show();        
fichier_xml_cible.setText(fichierxmlcible.getText());
fichier_dl_cible.setText(graphcibleld.getText()+aboxrule);
    }//GEN-LAST:event_XML_DL_cibleActionPerformed

    private void XML_DL_sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XML_DL_sourceActionPerformed
   xml_dl_source.setSize(1500,900);
   xml_dl_source.show();  
   
fichier_xml_source.setText(fichierxmlsource.getText());
fichier_dl_source.setText(graphsourceld.getText()+aboxrule);
    }//GEN-LAST:event_XML_DL_sourceActionPerformed

    private void parsercibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parsercibleActionPerformed
        
  
              parser m=new parser();
             if(fca==0){
              fichiercibleanalyser.append(m.getGTS(xml(1)));
              fca=1;}
    }//GEN-LAST:event_parsercibleActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    public void saveFile(String contenu, String file) {
		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file)));
 
			writer.write(contenu);
 
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

   JFileChooser chooser = new JFileChooser();
			/*chooser.setFileFilter(null --filter--);*/
 
			int returnVal = chooser.showSaveDialog(jPanel1);
 
			if(returnVal==JFileChooser.APPROVE_OPTION){
				String s = chooser.getSelectedFile().getPath();
				/*s = s.endsWith(".txt")?s:s+".txt";*/
 
				saveFile(fichiersourceanalyser.getText(), s);
			}        // TODO add your handling code here:
    
    }//GEN-LAST:event_saveActionPerformed

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DL;
    private javax.swing.JFrame Graph;
    private javax.swing.JTextArea Rulesdl;
    private javax.swing.JButton XML_DL_cible;
    private javax.swing.JButton XML_DL_source;
    private javax.swing.JFrame dl;
    private javax.swing.JTextArea fichier_dl_cible;
    private javax.swing.JTextArea fichier_dl_source;
    private javax.swing.JTextArea fichier_xml_cible;
    private javax.swing.JTextArea fichier_xml_source;
    private javax.swing.JTextArea fichiercibleanalyser;
    private javax.swing.JTextArea fichiersourceanalyser;
    private javax.swing.JTextPane fichierxmlcible;
    private javax.swing.JTextPane fichierxmlsource;
    private javax.swing.JButton graph_xml_dl;
    private javax.swing.JTextArea graphcibleld;
    private javax.swing.JScrollPane graphciblexml;
    private javax.swing.JTextArea graphecibledl;
    private javax.swing.JTextArea graphecibleparser;
    private javax.swing.JTextArea graphesourcedl;
    private javax.swing.JTextArea graphesourceparser;
    private javax.swing.JTextArea graphsourceld;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JFrame lesregles;
    private javax.swing.JButton parsercible;
    private javax.swing.JButton parsersource;
    private javax.swing.JButton rule_xml_dl;
    private javax.swing.JTextArea ruledl;
    private javax.swing.JTextArea ruleparser;
    private javax.swing.JButton save;
    private javax.swing.JTextField ss;
    private javax.swing.JFrame xml_dl_cible;
    private javax.swing.JFrame xml_dl_source;
    // End of variables declaration//GEN-END:variables
}
