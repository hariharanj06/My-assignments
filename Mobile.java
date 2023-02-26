package week1day1ass;

public class Mobile {

       String mobileBrandName = "poco";
       char mobileLogo = 'P';
       short noOfMobilePiece = 8;
       int modelNumber = 54;
       long mobileImeiNumber = 534536533;
       float mobileprice = 22999.45f;
       boolean isDamaged = false;
       
       public static void main(String[] args) {
		      Mobile myMobile = new Mobile();
		      System.out.println("Brand name" + myMobile.mobileBrandName);
		      System.out.println("Logo" + myMobile.mobileLogo);
		      System.out.println("Number of available pieces = " + myMobile.noOfMobilePiece);
		      System.out.println("Model number " + myMobile.modelNumber);
		      System.out.println("Imei Number " + myMobile.mobileImeiNumber);
		      System.out.println("Mobile price " + myMobile.mobileprice);
		      System.out.println("Status of Damage = " + myMobile.isDamaged);
       }
}
