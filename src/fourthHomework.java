void main(String[]args) {
    String statement = "ორცხობილა";
    int quantity = 18;
    Double price =2.8;
    int bought = 1;
    int stock = quantity - bought;
    boolean outOfStock = false;
    System.out.println(statement + " "+ "გაიყიდა" + " " + bought + " " + "ცალი" + " " + "მარაგშია" + "-"+ stock+" "+ "ცალი");
}
