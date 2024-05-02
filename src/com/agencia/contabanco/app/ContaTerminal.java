
package com.agencia.contabanco.app;
import java.util.Scanner;
/**
 *<h1>ContaTerminal</h1>
 * Recebera dados do cliente via terminal contando com
 * caracteristicas de uma conta de banco.
 * 
 * @author Ricardo Azevedo
 * @version 1.0
 * @since 01/05/2024
 */
public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        String agencia;
        
        String nomeCliente;
        
        float saldo;
        
        System.out.print("Por favor, digite o numero da agência: ");
        numero = scanner.nextInt();
        
        System.out.print("\nPor favor, digite o codigo da agência: ");
        agencia = scanner.next();
        
        System.out.print("\nPor favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();
        
        System.out.print("\nPor favor, digite o saldo: ");
        saldo = scanner.nextFloat();
        
        for(int contador = 0; contador < 6; contador++){
            System.out.println("*");
        }
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de R$"+saldo+" já está disponível para o saque.");   
        
        } 
    }

