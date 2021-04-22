public class aula2_autoAvaliacao1 {
    public static int num = 20;
    public static void main(String args[]){
        int num1=30;
        int num2=40;
        int num3=50;
        int num4=60;
        char lt1 = 'g';
        char lt2 = 'a';
        char lt3 = 't';
        char lt4 = 'o';
        /* usando mais de um parâmetro */
        System.out.println(num + ", " + num1 +", " + num2 +", " + num3 + ", " 
                + num4 + ", " + lt1 + ", " + lt2 + ", " + lt3 + ", " + lt4);
        
        /* Usando mais de um parâmetro */
        System.out.printf("%d\n %d\n %d\n %d\n %d\n %s\n %s\n %s\n %s\n", 
                num, num1, num2, num3, num4, lt1, lt2, lt3, lt4);
    }
}
