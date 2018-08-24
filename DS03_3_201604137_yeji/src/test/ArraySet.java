package test;


public class ArraySet implements Set {

	private Object[] objects = new Object[1000];

	private int size, i;

	@Override

	public boolean contains(Object object) {

		for (int i = 0; i < size; i++) {

			if (objects[i].equals(object))
				return true;

		}

		return false;

	}
	
	@Override
	public boolean add(Object object) {

		if (contains(object))
			return false;

		objects[size++] = object;

		return true;

	}



	@Override

	public Object getFirst() {
		i = 0;
		return objects[i++];

	}

	@Override

	public Object getNext() {
		return objects[i++];

	}

	/*
	 * 
	 * public static void arraycopy(Object src , int src_position , Object dst ,int
	 * dst_position ,int length) Object src : �����迭
	 *  int src_position : �����迭�� ������ġ
	 * 
	 * Object dst : ������ �迭
	 *  int dst_position : ������ �迭�� ������ġ 
	 *  int length : ������ ����.
	 * 
	 * arraycopy(a , 0 , b ,2 ,2)
	 * 
	 * a[1][2][3][4][5] b=a.clone
	 * 
	 * [1][2][3][4][5][ ][ ]
	 * [1][2][3][4][5][ ][ ]
	 */
	
	// 1. clone�� ���Ѽ� �迭 ����
	// 2. arraycopy �Լ� ����
	// 3. size ����

	@Override
	public boolean remove(Object object) {
		if (contains(object)) {
		
			for (int j = 0; j < size; j++) {
				if (object.equals(objects[j])) {
					Object[] clone = objects.clone();
					System.arraycopy(clone, j+1, objects, j, size-j);
					size--;
					break;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@Override

	public int size() {

		return size;
	}

}
