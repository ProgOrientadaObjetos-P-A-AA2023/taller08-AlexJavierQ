/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Docente;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;
import java.util.Scanner;
import paquete1.DocenteNombramiento;

public class Ejecutor {

    public static void main(String[] args) {
        int ini = 1;
        int op = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Bienvenido al programa--: ");

        System.out.println("Ingrese su nombre: ");
        String nombres = scanner.nextLine();
        System.out.println("Ingrese su cedula: ");
        String cedula = scanner.nextLine();
        Docente d = new Docente();
        d.establecerNombres(nombres);
        d.establecerCedula(cedula);

        while (ini == 1) {

            System.out.println("1-  Para crear Docente Nombramiento");
            System.out.println("2- Para crear Factura de Docente");
            System.out.println("0- Para Finalizar el programa");
            op = scanner.nextInt();
            if (op == 1) {
                DocenteNombramiento dN1 = new DocenteNombramiento();
                System.out.println("Ingrese el valor del sueldo");
                double vS = scanner.nextDouble();
                System.out.println("Ingrese el valor de horas extra");
                double vHE = scanner.nextDouble();
                System.out.println("Ingrese el numero de horas extras");
                double numHE = scanner.nextDouble();

                dN1.establecerValorsueldo(vS);
                dN1.establecerValorHoraExtra(vHE);
                dN1.establecerNumerHorasExtra(numHE);
                dN1.calcularSueldo();
                System.out.printf("%s", d);
                System.out.printf("Su sueldo corresponde a un valor de: %s usd\n", dN1);

            }
            if (op == 2) {
                DocenteFactura dF1 = new DocenteFactura();

                System.out.println("Ingrese el valor de la factura");
                double vF = scanner.nextDouble();

                dF1.establecerValorFactura(vF);
                dF1.calcularValorCancelar();
                System.out.printf("%s", d);
                System.out.printf("El valor a cancelar es de : %s usd\n", dF1);

            }

            // Finaliza el programa
            if (op == 0) {
                ini = 0;
            }
        }

    }

}
