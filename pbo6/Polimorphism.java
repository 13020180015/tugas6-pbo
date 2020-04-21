1
 2
 3
 4
 5
 6
 7
 8
 9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36	// Nama file : Polimorphism.java
// Contoh penerapan konsep polimorphism
 
public class Polimorphism {
 
   public static void main(String[ ] args) {
 
      cetakObyek(new Balok());
      cetakObyek(new PersegiPanjang());
      cetakObyek(new BangunDatar());
      cetakObyek(new Object());
   }
    
   public static void cetakObyek(Object obyek) {
      System.out.println(obyek);
   }
 
} // Akhir kelas Polimorphism
 
class Balok extends PersegiPanjang {
   public String toString() {
      return "Mempunyai sisi panjang, lebar dan tinggi";
   }
}
 
class PersegiPanjang extends BangunDatar {
   public String toString() {
      return "Mempunyai sisi panjang dan lebar";
   }
}
 
class BangunDatar extends Object {
   public String toString() {
      return "Mempunyai berbagai bentuk";
   }
}
