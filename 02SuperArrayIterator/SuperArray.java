import java.util.*;

public class SuperArray implements Iterable<String>{
	private String[] data;
	private int size;

	//Constr
	public SuperArray(){
		size = 0;
		data = new String[10];
	}
	public SuperArray(int newData){
		data = new String[newData];
		size = data.length;
		if (newData <= -1){
			throw new IllegalArgumentException();
		}
	}

	//Getsize
	public int size(){
		return size;
	}

	public String get(int ind){
		if(ind >= size() || ind < 0){
			throw new IndexOutOfBoundsException();
		}
		return data[ind];
	}


	public boolean add(String ele){
		if( size < data.length){
			data[size] = ele;
			size +=1;
		}
		else{
			grow();
			data[size] = ele;
			size = size + 1;
		}
		return true;
	}

	public void grow(){
		String[] newone = new String[data.length * 2];
		int x = 0;
		while(x < size){
			newone[x] = data[x];
			x += 1;
		}
		data = newone;
	}

//tostring
	public String toString(){
		String x = "[";
		for(int i = 0; i < size(); i++){
			x += data[i] + ",";
		}
		return x + "]";
	}

	public String toStringDebug(){
		String x = "[";
		for(int i = 0; i < data.length; i++){
			if (i < size){
				x += data[i] + ",";
			}
			else{ x += "_,";}
		}
	return x + "]";
	}

	public void clear(){
        	size = 0;
	}
	public boolean isEmpty(){
		return size == 0;
	}

	public String set(int ind, String ele){
		if (ind < 0 || ind >= size())
			throw new IndexOutOfBoundsException();
		String x = data[ind];
		data[ind] = ele;
		return x;
	}

	//harder jawns
	public void add(int ind, String ele){
		if(ind < 0 || ind > size()){
		    throw new IndexOutOfBoundsException();}
		if(data.length == size){grow();}
		if(size < data.length){
		    for(int y = size - 1; y >= ind; y--){
			data[y+1] = data[y];
		    }
		    data[ind] = ele;
		    size = size + 1;}
	    }

	public String remove(int ind){
		if (ind < 0 || ind >= size())
		    throw new IndexOutOfBoundsException();
		String x = data[ind];
		if (ind < size ){
			size -= 1;
			for (int i = ind; i < size; i++){
				set(i, data[i+1]);
			}
			return x;
		}
		else{
			return "none";
		}
	}

	public int indexOf(String i){
		int y = 0;
		for (int x = 0; x <size; x++){
			if(data[x] == i)
				y = x;
		}
		return y;
	}

	public int lastIndexOf(String i){
		int num = -1;
		for(int x = size-1; x > -1; x--){
		    if(data[x] == i && num == -1)
			num = x;
		}
		return num;
	}

	public String[] toArray(){
		String[] newJuan = new String[size];
		int x = 0;
		while (x < size){
			newJuan[x] = data[x];
		}
		return newJuan;
	}
	public Iterator<String> iterator(){
		return new superArrayIterator(this);
	}


	public static void main(String [] arghhh){
		System.out.println("pizza");
		SuperArray tester = new SuperArray();
		System.out.println(tester.add("cat"));
		System.out.println(tester.add("dog"));
		System.out.println(tester.add("elbow"));
		System.out.println(tester.toStringDebug());
		System.out.println(tester.set(2, "truck"));
		System.out.println(tester.toStringDebug());
		tester.add(2, "fish");
		System.out.println(tester.toStringDebug());
		System.out.println(tester.remove(3));
		System.out.println(tester.toStringDebug());
		System.out.println(tester.indexOf("cat"));
		System.out.println(tester.toStringDebug());
		tester.add("grease");
		System.out.println(tester.lastIndexOf("grease"));
		System.out.println(tester.toStringDebug());
		System.out.println(tester.get(2));



	}
}
