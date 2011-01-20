import java.awt.*;
import java.awt.event.*;

/**
 * 
 * 
 * @author 
 * @version 
 */
public class JavaTest extends Frame

{
   MenuItem menuItemAbout = new MenuItem();
   Menu menuHelp = new Menu();
   MenuItem menuItemPaste = new MenuItem();
   MenuItem menuItemCopy = new MenuItem();
   MenuItem menuItemCut = new MenuItem();
   Menu menuEdit = new Menu();
   MenuItem menuItemExit = new MenuItem();
   MenuItem menuItemSaveAs = new MenuItem();
   MenuItem menuItemSave = new MenuItem();
   MenuItem menuItemOpen = new MenuItem();
   MenuItem menuItemNew = new MenuItem();
   Menu menuFile = new Menu();
   MenuBar menuBar1 = new MenuBar();
   /**
    * constructor
    */
   public JavaTest(java.awt.GraphicsConfiguration a0) {
      super(a0);
      try {
         initComponents();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   /**
    * constructor
    */
   public JavaTest(java.lang.String a0)
      throws HeadlessException {
      super(a0);
      try {
         initComponents();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   /**
    * constructor
    */
   public JavaTest(java.lang.String a0, java.awt.GraphicsConfiguration a1) {
      super(a0, a1);
      try {
         initComponents();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   /**
    * constructor
    */
   public JavaTest()
      throws HeadlessException {
      super();
      try {
         initComponents();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   private void initComponents() {
      this.setBounds(0, 0, 784, 614);
      this.setSize(784, 614);
      this.setMenuBar(menuBar1);
      this.addWindowListener(new JavaTest_WindowAdapter(this));
      menuFile.setLabel("File");
      menuBar1.add(menuFile);
      menuEdit.setLabel("Edit");
      menuBar1.add(menuEdit);
      menuHelp.setLabel("Help");
      menuBar1.add(menuHelp);
      menuItemNew.setLabel("New");
      menuItemNew.setShortcut(new MenuShortcut(KeyEvent.VK_N, false));
      menuFile.add(menuItemNew);
      menuItemOpen.setLabel("Open...");
      menuItemOpen.setShortcut(new MenuShortcut(KeyEvent.VK_O, false));
      menuItemOpen.addActionListener(new JavaTest_menuItemOpen_ActionAdapter(this));
      menuFile.add(menuItemOpen);
      menuItemSave.setLabel("Save");
      menuItemSave.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
      menuFile.add(menuItemSave);
      menuItemSaveAs.setLabel("Save As...");
      menuFile.add(menuItemSaveAs);
      menuFile.addSeparator();
      menuItemExit.setLabel("Exit");
      menuItemExit.addActionListener(new JavaTest_menuItemExit_ActionAdapter(this));
      menuFile.add(menuItemExit);
      menuItemCut.setLabel("Cut");
      menuItemCut.setShortcut(new MenuShortcut(KeyEvent.VK_X, false));
      menuEdit.add(menuItemCut);
      menuItemCopy.setLabel("Copy");
      menuItemCopy.setShortcut(new MenuShortcut(KeyEvent.VK_C, false));
      menuEdit.add(menuItemCopy);
      menuItemPaste.setLabel("Paste");
      menuItemPaste.setShortcut(new MenuShortcut(KeyEvent.VK_V, false));
      menuEdit.add(menuItemPaste);
      menuItemAbout.setLabel("About...");
      menuItemAbout.addActionListener(new JavaTest_menuItemAbout_ActionAdapter(this));
      menuHelp.add(menuItemAbout);
   }


   /**
    * Main method
    */
   public static void main(String args[]) {
      JavaTest c = new JavaTest();
      c.setVisible(true);
   }

   /**
    * Events:  action
    * Method:  actionPerformed
    */
   void menuItemExit_actionPerformed(java.awt.event.ActionEvent e0) {
      // add code here
      ExitDialog dialog=new ExitDialog(this);
      dialog.setVisible(true);
      
   }

   /**
    * Events:  window
    * Method:  windowClosing
    */
   void JavaTest_windowClosing(java.awt.event.WindowEvent e0) {
      // add code here
      menuItemExit_actionPerformed(null);
      
   }

   /**
    * Events:  action
    * Method:  actionPerformed
    */
   void menuItemAbout_actionPerformed(java.awt.event.ActionEvent e0) {
      // add code here
      AboutDialog dialog=new AboutDialog(this);
      dialog.setVisible(true);
      
   }

   /**
    * Events:  action
    * Method:  actionPerformed
    */
   void menuItemOpen_actionPerformed(java.awt.event.ActionEvent e0) {
      try {
          // OpenFileDialog create and show modal
          FileDialog openFileDialog;
          openFileDialog = new FileDialog(this,"Open",FileDialog.LOAD);
          openFileDialog.setModal(true);
          openFileDialog.setVisible(true);
      } catch (Exception e) {
      }
   }

}

class JavaTest_WindowAdapter extends WindowAdapter {
   JavaTest adaptee;
   JavaTest_WindowAdapter(JavaTest adaptee) {
      this.adaptee=adaptee;
   }
   public void windowClosing(java.awt.event.WindowEvent e0) {
      adaptee.JavaTest_windowClosing(e0);
   }
}

class JavaTest_menuItemOpen_ActionAdapter implements ActionListener {
   JavaTest adaptee;
   JavaTest_menuItemOpen_ActionAdapter(JavaTest adaptee) {
      this.adaptee=adaptee;
   }
   public void actionPerformed(java.awt.event.ActionEvent e0) {
      adaptee.menuItemOpen_actionPerformed(e0);
   }
}


class JavaTest_menuItemExit_ActionAdapter implements ActionListener {
   JavaTest adaptee;
   JavaTest_menuItemExit_ActionAdapter(JavaTest adaptee) {
      this.adaptee=adaptee;
   }
   public void actionPerformed(java.awt.event.ActionEvent e0) {
      adaptee.menuItemExit_actionPerformed(e0);
   }
}


class JavaTest_menuItemAbout_ActionAdapter implements ActionListener {
   JavaTest adaptee;
   JavaTest_menuItemAbout_ActionAdapter(JavaTest adaptee) {
      this.adaptee=adaptee;
   }
   public void actionPerformed(java.awt.event.ActionEvent e0) {
      adaptee.menuItemAbout_actionPerformed(e0);
   }
}
