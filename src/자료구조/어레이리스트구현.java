package 자료구조;


/**
 * @author 82102
 *
 */
class ArrayList<T> {
	private int size;
	private Object[] arr;
	private int pointer;
	
	public ArrayList() {
		size = 8;
		arr = new Object[size];
		pointer = 0;
	}
	
	
	public void add(T obj) {
		
		if(pointer == arr.length) {
			System.out.println("꽉참");
			
			Object[] tempArr = new Object[size*2];
			for(int i=0;i<arr.length;i++) {
				tempArr[i] = arr[i];
			}
			size *=2;
			arr = tempArr;
		}
		arr[pointer] = obj;
		pointer++;
	}
	
	public int size() {
		return pointer;
	}
	
	public void remove(int index) {
		if(pointer-1 == index) {
			System.out.println("마지막");
			pointer--;
		}
		
		for(int i=index;i<pointer;i++) {
			arr[i] = arr[i+1];
		}
		System.out.println(pointer);
		pointer-=1;
		System.out.println("pointer = " + pointer);
	}

	
	public T get(int index) throws Exception {
		if(!(0 <= index && index <= pointer)) {
			System.out.println("잘못된인덱스");
			throw new Exception("잘못된인덱스");
		}
		return (T) arr[index];
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i=0;i<pointer; i++) {
            b.append(arr[i]);
            
	        if (i == pointer-1)
	            return b.append(']').toString();
	        
	        b.append(", ");
        }
            
		return b.toString();
	}
	
	
}




public class 어레이리스트구현 {
	
	public static void main(String[] args) throws Exception {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
//		list.add("aa");
		
		
		list.remove(0);
		
		System.out.println(list);
		System.out.println("사이즈 : " + list.size());
		System.out.println(list.get(7));
		
		int a = list.get(0);
		
		System.out.println(a);
	}
	
}
