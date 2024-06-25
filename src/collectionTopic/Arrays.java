package collectionTopic;

public class Arrays {
	
	public static void main(String[] args) {
		String[] product= {"mohan","lakshmi","mohan2","lakshmi2","mohan3","lakshmi3"};
		String search="mohan";
		boolean flag=false;
		for (int i = 0; i < product.length; i++) {
			if(product[i].equals(search)) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Product Present in array");
		}
		else {
			System.out.println("Product not Present in array");
		}
		
	}

}
