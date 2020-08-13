package finalCourse.product;

public class ExportProduct extends Product{
    String priceExport;
    String nameNation;

    public ExportProduct(String idProduct, String codeProduct, double priceProduct,
                         String numberProduct, String nameManufacture,String priceExport,
                                 String nameNation) {
        super(idProduct, codeProduct, priceProduct, numberProduct, nameManufacture);
        this.priceExport = priceExport;
        this.nameNation = nameNation;
    }
}
