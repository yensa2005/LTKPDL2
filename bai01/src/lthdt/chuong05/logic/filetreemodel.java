/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong05.logic;

import java.io.File;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author ttysa
 */
public class filetreemodel implements TreeModel{
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;
    
    public filetreemodel(String rootDir){
        //khoi tao nut goc
        rootNode = new DefaultMutableTreeNode(new File(rootDir));
        
        //khoi tao cay
        buildDDirectoryTree(rootNode,rootDir);
        tree = new DefaultTreeModel(rootNode); 
    }
    // tao cay thu muc
    public void buildDDirectoryTree(DefaultMutableTreeNode node, String rootDir){
            File curDir = new File(rootDir);
//            DefaultMutableTreeNode root = new DefaultMutableTreeNode(curDir);
            if(!curDir.isDirectory()){
                return;
            }
            File[] list = curDir.listFiles();
            for(int i = 0; i < list.length; i++) {
                DefaultMutableTreeNode child = new DefaultMutableTreeNode(list[i]);
                node.add(child);
                buildDDirectoryTree(child, rootDir + File.separator + list[i].getName());
            }
    }

    @Override
    public Object getRoot() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.rootNode;
    }

    @Override
    public Object getChild(Object parent, int index) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tree.removeTreeModelListener(l);
    }
    
}
