package com.step.assignments;

public class JewelleryBox {
  private Jewellery jewellery;
  private JewelleryBox jewelleryBox;

  public JewelleryBox(Jewellery jewellery, JewelleryBox jewelleryBox) {
    this.jewellery = jewellery;
    this.jewelleryBox = jewelleryBox;
  }

  public JewelleryBox(Jewellery jewellery) {
    this.jewellery = jewellery;
  }

  public JewelleryBox() {

  }

  public JewelleryBox(JewelleryBox jewelleryBox) {
    this.jewelleryBox = jewelleryBox;
  }

  public int totalCount() {
    int totalCount = 0;

    if (jewellery != null) {
      totalCount++;
    }

    if (jewelleryBox != null) {

      totalCount += this.jewelleryBox.totalCount();
    }

    return totalCount;
  }

}



