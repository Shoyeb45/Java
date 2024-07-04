public class ASCIISymbols {
    public static void main(String[] args) {
        System.out.print("Character\tASCII Code\n");
        System.out.print("_________\t__________\n");
        for(int i = 0; i < 128; i++) {
            System.out.println((char)(i) + "\t" + i);
        } 
    }
}
