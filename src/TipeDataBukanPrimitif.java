public class TipeDataBukanPrimitif {
  public static void main(String[] args) {

    Integer iniInteger = 100;
    Long iniLong = 10000L;

    Byte iniByte = null;

    System.out.println(iniByte);

    iniByte = 100;

    System.out.println(iniByte);

    int iniInt = 100;

    Integer iniObject = iniInt;

    short iniShort = iniObject.shortValue();
    long iniLong2 = iniObject.longValue();
    float iniFloat = iniObject.floatValue();

    Long amount = 1000000L;

  }
}
