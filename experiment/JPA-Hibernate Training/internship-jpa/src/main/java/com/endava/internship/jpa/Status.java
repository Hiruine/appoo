package com.endava.internship.jpa;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Status {

    INACTIVE(2),
    OPEN(0),
    CLOSED(1);

    private final int dbIndex;

    private static final Map<Integer, Status> integerToEnum = Stream.of(Status.values())
            .collect(Collectors.toMap(Status::toDbIndex, e -> e));

    Status(int dbIndex) {
        this.dbIndex = dbIndex;
    }

    public int toDbIndex() {
        return dbIndex;
    }

    public static Optional<Status> valueOf(int dbIndex) {
        return Optional.ofNullable(integerToEnum.get(dbIndex));
    }
}
