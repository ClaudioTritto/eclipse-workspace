package com.giuseppebrb.asd.exams.Lab20150702.datastructure;

public interface Dictionary<S> extends Iterable<Comparable> {
	public void insert(S e, Comparable k);
	public void delete(Comparable k);
	public S search(Comparable k);

}
