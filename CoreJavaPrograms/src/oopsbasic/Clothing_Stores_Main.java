package oopsbasic;

/**
 * This Class About Clothes for Women and Girls & Men and Boys Stores Details and
 * Management Details
 * 
 * @author prasa
 *
 */

public class Clothing_Stores_Main {
	public static void main(String[] args) {
		Clothing_Women_Girls cws = new Clothing_Women_Girls();

		cws.clothsname = "Culotte dress";
		cws.sizenumber = 32;
		cws.size = "Small";
		cws.clothtype = "Cotton";
		cws.cost = 2564;
		cws.stockstatus = true;
		cws.discount = 250;
		cws.type = "modern";
		cws.traditional = "No";
		cws.modern = "Yes";

		System.out.println("Cloth Names : " + cws.clothsname + "\n" + "Size Number : " + cws.sizenumber + "\n"
				+ "Size :" + cws.size + "\n" + "Cloth Type : " + cws.clothtype + "\n" + "Cost : " + cws.cost + "\n"
				+ "Stock Status : " + cws.stockstatus + "\n" + "Offers & Discount : " + cws.discount + "\n"
				+ "Cloth type : " + cws.type + "\n" + "Traditional Dress : " + cws.traditional + "\n"
				+ "Modern Dress : " + cws.modern + "\n");

		cws.clothsname = "Babydoll dress";
		cws.sizenumber = 35;
		cws.size = "Small";
		cws.clothtype = "semi-cotton";
		cws.cost = 2014;
		cws.stockstatus = true;
		cws.discount = 310;
		cws.type = "modern";
		cws.traditional = "No";
		cws.modern = "Yes";

		System.out.println("Cloth Names : " + cws.clothsname + "\n" + "Size Number : " + cws.sizenumber + "\n"
				+ "Size :" + cws.size + "\n" + "Cloth Type : " + cws.clothtype + "\n" + "Cost : " + cws.cost + "\n"
				+ "Stock Status : " + cws.stockstatus + "\n" + "Offers & Discount : " + cws.discount + "\n"
				+ "Cloth type : " + cws.type + "\n" + "Traditional Dress : " + cws.traditional + "\n"
				+ "Modern Dress : " + cws.modern + "\n");

		cws.clothsname = "Churidaar";
		cws.sizenumber = 36;
		cws.size = "large";
		cws.clothtype = "semi-cotton";
		cws.cost = 3614;
		cws.stockstatus = true;
		cws.discount = 300;
		cws.type = "traditional";
		cws.traditional = "Yes";
		cws.modern = "No";

		System.out.println("Cloth Names : " + cws.clothsname + "\n" + "Size Number : " + cws.sizenumber + "\n"
				+ "Size :" + cws.size + "\n" + "Cloth Type : " + cws.clothtype + "\n" + "Cost : " + cws.cost + "\n"
				+ "Stock Status : " + cws.stockstatus + "\n" + "Offers & Discount : " + cws.discount + "\n"
				+ "Cloth type : " + cws.type + "\n" + "Traditional Dress : " + cws.traditional + "\n"
				+ "Modern Dress : " + cws.modern + "\n");

		Mens_Boy_Dress mbd = new Mens_Boy_Dress();

		cws.clothsname = "T-Shirt";
		cws.sizenumber = 45;
		cws.size = "large";
		cws.clothtype = "Cotton";
		cws.cost = 1500;
		cws.stockstatus = true;
		cws.discount = 300;
		cws.type = "casual";
		cws.traditional = "No";
		cws.modern = "Yes";

		System.out.println("Cloth Names : " + cws.clothsname + "\n" + "Size Number : " + cws.sizenumber + "\n"
				+ "Size :" + cws.size + "\n" + "Cloth Type : " + cws.clothtype + "\n" + "Cost : " + cws.cost + "\n"
				+ "Stock Status : " + cws.stockstatus + "\n" + "Offers & Discount : " + cws.discount + "\n"
				+ "Cloth type : " + cws.type + "\n" + "Traditional Dress : " + cws.traditional + "\n"
				+ "Modern Dress : " + cws.modern + "\n");

		Clothes_Shop cs = new Clothes_Shop();

		cs.clothesshop_name = "Rajendra cloths";
		cs.location = "HYD";
		cs.shopcode = 22060;
		cs.shop_type = "mens_styles";
		cs.ownername = "Rajendra.K";
		cs.poductscount = 1369542;
		cs.nearaddress = "Hi-Tech city";
		cs.min_cost = 2695;
		cs.max_cost = 22549;

		System.out.println("Cloth Names : " + cs.clothesshop_name + "\n" + "Location Placed city  : " + cs.location
				+ "\n" + "Code :" + cs.shopcode + "\n" + "Shop Type : " + cs.shop_type + "\n" + "Name of Owner : "
				+ cs.ownername + "\n" + "Stock & Modeles count : " + cs.poductscount + "\n" + "Address Point : "
				+ cs.nearaddress + "\n" + "Cloth Minimum Costs starts : " + cs.min_cost + "\n"
				+ "Maximum Cloths Cost : " + cs.max_cost + "\n");

		cs.clothesshop_name = "Rekha cloths";
		cs.location = "HYD";
		cs.shopcode = 26092020;
		cs.shop_type = "baby_styles & wholesale_Store";
		cs.ownername = "RekhaRam";
		cs.poductscount = 126489;
		cs.nearaddress = "Sangareddy";
		cs.min_cost = 1525;
		cs.max_cost = 21949;

		System.out.println("Cloths Shop Names : " + cs.clothesshop_name + "\n" + "Location Placed city  : "
				+ cs.location + "\n" + "Code :" + cs.shopcode + "\n" + "Shop Type : " + cs.shop_type + "\n"
				+ "Name of Owner : " + cs.ownername + "\n" + "Stock & Modeles count : " + cs.poductscount + "\n"
				+ "Address Point : " + cs.nearaddress + "\n" + "Cloth Minimum Costs starts : " + cs.min_cost + "\n"
				+ "Maximum Cloths Cost : " + cs.max_cost + "\n");

		Management_ClothStores ms = new Management_ClothStores();

		ms.shopcode = 2260;
		ms.ownersname = "Rajendra";
		ms.management = "Own_shop";
		ms.staff = 98;
		ms.sal_min = 60254;
		ms.sal_max = 25149;

		System.out.println("Shop Code : " + ms.shopcode + "\n" + "Owner Name : " + ms.ownersname + "\n"
				+ "Management Details :" + ms.management + "\n" + "Staff Members : " + ms.staff + "\n"
				+ "Minimum salarys : " + ms.sal_min + "\n" + "Maximum Salarys: " + ms.sal_max + "\n");

	}
}
