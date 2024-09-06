/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author xuant
 */
import java.io.*;

public class WriteTextFile {

    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("SP01", "Gao", 30000));
        ds.add(new SanPham("SP02", "Duong", 45000));
        ds.add(new SanPham("SP02", "sua", 75000));

        try {
            FileWriter fw = new FileWriter("SanPam.txt");
            for (SanPham x : ds) {
                fw.write(x.getMaso() + ";" + x.getTen() + ";" + x.getGia() + "\n");
            }
            fw.close();
            System.out.println("Da ghi xong");
        }catch (Exception ex){
            System.out.println(ex.toString());
            System.out.println("Thao tac ghi phai that bai");
        }
    }
}
