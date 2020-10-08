public class SwitchStatement {
  public static void main(String[] args) {

    var nilai = "A";

    switch (nilai) {
      case "A":
        System.out.println("Wow, Anda Lulus Dengan Baik");
        break;
      case "B":
      case "C":
        System.out.println("Nilai Anda Cukup Baik");
        break;
      case "D":
        System.out.println("Anda tidak lulus");
        break;
      default:
        System.out.println("Mungkin Anda salah jurusan");
    }

    switch (nilai) {
      case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
      case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
      case "D" -> System.out.println("Anda Tidak Lulus");
      default -> {
        System.out.println("Muungkin Anda Salah Jurusan");
      }
    }

    String ucapan;
    switch (nilai) {
      case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
      case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
      case "D" -> ucapan = "Anda Tidak Lulus";
      default -> {
        ucapan = "Muungkin Anda Salah Jurusan";
      }
    }

    System.out.println(ucapan);

    ucapan = switch (nilai) {
      case "A":
        yield "Wow, Anda Lulus Dengan Baik";
      case "B", "C":
        yield "Nilai Anda Cukup Baik";
      case "D":
        yield "Anda Tidak Lulus";
      default:
        yield "Muungkin Anda Salah Jurusan";
    };

    System.out.println(ucapan);
  }
}
