public class SprzetElektroniczny {

    public static void main(String[] args) {

        //z 1.1 stworzenie 2 obiektów pierwszy commit nowy commit

        Telewizor telewizor1 = new Telewizor();
        telewizor1.nazwa = "Telewizor";
        telewizor1.marka = "LG";
        telewizor1.typ = "plazmowy";
        telewizor1.rozmiar ="55 cali";
        telewizor1.cena = 3399.7;

        System.out.println(telewizor1.nazwa);
        System.out.println(telewizor1.marka);
        System.out.println(telewizor1.typ);
        System.out.println(telewizor1. rozmiar);
        System.out.println(telewizor1.cena);
        System.out.println();


        Telewizor telewizor2 = new Telewizor();
        telewizor2.nazwa = "Monitor";
        telewizor2.marka = "Samsung LC27";
        telewizor2.typ = "monitor komputerowy";
        telewizor2.rozmiar = "27 cali";
        telewizor2.cena = 1299.3;

        System.out.println(telewizor2.nazwa);
        System.out.println(telewizor2.marka);
        System.out.println(telewizor2.typ);
        System.out.println(telewizor2.rozmiar);
        System.out.println(telewizor2.cena);

    }

}
