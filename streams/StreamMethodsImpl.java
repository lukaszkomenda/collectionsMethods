package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsImpl implements StreamsMethods{
    @Override
    public List<Integer> mergeTwoStreams(Stream<Integer> stream1, Stream<Integer> stream2) {

        return Stream.concat(stream1, stream2).collect(Collectors.toList());
    }

    @Override
    public List<Integer> mergeTripleStreams(Stream<Integer> stream1, Stream<Integer> stream2,
                                            Stream<Integer> stream3) {
        return Stream.concat(Stream.concat(stream1, stream2), stream3).collect(Collectors.toList());
    }

    @Override
    public String joiningStrings(String[] str) {
        String newString = Arrays.stream(str)
                .map(String::new)
                .collect(Collectors.joining(",","[","]"));

        return newString.substring(1, newString.length() - 1).replaceAll(",", "");
    }

}
