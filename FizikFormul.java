/*
 * Ad Soyad: [Sami Yusuf Yıldız]
 * Ogrenci No: [250541081]
 * Tarih: [08/11/2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    // Sabit: Yercekimi ivmesi
    final static double GRAVITY = 9.8; // m/s²

    // METOT 1: Hız hesapla (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        // v = mesafe / zaman
        return 0.0; // Degistirin
    }

    // METOT 2: İvme hesapla (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        // a = hiz degisimi / zaman
        return 0.0; // Degistirin
    }

    // METOT 3: Kuvvet hesapla (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        // F = kutle * ivme
        return 0.0; // Degistirin
    }

    // METOT 4: İş hesapla (W = F * d)
    public static double calculateWork(double force, double distance) {
        // W = kuvvet * mesafe
        return 0.0; // Degistirin
    }

    // METOT 5: Güç hesapla (P = W / t)
    public static double calculatePower(double work, double time) {
        // P = is / zaman
        return 0.0; // Degistirin
    }

    // METOT 6: Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        // KE = 0.5 * kutle * (hiz * hiz)
        // Math.pow(velocity, 2) kullanabilirsiniz
        return 0.0; // Degistirin
    }

    // METOT 7: Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        // PE = kutle * yercekimi * yukseklik
        return 0.0; // Degistirin
    }

    // METOT 8: Momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        // p = kutle * hiz
        return 0.0; // Degistirin
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== FIZIK FORMUL ASISTANI ===");
        System.out.println();

        // TEMEL OLCUMLER
        System.out.println("TEMEL OLCUMLER:");
        System.out.print("Kutle (kg): ");
        double mass = input.nextDouble();

        System.out.print("Mesafe (m): ");
        double distance = input.nextDouble();

        System.out.print("Zaman (s): ");
        double time = input.nextDouble();

        System.out.print("Hiz degisimi (m/s): ");
        double deltaV = input.nextDouble();

        System.out.print("Yukseklik (m): ");
        double height = input.nextDouble();
// 1️⃣ Hız (v = s / t)
public static double calculateVelocity(double distance, double time) {
    return distance / time;
}

// 2️⃣ İvme (a = Δv / t)
public static double calculateAcceleration(double deltaV, double time) {
    return deltaV / time;
}

// 3️⃣ Kuvvet (F = m * a)
public static double calculateForce(double mass, double acceleration) {
    return mass * acceleration;
}

// 4️⃣ İş (W = F * d)
public static double calculateWork(double force, double distance) {
    return force * distance;
}

// 5️⃣ Güç (P = W / t)
public static double calculatePower(double work, double time) {
    return work / time;
}

// 6️⃣ Kinetik Enerji (KE = 0.5 * m * v^2)
public static double calculateKineticEnergy(double mass, double velocity) {
    return 0.5 * mass * Math.pow(velocity, 2);
}

// 7️⃣ Potansiyel Enerji (PE = m * g * h)
public static double calculatePotentialEnergy(double mass, double height) {
    final double GRAVITY = 9.8;
    return mass * GRAVITY * height;
}

// 8️⃣ Momentum (p = m * v)
public static double calculateMomentum(double mass, double velocity) {
    return mass * velocity;
    }
        // HESAPLAMALARI YAP - Metotlari cagir
        // 1. Hiz (v) hesaplanmali (KE ve Momentum icin gerekli)
        // 2. Ivme (a) hesaplanmali (Kuvvet icin gerekli)
        // 3. Kuvvet (F) hesaplanmali (Is icin gerekli)
        // 4. Is (W) hesaplanmali (Guc icin gerekli)
        // ... digerlerini hesaplayin
  import java.util.Scanner;

public class PhysicsCalculator {

    final static double GRAVITY = 9.8; // Yerçekimi sabiti (m/s²)

    // 1️⃣ Hız
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // 2️⃣ İvme
    public static double calculateAcceleration(double deltaV, double time) {
        return deltaV / time;
    }

    // 3️⃣ Kuvvet
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // 4️⃣ İş
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // 5️⃣ Güç
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // 6️⃣ Kinetik Enerji
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // 7️⃣ Potansiyel Enerji
    public static double calculatePotentialEnergy(double mass, double height) {
        return mass * GRAVITY * height;
    }

    // 8️⃣ Momentum
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }



        // SONUCLARI YAZDIR

        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", velocity);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", acceleration);

        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", work);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", power);

        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
        // Toplam enerji = KE + PE
        System.out.printf("  Toplam Enerji             : %.2f J\n", (kineticEnergy + potentialEnergy)); 

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");
Hız (v): 10.438 m/s
İvme (a): 1.044 m/s²
Kuvvet (F): 78.300 N
İş (W): 391.500 J
Güç (P): 40.877 W
Kinetik Enerji (KE): 4082.016 J
Potansiyel Enerji (PE): 1470.000 J
Momentum (p): 782.850 kg·m/s
Yerçekimi sabiti: 9.80 m/s²

        input.close();
    }
}
