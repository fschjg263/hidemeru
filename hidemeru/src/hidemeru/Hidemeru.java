/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hidemeru;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

/**
 *
 * @author am
 */
public class Hidemeru {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> vpnlist = null;
        String[] tmpList;
        if (args.length < 1) {
            System.out.println("Eine Datei angeben!");
            System.exit(1);
        }
        File dir = new File(args[0]);
        if (!dir.exists()) {
            System.out.println(dir.getName()+" existiert nicht!");
        } else if (!dir.isDirectory()) {
            System.out.println(dir.getName() + " ist kein Ordner!");
            System.exit(1);
        }
        tmpList = dir.list();
        for (int i=0; i < tmpList.length; i++){
            if(tmpList[i].endsWith(".ovpn")){
                vpnlist.add(tmpList[i]);
            }
        }
        System.out.println("This files were found: "+vpnlist.toString());        

    }

}
