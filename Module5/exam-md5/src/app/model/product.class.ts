class TypeProduct {
  idType: number;
  typeName: String;
}

export class Product {
  id: number;
  name: string;
  typeProduct: TypeProduct;
  dateImport: string;
  dateExport: string;
  status: string;

}
