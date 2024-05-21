/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author matte
 */
public class DnDSimulazioneDadi 
{
    public static void main(String[] args) 
    {
        System.out.printf("Lancia 2 dadi da 20 faccie così capiamo quanti danni farai\n");
        int dado1, dado2, danno;
        Random random = new Random();
        dado1 = 1;
        dado2 = 1;
        danno = CriticoMetodi.damage(dado1, dado2);
        System.out.printf("Hai inflitto: %d", danno);
    }
}
