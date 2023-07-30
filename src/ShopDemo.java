import java.util.Vector;

class ProductItem{
    int id;
    float price;
    ProductItem(int id,float price){
        this.id=id;
        this.price=price;
    }
    public String toString(){
        return "ID"+id+"PRICE"+price
    }
    float getPrice(){
        return price;
    }

}
class ShoppingCart {
    int CustomerId;
    Vector ItemsV;

    ShoppingCart(int CustomerId) {
        this.CustomerId = CustomerId;
        ItemsV = new Vector();
    }

    public void AddItem(ProductItem pit) {
        ItemsV.addElement(pit);
    }

    public void removeItem(ProductItem pit) {
        ItemsV.remove(pit);
    }

    public void doPayment() {
        float amount = 0.0f;
        for (int i = 0; i < ItemsV.size(); i++) {
            amount += ((ProductItem) ItemsV.get(i)).getPrice();
        }
        System.out.println("Total Price" + amount);
    }
}
public class ShopDemo
{
}