package org.example;


    import java.util.Scanner;

    public class NivelDeExperiencia {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número de anos de experiência na área: ");
            int anos = scanner.nextInt();
            String nivel;

            System.out.print("Esta pessoa é um(a) ");
            switch (anos) {
                case 0:
                case 1:
                    nivel = "Iniciante";
                    break;
                case 2:
                case 3:
                case 4:
                    nivel = "Intermediário";
                    break;
                case 5:
                case 6:
                case 7:
                    nivel = "Avançado";
                    break;
                default:
                    nivel = "Especialista";
                    break;
            }

            System.out.println(nivel);
            scanner.close();
        }
    }





