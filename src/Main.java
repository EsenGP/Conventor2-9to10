import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = 0;
        String words = null;
        int a = 1;
        while (a==1) {
        int chis = Integer.parseInt(JOptionPane.showInputDialog(null,"Выберите систему счисления (2-9)"));
        switch (chis) {
            case 2: b = 2; words = "двоичное"; a = 0; break;
            case 3: b = 3; words = "троичное"; a = 0; break;
            case 4: b = 4; words = "четверичное"; a = 0; break;
            case 5: b = 5; words = "пятиричное"; a = 0; break;
            case 6: b = 6; words = "шестеричное"; a = 0; break;
            case 7: b = 7; words = "семеричное"; a = 0; break;
            case 8: b = 8; words = "восьмиричное"; a = 0; break;
            case 9: b = 9; words = "девятиричное"; a = 0; break;
            default: JOptionPane.showMessageDialog(null, "Ошибка"); break;
        }
        }
        String num = JOptionPane.showInputDialog(null,"Введите " + words + " число");
        num = new StringBuffer(num).reverse().toString();
        int length = num.length();
        int i = 0;
        int numb;
        double sum = 0;
        int len = length ;
        boolean que = false;
        while (i!=len) {
        numb = Integer.parseInt(num.substring(0,1));
        que = (numb>(b-1));
        if (que) {JOptionPane.showMessageDialog(null,"Это не " + words +" число!");}
        sum = sum + (numb*(Math.pow(b,i)));
        num = num.substring(1,length);
        length = length - 1;
        if (length==0) {break;}
        i++;
        }
        if (!que) {JOptionPane.showMessageDialog(null,"Это число в десятиричной системе " + (long) sum);}
    }
}
