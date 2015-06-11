/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatsym;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mateusz
 */
public class Chatsym {
    public static String readFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        String words;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            while ((words = br.readLine()) != null) {
                sb.append(words);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
