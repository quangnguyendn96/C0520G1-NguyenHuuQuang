package finalCourse.product;

public class ImportProduct extends Product {
    String priceImport;
    String nameProvince;
    String tax;
    ImportProduct(String idProduct, String codeProduct, double priceProduct, String numberProduct, String nameManufacture,
                  String priceImport,String nameProvince,String tax){
        super( idProduct,  codeProduct,  priceProduct,  numberProduct,  nameManufacture);
        this.priceImport = priceImport;
        this.nameProvince = nameProvince;
        this.tax = tax;
    }
}
