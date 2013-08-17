
public class MergeSort {

	private ObjectList sortList;

	public MergeSort(ObjectList unsortedList) {
		sortList = unsortedList;
	}

	public ObjectList sort() {

		int end = sortList.getSize();
		sortList = mergeSort(sortList);

		return sortList;
	}

	public ObjectList mergeSort(ObjectList list) {

		if (list.getSize() <= 1)
			return list;

		ObjectList list1 = new ObjectList();		
		ObjectList list2 = new ObjectList();

		for (int k = 0; k < list.getSize() / 2; k++)
			list1.add(list.get(k));

		for (int k = list.getSize() / 2; k < list.getSize(); k++)
			list2.add(list.get(k));

		list1 = mergeSort(list1);
		list2 = mergeSort(list2);

		return merge(list1, list2);

	}

	public ObjectList merge(ObjectList list1, ObjectList list2) {

		int firstList = 0;
		int secondList = 0;

		ObjectList tempList = new ObjectList();

		while (firstList < list1.getSize() && secondList < list2.getSize()) {
			if ((Integer)list1.get(firstList) > (Integer)list2.get(secondList)) {
				tempList.add(list2.get(secondList));
				secondList++;
			}
			else {
				tempList.add(list1.get(firstList));
				firstList++;
			}
		}


		while (firstList < list1.getSize())	{
			tempList.add(list1.get(firstList));
			firstList++;
		}		

		while (secondList < list2.getSize()) {
			tempList.add(list2.get(secondList));
			secondList++;
		}

		return tempList;
	}

	public void printList() {
		sortList.printList();
	}
}