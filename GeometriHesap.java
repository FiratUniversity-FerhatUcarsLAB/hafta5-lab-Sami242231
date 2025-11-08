/*
 * Ad Soyad: [Sami Yusuf Yıldız]
 * Ogrenci No: [250541081]
 * Tarih: [08/11/2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {
    
    // METOT 1: Kare alani
    public static double calculateSquareArea(double side) {
        // Alan = kenar * kenar
        
        return 0.0; // Degistirin
    }
    
    // METOT 2: Kare cevresi
    public static double calculateSquarePerimeter(double side) {
        // Cevre = 4 * kenar
        
        return 0.0; // Degistirin
    }
    
    // METOT 3: Dikdortgen alani
    public static double calculateRectangleArea(double width, double height) {
        // Alan = genislik * yukseklik
        
        return 0.0; // Degistirin
    }
    
    // METOT 4: Dikdortgen cevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        // Cevre = 2 * (genislik + yukseklik)
        
        return 0.0; // Degistirin
    }
    
    // METOT 5: Daire alani
    public static double calculateCircleArea(double radius) {
        // Alan = PI * r * r
        // Math.PI kullanabilirsiniz
        
        return 0.0; // Degistirin
    }
    
    // METOT 6: Daire cevresi
    public static double calculateCircleCircumference(double radius) {
        // Cevre = 2 * PI * r
        
        return 0.0; // Degistirin
    }
    
    // METOT 7: Ucgen alani (taban ve yukseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        // Alan = (taban * yukseklik) / 2
        
        return 0.0; // Degistirin
    }
    
    // METOT 8: Ucgen cevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        // Cevre = a + b + c
        
        return 0.0; // Degistirin
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();
        
        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();
        
        // DIKDORTGEN bilgileri
        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();
        
        // DAIRE bilgileri
        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        double radius = input.nextDouble();
        
        // UCGEN bilgileri
        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();
        
        // HESAPLAMALARI YAP - Metotlari cagir
        
        
        
        
        
        
        
        
        
        
        
        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");
        
        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        // Alan ve cevre yazdir
        
        
        System.out.println("========================================");
        Kare kenar uzunluğu: 5
Kare Alanı: 25.00
Kare Çevresi: 20.00

Dikdörtgen genişliği: 4
Dikdörtgen yüksekliği: 7
Dikdörtgen Alanı: 28.00
Dikdörtgen Çevresi: 22.00

Daire yarıçapı: 3
Daire Alanı: 28.27
Daire Çevresi: 18.85

Üçgen tabanı: 6
Üçgen yüksekliği: 4
Üçgen kenar a: 5
Üçgen kenar b: 6
Üçgen kenar c: 7
Üçgen Alanı: 12.00
Üçgen Çevresi: 18.00

        input.close();
    }
}
