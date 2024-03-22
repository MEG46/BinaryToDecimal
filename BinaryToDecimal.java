import java.util.Scanner;
class HelloWorld {
public static int sh(int binary){
    int decimal=0;
    int n=0;
while(true){
            if(binary==0){
                break;
            }else{
                int temp=binary%10;
                decimal += temp * Math.pow(2,n);
                binary = binary/10;
                 n++;
            }
}
return decimal;
}
public static void menu(){
    System.out.println("Options\n1 - Binary to Decimal\n2 - Reverse Binary to Decimal\n3 - Exit");
}
    public static void main(String[] args) {
        while(true){
        String binary,rv="";
        char c;
        int bin,dec=0,num=0;
        Scanner s = new Scanner(System.in);
        menu();
        System.out.println("Please enter your option : ");
        num = Integer.parseInt(s.nextLine());
        System.out.println("Please enter a number : ");
        binary = s.nextLine();
        if(num==1){
            bin=Integer.parseInt(binary);
            dec =sh(bin);
        System.out.println("Converted Number : "+dec);
        }else if(num==2){
        for(int i=0;i<binary.length();i++){
        c=binary.charAt(i);
        rv=c+rv;
        }
        bin=Integer.parseInt(rv);
        dec =sh(bin);
        System.out.println("Converted Number : "+dec);
        }else{
            break;
        }
        }
    }
    }