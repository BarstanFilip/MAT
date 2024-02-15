class MyOwnAutoShop{
    public static main void(String[], args){
        Sedan sedan = new sedan(100, 20000, 'alb', 2)
            System.out.println("Sedan pret" + sedan.getSalePrice());
        
        Ford ford1 = new Ford(140, 25000, 'verde', 2000, 9000);
        Ford ford2 = new Ford(130, 45000, 'rosu', 2010, 10000);
        System.out.println("Ford1 pret" + ford1.getSalePrice());
        System.out.println("Ford 2 pret" + ford1.getSalePrice());

    }
}