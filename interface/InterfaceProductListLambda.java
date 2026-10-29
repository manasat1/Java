class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + price;
    }
}

interface ProductIterator {
    boolean hasNext();
    Product next();
}

interface Search {
    boolean find(Product product);
}

class ProductList implements ProductIterator {
    private Product[] products = new Product[10];
    private int count = -1;
    private int currentCount = -1;

    public void add(Product p) {
        products[++count] = p;
    }

    @Override
    public boolean hasNext() {
        return currentCount >= 0;
    }

    @Override
    public Product next() {
        return products[currentCount--];
    }

    public ProductIterator iterator() {
        currentCount = count;
        return this;
    }

    public Product find(Search search) {
        for (int i = 0; i <= count; i++) {
            if (search.find(products[i])) {
                return products[i];
            }
        }
        return null;
    }
}

class InterfaceProductListLambda {
    public static void main(String[] args) {

        ProductList list = new ProductList();

        list.add(new Product(1001, "Dell", 4500.00));
        list.add(new Product(1002, "Lenovo", 35.55));

        ProductIterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Product findById = list.find(p -> p.getId() == 1002);

        Product findByName = list.find(p -> p.getName().equals("Dell"));

        Product findByPrice = list.find(p -> p.getPrice() == 35.55);

        System.out.println("Found by ID: " + findById);
        System.out.println("Found by name: " + findByName);
        System.out.println("Found by price: " + findByPrice);
    }
}
