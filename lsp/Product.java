abstract class Product {
    abstract String getName();
    abstract Date getExpiredDate();
    /**
    * Function to get all of information about product
    */
    public void getProductInfo() {
    // some magic code
    }
}

class Vegetable extends Product {
    @Override
    String getName() {
    return "Broccoli";
    }
    @Override
    Date getExpiredDate() {
    return new Date();
    }
}

class Smartphone extends Product {
    @Override
    String setName() {
        return "Samsung S10+ Limited Edition";
    }
    @Override
    Date setExpiredDate() {
    return new Date(); // ???????
    }
}

