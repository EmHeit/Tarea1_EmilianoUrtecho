/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1_emilianourtecho;


import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Tarea1_EmilianoUrtecho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner escan = new Scanner (System.in);
        
        System.out.println("        ~Menu~");
        System.out.println("    1. Cuantos numeros pares e impares hay entre este rango?");
        System.out.println("    2. Triangulos y mas Triangulos.");
        System.out.println("    3. Anita lava la tina");
        System.out.println("    4. Codigos secretos.");
        System.out.println("    5. Salir");
        System.out.print("Que desea ver?: ");
        int eleccion = escan.nextInt();
        
        do {
            switch (eleccion){
                case 1:
                    // cuantos numeros pares e impares hay entre este rango?
                    
                    int par, impar, n;
                    System.out.print("Escriba un numero: ");
                    n = escan.nextInt();
                    int mn = 0;
                    boolean ciclo = true;
                    while(ciclo = true){
                            System.out.print("Entre 0 y "+n+" existen ");
                            int contP = 0;
                            for (int i = 0; i <= n; i+=2) {
                                contP++;
                            }
                            System.out.print(+contP+" numeros pares y estos son:");
                            for (int i = 0; i <= 10; i+=2) {
                                System.out.print(" "+mn);
                                mn = mn + 2;
                            }
                            System.out.println("");
                            System.out.print("Entre 0 y "+n+" existen ");
                            int contIMP = 0;
                            mn = 1;
                            for (int i = 1; i <= n; i+=2) {
                                contIMP++;
                            }
                            System.out.print(+contIMP+" numeros impares y estos son:");
                            for (int i = 1; i <= 10; i+=2) {
                                System.out.print(" "+mn);
                                mn = mn + 2;
                            }
                            System.out.println("");
                            ciclo = false;           
                            break;
                        
                    }
                    
                    break;
                case 2:
                    //Triangulos y mas triangulos
                    System.out.println("            ~Sub-Menu~");
                    System.out.println("        1. Equilatero");
                    System.out.println("        2. Rectangulo");
                    System.out.println("        3. Salir");
                    System.out.print("Elija el tipo de triangulo...: ");
                    int t_Triang = escan.nextInt();                    
                    
                    do {
                        switch (t_Triang){
                            case 1: // Triangulo equilatero
                                
                                System.out.print("Elija la altura del triangulo equilatero: ");
                                int alturaTE = escan.nextInt();
                                
                                int contTE = 1;
                                for (int i = 1; i <= alturaTE; i++) {
                                    for (int j = i; j <= alturaTE; j++) {
                                        System.out.print(" ");
                                    }
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println("");
                                }
                                                                
                                break;
                            case 2: // Triangulo Rectangulo
                                
                                System.out.print("Elija la altura del triangulo rectangulo: ");
                                int alturaTR = escan.nextInt();
                                int contTR = 1;
                                for (int i = 1; i <= alturaTR; i++) {
                                    for (int j = 1; j <= contTR; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println("");
                                    contTR++;
                                    
                                }
                                
                                break;
                            case 3:
                                System.out.println("No escogio ningun tipo de triangulo, si quiere salir vuelva a presionar 3");
                                break;
                            default:
                                System.out.println("Elija otra tecla ya que no puedo ejecutar la tecla que acaba de presionar");
                                break;
                        }
                    System.out.println("            ~Sub-Menu~");
                    System.out.println("        1. Equilatero");
                    System.out.println("        2. Rectangulo");
                    System.out.println("        3. Salir");
                    System.out.print("Desea ver otro tipo de triangulo?: ");
                    t_Triang = escan.nextInt();                    
                    
                    } while (t_Triang != 3);
                    
                    break;
                case 3:
                    //Anita lava la tina
                    
                    ///Esta no la terminé porque no supe qué hacer, pero révisalo, está bonito :)
                    
                    System.out.print("Escriba algo: ");
                    String str = escan.nextLine();
                    str = escan.nextLine();
                    String reverseStr = "";
                    int strLength = str.length();
                    
                    for (int i = (strLength - 1); i >=0; --i) {
                    reverseStr = reverseStr + str.charAt(i);
                    }
                    
                    if (str.toLowerCase().equalsIgnoreCase(reverseStr.toLowerCase())) {
                    System.out.println(str + " es una palindroma");
                    }
                    else {
                    System.out.println(str + " no es una palindroma.");
                    }                    
                    
                    
                    break;
                case 4:
                    //Codigos secretos
                    
                    System.out.print("Escriba algo: ");
                    String algo = escan.next();
                    
                    char caracter = ' ';
                    int algoLength = algo.length();
                    int acum = 0;
                    char posicion = 0;
                    
                    for (int i = 0; i < algo.length(); i++) {
                        posicion = algo.charAt(i);
                        
                        if (Character.isLetter(posicion)) {
                            if (posicion != ' ') {
                                for (int j = 0; j < acum; j++) {
                                    System.out.print(caracter);
                                }
                            }
                            caracter = posicion;
                            acum = 0;
                        } else if(Character.isDigit(posicion)){
                            acum = acum * 10 + (posicion - '0');
                        }
                    }
                    
                    for (int i = 0; i < acum; i++) {
                        System.out.print(caracter);
                    }
                    
                    System.out.println();
                    
                    break;

                case 5:
                    System.out.println("Si quiere salir, pulse la misma tecla. Si no quiere pulse otra tecla");
                    break;
                default:
                    System.out.println("Lo siento, no puedo leer eso, pulse otra tecla.");
                    break;
            }

        System.out.println("        ~Menu~");
        System.out.println("    1. Cuantos numeros pares e impares hay entre este rango?");
        System.out.println("    2. Triangulos y mas Triangulos.");
        System.out.println("    3. Anita lava la tina");
        System.out.println("    4. Codigos secretos.");
        System.out.println("    5. Salir");
        System.out.print("Desea ver otra cosa?: ");
        eleccion = escan.nextInt();
            
        } while (eleccion != 5);
    }
    
}
