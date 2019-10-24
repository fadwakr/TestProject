package maven_project.entities;


public class Product {

	private int id_product ;
	private String  name_product; 
	private int quant_product;
	
	public Product(String name_product, int quant_product) {
		super();
		this.name_product = name_product;
		this.quant_product = quant_product;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName_product() {
		return name_product;
	}
	public void setName_product(String name_product) {
		this.name_product = name_product;
	}
	public int getQuant_product() {
		return quant_product;
	}
	public void setQuant_product(int quant_product) {
		this.quant_product = quant_product;
	}
	

	public int Affichage_product(int number_product, String name) {
		int quantite =0;
		if (name == "Apple" ) {
			quantite = 2*number_product;
		}else if (name == "Orange") 	{
			quantite =  number_product;
		}else if (name =="Watermelon") {
			if (number_product %  2 == 0 ) {
			quantite = number_product+ 3*(number_product/2);
			}
		}
		return quantite;
	}
}
