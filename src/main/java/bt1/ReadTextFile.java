/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xuant
 */
public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "sanpham.txt";
        List<String> products = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                products.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Xuất danh sách sản phẩm ra màn hình
        System.out.println("Danh sách sản phẩm:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}
