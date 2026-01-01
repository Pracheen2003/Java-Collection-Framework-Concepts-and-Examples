
public class ArrayDs {
int arr[];
int size;
public ArrayDs(int size) {
	arr = new int[size];
}

public void insert(int elem, int pos) {
	if(pos>=0 && pos<=arr.length-1)
		arr[pos] = elem;
	else
		System.out.println("Element"+elem+" cannot be inserted at position"+pos);
}

public void delete(int pos) {
	if(pos>0 && pos<=arr.length-1)
		arr[pos] = 0;
	else
		System.out.println("Element present at index"+pos+" cannot be deleted");
}

public void display() {
	for (int i : arr) {
		System.out.println(i+" ");
	}
}

public int sum() {
	int sum = 0;
	for(int i = 0;i <=arr.length-1;i++) {
		sum+=arr[i];
	}
	return sum;
}

public void sort() {
	for (int i = 0; i <= arr.length-2;i++) {
		for(int j = 0; i <= arr.length-2-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
}
