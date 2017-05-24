package PPP_Project;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis = 0;

        //Decorator Pattern
        Kamar kamarVIP = new KamarVIPDecorator(new KamarVIP());
        Kamar kamarStandar = new KamarStandarDecorator(new KamarStandar());

        System.out.println("1. TIPE VIP");
        kamarVIP.description();
        System.out.println("");
        System.out.println("2. TIPE STANDAR");
        kamarStandar.description();

        System.out.print("Pilih jenis kamar (1/2) : ");
        jenis = input.nextInt();
        if (jenis == 1) {
            pilihMetodePembayaran(kamarVIP.getCost(), kamarVIP.getTitle());
        } else if (jenis == 2) {
            pilihMetodePembayaran(kamarStandar.getCost(), kamarStandar.getTitle());
        }

        RoomService();

    }

    public static void RoomService() {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int pil1 = 0;
        String pil2;

        //Factory Pattern
        while (pil1 != 4) {
            System.out.println("=== ROOM SERVICE ===");
            System.out.println("1. Laundry");
            System.out.println("2. Cleaning Service");
            System.out.println("3. Catering");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1-4): ");
            pil1 = input1.nextInt();
            System.out.println("");
            switch (pil1) {
                case 1:
                    LaundryFactory laundryFactory = new LaundryFactory();
                    System.out.println("* TIPE 1");
                    System.out.println("* TIPE 2");
                    System.out.print("Masukkan pilihan: ");
                    pil2 = input2.nextLine();
                    Laundry laundry = laundryFactory.getLaundry(pil2);
                    laundry.facility();
                    pilihMetodePembayaran(laundry.getPrice(), laundry.getTitle());
                    System.out.println("");
                    break;
                case 2:
                    CleaningServiceFactory cleaningServiceFactory = new CleaningServiceFactory();
                    System.out.println("* TIPE 1");
                    System.out.println("* TIPE 2");
                    System.out.println("* TIPE 3");
                    System.out.print("Masukkan pilihan: ");
                    pil2 = input2.nextLine();
                    CleaningService cleaningService = cleaningServiceFactory.getCleaningService(pil2);
                    cleaningService.facility();
                    pilihMetodePembayaran(cleaningService.getPrice(), cleaningService.getTitle());
                    System.out.println("");
                    break;
                case 3:
                    CateringFactory cateringFactory = new CateringFactory();
                    System.out.println("* PAKET 1");
                    System.out.println("* PAKET 2");
                    System.out.println("* PAKET 3");
                    System.out.print("Masukkan pilihan: ");
                    pil2 = input2.nextLine();
                    Catering catering = cateringFactory.getCatering(pil2);
                    catering.facility();
                    pilihMetodePembayaran(catering.getPrice(), catering.getTitle());
                    System.out.println("");
                    break;
                default:
                    break;
            }
        }
    }

    public static void pilihMetodePembayaran(double cost, String detail) {
        Scanner input2 = new Scanner(System.in);
        int jenis = 0;

        //Template Pattern
        System.out.println("\n=== Metode Pembayaran ===");
        System.out.println("1. Pembayaran Tunai");
        System.out.println("2. Pembayaran Debit Tabungan");
        System.out.println("3. Pembayaran Paypal");
        System.out.print("Pilih metode pembayaran (1-3) : ");
        jenis = input2.nextInt();
        switch (jenis) {
            case 1:
                CashPayment cashPayment = new CashPayment();
                cashPayment.PaymentProcess(cost, detail);
                break;
            case 2:
                DebitPayment debitPayment = new DebitPayment();
                debitPayment.PaymentProcess(cost, detail);
                break;
            case 3:
                PaypalPayment paypalPayment = new PaypalPayment();
                paypalPayment.PaymentProcess(cost, detail);
                break;
            default:
                break;
        }
    }
}
