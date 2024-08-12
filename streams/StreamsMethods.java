package org.example.streams;

import java.util.List;
import java.util.stream.Stream;

public interface StreamsMethods {

    List<Integer> mergeTwoStreams (Stream <Integer> stream1, Stream<Integer> stream2);
    List<Integer> mergeTripleStreams (Stream <Integer> stream1, Stream<Integer> stream2, Stream<Integer> stream3);
    String joiningStrings (String[] str);
}
