public class OperatorPembanding java {
  public static void main(String[] args) {
    int nilaiA = 12;
    int nilaiB = 4;
    boolean hasil;
    
    // apakah A lebih besar dari B?
    hasil = nilaiA > nilaiB;
    System.out.println(hasil);
    
      
    // apakah A lebih kecil dari B?
    hasil = nilaiA < nilaiB;
    System.out.println(hasil);
    
      
    // apakah A lebih besar samadengan dari B?
    hasil = nilaiA >= nilaiB;
    System.out.println(hasil);
    
    
    // apakah A lebih kecil samadengan dari B?
    hasil = nilaiA <= nilaiB;
    System.out.println(hasil);
    
    // apakah nilai A  samadengan B?
    hasil = nilaiA == nilaiB;
    System.out.println(hasil);
    
    // apakah nilai A tidak samadengan B?
    hasil = nilaiA != nilaiB;
    System.out.println(hasil);
  }
}