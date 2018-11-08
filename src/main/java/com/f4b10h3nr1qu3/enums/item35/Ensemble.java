package com.f4b10h3nr1qu3.enums.item35;

/**
 * ITEM 35: USE INSTANCE FIELDS INSTEAD OF ORDINALS
 * e.g. return ordinal() + 1;
 * Never derive a value associated with an enum from its ordinal; store it in an instance field instead.
 */
public enum Ensemble {

  SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),

  SEXTET(6), SEPTET(7), OCTET(8), DOUBLE_QUARTET(8),

  NONET(9), DECTET(10), TRIPLE_QUARTET(12);

  private final int numberOfMusicians;

  Ensemble(int size) { this.numberOfMusicians = size; }

  public int numberOfMusicians() { return numberOfMusicians; }

}