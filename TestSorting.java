import java.util.Arrays;

public class TestSorting{
	public static void main(String args[]){

		int arr[] = {3, 1, 8, 2, 4};
		// int currentValue, index;

		// // Insertion Sort
		// for(int i = 1; i < array.length; ++i){
		// 	currentValue = array[i];

		// 	for(index = i - 1; index >= 0 && array[index] > currentValue; --index){
		// 		array[index + 1] = array[index];
		// 	}

		// 	array[index + 1] = currentValue;
		// }


		// Shell Sort
		int i, j, gap, temp;

		gap = arr.length / 2;

		while(gap > 0){
			// insertion sort of gapped elements
			i = gap;

			while(i < arr.length){
				temp = arr[i];

				// shifting gap sorted elements to correct location
				for(j = i; j >= gap && arr[j - gap] > temp; j = j - gap){
					arr[j] = arr[j - gap];
				}

				arr[j] = temp;

				++i;
			}

			gap = gap / 2;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

/*
for(gap = n/2; gap >= 1; gap = gap/2){  >> para sa pagde-determine ng gap
	for(j = gap; j < n; ++j){  >> magsisimula basically sa half ng array, hanggang di pa nakakarating sa last index ng array
		for(i = j-gap; i >= 0; i = i-gap){  >> eto yung left na pinagco-compare, take into consideration yung GAP pa rin
			if(a[i + gap] > a[i]) break; >> kapag mas malaki yung nasa unahan na pinagco-compare, alis na sa loop
			else{
				swap(a[i + gap], a[i]);
			}
		}
	}
}



*/