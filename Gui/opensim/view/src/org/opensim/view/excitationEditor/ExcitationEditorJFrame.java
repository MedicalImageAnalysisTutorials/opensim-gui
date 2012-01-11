/*
 * Copyright (c)  2005-2008, Stanford University
 * Use of the OpenSim software in source form is permitted provided that the following
 * conditions are met:
 * 	1. The software is used only for non-commercial research and education. It may not
 *     be used in relation to any commercial activity.
 * 	2. The software is not distributed or redistributed.  Software distribution is allowed 
 *     only through https://simtk.org/home/opensim.
 * 	3. Use of the OpenSim software or derivatives must be acknowledged in all publications,
 *      presentations, or documents describing work in which OpenSim or derivatives are used.
 * 	4. Credits to developers may not be removed from executables
 *     created from modifications of the source.
 * 	5. Modifications of source code must retain the above copyright notice, this list of
 *     conditions and the following disclaimer. 
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 *  SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 *  TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 *  HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 *  OR BUSINESS INTERRUPTION) OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 *  WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
/*
 * ExcitationEditorJFrame.java
 *
 * Created on January 29, 2008, 4:49 PM
 */

package org.opensim.view.excitationEditor;
import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.opensim.modeling.Actuator;
import org.opensim.modeling.ControlLinear;
import org.opensim.modeling.ControlSet;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.SetActuators;
import org.opensim.utils.FileUtils;
import org.opensim.utils.TheApp;
import org.opensim.view.pub.OpenSimDB;

/**
 *
 * @author  Ayman
 */
public class ExcitationEditorJFrame extends javax.swing.JFrame {
    ExcitationEditorJPanel dPanel;
    ArrayList<ControlLinear> controlsRefs = new ArrayList<ControlLinear>(2);    // This's a hack to prevent early garbage collection
    String helpText = "<html>\nAnchor with left mouse button and drag to lower right to <b>Zoom In</b> on a rectangle.<br>\nAnchor  with left mouse button and drag to the left to <b>Zoom Out/Refit</b> the data.<br>\nUse <b>I</b> to zoom in about the center of the pane.l<br>\nUse <b>O</b> to zoom out about the center of the panel.l<br>\nUse <b>L</b> to move the panel Left<br>\nUse <b>R</b> to move the panel Right<br>\nUse <b>U</b> to move the panel Up<br>\nUse <b>D</b> to move the panel Down<br>\n<b>Selection:</b><br>\nHolding <b>CTRL</b> button down turns on selection mode.<br>\n  - Left mouse button selects individual points.<br>\n  - Shift + left mouse button accumulates selection.<br>\n  - Draw box to select all points within the box.<br>\n  - Left mouse button in background deselects all points.<br>\n<b>Adding Points:</b><br>\nRight mouse click inside a panel and use popup menu to add points.<br>\n</html>";

    /*********Added by jingjing***********/
    HelpSet hs = null;
    HelpBroker hb = null;
    /*****************end*****************/

    /** Creates new form ExcitationEditorJFrame */
    public ExcitationEditorJFrame() {
        prepareHelpset();
        initComponents();
        hb.enableHelpOnButton(helpButton, "org.opensim.view.excitationEditor.help", hs);

        //getContentPane().setLayout(new BorderLayout());
        dPanel=new ExcitationEditorJPanel(this, null);
        getContentPane().add(dPanel, BorderLayout.CENTER);
        setIconImage(TheApp.getAppImage());
        setTitle("Excitation Editor");
        pack();
    }
    /**
     * Constructor that takes a control set
     */
    public ExcitationEditorJFrame(ControlSet controls) {
        // implicit call to the noarg constructor
        initComponents();
        //getContentPane().setLayout(new BorderLayout());
        dPanel=new ExcitationEditorJPanel(this, null);
        getContentPane().add(dPanel, BorderLayout.CENTER);
        setIconImage(TheApp.getAppImage());
        if (controls.getDocumentFileName().equalsIgnoreCase(""))
            SaveButton.setEnabled(false);
        setTitle("Excitation Editor: Editing file "+new File(controls.getDocumentFileName()).getName());
        pack();
        dPanel.populate(controls, false);
    }

    /**
     * Create Helset and HelpBroker for the help Button
     */
    public void prepareHelpset() {
        String helpsetfile = "ExcitationEditor.hs";
        ClassLoader cl = this.getClass().getClassLoader();
        try {
            URL hsURL = HelpSet.findHelpSet(cl, helpsetfile);
            hs = new HelpSet(null, hsURL);
        } catch(Exception ee) {
            System.out.println("HelpSet: "+ee.getMessage());
            System.out.println("HelpSet: "+ helpsetfile + " not found");
        }

        hb = hs.createHelpBroker();
    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jFileMenu = new javax.swing.JMenu();
        jLoadMenuItem = new javax.swing.JMenuItem();
        jSaveMenuItem = new javax.swing.JMenuItem();
        jSaveAsMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jCreateDefaultMenuItem = new javax.swing.JMenuItem();
        jToolsMenu = new javax.swing.JMenu();
        jSaveTemplateMenuItem = new javax.swing.JMenuItem();
        jLoadTemplateMenuItem = new javax.swing.JMenuItem();
        jControlPanel = new javax.swing.JPanel();
        LoadButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        CreateNewButton = new javax.swing.JButton();
        SaveLayoutButton = new javax.swing.JButton();
        LoadLayoutButton = new javax.swing.JButton();
        SaveAsButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();

        jFileMenu.setText("File");
        jFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileMenuActionPerformed(evt);
            }
        });

        jLoadMenuItem.setText("Load...");
        jLoadMenuItem.setToolTipText("Load Excitations from an XML file");
        jLoadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoadMenuItemActionPerformed(evt);
            }
        });
        jFileMenu.add(jLoadMenuItem);

        jSaveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jSaveMenuItem.setText("Save...");
        jSaveMenuItem.setToolTipText("Store excitations into an XML file");
        jSaveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveMenuItemActionPerformed(evt);
            }
        });
        jFileMenu.add(jSaveMenuItem);

        jSaveAsMenuItem.setText("Save A Copy...");
        jSaveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveAsMenuItemActionPerformed(evt);
            }
        });
        jFileMenu.add(jSaveAsMenuItem);
        jFileMenu.add(jSeparator1);

        jCreateDefaultMenuItem.setText("New (current model)");
        jCreateDefaultMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateDefaultMenuItemActionPerformed(evt);
            }
        });
        jFileMenu.add(jCreateDefaultMenuItem);

        jMenuBar1.add(jFileMenu);

        jToolsMenu.setText("Tools");

        jSaveTemplateMenuItem.setText("Save Layout...");
        jSaveTemplateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveTemplateMenuItemActionPerformed(evt);
            }
        });
        jToolsMenu.add(jSaveTemplateMenuItem);

        jLoadTemplateMenuItem.setText("Load Layout...");
        jLoadTemplateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoadTemplateMenuItemActionPerformed(evt);
            }
        });
        jToolsMenu.add(jLoadTemplateMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LoadButton.setText("Load...");
        LoadButton.setToolTipText("Load excitations from an xml file");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.setToolTipText("Save excitations to the file they came from");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        CreateNewButton.setText("New...");
        CreateNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewButtonActionPerformed(evt);
            }
        });

        SaveLayoutButton.setText("Save Layout...");
        SaveLayoutButton.setToolTipText("Save current dialog layout to a file");
        SaveLayoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveLayoutButtonActionPerformed(evt);
            }
        });

        LoadLayoutButton.setText("Load Layout...");
        LoadLayoutButton.setToolTipText("apply layout from a saved layout file");
        LoadLayoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadLayoutButtonActionPerformed(evt);
            }
        });

        SaveAsButton.setText("Save As");
        SaveAsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsButtonActionPerformed(evt);
            }
        });

        helpButton.setText("Help");
        helpButton.setToolTipText("");

        org.jdesktop.layout.GroupLayout jControlPanelLayout = new org.jdesktop.layout.GroupLayout(jControlPanel);
        jControlPanel.setLayout(jControlPanelLayout);
        jControlPanelLayout.setHorizontalGroup(
            jControlPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jControlPanelLayout.createSequentialGroup()
                .add(LoadButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(SaveButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(SaveAsButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(CreateNewButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(SaveLayoutButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LoadLayoutButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(helpButton)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jControlPanelLayout.setVerticalGroup(
            jControlPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jControlPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(LoadButton)
                .add(SaveButton)
                .add(CreateNewButton)
                .add(SaveLayoutButton)
                .add(LoadLayoutButton)
                .add(SaveAsButton)
                .add(helpButton))
        );

        getContentPane().add(jControlPanel, java.awt.BorderLayout.NORTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-574)/2, (screenSize.height-300)/2, 574, 300);
    }// </editor-fold>//GEN-END:initComponents


    private void jLoadTemplateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoadTemplateMenuItemActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jLoadTemplateMenuItemActionPerformed

    private void jFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileMenuActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jFileMenuActionPerformed

    private void SaveAsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsButtonActionPerformed
// TODO add your handling code here:
         jSaveAsMenuItemActionPerformed(null);
    }//GEN-LAST:event_SaveAsButtonActionPerformed

    private void LoadLayoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadLayoutButtonActionPerformed
// TODO add your handling code here:
      String fileName = FileUtils.getInstance().browseForFilename(FileUtils.getFileFilter(".txt", "Load template file"), this);
      if (fileName==null) return;
      dPanel.applyLayoutFromFile(fileName);
    }//GEN-LAST:event_LoadLayoutButtonActionPerformed

    private void SaveLayoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveLayoutButtonActionPerformed
// TODO add your handling code here:
        jSaveTemplateMenuItemActionPerformed(null);
    }//GEN-LAST:event_SaveLayoutButtonActionPerformed

    private void CreateNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewButtonActionPerformed
// TODO add your handling code here:
        jCreateDefaultMenuItemActionPerformed(null);
    }//GEN-LAST:event_CreateNewButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
// TODO add your handling code here:
        jSaveMenuItemActionPerformed(null);
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
// TODO add your handling code here:
        jLoadMenuItemActionPerformed(null);
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void jSaveTemplateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveTemplateMenuItemActionPerformed
        String fileName = FileUtils.getInstance().browseForFilenameToSave(
                FileUtils.getFileFilter(".txt", "Save layout to file"), true, "excitation_layout.txt", this);
        if(fileName!=null) {
            try {
                OutputStream ostream = new FileOutputStream(fileName);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(ostream));
                ExcitationsGridJPanel gridPanel = dPanel.getExcitationGridPanel();
                writer.write(gridPanel.getNumColumns()+"\n");
                for(int i=0; i<gridPanel.getNumColumns(); i++) 
                    gridPanel.getColumn(i).write(writer);
                writer.flush();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

 
// TODO add your handling code here:
    }//GEN-LAST:event_jSaveTemplateMenuItemActionPerformed

    private void jSaveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveAsMenuItemActionPerformed
        String fileName = FileUtils.getInstance().browseForFilenameToSave(
                FileUtils.getFileFilter(".xml", "Save excitations to file"), true, "controls.xml", this);
         if(fileName!=null) {
            dPanel.getControlSet().print(fileName);  // We should also switch current set to use the saveAs file
            String temp=dPanel.getControlSet().getDocumentFileName();
            int x=0;
         }
// TODO add your handling code here:
    }//GEN-LAST:event_jSaveAsMenuItemActionPerformed

    private void jCreateDefaultMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateDefaultMenuItemActionPerformed
// TODO add your handling code here:
        Model currentModel = OpenSimDB.getInstance().getCurrentModel();
        if (currentModel==null){
            DialogDisplayer.getDefault().notify(
               new NotifyDescriptor.Message("You need a current model to use this functionality."));
            return;
        }
        // Create a blank control set
        ControlSet controlSet = new ControlSet();
        
        // Cycle thru Actuators and create a Control for it with default min=0, max=1, val=0
        SetActuators acts = currentModel.getForceSet().getActuators();
	controlSet.setName(currentModel.getName()+"_Default");

	for(int i=0;i<acts.getSize();i++) {
                Actuator act = acts.get(i);
                int numControls = act.numControls();
                for (int nc=0;nc<numControls;nc++){
                    ControlLinear control = new ControlLinear();
                    control.setControlValue(0.0, 0.1);
                    control.setControlValue(1.0, 0.1);
                    control.setControlValueMin(0.0, 0.0);
                    control.setControlValueMin(1.0, 0.0);
                    control.setControlValueMax(0.0, 1.0);
                    control.setControlValueMax(1.0, 1.0);
                    if (nc==0)
                        control.setName(act.getName());
                    else
                        control.setName(act.getName()+String.valueOf(nc));
                    controlSet.append(control);
                    controlsRefs.add(control);
                }
	}
        
        String fileName = FileUtils.getInstance().browseForFilenameToSave( 
                FileUtils.getFileFilter(".xml", "Save excitations to file"), true, "controls.xml", this); 
         if(fileName!=null) { 
            controlSet.print(fileName); 
            dPanel.populate(controlSet, true);
         }
    }//GEN-LAST:event_jCreateDefaultMenuItemActionPerformed

    private void jSaveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveMenuItemActionPerformed
// TODO add your handling code here:
        ControlSet obj = dPanel.getControlSet();
        if (obj!=null)
            obj.print(obj.getDocumentFileName());
    }//GEN-LAST:event_jSaveMenuItemActionPerformed

    private void jLoadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoadMenuItemActionPerformed
// TODO add your handling code here:
        //Browse for existing xml file
        if (dPanel.getControlSet()!=null){
            Object answer = DialogDisplayer.getDefault().notify(
                    new NotifyDescriptor.Confirmation("Loading a new file will erase the current content of the excitation editor. Do you want to proceed?",NotifyDescriptor.YES_NO_OPTION));
            if (answer==NotifyDescriptor.NO_OPTION) return;
            dPanel.clear();
        }
         String fileName = FileUtils.getInstance().browseForFilename(".xml", "Controls XML file", this);
         if(fileName!=null) {
         OpenSimObject objGeneric = OpenSimObject.makeObjectFromFile(fileName);
         if (objGeneric==null || !objGeneric.getType().equalsIgnoreCase("ControlSet")){
            DialogDisplayer.getDefault().notify(
               new NotifyDescriptor.Message("Could not construct excitations from the specified file.")); 
            return;
         }
         ControlSet obj = new ControlSet(fileName);
         if (obj != null){
             dPanel.populate(obj, true);
             setTitle("Excitation Editor: Editing file "+new File(fileName).getName());
          } else {
            DialogDisplayer.getDefault().notify(
               new NotifyDescriptor.Message("Could not construct excitations from the specified file."));
         }
      }
   
    }//GEN-LAST:event_jLoadMenuItemActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcitationEditorJFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateNewButton;
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton LoadLayoutButton;
    private javax.swing.JButton SaveAsButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SaveLayoutButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JPanel jControlPanel;
    private javax.swing.JMenuItem jCreateDefaultMenuItem;
    private javax.swing.JMenu jFileMenu;
    private javax.swing.JMenuItem jLoadMenuItem;
    private javax.swing.JMenuItem jLoadTemplateMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jSaveAsMenuItem;
    private javax.swing.JMenuItem jSaveMenuItem;
    private javax.swing.JMenuItem jSaveTemplateMenuItem;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu jToolsMenu;
    // End of variables declaration//GEN-END:variables
    
}