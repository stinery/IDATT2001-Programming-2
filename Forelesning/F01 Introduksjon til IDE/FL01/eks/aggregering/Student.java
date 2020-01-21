package FL01.eks.aggregering;

/**
 * Student.java  - "Programmering i Java", 4.utgave - 2009-07-01
 * Fra programliste 11.5 side 361.
 *
 * Komposisjon: Navneobjektet er gjemt inne i studentobjektet.
 * Klienten forholder seg ikke til klassen Navn i det hele tatt.
 */

public class Student {
  private Navn navn;
  private Poststed poststed;

  public Student(Navn navn, Poststed poststed) {
    this.navn = navn;
    this.poststed = poststed;
  }

  public String getEtternavn() {
    return navn.getEtternavn();
  }

  public String getFornavn() {
    return navn.getFornavn();
  }

  public void setFornavn(String fornavn) {
    navn.setFornavn(fornavn);
  }

  public void setEtternavn(String etternavn) {
    navn.setEtternavn(etternavn);
  }

  public String toString() {
    return "Navn: "+navn.toString() + ", poststed" + poststed.toString();
  }
}