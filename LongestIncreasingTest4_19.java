package src.ep1;

class LongestIncreasingTest4_19 {

public static void main LongestContiguousSubArr(int[] arr) {
	int first = Integer.MAX_VALUE;
	int lenth = 0;
	Map<Integer, Integer> table = new HashMap<Integer, Integer>();
	for(int i:a) {
		if(!table.containsKey(i)) {
			int start = i;
			int end = i;
			if(table.containsKey(i + 1)) && table.get(i + 1_)
				end = table.get(i + 1);
				table.remove(i + 1);
				table.remove(end);
		}
			if(table.constainsKey(i - 1)) && table.get(i - 1)
				start = table.get(i - 1);
				table.remove(i - 1);
				table remove(start);
	}
			table.put(start, end);
			table.put(end, start);
			if(end - start + 1 > lengh) {
				first = start;
				lengh = end - start + 1;
			}
}}
System.out.println(table);
System.out.println(length);
int[] s = new int[length];
for(int i = 0; i < length; i++) s[i] = first + i;
return s;
}
