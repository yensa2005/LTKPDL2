/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong05.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;

/**
 *
 * @author ttysa
 */
public class FADO {

    public FADO() {
    }
    
    //Thao tac 1: Liet ke cac thu muc
    public File[] getDirectoryContent(String folder){
        File directory = new File(folder);
        if(directory.isFile())
            return null;
        File[] results = directory.listFiles();
        return results;
    }
    
    //Thao tac 2: Xuat ket qua
    public String displayContent(File[] content){
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < content.length; i++){
           sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
           sb.append("\n");
       }
       return sb.toString();
    }
    
    //Thao tac 3: Loc ra cac thu muc
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++){
            if(content[i].isDirectory()){
              result.add(content[i]);  
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    //Thao tac 4: Loc ra ket qua tat ca cac tap tin
    public File[] getFiles(File[] content) {
       ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++){
            if(content[i].isFile()){
              result.add(content[i]);  
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    } 
    //Thao tac 5: duyet de qui
    public void getContentRecursively(String folder){
        File content = new File(folder);
        //Dieu kien dung
        if(content.isFile()){
            System.out.println(content.getPath() + File.separator + content.getName());
            return;
        }
        //Cau goi de qui trong stack
        System.out.println("Thu muc: " + folder);
        File[] sub = content.listFiles();
        for(int i = 0; i < sub.length; i++){
            getContentRecursively(folder + File.separator + sub[i].getName());
        }
    }
    //Thao tac 6: doc file van ban
    public String readTextFile(String filename) throws FileNotFoundException{
        StringBuilder content = new StringBuilder();
        
        try {
            //mo file
            FileReader fr = new FileReader(filename);
            //dung bo dem
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            while((line = br.readLine()) != null) {
                content.append(line);
                content.append("\n");
            }
            
            //dong file
            br.close();
            fr.close();
        } catch (FileAlreadyExistsException ex) {
            return "Khong tim thay file " + filename;   
        } catch (IOException ex) {
            return "Khong the doc file " + filename;
        }
        return content.toString();
    }
    //Thao tac 7: luu tap tin
    public boolean writeTextFile(String filename, String content) throws IOException {
        boolean flag = true; //luu thanh cong
        try {
            //mo file
            FileWriter fw = new FileWriter(filename);
            //su dung buffer
            BufferedWriter bw = new BufferedWriter(fw);
            //ghi ra file
            bw.write(content);
            //dong file
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            return false;
        }
        return flag;
    }
    
}
