nhập  java.util.Scanner ;
 ứng dụng lớp  công cộng {
    public  static  void  main ( String [] args ) {
       // khai bao bien
        nhân đôi a, b, c, x1, x2, delta;
        Máy quét sc =  Máy quét mới  ( Hệ thống . In);
        Hệ thống . ra ngoài . print ( " Nhap a (a # 0): " );
        a = sc . nextDouble ();
        Hệ thống . ra ngoài . print ( " Nhap b: " );
        b = sc . nextDouble ();
        Hệ thống . ra ngoài . print ( " Nhap c: " );
        c = sc . nextDouble ();
        Hệ thống . ra ngoài . println ( " Phuong trinh bac 2 vua nhap co dang: "  + a +  " x ^ 2 + "  + b +  " x + "  + c +  " = 0 " );
       // tinh delta
        delta =  Toán học . pow (b, 2 ) -  4  * a * c;
        if (delta <  0 ) {
            Hệ thống . ra ngoài . println ( " Phuong trinh vo nghiem! " );
        } else  if (delta ==  0 ) {
            x1 =  - b / ( 2  * a);
            Hệ thống . ra ngoài . println ( " Phuong trinh co 1 nghiem la: x1 = x2 = "  + x1);
        } khác {
            x1 = ( - b +  Math . sqrt (delta)) / ( 2  * a);
            x2 = ( - b -  Math . sqrt (delta)) / ( 2  * a);
            Hệ thống . ra ngoài . println ( " Phuong trinh co 2 nghiem: x1 = "  + x1 +  " va x2 = "  + x2);
        }
    }
}