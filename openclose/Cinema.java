class Cinema {
    public Double price;
}

abstract class Cinema {
    public Double price;
    abstract Double calculateAdminFee();
}

class StandardCinema extends Cinema {
    public StandardCinema(Double price) {
        this.price = price;
    }

    @Override
    Double calculateAdminFee() {
    return price * 10 / 100;
    }

}

class DeluxeCinema extends Cinema {
    public DeluxeCinema(Double price) {
        this.price = price;
    }

    @Override
    Double calculateAdminFee() {
    return price * 12 / 100;
    }
}

class PremiumCinema extends Cinema {
    public PremiumCinema(Double price) {
         this.price = price;
    }
    @Override
    Double calculateAdminFee() {
    return price * 20 / 100;
    }
}

class CinemaCalculations {
    public Double calculateAdminFee(Cinema cinema) {
    if (cinema instanceof StandardCinema) {
    return ((StandardCinema) cinema).price * 10 / 100;
    } else if (cinema instanceof DeluxeCinema) {
    return ((DeluxeCinema) cinema).price * 12 / 100;
    } else if (cinema instanceof PremiumCinema) {
    return ((PremiumCinema) cinema).price * 20 / 100;
    } else
    return 0.0;
    }
}

class Main {
    public static void main(String[] args) {
        StandardCinema standardCinema = new StandardCinema(100.0);
        Double adminFee = standardCinema.calculateAdminFee();
        System.out.println(adminFee);
    }
}