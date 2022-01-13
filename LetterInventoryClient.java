public class LetterInventoryClient {
    public static void main (String [] args) {
        LetterInventory inventory1 = new LetterInventory("your dad homo!@*");
        System.out.println(inventory1.size());
        System.out.println(inventory1.isEmpty());
        System.out.println(inventory1.get('A'));
        System.out.println(inventory1.toString());
        inventory1.set('g', 3);
        System.out.println(inventory1.toString());
        
    }
}
