package catanddogyears;
public class CatAndDogYears {
public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int Umurorang) {
    int anj = 0;
    int kucg = 0;
    if (Umurorang >= 1) {
      anj += 15;
      kucg += 15;
    }
    if (Umurorang >= 2) {
      anj += 9;
      kucg += 9;
    }
    if (Umurorang > 2) {
      anj += 5 * (Umurorang - 2);
      kucg += 4 * (Umurorang - 2);
    }
    return new int[]{Umurorang, kucg, anj};
  }
