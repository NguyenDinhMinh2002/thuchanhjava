nhập  java.util.Scanner ;
 lớp  công khai App2 {
    nhân đôi a1, b1, c1;
    nhân đôi a2, b2, c2;
    public  static  void  main ( String [] args ) ném  Exception {
        nhân đôi a1, b1, c1;
        nhân đôi a2, b2, c2;
        Scanner s =  new  Scanner ( Hệ thống . In);
        Hệ thống . ra ngoài . println ( " Nhap phuong trinh 1 " );
        Hệ thống . ra ngoài . println ( " Nhap he so: a1, b1, c1 = " );
        a1 = s . nextDouble ();
        b1 = s . nextDouble ();
        c1 = s . nextDouble ();
        Hệ thống . ra ngoài . println ( " Nhap phuong trinh 2 " );
        Hệ thống . ra ngoài . println ( " a2, b2, c2 = " );
        a2 = s . nextDouble ();
        b2 = s . nextDouble ();
        c2 = s . nextDouble ();
        Hệ thống . ra ngoài . println ( " ------- Hoan thanh Nhap ------- " );
        Hệ thống . ra ngoài . println ( " " );
        // Phuong trinh the
        nhân đôi b11 = b1 * b2;
        nhân đôi c11 = c1 * b2;
        nhân đôi b22 = b2 * b1;
        nhân đôi c22 = c2 * b1;
        double y = (a1 * b2 - a2 * b1) / ( c11 - c22);
        Hệ thống . ra ngoài . println ( " nghiem cua hpt y = " + y);
        double x = (c11 - b11 * y) / (a1 * b2);
        Hệ thống . ra ngoài . println ( " nghiem cua hpt x = " + x);
    }
}