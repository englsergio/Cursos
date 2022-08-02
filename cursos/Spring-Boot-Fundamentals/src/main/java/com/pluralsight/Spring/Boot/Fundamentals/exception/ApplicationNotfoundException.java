package com.pluralsight.Spring.Boot.Fundamentals.exception;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationNotfoundException extends RuntimeException implements GraphQLError {
    private Map<String, Object> extensions = new HashMap<>();
    public ApplicationNotfoundException(String exception) {
        super(exception);
    }
    public ApplicationNotfoundException(String message, Long invalidApplicationId) {
        super(message);
        extensions.put("invalidApplicationId", invalidApplicationId);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return ErrorType.DataFetchingException;
    }
}
