import java.util.Scanner;

class CaesarCipher{
    public static String encrypt(String msg,int key){
        String s = "";
        for(int i=0;i<msg.length();i++){
            if(msg.charAt(i)>=65&&msg.charAt(i)<=90){
                s += (char)(((msg.charAt(i)+key-65)%26)+65);
            }
            else{
                s += (char)(((msg.charAt(i)+key-97)%26)+97);
            }
        }
        return s;
    }
    public static String decrypt(String msg,int key){
        String s = "";
        for(int i=0;i<msg.length();i++){
            if(msg.charAt(i)>=65&&msg.charAt(i)<=90){
                s += (char)(((msg.charAt(i)-key-65+26)%26)+65);
            }
            else{
                s += (char)(((msg.charAt(i)-key-97+26)%26)+97);
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message:-");
        String s = sc.nextLine();
        System.out.print("Enter a key:-");
        int key = sc.nextInt();
        String encrypted_msg = encrypt(s, key);
        System.out.println("Encrypted message is :- "+encrypted_msg);
        String decrypted_msg = decrypt(encrypted_msg, key);
        System.out.println("Decrypted message is :- "+decrypted_msg);
        sc.close();
    }
}