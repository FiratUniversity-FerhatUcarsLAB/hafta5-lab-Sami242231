/*
 * Ad Soyad: [Sami Yusuf Yıldız]
 * Ogrenci No: [250541081]
 * Tarih: [08/11/2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {

    // Sabitler
    final static double VAT_RATE = 0.18;      // KDV Oranı (%18)
    final static double SHIPPING_FEE = 29.99; // Sabit kargo ücreti (TL)

    // METOT 1: Bir urunun toplam fiyatini hesaplar (fiyat * adet)
    public static double calculateLineTotal(double price, int quantity) {
        // Satir Toplami = fiyat * adet
        return 0.0; // Degistirin
    }

    // METOT 2: Sepetteki 3 urunun ara toplamini hesaplar
    public static double calculateSubtotal(double line1, double line2, double line3) {
        // Ara Toplam = urun1 + urun2 + urun3
        return 0.0; // Degistirin
    }

    // METOT 3: Indirim tutarini hesaplar
    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        // Indirim Tutari = araToplam * (indirimYuzdesi / 100)
        return 0.0; // Degistirin
    }

    // METOT 4: Indirimli fiyati hesaplar (araToplam - indirimTutari)
    public static double applyDiscount(double subtotal, double discountAmount) {
        // Indirimli Toplam = araToplam - indirimTutari
        return 0.0; // Degistirin
    }

    // METOT 5: KDV tutarini hesaplar (indirimliTutar * kdvOrani)
    public static double calculateVAT(double discountedTotal, double vatRate) {
        // KDV Tutari = indirimliTutar * VAT_RATE
        return 0.0; // Degistirin
    }

    // METOT 6: Genel toplami hesaplar (indirimliTutar + kdv + kargo)
    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        // Genel Toplam = indirimliTutar + kdvTutari + kargoUcreti
        return 0.0; // Degistirin
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== E-TICARET SEPET HESAPLAYICI ===");
        System.out.println("\nLutfen 3 urunun bilgilerini girin:");

        // URUN 1 Bilgileri
        System.out.println("\nURUN 1:");
        System.out.print("  Birim Fiyat (TL): ");
        double price1 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty1 = input.nextInt();

        // URUN 2 Bilgileri
        System.out.println("\nURUN 2:");
        System.out.print("  Birim Fiyat (TL): ");
        double price2 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty2 = input.nextInt();

        // URUN 3 Bilgileri
        System.out.println("\nURUN 3:");
        System.out.print("  Birim Fiyat (TL): ");
        double price3 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty3 = input.nextInt();

        // Indirim Bilgisi
        System.out.println("\nIndirim Kuponu Yuzdesi (%): ");
        double discountPercent = input.nextDouble();
// Sabitler
final static double VAT_RATE = 0.18;       // %18 KDV
final static double SHIPPING_FEE = 29.99;  // Kargo ücreti

// 1️⃣ Ürün toplamını hesaplar (fiyat × adet)
public static double calculateItemTotal(double price, int quantity) {
    return price * quantity;
}

// 2️⃣ Ara toplamı hesaplar (3 ürünün toplamı)
public static double calculateSubTotal(double t1, double t2, double t3) {
    return t1 + t2 + t3;
}

// 3️⃣ İndirim tutarını hesaplar (ara toplam × %indirim)
public static double calculateDiscountAmount(double subTotal, double discountPercent) {
    return subTotal * (discountPercent / 100);
}

// 4️⃣ İndirimli toplamı hesaplar (ara toplam − indirim)
public static double calculateDiscountedTotal(double subTotal, double discountAmount) {
    return subTotal - discountAmount;
}

// 5️⃣ KDV tutarını hesaplar (indirimli toplam × VAT_RATE)
public static double calculateVat(double discountedTotal) {
    return discountedTotal * VAT_RATE;
}

// 6️⃣ Genel toplamı hesaplar (indirimli toplam + KDV + kargo)
public static double calculateGrandTotal(double discountedTotal, double vatAmount) {
    return discountedTotal + vatAmount + SHIPPING_FEE;
}
        // HESAPLAMALARI YAP - Metotlari cagir
        // 1. Urunlerin satis toplamlarini hesapla
    

        // 2. Ara toplami hesapla

        // 3. Indirim tutarini hesapla
      

        // 4. Indirimli toplami hesapla
      

        // 5. KDV tutarini hesapla (Indirimli toplam uzerinden)
      

        // 6. Genel toplami hesapla
inal static double VAT_RATE = 0.18;       // %18 KDV
    final static double SHIPPING_FEE = 29.99;  // Kargo ücreti

    --- Hesaplamalar ---
        double total1 = calculateProductTotal(price1, qty1);  // 150 × 2 = 300
        double total2 = calculateProductTotal(price2, qty2);  // 90 × 1 = 90
        double total3 = calculateProductTotal(price3, qty3);  // 45 × 3 = 135

        double subtotal = calculateSubtotal(total1, total2, total3);  // 300 + 90 + 135 = 525
        double discountAmount = calculateDiscountAmount(subtotal, discountRate); // 525 × 0.10 = 52.5
        double discountedTotal = calculateDiscountedTotal(subtotal, discountAmount); // 525 - 52.5 = 472.5
        double vat = calculateVAT(discountedTotal); // 472.5 × 0.18 = 85.05
        double grandTotal = calculateGrandTotal(discountedTotal, vat); // 472.5 + 85.05 + 29.99 = 587.54

        // --- Sonuçlar ---
    }

    // === MAIN ===
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sepet Hesaplayıcı ===");

        // Ürün 1
        System.out.print("1. ürün fiyatı: ");
        double price1 = input.nextDouble();
        System.out.print("1. ürün adedi: ");
        int qty1 = input.nextInt();

        // Ürün 2
        System.out.print("2. ürün fiyatı: ");
        double price2 = input.nextDouble();
        System.out.print("2. ürün adedi: ");
        int qty2 = input.nextInt();

        // Ürün 3
        System.out.print("3. ürün fiyatı: ");
        double price3 = input.nextDouble();
        System.out.print("3. ürün adedi: ");
        int qty3 = input.nextInt();

        // İndirim
        System.out.print("İndirim oranı (%): ");
        double discountPercent = input.nextDouble();

        // Hesaplamalar
        double total1 = calculateItemTotal(price1, qty1);
        double total2 = calculateItemTotal(price2, qty2);
        double total3 = calculateItemTotal(price3, qty3);

        double subTotal = calculateSubTotal(total1, total2, total3);
        double discountAmount = calculateDiscountAmount(subTotal, discountPercent);
        double discountedTotal = calculateDiscountedTotal(subTotal, discountAmount);
        double vatAmount = calculateVat(discountedTotal);
        double grandTotal = calculateGrandTotal(discountedTotal, vatAmount);


        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("           SIPARIS OZETI");
        System.out.println("========================================");

        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", price1, qty1, line1Total);
        System.out.printf("Urun 2 Toplam (%.2f TL x %d): %.2f TL\n", price2, qty2, line2Total);
        System.out.printf("Urun 3 Toplam (%.2f TL x %d): %.2f TL\n", price3, qty3, line3Total);
        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                   : %.2f TL\n", subtotal);

        System.out.printf("\nIndirim Tutari (%%%.0f)         : -%.2f TL\n", discountPercent, discountAmount);
        System.out.printf("Indirimli Toplam             : %.2f TL\n", discountedTotal);

        System.out.printf("\nKDV Tutari (%%%.0f)             : +%.2f TL\n", (VAT_RATE * 100), vatAmount);
        System.out.printf("Kargo Ucreti                 : +%.2f TL\n", SHIPPING_FEE);
        System.out.println("----------------------------------------");
        System.out.printf("GENEL TOPLAM                 : %.2f TL\n", grandTotal);
        System.out.println("========================================");
Ürün 1 Toplamı: 300.00 TL
Ürün 2 Toplamı: 240.00 TL
Ürün 3 Toplamı: 50.00 TL
Ara Toplam: 590.00 TL
İndirim Tutarı (%10.0): 59.00 TL
İndirimli Toplam: 531.00 TL
KDV (%18): 95.58 TL
Kargo Ücreti: 29.99 TL
Genel Toplam: 656.57 TL

        input.close();
    }
}
