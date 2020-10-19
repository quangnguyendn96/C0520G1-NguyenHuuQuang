package quang.company.productmodal.model;

public class ProductCode {
    public static String setUpCode(Product product) {
        String code = null;
        Long id = product.getIdProduct();
        if (id < 10) {
            code = "SV-000" + id;
        } else if (id < 100) {
            code = "SV-00" + id;
        } else if (id < 1000) {
            code = "SV-0" + id;
        } else if (id < 10000) {
            code = "SV-" + id;
        } else {
            code = "SV-zzzz";
        }
        return code;
    }
}
