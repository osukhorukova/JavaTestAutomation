package by.teachmeskills.lesson9.contractonsupply;

import by.teachmeskills.lesson9.document.Document;

import java.time.LocalDate;

public class ContractOnSupply extends Document {
    int amountOfGoods;
    String goodsType;

    public ContractOnSupply(){
    }

    public ContractOnSupply(String documentNumber, String goodsType, int amountOfGoods, LocalDate date) {
        super(date, documentNumber);
        this.amountOfGoods = amountOfGoods;
        this.goodsType = goodsType;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }

    public String getGoodsType() {
        return goodsType;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "; Good's type: " + getGoodsType() + "; Amount of goods: " + getAmountOfGoods();
    }
}
