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
    // 1️⃣ Kare Alanı
public static double calculateSquareArea(double side) {
    return side * side;
}

// 2️⃣ Kare Çevresi
public static double calculateSquarePerimeter(double side) {
    return 4 * side;
}

// 3️⃣ Dikdörtgen Alanı
public static double calculateRectangleArea(double width, double height) {
    return width * height;
}

// 4️⃣ Dikdörtgen Çevresi
public static double calculateRectanglePerimeter(double width, double height) {
    return 2 * (width + height);
}

// 5️⃣ Daire Alanı
public static double calculateCircleArea(double radius) {
    return Math.PI * Math.pow(radius, 2);
}

// 6️⃣ Daire Çevresi
public static double calculateCircleCircumference(double radius) {
    return 2 * Math.PI * radius;
}

// 7️⃣ Üçgen Alanı
public static double calculateTriangleArea(double base, double height) {
    return (base * height) / 2;
}

// 8️⃣ Üçgen Çevresi
public static double calculateTrianglePerimeter(double a, double b, double c) {
    return a + b + c;
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
      import java.util.Scanner;

public class GeometryCalculator {

    public class GeometryCalculator {

    // 1️⃣ Kare Alanı Hesaplama
    // Formül: Alan = kenar × kenar
    public static double calculateSquareArea(double side) {
        double area = side * side; // kare alanı hesaplanıyor
        return area;
    }

    // 2️⃣ Kare Çevresi Hesaplama
    // Formül: Çevre = 4 × kenar
    public static double calculateSquarePerimeter(double side) {
        double perimeter = 4 * side; // kare çevresi hesaplanıyor
        return perimeter;
    }

    // 3️⃣ Dikdörtgen Alanı Hesaplama
    // Formül: Alan = genişlik × yükseklik
    public static double calculateRectangleArea(double width, double height) {
        double area = width * height; // dikdörtgen alanı hesaplanıyor
        return area;
    }

    // 4️⃣ Dikdörtgen Çevresi Hesaplama
    // Formül: Çevre = 2 × (genişlik + yükseklik)
    public static double calculateRectanglePerimeter(double width, double height) {
        double perimeter = 2 * (width + height); // dikdörtgen çevresi hesaplanıyor
        return perimeter;
    }

    // 5️⃣ Daire Alanı Hesaplama
    // Formül: Alan = π × r²
    public static double calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius; // daire alanı hesaplanıyor
        return area;
    }

    // 6️⃣ Daire Çevresi Hesaplama
    // Formül: Çevre = 2 × π × r
    public static double calculateCircleCircumference(double radius) {
        double circumference = 2 * Math.PI * radius; // daire çevresi hesaplanıyor
        return circumference;
    }

    // 7️⃣ Üçgen Alanı Hesaplama
    // Formül: Alan = (taban × yükseklik) / 2
    public static double calculateTriangleArea(double base, double height) {
        double area = (base * height) / 2; // üçgen alanı hesaplanıyor
        return area;
    }

    // 8️⃣ Üçgen Çevresi Hesaplama
    // Formül: Çevre = a + b + c
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        double perimeter = a + b + c; // üçgen çevresi hesaplanıyor
        return perimeter;
    }

    // 🔹 Test için main metodu
    public static void main(String[] args) {

        // --- Kare ---
        double kareKenar = 5;
        System.out.println("Kare Alanı (kenar=" + kareKenar + "): " + calculateSquareArea(kareKenar));
        System.out.println("Kare Çevresi (kenar=" + kareKenar + "): " + calculateSquarePerimeter(kareKenar));

        // --- Dikdörtgen ---
        double genislik = 4, yukseklik = 6;
        System.out.println("\nDikdörtgen Alanı (genişlik=" + genislik + ", yükseklik=" + yukseklik + "): " + calculateRectangleArea(genislik, yukseklik));
        System.out.println("Dikdörtgen Çevresi (genişlik=" + genislik + ", yükseklik=" + yukseklik + "): " + calculateRectanglePerimeter(genislik, yukseklik));

        // --- Daire ---
        double yaricap = 3;
        System.out.println("\nDaire Alanı (yarıçap=" + yaricap + "): " + calculateCircleArea(yaricap));
        System.out.println("Daire Çevresi (yarıçap=" + yaricap + "): " + calculateCircleCircumference(yaricap));

        // --- Üçgen ---
        double taban = 4, yukseklikU = 5, a = 3, b = 4, c = 5;
        System.out.println("\nÜçgen Alanı (taban=" + taban + ", yükseklik=" + yukseklikU + "): " + calculateTriangleArea(taban, yukseklikU));
        System.out.println("Üçgen Çevresi (a=" + a + ", b=" + b + ", c=" + c + "): " + calculateTrianglePerimeter(a, b, c));
    }
    }
    }

    // === MAIN ===
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kare
        System.out.print("Kare kenar uzunluğu: ");
        double squareSide = input.nextDouble();

        // Dikdörtgen
        System.out.print("Dikdörtgen genişlik: ");
        double rectWidth = input.nextDouble();
        System.out.print("Dikdörtgen yükseklik: ");
        double rectHeight = input.nextDouble();

        // Daire
        System.out.print("Daire yarıçap: ");
        double circleRadius = input.nextDouble();

        // Üçgen
        System.out.print("Üçgen taban uzunluğu: ");
        double triBase = input.nextDouble();
        System.out.print("Üçgen yükseklik: ");
        double triHeight = input.nextDouble();
        System.out.print("Üçgen kenar a: ");
        double triA = input.nextDouble();
        System.out.print("Üçgen kenar b: ");
        double triB = input.nextDouble();
        System.out.print("Üçgen kenar c: ");
        double triC = input.nextDouble();

        // Hesaplamalar ve çıktı
        System.out.println("\n=== Hesap Sonuçları ===");

        System.out.printf("Kare Alanı: %.2f, Çevresi: %.2f%n",
                calculateSquareArea(squareSide),
                calculateSquarePerimeter(squareSide));

        System.out.printf("Dikdörtgen Alanı: %.2f, Çevresi: %.2f%n",
                calculateRectangleArea(rectWidth, rectHeight),
                calculateRectanglePerimeter(rectWidth, rectHeight));

        System.out.printf("Daire Alanı: %.2f, Çevresi: %.2f%n",
                calculateCircleArea(circleRadius),
                calculateCircleCircumference(circleRadius));

        System.out.printf("Üçgen Alanı: %.2f, Çevresi: %.2f%n",
                calculateTriangleArea(triBase, triHeight),
                calculateTrianglePerimeter(triA, triB, triC));

        input.close();
    }
            }  
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
