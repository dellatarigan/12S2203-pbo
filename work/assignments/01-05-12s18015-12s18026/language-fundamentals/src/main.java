/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 07-12s18026 Yohanes Silitonga
 * @author 07-12s18015 Della Tarigan
 */
public class main {
    /* program emtry point */   
    public static void main(String[] _args) {
        System.out.println("Hello, world!");
        
// declaring and manipulating primitive variablaes 
int gear = 1;
boolean result = true;
char capitalC = 'C';
byte b = 100;

System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
gear++; result = !result; capitalC += 4; 
System.out.println(gear + ", " + result + ", " + capitalC + ", " + b); 
// 26 in hexadecimal and binary
int hexVal = 0x1a;
int binVal = 0b11010; 
System.out.println(hexVal + ", " + binVal);

// intantiating and manipulating objects
String name = "Wiro Sableng";
Short gearObject = 1;
Boolean resultObj = true;  
System.out.println(name + ", " + gearObject + ", " + resultObj); 
name = name.toUpperCase();
gearObject++;
resultObj = (result == false) || !resultObj; 
System.out.println(name + ", " + gearObject + ", " + resultObj);

// array, collections, and loop
int[][] numbers = new int[10][10]; 
for (int i = 0; i < numbers.length; ++i) {
    for (int j = 0; j < numbers[i].length; ++j) {
        numbers[i][j] = i + j;   }
} 
 
for (int i = 0; i < numbers.length; ++i) {
    for (int j = 0; j < numbers[i].length; ++j) {
        System.out.print(numbers[i][j] + " ");
    }
    System.out.println();
        } 

    //Challange
    ArrayList<Integer> nomor = new ArrayList<Integer>();
    
    for (int w = 0; w < 19; ++w){
        nomor.add(w);
    }
    
    for (int j = 0; j < nomor.size();j++){
        System.out.println(nomor.get(j) + " " + nomor.get(j+1) + " "  + nomor.get(j+2) + " "  + nomor.get(j+3) + " "  + nomor.get(j+4) + " "  + nomor.get(j+5) + " "  + nomor.get(j+6) + " "  + nomor.get(j+7) + " "  + nomor.get(j+8) + " "  + nomor.get(j+9));
        }
    } 
}
