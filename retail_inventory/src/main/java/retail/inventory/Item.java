package retail.inventory;

public class Item {
    private String type;
    private String name;
    private Double price;
    private Integer quantity;

    public Item(String aT, String aN, Double aP, Integer aQ)
    {
        setType(aT);
        setName(aN);
        setPrice(aP);
        setQuantity(aQ);
    }
    public String getType()
    {
        return this.type;
    }
    public String getName()
    {
        return this.name;
    }
    public Double getPrice()
    {
        return this.price;
    }
    public Integer getQuantity()
    {
        return this.quantity;
    }
    public void setType(String aT)
    {
        this.type = aT;
    }
    public void setName(String aN)
    {
        this.name = aN;
    }
    public void setPrice(Double aP)
    {
        this.price = aP;
    }
    public void setQuantity(Integer aQ)
    {
        this.quantity = aQ;
    }
    
}
