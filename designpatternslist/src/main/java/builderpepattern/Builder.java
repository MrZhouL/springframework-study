package builderpepattern;

/**
 * Builder类，确定产品由两个部件partA和partB组成。并声明一个得到产品建造后结果的方法getResult
 *
 */
public abstract class Builder {
    public abstract void BuiderPartA();
    public abstract void BuiderPartB();

    public abstract Product getResult();


}
