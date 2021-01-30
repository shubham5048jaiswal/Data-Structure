package list;

import java.util.ArrayList;

 class Interval {
	int start;
	int end;
	Interval(){
		start = 0; end = 0;
	}
}



public class Solution {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals,Interval newInterval){	
	
	if(intervals == null){
		intervals = new ArrayList<Interval>();
		intervals.add(newInterval);
	}else if(intervals.size()== 0) {
		intervals = new ArrayList<Interval>();
		intervals.add(newIntervals);
	}
	Intervals toInsert = newInterval;
	
	int i = 0;
	while(i<intervals.size) {
		Interval current = intervals.get(i);
		if(current.end<toInsert.start) {
			i++;
			continue;
		}else if(current.start>toInsert.end) {
			intervals.add(i,toInsert);
			break;
		}else {
			toInsert.start = Math.min(toInsert.start, current.start);
			toInsert.end = Math.max(toInsert.end, current.end);
			intervals.remove(i);
		}
	}
	if(i == intervals.size()) {
		intervals.add(toInsert);
	}
	return intervals;
	}
}
	


