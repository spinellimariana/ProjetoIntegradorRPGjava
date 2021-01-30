/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPGgrupo8turmaA;

/**
 *
 * @author Lenovo
 */
public class grupo8turmaAteste {
    /*CLASSE DE TESTES DO GRUPO 8 TURMA A - TADS Noturno - 1o Semestre:
        Maysa Bilac Alves
        Brendon Monteiro Silva
        Mariana Lima Alves de Almeida Spinelli*/
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            testa_dados(2, 12);
        }

    }

    public static void testa_dados(int valorMin, int valorMax) {
        if (grupo8turmaArpg.dados() <= valorMin && grupo8turmaArpg.dados() >= valorMax) {
            System.out.println("Temos um erro!");
        } else {
            System.out.println("ok, passou no teste!");
        }
    }

}
