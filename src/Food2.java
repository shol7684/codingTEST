import java.util.Arrays;

public class Food2 {
		int foodId;
		String foodName;
		int foodPrice;
		
		String[] foodOptionName;
		int[] foodOptionPrice;
		int[] foodOptionId;
		public int getFoodId() {
			return foodId;
		}
		public void setFoodId(int foodId) {
			this.foodId = foodId;
		}
		public String getFoodName() {
			return foodName;
		}
		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}
		public int getFoodPrice() {
			return foodPrice;
		}
		public void setFoodPrice(int foodPrice) {
			this.foodPrice = foodPrice;
		}
		public String[] getFoodOptionName() {
			return foodOptionName;
		}
		public void setFoodOptionName(String[] foodOptionName) {
			this.foodOptionName = foodOptionName;
		}
		public int[] getFoodOptionPrice() {
			return foodOptionPrice;
		}
		public void setFoodOptionPrice(int[] foodOptionPrice) {
			this.foodOptionPrice = foodOptionPrice;
		}
		public int[] getFoodOptionId() {
			return foodOptionId;
		}
		public void setFoodOptionId(int[] foodOptionId) {
			this.foodOptionId = foodOptionId;
		}
		@Override
		public String toString() {
			return "Food2 [foodId=" + foodId + ", foodName=" + foodName + ", foodPrice=" + foodPrice
					+ ", foodOptionName=" + Arrays.toString(foodOptionName) + ", foodOptionPrice="
					+ Arrays.toString(foodOptionPrice) + ", foodOptionId=" + Arrays.toString(foodOptionId) + "]";
		}
		
		
		
		
		
}
