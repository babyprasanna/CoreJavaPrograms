package oops.basic;

/**
 * This Class About Clothes for Women and Girls & Men and Boys Stores Details
 * and Management Details
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

		Clothing_Women_Girls cws2 = new Clothing_Women_Girls();
		cws2.clothsname = "Babydoll dress";
		cws2.sizenumber = 35;
		cws2.size = "Small";
		cws2.clothtype = "semi-cotton";
		cws2.cost = 2014;
		cws2.stockstatus = true;
		cws2.discount = 310;
		cws2.type = "modern";
		cws2.traditional = "No";
		cws2.modern = "Yes";

		System.out.println("Cloth Names : " + cws2.clothsname + "\n" + "Size Number : " + cws2.sizenumber + "\n"
				+ "Size :" + cws2.size + "\n" + "Cloth Type : " + cws2.clothtype + "\n" + "Cost : " + cws2.cost + "\n"
				+ "Stock Status : " + cws2.stockstatus + "\n" + "Offers & Discount : " + cws2.discount + "\n"
				+ "Cloth type : " + cws2.type + "\n" + "Traditional Dress : " + cws2.traditional + "\n"
				+ "Modern Dress : " + cws2.modern + "\n");

		Clothing_Women_Girls cws3 = new Clothing_Women_Girls();

		cws3.clothsname = "Churidaar";
		cws3.sizenumber = 36;
		cws3.size = "large";
		cws3.clothtype = "semi-cotton";
		cws3.cost = 3614;
		cws3.stockstatus = true;
		cws3.discount = 300;
		cws3.type = "traditional";
		cws3.traditional = "Yes";
		cws3.modern = "No";

		System.out.println("Cloth Names : " + cws3.clothsname + "\n" + "Size Number : " + cws3.sizenumber + "\n"
				+ "Size :" + cws3.size + "\n" + "Cloth Type : " + cws3.clothtype + "\n" + "Cost : " + cws3.cost + "\n"
				+ "Stock Status : " + cws3.stockstatus + "\n" + "Offers & Discount : " + cws3.discount + "\n"
				+ "Cloth type : " + cws3.type + "\n" + "Traditional Dress : " + cws3.traditional + "\n"
				+ "Modern Dress : " + cws3.modern + "\n");

		Mens_Boy_Dress mbd = new Mens_Boy_Dress();

		mbd.clothsname = "T-Shirt";
		mbd.sizenumber = 45;
		mbd.size = "large";
		mbd.clothtype = "Cotton";
		mbd.cost = 1500;
		mbd.stockstatus = true;
		mbd.discount = 300;
		mbd.type = "casual";
		mbd.traditional = "No";
		mbd.modern = "Yes";

		System.out.println("Cloth Names : " + mbd.clothsname + "\n" + "Size Number : " + mbd.sizenumber + "\n"
				+ "Size :" + mbd.size + "\n" + "Cloth Type : " + mbd.clothtype + "\n" + "Cost : " + mbd.cost + "\n"
				+ "Stock Status : " + cws.stockstatus + "\n" + "Offers & Discount : " + cws.discount + "\n"
				+ "Cloth type : " + mbd.type + "\n" + "Traditional Dress : " + mbd.traditional + "\n"
				+ "Modern Dress : " + mbd.modern + "\n");

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

		Clothes_Shop cs1 = new Clothes_Shop();

		cs1.clothesshop_name = "Rekha cloths";
		cs1.location = "HYD";
		cs1.shopcode = 26092020;
		cs1.shop_type = "baby_styles & wholesale_Store";
		cs1.ownername = "RekhaRam";
		cs1.poductscount = 126489;
		cs1.nearaddress = "Sangareddy";
		cs1.min_cost = 1525;
		cs1.max_cost = 21949;

		System.out.println("Cloths Shop Names : " + cs1.clothesshop_name + "\n" + "Location Placed city  : "
				+ cs1.location + "\n" + "Code :" + cs1.shopcode + "\n" + "Shop Type : " + cs1.shop_type + "\n"
				+ "Name of Owner : " + cs1.ownername + "\n" + "Stock & Modeles count : " + cs1.poductscount + "\n"
				+ "Address Point : " + cs1.nearaddress + "\n" + "Cloth Minimum Costs starts : " + cs1.min_cost + "\n"
				+ "Maximum Cloths Cost : " + cs1.max_cost + "\n");

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
