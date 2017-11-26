public class SprzetElektroniczny {

    public static void main(String[] args) {

        // z 1.2 zastosowanie konstruktora

        Telewizor telewizor1 = new Telewizor("Telewizor", "LG", "plazmowy", "55 cali", 3399.7);
        System.out.println(telewizor1.nazwa);
        System.out.println(telewizor1.marka);
        System.out.println(telewizor1.typ);
        System.out.println(telewizor1.rozmiar);
        System.out.println(telewizor1.cena);
        System.out.println();


        Telewizor telewizor2 = new Telewizor("Monitor", "Samsung LC27", "monitor komputerowy", "27 cali", 1299.3);
        System.out.println(telewizor2.nazwa);
        System.out.println(telewizor2.marka);
        System.out.println(telewizor2.typ);
        System.out.println(telewizor2.rozmiar);
        System.out.println(telewizor2.cena);

    }

}
