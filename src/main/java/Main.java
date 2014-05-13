/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * modificado por Tomás Abril
 */
public class Main
{
    public static void main(String[] args) 
    {
        long a=7, b=5;
        long c;
        c = Pratica34.mdc(a, b);
        System.out.println(c);
        
        for(int i=0; i<20; i++){
            System.out.println("fatorial de " +i);
            System.out.println(Pratica34.fatorial(i));
        }
    }
}
