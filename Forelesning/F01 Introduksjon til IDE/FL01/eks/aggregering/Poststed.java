package FL01.eks.aggregering;
/**
 * Poststed.java  - "Programmering i Java", 4.utgave - 2009-07-01
 * Enkel immutabel klasse med to objektvariabler; postnr. og poststed.
 */

public class Poststed {
  private final int postnr;
  private final String sted;

  public Poststed(int postnr, String sted) {
    this.postnr = postnr;
    this.sted = sted.trim();
  }

  public int getPostnr() {
    return postnr;
  }

  public String getSted() {
    return sted;
  }

  public String toString() {
    return postnr + " " + sted;
  }
}